package XML;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ProductHandler extends DefaultHandler {

	private List<Product> prodList = new ArrayList<>();

	private Product currProd=null;
	private String currEle="";

	public List<Product> getProdList() {
		return prodList;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attribute) throws SAXException {
		currEle = qName;
		if ("product".equals(currEle)) {
			currProd = new Product();
			currProd.setId(attribute.getValue("id"));
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		switch (currEle) {
		case "name":
			currProd.setName(new String(ch, start, length));
			break;
		case "qty":
			currProd.setQuantity(new String(ch, start, length));
			break;
		case "price":
			currProd.setPrice(new String(ch, start, length));
			break;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if("product".equals(qName))
		{
			prodList.add(currProd);
		}
		currEle="";
	}

}
