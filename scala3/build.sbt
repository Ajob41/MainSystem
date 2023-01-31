val scala3Version = "3.2.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "devdirsystem",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq("org.scalameta" %% "munit" % "0.7.29" % Test,
       "org.openjfx" % "javafx" % "20-ea+11",
        "org.openjfx" % "javafx-base" % "20-ea+11",
        "org.openjfx" % "javafx-controls" % "20-ea+11",
        "org.openjfx" % "javafx-graphics" % "20-ea+11",
        "org.openjfx" % "javafx-media" % "20-ea+11",
        "org.openjfx" % "javafx-web" % "20-ea+11",
        "org.openjfx" % "javafx-fxml" % "20-ea+11"
    )
  )
