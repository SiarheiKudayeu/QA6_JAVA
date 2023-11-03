package lesson9.get_and_set;

public class MainGetAndSet {
    public static void main(String[] args) {
        GetAndSet getAndSet = new GetAndSet();
        //getAndSet.four = 44;
        getAndSet.setFour(44);
        System.out.println(getAndSet.getFour());
    }
}
