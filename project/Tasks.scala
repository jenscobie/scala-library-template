import sbt._

object Tasks {

  lazy val compileAllTask = addCommandAlias("compile-all", ";compile ;test:compile")
  lazy val preCommitTask = addCommandAlias("pre-commit", ";test")
}
