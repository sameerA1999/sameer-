package observer;
public class Main {
    
    public static void main(String[] args) {
        Source s = new Source();

        Observer Small = new SmallObserver(s);
        Observer Large =  new CapitalObserver(s);

        s.setData("Sameer");

    }
}


