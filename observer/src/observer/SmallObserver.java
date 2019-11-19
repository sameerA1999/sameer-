package observer;

public class SmallObserver extends Observer {

    public SmallObserver(Source source) {
        this.source = source;
        this.source.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println(source.getData().toLowerCase());
    }
}
