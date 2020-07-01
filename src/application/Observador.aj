import application.Observer;

public aspect Observador{
	pointcut cambiocolor(String x): call(void Observer.actualizarColor(String)) && args(x);
	
	after(String x): cambiocolor(x){
		System.out.println("Se ha cambiado el color: "+x);
	}
}