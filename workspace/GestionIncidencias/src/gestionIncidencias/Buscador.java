
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author pedro
 */
public class Buscador {
    
    private static XPath xpath;
    private static XPathExpression exp;
    

public static void main(String[] args) {
     String texto = EjecutaXPath();
     System.out.println(texto);

}

    
public static String EjecutaXPath() {
  
        String salida = "";
        try {
            //Crea el object xpathfactory
            
            xpath = XPathFactory.newInstance().newXPath();
            
            
            
            
        }
            
            

}      




}
