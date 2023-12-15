import entities.Transport;
import org.xml.sax.SAXException;
import services.XMLConverterService;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transport> transportList;
        try {
            transportList = XMLConverterService.getTransportFromXML("D:\\Лабы\\ситарис\\lab4_8\\lab4_8_main\\labs4_8_main\\src\\main\\resources\\cars.xml");
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }
        transportList.forEach(transport -> System.out.println(transport.getInfo()));

    }

}
