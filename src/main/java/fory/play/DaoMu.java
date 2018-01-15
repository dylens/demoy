package fory.play;

import java.util.ArrayList;
import java.util.List;

public class DaoMu implements Subject {
    private String context;
    private String picture;
    List<Observer> reader = new ArrayList<>();

    public String getContext() {
        return context;
    }

    public String getPicture() {
        return picture;
    }

    public void setContext(String newContext, String newPicture) {
        context = newContext;
        picture = newPicture;
        notifyObservers(this);
    }

    public void addObserver(Observer o) {
        reader.add(o);
    }

    public void deleteObserver(Observer o) {
        reader.remove(o);
    }

    @Override
    public void notifyObservers(Subject s) {
        reader.forEach(r -> r.update(s));
    }

    public static void main(String[] args) {
        DaoMu daoMu = new DaoMu();
        Alice alice = new Alice();
        Bob bob = new Bob();
        daoMu.addObserver(alice);
        daoMu.addObserver(bob);
        daoMu.setContext("一天，吴邪和闷油瓶去吃大排档","吴邪和闷油瓶的图");

        daoMu.deleteObserver(bob);
        daoMu.setContext("偶遇胖子在街头跳广场舞","胖子在跳广场舞的照骗");
    }
}