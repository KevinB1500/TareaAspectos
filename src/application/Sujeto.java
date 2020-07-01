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
		 btn1 = new Button("Color 1");
	     btn2 = new Button("Color 2");
	     btn3 = new Button("Color 3");
	     root = new VBox();
	     root.getChildren().addAll(btn1,btn2,btn3);
	     root.setMargin(btn1, new Insets(20, 20, 20, 20)); 
	     root.setMargin(btn2, new Insets(20, 20, 20, 20)); 
	     root.setMargin(btn3, new Insets(20, 20, 20, 20)); 
	     root.setAlignment(Pos.CENTER);
	}
	
	public VBox getRoot() {	
		return root;
	}
	
	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}



	

}