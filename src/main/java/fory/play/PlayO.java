package fory.play;

import com.alibaba.fastjson.JSON;

public class PlayO {

    public static void main(String[] args) {
        Obj obj = new Obj();
        obj.setA("a is a string");
        Sub sub = new Sub();
        sub.setB("b is a string");
        obj.setSub(sub);
        String jsonString = JSON.toJSONString(obj);
        System.out.println(jsonString);

        Obj obj1 = JSON.parseObject("{\"a\":\"a is a string\",\"sub\":{\"b\":\"b is a string\"}}", Obj.class);
        System.out.println(obj1);
    }
}

class Obj {
    String a;
    Sub sub;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Sub getSub() {
        return sub;
    }

    public void setSub(Sub sub) {
        this.sub = sub;
    }
}

class Sub {
    String b;

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}