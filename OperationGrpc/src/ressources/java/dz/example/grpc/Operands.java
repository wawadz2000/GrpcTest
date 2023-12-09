// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: operation.proto

package ressources.java.dz.example.grpc;

/**
 * Protobuf type {@code ressources.java.dz.example.grpc.Operands}
 */
public final class Operands extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ressources.java.dz.example.grpc.Operands)
    OperandsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Operands.newBuilder() to construct.
  private Operands(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Operands() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Operands();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ressources.java.dz.example.grpc.Operation.internal_static_ressources_java_dz_example_grpc_Operands_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ressources.java.dz.example.grpc.Operation.internal_static_ressources_java_dz_example_grpc_Operands_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ressources.java.dz.example.grpc.Operands.class, ressources.java.dz.example.grpc.Operands.Builder.class);
  }

  public static final int A_FIELD_NUMBER = 1;
  private int a_ = 0;
  /**
   * <code>int32 a = 1;</code>
   * @return The a.
   */
  @java.lang.Override
  public int getA() {
    return a_;
  }

  public static final int B_FIELD_NUMBER = 2;
  private int b_ = 0;
  /**
   * <code>int32 b = 2;</code>
   * @return The b.
   */
  @java.lang.Override
  public int getB() {
    return b_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (a_ != 0) {
      output.writeInt32(1, a_);
    }
    if (b_ != 0) {
      output.writeInt32(2, b_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (a_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, a_);
    }
    if (b_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, b_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ressources.java.dz.example.grpc.Operands)) {
      return super.equals(obj);
    }
    ressources.java.dz.example.grpc.Operands other = (ressources.java.dz.example.grpc.Operands) obj;

    if (getA()
        != other.getA()) return false;
    if (getB()
        != other.getB()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + A_FIELD_NUMBER;
    hash = (53 * hash) + getA();
    hash = (37 * hash) + B_FIELD_NUMBER;
    hash = (53 * hash) + getB();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ressources.java.dz.example.grpc.Operands parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ressources.java.dz.example.grpc.Operands parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ressources.java.dz.example.grpc.Operands parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ressources.java.dz.example.grpc.Operands parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ressources.java.dz.example.grpc.Operands parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ressources.java.dz.example.grpc.Operands parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ressources.java.dz.example.grpc.Operands parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ressources.java.dz.example.grpc.Operands parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ressources.java.dz.example.grpc.Operands parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ressources.java.dz.example.grpc.Operands parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ressources.java.dz.example.grpc.Operands parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ressources.java.dz.example.grpc.Operands parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ressources.java.dz.example.grpc.Operands prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ressources.java.dz.example.grpc.Operands}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ressources.java.dz.example.grpc.Operands)
      ressources.java.dz.example.grpc.OperandsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ressources.java.dz.example.grpc.Operation.internal_static_ressources_java_dz_example_grpc_Operands_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ressources.java.dz.example.grpc.Operation.internal_static_ressources_java_dz_example_grpc_Operands_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ressources.java.dz.example.grpc.Operands.class, ressources.java.dz.example.grpc.Operands.Builder.class);
    }

    // Construct using ressources.java.dz.example.grpc.Operands.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      a_ = 0;
      b_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ressources.java.dz.example.grpc.Operation.internal_static_ressources_java_dz_example_grpc_Operands_descriptor;
    }

    @java.lang.Override
    public ressources.java.dz.example.grpc.Operands getDefaultInstanceForType() {
      return ressources.java.dz.example.grpc.Operands.getDefaultInstance();
    }

    @java.lang.Override
    public ressources.java.dz.example.grpc.Operands build() {
      ressources.java.dz.example.grpc.Operands result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ressources.java.dz.example.grpc.Operands buildPartial() {
      ressources.java.dz.example.grpc.Operands result = new ressources.java.dz.example.grpc.Operands(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ressources.java.dz.example.grpc.Operands result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.a_ = a_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.b_ = b_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ressources.java.dz.example.grpc.Operands) {
        return mergeFrom((ressources.java.dz.example.grpc.Operands)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ressources.java.dz.example.grpc.Operands other) {
      if (other == ressources.java.dz.example.grpc.Operands.getDefaultInstance()) return this;
      if (other.getA() != 0) {
        setA(other.getA());
      }
      if (other.getB() != 0) {
        setB(other.getB());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              a_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              b_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int a_ ;
    /**
     * <code>int32 a = 1;</code>
     * @return The a.
     */
    @java.lang.Override
    public int getA() {
      return a_;
    }
    /**
     * <code>int32 a = 1;</code>
     * @param value The a to set.
     * @return This builder for chaining.
     */
    public Builder setA(int value) {

      a_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 a = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearA() {
      bitField0_ = (bitField0_ & ~0x00000001);
      a_ = 0;
      onChanged();
      return this;
    }

    private int b_ ;
    /**
     * <code>int32 b = 2;</code>
     * @return The b.
     */
    @java.lang.Override
    public int getB() {
      return b_;
    }
    /**
     * <code>int32 b = 2;</code>
     * @param value The b to set.
     * @return This builder for chaining.
     */
    public Builder setB(int value) {

      b_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 b = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearB() {
      bitField0_ = (bitField0_ & ~0x00000002);
      b_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ressources.java.dz.example.grpc.Operands)
  }

  // @@protoc_insertion_point(class_scope:ressources.java.dz.example.grpc.Operands)
  private static final ressources.java.dz.example.grpc.Operands DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ressources.java.dz.example.grpc.Operands();
  }

  public static ressources.java.dz.example.grpc.Operands getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Operands>
      PARSER = new com.google.protobuf.AbstractParser<Operands>() {
    @java.lang.Override
    public Operands parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Operands> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Operands> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ressources.java.dz.example.grpc.Operands getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

