import Dependencies._

ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "producer",
        libraryDependencies += scalaTest % Test,
    libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "2.7.0")

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
