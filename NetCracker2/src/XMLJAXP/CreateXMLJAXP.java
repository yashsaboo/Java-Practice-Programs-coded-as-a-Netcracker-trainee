package XMLJAXP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class CreateXMLJAXP {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		
		JAXBContext jContent = JAXBContext.newInstance(ProductCollection.class);
		
		ProductCollection coll = new ProductCollection();
		
		Product product = new Product();
		product.setId("1000");
		product.setName("Laptop");
		product.setPrice("35000");
		product.setQuantity("20");
		
		Product product1 = new Product();
		product1.setId("1001");
		product1.setName("LED");
		product1.setPrice("4000");
		product1.setQuantity("10");
		
		coll.getProdList().add(product);
		coll.getProdList().add(product1);
		
		Marshaller marshaller = jContent.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(coll, new PrintWriter(new File("src/jaxpfile2.xml")));
		
	}

}
