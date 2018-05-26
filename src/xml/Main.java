package xml;

import java.io.File;
import java.rmi.UnmarshalException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Main {

	public static void main(String[] args) {
		crearXml();
	}
	public static void crearXml() {
		try {
			List<codigo> codigos = new ArrayList<>();
			codigo c1 = new codigo("123", "456", "789", "111");
			codigo c2 = new codigo("123", "456", "789", "222");
			
			codigos.add(c1);
			codigos.add(c2);
			
			xmlPrueba xml = new xmlPrueba();
			xml.setCodigos(codigos);

			//JABX contexto
			JAXBContext ctx = JAXBContext.newInstance(xmlPrueba.class);
		
			Marshaller ms = ctx.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			ms.marshal(xml, new File("C:\\Users\\Ba\\eclipse-workspace\\org.tec.odyssey\\bin\\xmls\\Ejemplo.xml"));
		
		
		
		} catch (JAXBException e) {
			// TODO: handle exception
		}
		
	}
	public static void leerXml() {
		try {
			
			JAXBContext ctx = JAXBContext.newInstance(xmlPrueba.class);
			Unmarshaller ums = ctx.createUnmarshaller();
			
			xmlPrueba xml = (xmlPrueba) ums.unmarshal(
					new File("C:\\Users\\Ba\\eclipse-workspace\\org.tec.odyssey\\bin\\xmls\\Ejemplo.xml")
				 );
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}


