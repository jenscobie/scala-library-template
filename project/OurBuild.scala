import sbt._
import Keys._

object OurBuild extends Build {

  lazy val root = Project(id = "sbt-project-template",
    base = file("."),
    settings = Project.defaultSettings)
}