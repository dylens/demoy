package fory.xml;

import com.thoughtworks.xstream.XStream;
import fory.xml.model.Person;
import fory.xml.model.Persons;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static Persons getPersons() {
        Person p = new Person(1, "aa", 22);
        Person p2 = new Person(2, "bb", 23);

        List<Person> listPerson = new ArrayList<>();
        listPerson.add(p);
        listPerson.add(p2);

        return new Persons(listPerson);
    }

    public static void main(String[] args) {
        Persons persons = getPersons();

        XStream stream = new XStream();
        stream.alias("persons", Persons.class);
        stream.alias("person", Person.class);

        String obj2xml = stream.toXML(persons);
        System.out.println(obj2xml);

        Persons xml2obj = (Persons) stream.fromXML(obj2xml);

        for (Person person : xml2obj.getListPerson()) {
            System.out.println(person.getIdCard() + "--" + person.getName() + "--" + person.getAge());
        }

    }

}
