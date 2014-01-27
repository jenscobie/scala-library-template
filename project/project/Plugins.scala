import sbt._

object Plugins extends Build {

  lazy val defaultPlugins = Seq(addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.2"))

  lazy val plugins = Project("plugins",
    file("."),
    settings = Defaults.defaultSettings ++ defaultPlugins)
}