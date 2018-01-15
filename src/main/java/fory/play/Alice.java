package fory.play;

public class Alice implements Observer {

    public void update(Subject daoMu) {
        DaoMu daoMuBiJi = (DaoMu) daoMu;
        System.out.println("盗墓更新了，Alice开心地看：" + daoMuBiJi.getContext());
        System.out.println("Alice点开图片看到：" + daoMuBiJi.getPicture());
    }
}