import sbt._
import Keys._
import Tasks._

object OurBuild extends Build {

  val defaultSettings = Defaults.defaultSettings ++ Seq(
    name := "scala-library-template",
    version := "1.0",
    scalaVersion := "2.10.3",
    libraryDependencies ++= Seq(Dependencies.specs2)
  ) ++
    compileAllTask ++
    preCommitTask

  lazy val root = Project(id = "scala-library-template",
    base = file("."),
    settings = Project.defaultSettings)
  .aggregate(someLibrary)

  lazy val someLibrary = Project(id = "some-library",
    base = file("some-library"),
    settings = defaultSettings)
}