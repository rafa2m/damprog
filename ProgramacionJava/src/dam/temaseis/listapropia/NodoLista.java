package dam.temaseis.listapropia;

import java.util.Comparator;

import org.eclipse.jdt.annotation.NonNull;

public class NodoLista<T> implements Comparator<T> {	
	private T info; //v
	private NodoLista<T> nextNode; //s
	public NodoLista(@NonNull T info, NodoLista<T> nextNode) {
		this.info = info;
		this.nextNode = nextNode;
	}
	public T getInfo() {
		return info;
	}
	public void setInfo(@NonNull T info) {
		this.info = info;
	}
	public NodoLista<T> getNextNode() {
		return nextNode;
	}
	public void setNextNode(NodoLista<T> nextNode) {
		this.nextNode = nextNode;
	}
	@Override
	public int compare(Object arg0, Object arg1) {
		NodoLista<T> nodo1, nodo2;
		//comprobar nulidad
		if(arg0==null || arg1==null)
			throw new NullPointerException();
		//comprobar tipos
		if(!(arg0 instanceof NodoLista) || !(arg1 instanceof NodoLista))
			throw new ClassCastException();
		
		if(!(((NodoLista<T>)(arg0)).getClass().getName().equals(
				((NodoLista<T>)(arg1)).getClass().getName())))
			throw new ClassCastException();		
		//comparación
		nodo1 = (NodoLista<T>)arg0;
		nodo2 = (NodoLista<T>)arg1;
		
		
		return 0;
	}	
}
