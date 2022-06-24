
import org.w3c.dom.*;
import javax.xml.parsers.*;
import org.xml.sax.SAXException;
import java.io.*;

public class Patients{
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//Get Document Builder
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		 
		//Build Document
		Document document = builder.parse(new File("F:\\patients.xml"));
		 
		//Normalize the XML Structure; It's just too important !!
		document.getDocumentElement().normalize();
		 
		//Here comes the root node
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());
		
		NodeList nList = document.getElementsByTagName("patient");
		System.out.println("============================");
		 
		for (int temp = 0; temp < nList.getLength(); temp++)
		{
			 Node node = nList.item(temp);
			 System.out.println("");    //Just a separator
			 if (node.getNodeType() == Node.ELEMENT_NODE)
			 {
				Element element = (Element) node;
				System.out.println("id: " + element.getAttribute("id"));
				System.out.println("Name: " + element.getElementsByTagName("name").item(0).getTextContent());
				System.out.println("Phone No: " + element.getElementsByTagName("phone").item(0).getTextContent());
				System.out.println("Email: " + element.getElementsByTagName("email").item(0).getTextContent());
			 }
		}
	}
}