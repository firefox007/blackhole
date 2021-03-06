package com.dp.blackhole.appnode;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dp.blackhole.appnode.AppLog;
import com.dp.blackhole.appnode.RollRecoveryZero;
import com.dp.blackhole.conf.ConfigKeeper;
import com.dp.blackhole.simutil.SimRecoveryServer;
import com.dp.blackhole.simutil.Util;

public class TestRollRecoveryZero {
    private static final Log LOG = LogFactory.getLog(TestRollRecoveryZero.class);
    private static final String MAGIC = "fee54we";
    private static final int port = 40003;
    private static File file;
    private static AppLog appLog;
    private static List<String> header = new ArrayList<String>();
    private static List<String> receives = new ArrayList<String>();
    private Thread serverThread;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ConfigKeeper confKeeper = new ConfigKeeper();
        confKeeper.addRawProperty(MAGIC + ".ROLL_PERIOD", "3600");
        confKeeper.addRawProperty(MAGIC + ".BUFFER_SIZE", "4096");
        //build a tmp file
        file = Util.createTmpFile(MAGIC + "." + Util.FILE_SUFFIX, Util.expected);
        file = Util.createTmpFile(MAGIC, Util.expected);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        LOG.debug("delete tmp file for test RollRecoveryZero " + file);
        Util.deleteTmpFile(MAGIC);
    }

    @Before
    public void setUp() throws Exception {
        appLog = new AppLog(MAGIC, file.getAbsolutePath(), System.currentTimeMillis());
        SimRecoveryServer server = new SimRecoveryServer(port, header, receives);
        serverThread = new Thread(server);
        serverThread.start();
    }

    @After
    public void tearDown() throws Exception {
//        serverThread.interrupt();
    }

    @Test
    public void test() {
        RollRecoveryZero recoveryZ = new RollRecoveryZero(Util.HOSTNAME, port, appLog, Util.rollTS);
        Thread thread = new Thread(recoveryZ);
        thread.start();
        try {
            serverThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String[] expectedHeader = new String[4];
        expectedHeader[0] = "2";
        expectedHeader[1] = MAGIC;
        expectedHeader[2] = "3600";
        expectedHeader[3] = String.valueOf(Util.rollTS);
        assertArrayEquals("head not match", expectedHeader, header.toArray());
        assertEquals("loader function fail.", Util.expected, receives.get(receives.size()-1));
    }
}
