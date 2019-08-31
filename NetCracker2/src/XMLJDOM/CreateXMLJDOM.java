package XMLJDOM;

import java.io.IOException;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class CreateXMLJDOM {

	public static void main(String[] args) throws IOException {

		Document doc = new Document();
		Element studEle = new Element("student");
		Attribute attr = new Attribute("roll", "100");
		studEle.setAttribute(attr);

		Element name = new Element("name");
		name.setText("Vinod");
		studEle.addContent(name);

		Element city = new Element("city");
		city.setText("Pune");
		studEle.addContent(city);

		Element mobile = new Element("mobile");
		mobile.setText("99999 99999");
		studEle.addContent(mobile);

		doc.setRootElement(studEle);

		XMLOutputter out = new XMLOutputter();
		Format fmt = Format.getPrettyFormat();
		out.setFormat(fmt);
		out.output(doc, System.out);
	}

}
