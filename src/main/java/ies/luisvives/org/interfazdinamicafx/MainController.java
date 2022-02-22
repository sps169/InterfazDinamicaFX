package ies.luisvives.org.interfazdinamicafx;

import javafx.animation.Animation;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class MainController {
	@FXML
	Button menu_button;

	@FXML
	Button show_panel_1_button;

	@FXML
	Button show_panel_2_button;

	@FXML
	VBox menu;

	@FXML
	StackPane view_1;

	@FXML
	StackPane view_2;

	@FXML
	public void initialize() {
		menu.toFront();
		menu_button.toFront();
		view_1.setVisible(true);
		view_1.toBack();
		view_2.setVisible(false);
		view_2.toBack();
	}

	@FXML
	private void onClickMenuButton(ActionEvent event) {
		TranslateTransition transition = new TranslateTransition(Duration.millis(100),menu);
		if (menu.translateXProperty().getValue() == 0) {
			transition.setFromX(0);
			transition.setToX(-200);
		}else {
			transition.setFromX(-200);
			transition.setToX(0);
		}
		transition.play();
		menu.toFront();
	}

	@FXML
	private void onClickLayout1Button(ActionEvent event) {
		view_1.setVisible(true);
		view_2.setVisible(false);
		view_1.toFront();
	}

	@FXML
	private void onClickLayout2Button(ActionEvent event) {
		view_1.setVisible(false);
		view_2.setVisible(true);
		view_2.toFront();
	}
}
