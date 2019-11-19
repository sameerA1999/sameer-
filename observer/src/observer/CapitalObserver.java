package observer;
public class CapitalObserver extends Observer {

    public CapitalObserver(Source source) {
        this.source = source;
        this.source.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println(source.getData().toUpperCase());
    }
}
