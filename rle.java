package compressioni;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class rle extends Application{
	String mImg[][] = new String[3][3];
	TextField tMatrice = new TextField();
	Button calcola  = new Button();
	Label lRis = new Label();
	
	public void start(Stage finestra) {
		GridPane griglia = new GridPane();
		Scene scena = new Scene(griglia);
		
		griglia.setAlignment(Pos.CENTER);
		griglia.setPadding(new  Insets(10));
		griglia.setHgap(10);
		griglia.setVgap(10);
		griglia.add(tMatrice,0,0);
		griglia.add(calcola, 0, 1);
		griglia.add(lRis, 0, 2);
		
		calcola.setOnAction(e->calcola());
		
		finestra.setScene(scena);
		finestra.setTitle("rle");
		finestra.show();
	}
	private void calcola() {
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
