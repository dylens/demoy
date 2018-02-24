import demoy.protocol.Testcases;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.xml.transform.StringResult;
import org.springframework.xml.transform.StringSource;

import javax.xml.transform.Result;
import javax.xml.transform.Source;

public class Marshaller {

    private static Jaxb2Marshaller marshaller = createMarshaller(Testcases.class);

    public static String marshal(Object o) {
        Result result = new StringResult();
        marshaller.marshal(o, result);
        return result.toString();
    }

    public static Object unmarshal(String xmlContent) {
        Source source = new StringSource(xmlContent);
        return marshaller.unmarshal(source);
    }

    private static Jaxb2Marshaller createMarshaller(Class clazz) {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath(clazz.getPackage().getName());
        try {
            jaxb2Marshaller.afterPropertiesSet();
        } catch (Exception e) {

        }
        return jaxb2Marshaller;
    }
}