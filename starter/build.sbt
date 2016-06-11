val scalatest = "org.scalatest" % "scalatest_2.12.0-M4" % "3.0.0-M16-SNAP4"

lazy val commonSettings = Seq(
    organization := "com.neopragma",
    version := "1.0",
    scalaVersion := "2.12.0-M4"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "hello",
    libraryDependencies += scalatest
  )
