package services;

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Addition.proto

public final class AdditionOuterClass {
  private AdditionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Operands_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Operands_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Result_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Result_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Addition.proto\" \n\010Operands\022\t\n\001a\030\001 \001(\005\022" +
      "\t\n\001b\030\002 \001(\005\"\025\n\006Result\022\013\n\003sum\030\001 \001(\0052%\n\010Add" +
      "ition\022\031\n\003add\022\t.Operands\032\007.ResultB\002P\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Operands_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Operands_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Operands_descriptor,
        new java.lang.String[] { "A", "B", });
    internal_static_Result_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Result_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Result_descriptor,
        new java.lang.String[] { "Sum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
