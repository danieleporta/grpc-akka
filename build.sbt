name := "grpc-akka"

version := "0.1"

scalaVersion := "2.13.1"

enablePlugins(AkkaGrpcPlugin)
// ALPN agent
enablePlugins(JavaAgent)
javaAgents += "org.mortbay.jetty.alpn" % "jetty-alpn-agent" % "2.0.9" % "runtime;test"

//PB.targets in Compile := Seq(
//  scalapb.gen() -> (sourceManaged in Compile).value
//)


libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.8" % "test",
  "io.grpc" % "grpc-netty" % scalapb.compiler.Version.grpcJavaVersion, //netty transport of grpc
  "io.grpc" % "grpc-protobuf" % scalapb.compiler.Version.grpcJavaVersion, //protobuf message encoding for java implementation
  "io.grpc" % "grpc-services" % scalapb.compiler.Version.grpcJavaVersion,
  "io.grpc" % "grpc-services" % scalapb.compiler.Version.grpcJavaVersion % "protobuf",
  "org.scalacheck" %% "scalacheck" % "1.14.0" % "test",
  "javax.annotation" % "javax.annotation-api" % "1.3.2", // needed for grpc-java on JDK9
  "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf"
)

