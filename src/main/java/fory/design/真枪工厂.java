package fory.design;

public class 真枪工厂 implements 武器工厂 {

    public 弹药 createBullet() {
        return new 子弹();
    }

    public 武器 createGun() {
        return new 枪();
    }
}