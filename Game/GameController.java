package Game;

import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable {
    @FXML
    public AnchorPane pane1;

    @FXML
    public AnchorPane pane2;

    @FXML
    public Circle ball;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        RotateTransition rotateTransition = new RotateTransition();
        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setDuration(Duration.seconds(1));
        translateTransition.setNode(pane2);
        translateTransition.setToY(-100);


        rotateTransition.setDuration(Duration.seconds(1));
        rotateTransition.setNode(pane1);

        rotateTransition.setByAngle(360);

        rotateTransition.setCycleCount(100);

        rotateTransition.setAutoReverse(false);

        translateTransition.setAutoReverse(true);
        translateTransition.setCycleCount(50);

        translateTransition.play();
        rotateTransition.play();
    }
}
