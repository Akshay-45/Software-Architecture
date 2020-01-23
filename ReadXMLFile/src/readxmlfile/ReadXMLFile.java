/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readxmlfile;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author student
 */
public class ReadXMLFile {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        // TODO code application logic here
        File file = new File("C:\\Users\\student\\Documents\\NetBeansProjects\\connect.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);
        doc.getDocumentElement().normalize();
        System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
        NodeList nodeList = doc.getElementsByTagName("student");
        for (int itr = 0; itr < nodeList.getLength(); itr++) {
            Node node = nodeList.item(itr);
            System.out.println("\nNode Name :" + node.getNodeName());
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;
                System.out.println("Student id: " + eElement.getElementsByTagName("id").item(0).getTextContent());
                System.out.println("First Name: " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
                System.out.println("Last Name: " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
                System.out.println("Subject: " + eElement.getElementsByTagName("subject").item(0).getTextContent());
                System.out.println("Marks: " + eElement.getElementsByTagName("marks").item(0).getTextContent());
            }
        }
    }
}
    

