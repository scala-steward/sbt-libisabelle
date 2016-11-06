lazy val Fail = config("fail") extend(Compile)

lazy val root = project.in(file("."))
  .configs(Fail)
  .enablePlugins(LibisabellePlugin)
  .settings(
    moduleName := "test",
    isabelleVersions := List("2016"),
    LibisabellePlugin.isabelleSettings(Fail),
    isabelleSessions in Compile := List("Pure", "Test"),
    isabelleSessions in Fail := List("Test_Fail")
  )
