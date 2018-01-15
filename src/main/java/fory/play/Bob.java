package fory.play;

public class Bob implements Observer {

    public void update(Subject daoMu) {
        System.out.println("盗墓更新了，Bob一目十行地看：" + ((DaoMu) daoMu).getContext());
    }
}