package services;

import entities.Transport;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public class WebService {
    public static String getData(){
        List<Transport> transportList = getTransport();
        StringBuilder output = new StringBuilder();
        for (Transport transport : transportList) {
            output.append(transport.getInfo()).append(",\n");
        }
        return output.toString();
    }
    public static List<Transport> getTransport() {
        try {
            return XMLConverterService.getTransportFromXML("D:/Лабы/ситарис/lab4_8/lab4_8_main/labs4_8_main/src/main/resources/carsTest.xml");
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getSumPrice() {
        List<Transport> transportList = getTransport();
        return transportList.stream().map(Transport::getPrice).reduce(Float::sum).get().toString();
    }

    public static String getSumEnginePower() {
        List<Transport> transportList = getTransport();
        return transportList.stream().map(Transport::getEnginePower).reduce(Float::sum).get().toString();
    }

    public static String getNUmberOfTransport() {
        return Integer.toString(getTransport().size());
    }

    public static String getSumPrice(List<Transport> transportList) {
        return transportList.stream().map(Transport::getPrice).reduce(Float::sum).get().toString();
    }

    public static String getSumEnginePower(List<Transport> transportList) {
        return transportList.stream().map(Transport::getEnginePower).reduce(Float::sum).get().toString();
    }

}
