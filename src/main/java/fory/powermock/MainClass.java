package fory.powermock;

public class MainClass {

    public int make(String name) {
        String content = StaticClass.get(name);
        return content.length();
    }

}
