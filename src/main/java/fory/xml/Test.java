package fory.xml;

import com.thoughtworks.xstream.XStream;
import fory.xml.model.Person;
import fory.xml.model.Persons;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static Persons getPersons() {
        // 构建 person 对象，动态的可以从数据库中取出
        Person p = new Person(1, "aa", 22);
        Person p2 = new Person(2, "bb", 23);

        // 把对象放入 person 集合中
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(p);
        listPerson.add(p2);
        // 构造出一个 persons 对象

        return new Persons(listPerson);
    }

    public static void main(String[] args) {
        // 取得 persons 对象
        Persons persons = getPersons();

        // 给每一个实体类取一个别名，作为当前实体的根标签
        XStream stream = new XStream();
        stream.alias("persons", Persons.class);
        stream.alias("person", Person.class);

        // 将 java 对象转换成 xml
        String obj2xml = stream.toXML(persons);
        System.out.println(obj2xml);

        // 将 xml 转换成 java 对象
        Persons xml2obj = (Persons) stream.fromXML(obj2xml);

        for (Person person : xml2obj.getListPerson()) {
            System.out.println(person.getIdCard() + "--" + person.getName() + "--" + person.getAge());
        }

    }

}
