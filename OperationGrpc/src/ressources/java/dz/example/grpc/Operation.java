// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: operation.proto

package ressources.java.dz.example.grpc;

public final class Operation {
  private Operation() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ressources_java_dz_example_grpc_Operands_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ressources_java_dz_example_grpc_Operands_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ressources_java_dz_example_grpc_Result_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ressources_java_dz_example_grpc_Result_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ressources_java_dz_example_grpc_Points_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ressources_java_dz_example_grpc_Points_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ressources_java_dz_example_grpc_Point_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ressources_java_dz_example_grpc_Point_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017operation.proto\022\037ressources.java.dz.ex" +
      "ample.grpc\" \n\010Operands\022\t\n\001a\030\001 \001(\005\022\t\n\001b\030\002" +
      " \001(\005\"\025\n\006Result\022\013\n\003res\030\001 \001(\002\"p\n\006Points\0222\n" +
      "\002p1\030\001 \001(\0132&.ressources.java.dz.example.g" +
      "rpc.Point\0222\n\002p2\030\002 \001(\0132&.ressources.java." +
      "dz.example.grpc.Point\"\035\n\005Point\022\t\n\001x\030\001 \001(" +
      "\005\022\t\n\001y\030\002 \001(\0052\341\003\n\nOperations\022Y\n\003add\022).res" +
      "sources.java.dz.example.grpc.Operands\032\'." +
      "ressources.java.dz.example.grpc.Result\022_" +
      "\n\tsubstract\022).ressources.java.dz.example" +
      ".grpc.Operands\032\'.ressources.java.dz.exam" +
      "ple.grpc.Result\022\\\n\006multip\022).ressources.j" +
      "ava.dz.example.grpc.Operands\032\'.ressource" +
      "s.java.dz.example.grpc.Result\022\\\n\006divide\022" +
      ").ressources.java.dz.example.grpc.Operan" +
      "ds\032\'.ressources.java.dz.example.grpc.Res" +
      "ult\022[\n\007distace\022\'.ressources.java.dz.exam" +
      "ple.grpc.Points\032\'.ressources.java.dz.exa" +
      "mple.grpc.ResultB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ressources_java_dz_example_grpc_Operands_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ressources_java_dz_example_grpc_Operands_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ressources_java_dz_example_grpc_Operands_descriptor,
        new java.lang.String[] { "A", "B", });
    internal_static_ressources_java_dz_example_grpc_Result_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ressources_java_dz_example_grpc_Result_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ressources_java_dz_example_grpc_Result_descriptor,
        new java.lang.String[] { "Res", });
    internal_static_ressources_java_dz_example_grpc_Points_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ressources_java_dz_example_grpc_Points_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ressources_java_dz_example_grpc_Points_descriptor,
        new java.lang.String[] { "P1", "P2", });
    internal_static_ressources_java_dz_example_grpc_Point_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ressources_java_dz_example_grpc_Point_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ressources_java_dz_example_grpc_Point_descriptor,
        new java.lang.String[] { "X", "Y", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}