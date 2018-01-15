package fory.design;

public class 豌豆射手工厂 implements 武器工厂 {

    public 弹药 createBullet() {
        return new 豌豆();
    }

    public 武器 createGun() {
        return new 豌豆射手();
    }
}