package ar.edu.unlu.pila;

public class Pila {
	private Nodo tope = null;

	public void meter(Object dato) {
		Nodo nuevoNodo = new Nodo();
		nuevoNodo.setDato(dato);
		if (tope == null) {
			tope = nuevoNodo;
		} else {
			nuevoNodo.setProximo(tope);
			tope = nuevoNodo;
		}
	}

	public Object sacar() {
		Object dato = "";
		if (!estaVacia()) {
			dato = tope.getDato();
			tope = tope.getProximo();
		}
		return dato;

	}

	public String tieneDatos() {
		if (estaVacia()) {
			return "esta vacia";
		} else {
			return "tiene datos";
		}
	}

	public Boolean estaVacia() {
		if (tope == null) {
			return true;
		} else {
			return false;
		}
	}

}
