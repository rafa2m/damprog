package dam.temaseis.xml;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.eclipse.jdt.annotation.NonNull;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
/**
 * Ejemplo de manipulación de XML y DOM
 * @author rafa
 * @version 1.0
 */
public class TestXml {

	public static void main(String[] args) {
		TestXml txml = new TestXml();
		//construye un DOM a partir de una cadena XML
		//txml.stringToDom();

		//construye un DOM a partir de un fichero XML
		Document document = txml.xmlFileToDom();

		//buscamos la primera etiqueta book
		/*Element element= txml.findElementByTagName(document, "Cost");
		if(element!=null) {
			//si la encontramos mostramos el texto de la etiqueta
			System.out.println(element.getTextContent());
			//se muestran todos los atributos y valores correspondientes
			if(element.getAttributes().getLength()>0) {	
				for(int i=0;i<element.getAttributes().getLength();i++) {
					Node item = element.getAttributes().item(i);
					System.out.println("Atributo:" + 
							item.getNodeName()+
							", valor:" + item.getNodeValue());
				}
			}

			//obtenemos la lista de nodos hijos de uno dado
			System.out.println("Nodos hijos de uno indicado");
			element = (Element)document.getFirstChild();
			if(element!=null) {
				NodeList nodeList=txml.getChilds(document, element);
				for(int i=0;i<nodeList.getLength();i++)
					System.out.println(nodeList.item(i).getNodeName() + ", tipo:" 
							+ txml.getNodeTypeName(nodeList.item(i).getNodeType()));
			}
		}*/

		//se añade un nuevo nodo al DOM
		txml.newNode(document);
		System.out.println(document.getElementsByTagName("Book").getLength());

		//se actualiza el fichero XML a partir del DOM
		txml.domToFile(document);
		
		//se elimina el nuevo nodo añadido al DOM y actualiza el fichero
		if(txml.removeNode(document, "3"))
			System.out.println("Se ha eliminado el nodo Book con id 3");
		txml.domToFile(document);
	}
	/**
	 * Convierte una cadena XML a objeto de tipo DOM
	 */
	private void stringToDom() {
		String xmlDocument = "<?xml version='1.0' encoding='UTF-8' ?>"
				+ "<library>"
				+ "<book id=\"1\">Effective Java</book>"
				+ "<book id=\"2\">Java Concurrency In Practice</book>"
				+ "</library>";

		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		// This is useless here, because the XML does not have namespaces, 
		//but this option is usefull to know in cas
		documentBuilderFactory.setNamespaceAware(true);
		DocumentBuilder documentBuilder;

		// There are various options here, to read from an InputStream, from a file, ...
		try {
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse(new InputSource(new StringReader(xmlDocument)));

			System.out.println("Root of the XML Document: " + 
			document.getDocumentElement().getLocalName());
			System.out.println("Iterate the contents using getChildNodes()");
			// Iterate the contents
			NodeList firstLevelChildren = document.getDocumentElement().getChildNodes();
			for (int i = 0; i < firstLevelChildren.getLength(); i++) {
				Node item = firstLevelChildren.item(i);
				System.out.println("First level child found, XML tag name is: " 
				+ item.getLocalName());
				System.out.println("\tid attribute of this tag is : " 
				+ item.getAttributes().getNamedItem("id").getTextContent());
			}
			// Another way would have been
			System.out.println("Iterate the contents using getElementsByTagName()");
			NodeList allBooks = document.getDocumentElement().getElementsByTagName("book");
			for(int i=0;i<allBooks.getLength();i++) {
				Node item = firstLevelChildren.item(i);
				System.out.println("First level child found, XML tag name is: " 
				+ item.getLocalName());
				System.out.println("\tid attribute of this tag is : " 
				+ item.getAttributes().getNamedItem("id").getTextContent());
			}

		} catch (SAXException | IOException | ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Convierte un DOM a un fichero XML
	 * @param document Objeto DOM a convertir
	 */
	private void domToFile(@NonNull Document document) {
		try {
			// 1º Creamos una instancia de la clase File para acceder al archivo donde guardaremos el XML.
			File f=new File(this.getFileFromResource("library.xml"));

			//2º Creamos una nueva instancia del transformador a través de la fábrica de transformadores.
			Transformer transformer = TransformerFactory.newInstance().newTransformer();

			//3º Establecemos algunas opciones de salida, como por ejemplo, la codificación de salida.
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

			//4º Creamos el StreamResult, que intermediará entre el transformador y el archivo de destino.
			StreamResult result = new StreamResult(f);            

			//5º Creamos el DOMSource, que intermediará entre el transformador y el árbol DOM.
			DOMSource source = new DOMSource(document);

			//6º Realizamos la transformación.
			transformer.transform(source, result);         

		} catch (TransformerException ex) {
			System.out.println("¡Error! No se ha podido llevar a cabo la transformación.");            
		}

	}
	/**
	 * Elimina el nodo indicado como parámtro
	 * @param document DOM sobre el que se realizará la eliminación
	 * @param id Identificador del nodo a eliminar
	 * @return True si lo elimina
	 */
	private boolean removeNode(@NonNull Document document,@NonNull String id) {
		Element element=document.getElementById(id);				
		return element.getParentNode().removeChild(element)!=null;	
	}
	/**
	 * Obtiene un nodo por el nombre de su tipo
	 * @param nodeType Tipo de nodo
	 * @return Cadena con el nombre del tipo del nodo
	 */
	private String getNodeTypeName(int nodeType) {
		switch(nodeType) {
		case Node.ELEMENT_NODE:
			return "Elemento";
		case Node.TEXT_NODE:
			return "texto";
		case Node.ATTRIBUTE_NODE:
			return "atributo";
		case Node.COMMENT_NODE:
			return "comentario";
		default:
			return "";
		}
	}
	/**
	 * Obtiene los nodos hijos de uno dado como parámetro
	 * @param document DOM del que se van a obtener los nodos hijos
	 * @param element Nodo a partir del cual se obtendrán los hijos
	 * @return Lista de nodos hijos
	 */
	private NodeList getChilds(@NonNull Document document, 
			@NonNull Element element) {
		NodeList nodeList=element.getChildNodes();
		for (int i=0; i<nodeList.getLength();i++) {
			Node nodo=nodeList.item(i);
			switch (nodo.getNodeType()){
			case Node.ELEMENT_NODE:
				Element elemento = (Element) nodo;
				System.out.println("Etiqueta:" + 
						elemento.getTagName());
				break;
			case Node.TEXT_NODE:
				Text texto = (Text) nodo;
				System.out.println("Texto:" + 
						texto.getWholeText());
				break;
			}      
		}
		return nodeList;
	}
	/**
	 * Obtener un elemento del DOM a partir de la etiqueta de un nodo dado
	 * @param document DOM sobre le que se obtiene el nodo
	 * @param tagName Etiqueta del nodo a buscar
	 * @return Null si no se encuentra o la instancia del nodo encontrado
	 */
	private Element findElementByTagName(@NonNull Document document,
			@NonNull String tagName) {
		NodeList listaNodos=document.
				getElementsByTagName(tagName);
		Element cliente=null;
		if (listaNodos.getLength()>0){
			cliente=(Element)listaNodos.item(0);
		}
		return cliente;
	}
	/**
	 * Convierte un fichero XML a un objeto DOM
	 * @return Devuelve el objeto DOM correspondiente a un fichero XML
	 */
	private Document xmlFileToDom() {
		try {
			URI uriFile = getFileFromResource("library.xml");
			// 1º Creamos una nueva instancia de un fábrica de constructores de documentos.DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			//dbf.setNamespaceAware(true);

			// 2º A partir de la instancia anterior, fabricamos un constructor de documentos, que procesará el XML.
			DocumentBuilder db = dbf.newDocumentBuilder();

			// 3º Procesamos el documento (almacenado en un archivo) y lo convertimos en un árbol DOM.
			Document documento=db.parse(uriFile.toString());

			return documento;
		} catch (Exception ex) {
			System.out.println("¡Error! No se ha podido cargar el documento XML.");
		}  
		return null;
	}
	/**
	 * Crea un nuevo nodo en el DOM pasado como parámetro
	 * @param document DOM sobre el que se creará el nuevo nodo
	 */
	private void newNode(@NonNull Document document) {
		Element bookNode=document.
				createElement("Book");
		bookNode.setAttribute("id", 
				String.valueOf(document.getElementsByTagName("Book").getLength()+1));
		Element titleNode= document.createElement("Title");
		titleNode.setTextContent("Core Java Volume I – Fundamentals");
		Element authorNode = document.createElement("Author");
		authorNode.setTextContent("Cay S. Horstmann");
		Element dateNode = document.createElement("Date");
		dateNode.setTextContent("2020");
		Element isbnNode = document.createElement("ISBN");
		isbnNode.setTextContent("0135166306");
		Element publisherNode = document.createElement("Publisher");
		publisherNode.setTextContent("Pearson");
		Element costNode = document.createElement("Cost");
		costNode.setAttribute("currency", "€");
		costNode.setTextContent("56,20");

		bookNode.appendChild(titleNode);
		bookNode.appendChild(authorNode);
		bookNode.appendChild(dateNode);
		bookNode.appendChild(isbnNode);
		bookNode.appendChild(publisherNode);
		bookNode.appendChild(costNode);

		document.getDocumentElement().appendChild(bookNode);
	}
	/**
	 * Obtiene la URI de un fichero
	 * @param fileName Nombre del fichero para construir la URI
	 * @return URI del fichero indicado
	 */
	private URI getFileFromResource(String fileName) {
		URL resource=null;
		URI uri = null;

		ClassLoader classLoader = getClass().getClassLoader();		
		try {
			resource = classLoader.getResource(fileName);
			if(resource!=null)
				uri=resource.toURI();  

		}catch(NullPointerException | URISyntaxException e) {
			return uri;
		}
		return uri;
	}
}
