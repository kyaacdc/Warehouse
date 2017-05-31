name := """play-java-seed"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.11"

PlayKeys.externalizeResources := false

libraryDependencies += javaJdbc
libraryDependencies += "mysql" % "mysql-connector-java" % "6.0.6"

libraryDependencies ++= Seq(
  evolutions,
  javaJpa,
  javaJdbc,
  "mysql" % "mysql-connector-java" % "6.0.6",
  "org.hibernate" % "hibernate-entitymanager" % "5.2.10.Final" // replace by your jpa implementation
)
