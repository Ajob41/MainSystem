import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class Start extends Application:
  override def start(primaryStage: Stage): Unit =
    val btn = Button("Say 'Hello World'")
    btn.setOnAction(_ => println("Hello World!"))

    val root = StackPane(btn)
    val scene = Scene(root, 300, 250)

    primaryStage.setTitle("Hello World!")
    primaryStage.setScene(scene)
    primaryStage.show()

@main def main(args: String*): Unit =
  Application.launch(classOf[Start], args: _*)
