package observer;

import java.util.ArrayList;
import java.util.List;

public class Source {
    private String data;
    private List<Observer> observerList = new ArrayList<>();

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        notifyObserver();
    }

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    private void notifyObserver(){
        for(Observer a : observerList){
            a.update();
        }
    }
}
