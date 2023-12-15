import entities.Transport;
import org.junit.Test;
import org.xml.sax.SAXException;
import services.WebService;
import services.XMLConverterService;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void testXMLParser() {
        List<Transport> transports;
        try {
            transports = XMLConverterService.getTransportFromXML("D:/Лабы/ситарис/lab4_8/lab4_8_main/labs4_8_main/src/main/resources/testData/carsTest.xml");
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }
        assertEquals(2, transports.size());
    }

    @Test
    public void testWebServicePriceSum() {
        List<Transport> transports;
        try {
            transports = XMLConverterService.getTransportFromXML("D:/Лабы/ситарис/lab4_8/lab4_8_main/labs4_8_main/src/main/resources/testData/carsTest.xml");
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }
        assertEquals("4.0", WebService.getSumPrice(transports));
    }

    @Test
    public void testWebServiceEnginePowerSum() {
        List<Transport> transports;
        try {
            transports = XMLConverterService.getTransportFromXML("D:/Лабы/ситарис/lab4_8/lab4_8_main/labs4_8_main/src/main/resources/testData/carsTest.xml");
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }
        assertEquals("6.0", WebService.getSumEnginePower(transports));
    }

}
