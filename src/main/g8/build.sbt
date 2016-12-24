name := """$name$"""

organization := "$organization$"

version := "1.0-SNAPSHOT"

scalaVersion := "$scala_version$"

scalaSource in Compile := baseDirectory.value / "app"

scalaSource in Test := baseDirectory.value / "tests"

resourceDirectory in Compile := baseDirectory.value / "res"

resourceDirectory in Test := baseDirectory.value / "res"

mainClass in Compile := Some("org.reactivecouchbase.webstack.WebStack")
mainClass in reStart := Some("org.reactivecouchbase.webstack.WebStack")

libraryDependencies += "org.reactivecouchbase.webstack" %% "webstack-core-scala" % "$webstack_version$"
libraryDependencies += "org.scalatest" %% "scalatest" % "$scala_test_version$" % "test"

resolvers += "webstack-snapshots-repository" at "https://raw.github.com/mathieuancelin/webstack-scala/master/repository/snapshots"
resolvers += "webstack-releases-repository" at "https://raw.github.com/mathieuancelin/webstack-scala/master/repository/releases"
