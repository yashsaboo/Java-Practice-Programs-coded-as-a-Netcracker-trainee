package XML;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class SaxParserDemo {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, FileNotFoundException, IOException {
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		File file = new File("src/sample2.xml");
		
		ProductHandler ph = new ProductHandler();
		parser.parse(new FileInputStream(file), ph);
		
		for(Product product:ph.getProdList())
		{
			System.out.println(product);
		}
	}
}
