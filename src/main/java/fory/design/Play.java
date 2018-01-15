package fory.design;

public class Play {

    public static void main(String[] args) {
        真枪工厂 gunFactory = new 真枪工厂();
        gunFactory.createBullet();
        gunFactory.createGun();

        豌豆射手工厂 peaFactory = new 豌豆射手工厂();
        peaFactory.createBullet();
        peaFactory.createGun();
    }

}