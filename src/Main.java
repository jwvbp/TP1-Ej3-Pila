import ar.edu.unlu.pila.Pila;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pila miPila = new Pila();
		System.out.println(miPila.tieneDatos());
		miPila.meter("vacas");
		miPila.meter("caballos");
		miPila.meter("perros");
		miPila.meter("gatos");
		System.out.println(miPila.tieneDatos());
		System.out.println(miPila.sacar());
		System.out.println(miPila.sacar());
		miPila.meter("atunes");
		System.out.println(miPila.sacar());
		System.out.println(miPila.sacar());
		
	}

}
