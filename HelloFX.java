package hellow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloFX {

	ArrayList<String> colors = new ArrayList<String>(
			Arrays.asList("orangered", "white", "green", "blue", "black", "red"));

	@FXML
	private Button neatButton;

	@FXML
	protected void handleSubmitButtonAction(ActionEvent event) {
		System.out.println("Neat!");
		int num = getRandomNumberInRange(0, 5);
		System.out.println("num = " + num);
		neatButton.setStyle("-fx-background-color: " + this.colors.get(num));
		num = (int) Math.random() * 5;
	}

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	@FXML
	protected void handleSubmitButtonTouch(ActionEvent event) {
		System.out.println("THAT TICKLES");
	}

}
