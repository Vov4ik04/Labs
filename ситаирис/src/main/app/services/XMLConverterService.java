package services;

import entities.Car;
import entities.CarDecorator;
import entities.Transport;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XMLConverterService {
    public static List<Transport> getTransportFromXML(String fileName) throws ParserConfigurationException, IOException, SAXException {
        File inputFile = new File(fileName);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        factory.setIgnoringComments(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(inputFile);
        Element lib = doc.getDocumentElement();
        List<Car> transports = new ArrayList<Car>();
        if ("cars".equals(lib.getTagName())) {
            NodeList cars = lib.getElementsByTagName("car");
            for (int i = 0; i < cars.getLength(); ++i) {
                Element car = (Element) cars.item(i);
                String name =  car
                        .getElementsByTagName("name")
                        .item(0)
                        .getTextContent();
                String price = car
                        .getElementsByTagName("price")
                        .item(0)
                        .getTextContent();
                String enginePower = car
                        .getElementsByTagName("enginePower")
                        .item(0)
                        .getTextContent();
                transports.add(Car.builder()
                        .price(Float.parseFloat(price))
                        .name(name)
                        .enginePower(Float.parseFloat(enginePower))
                        .build());
            }
        }

        List<Transport> carDecorators = new ArrayList<>();
        transports.forEach(transport -> carDecorators.add(new CarDecorator(transport)));
        return carDecorators;
    }
}
