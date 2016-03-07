package com.haochen.moxytest;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class App 
{
    public static void main(String[] args) throws Exception {
        JAXBContext jc = JAXBContext.newInstance(Zoo.class);
 
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        StringReader reader = new StringReader("<zoo><animals><animal type=\"cat\"><name>alice</name></animal><animal type=\"dog\"><name>amy</name></animal><animal type=\"cat\"><name>kitty</name></animal></animals></zoo>");
        Zoo zoo = (Zoo) unmarshaller.unmarshal(reader);
       System.out.println(zoo.toString());
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(zoo, System.out);
    }
}
