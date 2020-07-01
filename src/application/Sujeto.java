package application;

import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Sujeto implements EventHandler<ActionEvent> {
	private VBox root ;
	private Button btn1 ;
	private Button btn2 ;
	private Button btn3 ;
	
	public Sujeto() {
		createContent();
	}
	private void createContent() {
		 btn1 = new Button("Verde");
	     btn2 = new Button("Amarillo");
	     btn3 = new Button("Negro");
	     
	     root = new VBox();
	     
	     root.getChildren().addAll(btn1,btn2,btn3);
	     
	     VBox.setMargin(btn1, new Insets(20, 20, 20, 20)); 
	     VBox.setMargin(btn2, new Insets(20, 20, 20, 20)); 
	     VBox.setMargin(btn3, new Insets(20, 20, 20, 20)); 
	     
	     root.setAlignment(Pos.CENTER);
	     
	     btn1.setOnAction((ActionEvent event) -> {
	    	 root.setStyle("-fx-background-color: MediumSeaGreen");
	     });
	     
	     btn2.setOnAction((ActionEvent event) -> {
	    	 root.setStyle("-fx-background-color: Yellow");
	     });
	     
	     btn3.setOnAction((ActionEvent event) -> {
	    	 root.setStyle("-fx-background-color: Black");
	     });
	     
	}
	
	public VBox getRoot() {	
		return root;
	}
	@Override
	public void handle(ActionEvent event) {
		
		
	}
	

	

}