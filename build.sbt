lazy val scala2112 = project.settings(
  scalaVersion := "2.11.2"
)

lazy val scala2113 = project.settings(
  scalaVersion := "2.11.3",
  dependencyOverrides := {
    dependencyOverrides.value + (
      "org.scala-lang" %% "scala-library" % scalaVersion.value
    )
  }
).dependsOn(scala2112)
