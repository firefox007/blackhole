// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AssignCollector.proto

package com.dp.blackhole.common.gen;

public final class AssignCollectorPB {
  private AssignCollectorPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AssignCollectorOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string app_name = 1;
    /**
     * <code>required string app_name = 1;</code>
     */
    boolean hasAppName();
    /**
     * <code>required string app_name = 1;</code>
     */
    java.lang.String getAppName();
    /**
     * <code>required string app_name = 1;</code>
     */
    com.google.protobuf.ByteString
        getAppNameBytes();

    // required string collector_server = 2;
    /**
     * <code>required string collector_server = 2;</code>
     */
    boolean hasCollectorServer();
    /**
     * <code>required string collector_server = 2;</code>
     */
    java.lang.String getCollectorServer();
    /**
     * <code>required string collector_server = 2;</code>
     */
    com.google.protobuf.ByteString
        getCollectorServerBytes();
  }
  /**
   * Protobuf type {@code blackhole.AssignCollector}
   */
  public static final class AssignCollector extends
      com.google.protobuf.GeneratedMessage
      implements AssignCollectorOrBuilder {
    // Use AssignCollector.newBuilder() to construct.
    private AssignCollector(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AssignCollector(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AssignCollector defaultInstance;
    public static AssignCollector getDefaultInstance() {
      return defaultInstance;
    }

    public AssignCollector getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private AssignCollector(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              appName_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              collectorServer_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dp.blackhole.common.gen.AssignCollectorPB.internal_static_blackhole_AssignCollector_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dp.blackhole.common.gen.AssignCollectorPB.internal_static_blackhole_AssignCollector_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector.class, com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector.Builder.class);
    }

    public static com.google.protobuf.Parser<AssignCollector> PARSER =
        new com.google.protobuf.AbstractParser<AssignCollector>() {
      public AssignCollector parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AssignCollector(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<AssignCollector> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string app_name = 1;
    public static final int APP_NAME_FIELD_NUMBER = 1;
    private java.lang.Object appName_;
    /**
     * <code>required string app_name = 1;</code>
     */
    public boolean hasAppName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string app_name = 1;</code>
     */
    public java.lang.String getAppName() {
      java.lang.Object ref = appName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          appName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string app_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAppNameBytes() {
      java.lang.Object ref = appName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string collector_server = 2;
    public static final int COLLECTOR_SERVER_FIELD_NUMBER = 2;
    private java.lang.Object collectorServer_;
    /**
     * <code>required string collector_server = 2;</code>
     */
    public boolean hasCollectorServer() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string collector_server = 2;</code>
     */
    public java.lang.String getCollectorServer() {
      java.lang.Object ref = collectorServer_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          collectorServer_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string collector_server = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCollectorServerBytes() {
      java.lang.Object ref = collectorServer_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        collectorServer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      appName_ = "";
      collectorServer_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasAppName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCollectorServer()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getAppNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getCollectorServerBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getAppNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getCollectorServerBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code blackhole.AssignCollector}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollectorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.dp.blackhole.common.gen.AssignCollectorPB.internal_static_blackhole_AssignCollector_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.dp.blackhole.common.gen.AssignCollectorPB.internal_static_blackhole_AssignCollector_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector.class, com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector.Builder.class);
      }

      // Construct using com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        appName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        collectorServer_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dp.blackhole.common.gen.AssignCollectorPB.internal_static_blackhole_AssignCollector_descriptor;
      }

      public com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector getDefaultInstanceForType() {
        return com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector.getDefaultInstance();
      }

      public com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector build() {
        com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector buildPartial() {
        com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector result = new com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.appName_ = appName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.collectorServer_ = collectorServer_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector) {
          return mergeFrom((com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector other) {
        if (other == com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector.getDefaultInstance()) return this;
        if (other.hasAppName()) {
          bitField0_ |= 0x00000001;
          appName_ = other.appName_;
          onChanged();
        }
        if (other.hasCollectorServer()) {
          bitField0_ |= 0x00000002;
          collectorServer_ = other.collectorServer_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasAppName()) {
          
          return false;
        }
        if (!hasCollectorServer()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.dp.blackhole.common.gen.AssignCollectorPB.AssignCollector) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string app_name = 1;
      private java.lang.Object appName_ = "";
      /**
       * <code>required string app_name = 1;</code>
       */
      public boolean hasAppName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string app_name = 1;</code>
       */
      public java.lang.String getAppName() {
        java.lang.Object ref = appName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          appName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string app_name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getAppNameBytes() {
        java.lang.Object ref = appName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          appName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string app_name = 1;</code>
       */
      public Builder setAppName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        appName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string app_name = 1;</code>
       */
      public Builder clearAppName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        appName_ = getDefaultInstance().getAppName();
        onChanged();
        return this;
      }
      /**
       * <code>required string app_name = 1;</code>
       */
      public Builder setAppNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        appName_ = value;
        onChanged();
        return this;
      }

      // required string collector_server = 2;
      private java.lang.Object collectorServer_ = "";
      /**
       * <code>required string collector_server = 2;</code>
       */
      public boolean hasCollectorServer() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string collector_server = 2;</code>
       */
      public java.lang.String getCollectorServer() {
        java.lang.Object ref = collectorServer_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          collectorServer_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string collector_server = 2;</code>
       */
      public com.google.protobuf.ByteString
          getCollectorServerBytes() {
        java.lang.Object ref = collectorServer_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          collectorServer_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string collector_server = 2;</code>
       */
      public Builder setCollectorServer(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        collectorServer_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string collector_server = 2;</code>
       */
      public Builder clearCollectorServer() {
        bitField0_ = (bitField0_ & ~0x00000002);
        collectorServer_ = getDefaultInstance().getCollectorServer();
        onChanged();
        return this;
      }
      /**
       * <code>required string collector_server = 2;</code>
       */
      public Builder setCollectorServerBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        collectorServer_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:blackhole.AssignCollector)
    }

    static {
      defaultInstance = new AssignCollector(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:blackhole.AssignCollector)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_blackhole_AssignCollector_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_blackhole_AssignCollector_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025AssignCollector.proto\022\tblackhole\"=\n\017As" +
      "signCollector\022\020\n\010app_name\030\001 \002(\t\022\030\n\020colle" +
      "ctor_server\030\002 \002(\tB0\n\033com.dp.blackhole.co" +
      "mmon.genB\021AssignCollectorPB"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_blackhole_AssignCollector_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_blackhole_AssignCollector_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_blackhole_AssignCollector_descriptor,
              new java.lang.String[] { "AppName", "CollectorServer", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
