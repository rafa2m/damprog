package dam.temaseis.listapropia;

import java.util.Iterator;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Ejemplo de lista simple sin usar clases Java, se implementa la interfaz Iterator
 * para recorrer los elementos de la lista sin usar la posición de los mismos
 * @author rafa
 * @param <T> Tipo de datos de los nodos de la lista
 * @version 1.0
 */
public class ListaSimple<T> implements Iterator{
	//mantiene la referencia al primer elemento de la lista
	private NodoLista<T> start=null;
	private NodoLista<T> current=start;
	private int size=0;
	private boolean iterating=false;
	/**
	 * Añade un nuevo nodo a la lista
	 * @param info Información que contiene el nuevo nodo
	 */
	public void add(@NonNull T info) {
		//si la lista está vacía, el nuevo nodo es el primero y el último
		if(this.isEmpty()) {			
			this.start = new NodoLista<T>(info,null);
			this.start.setNextNode(null);
			this.current = start;
		}else {
			//si la lista no está vacía hay que recorrerla desde el 
			//inicio hasta el final
			NodoLista<T> nodoActual = start;
			while(nodoActual.getNextNode()!=null) {
				nodoActual=nodoActual.getNextNode();
			}
			//hemos llegado al final de la lista
			nodoActual.setNextNode(new NodoLista<T>(info,null));
		}
		this.size++;
	}
	/**
	 * Inserta un nodo en la posición indicada como parámetro
	 * @param info Información del nodo que se va a insertar
	 * @param pos Posición de la lista donde se insertará el nuevo nodo
	 * @return True si se consigue realizar la inserción
	 */
	public boolean insert(@NonNull T info, int pos) {		
		int index=1;
		NodoLista<T> nodoActual = null;
		NodoLista<T> nodoLista = new NodoLista<T>(info,null);
		//la lista está vacía
		if(this.isEmpty()) return false;
		//la posición de inserción no es correcta
		if(pos<1 || pos>(this.getSize()+1))
			return false;		
		//se intenta insertar al principio de la lista
		if(pos==1) {			
			nodoLista.setNextNode(this.start);
			this.start = nodoLista;
			this.size++;
			return true;
		}else if(pos == (this.size+1)) {
			//se intenta insertar al final
			nodoActual = this.start;
			while(nodoActual.getNextNode()!=null) {
				nodoActual = nodoActual.getNextNode();
			}
			nodoActual.setNextNode(nodoLista);
			this.size++;
			return true;					
		}else {
			//se intenta insertar en medio
			nodoActual = this.start;
			while(index<pos-1) {				
				index++;		
				nodoActual = nodoActual.getNextNode();
			}			
			nodoLista.setNextNode(nodoActual.getNextNode());
			nodoActual.setNextNode(nodoLista);						
			this.size++;
			return true;
		}		
	}
	//TODO
	public NodoLista<T> delete(@NonNull T info){
		NodoLista<T> previousNode=this.start;
		NodoLista<T> currentNode=this.start;
		//si la lista está vacía se devuelve nulo
		if(this.isEmpty())
			return null;
		
		//el nodo a eliminar es el primero
		if(this.start.getInfo().equals(info)) {
			if(this.size==1)
				this.start=null;
			else {
				this.start =this.start.getNextNode();
				previousNode = this.start;
			}
			this.size--;
			return previousNode;
		}else {
			NodoLista<T> toReturn = currentNode;			
			while(currentNode!=null) {
				if(currentNode.getInfo().equals(info)) {
					toReturn = currentNode;
					previousNode.setNextNode(currentNode.getNextNode());
					currentNode=null;
					break;
				}
				previousNode = currentNode;
				currentNode=currentNode.getNextNode();
			}
			this.size--;
			return toReturn;
		}
	}
	/**
	 * Obtiene el nodo de la lista indicado a partir de la información
	 * que contiene el nodo indicada como parámetro
	 * @param info Información del nodo que se busca
	 * @return Un nodo de la lista con la información buscada o null
	 * en caso de lista vacía o no encontrado
	 */
	public NodoLista<T> get(@NonNull T info){
		//si la lista está vacía se devuelve nulo
		if(this.isEmpty())
			return null;
		NodoLista<T> find=this.start;
		while(find.getNextNode()!=null || !find.getInfo().equals(info))
			find = find.getNextNode();

		return find.getInfo().equals(info)?find:null;
	}
	/**
	 * La lista estará vacía si el nodo de inicio es nulo
	 * @return True si la lista no está vacía
	 */
	public boolean isEmpty() {
		return start==null;
	}
	/**
	 * Número de elementos de la lista
	 * @return
	 */
	public int getSize() {
		return size;
	}
	@Override
	public boolean hasNext() {
		if(!iterating) { 
			this.current = this.start;
			this.iterating=true;
		}
		else if(this.current==null) {
			this.iterating=false;
		}
			
		return this.current!=null;		
	}
	@Override
	public Object next() {
		NodoLista<T> toReturn=this.current;
		this.current=current.getNextNode();
		return toReturn.getInfo();
	}	
}
