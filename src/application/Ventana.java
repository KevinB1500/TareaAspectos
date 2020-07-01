package application;
import application.Observer;
import javafx.scene.layout.VBox;

public class Ventana implements Observer {
	private VBox vbox;
	public Ventana() {
		vbox=new VBox();
	}
	@Override
	public void actualizarColor(String color) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		vbox.setStyle("-fx-background-color: "+color);
	}
	public VBox getVentana() {
		return this.vbox;
	}

}
