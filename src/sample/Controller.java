package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label HelloWorld;

    public void SayHelloID(ActionEvent actionEvent) {
        HelloWorld.setText("Hello World");
    }
}
