package lesson9.get_and_set;

public class GetAndSet {
    private int first;
    private String second;
    private boolean three;
    private int four;

    public void setFour(int four){
        this.four = four;
    }

    public int getFour(){
        return four;
    }
    public void setFirst(int first){
        this.first = first;
    }

    public int getFirst(){
        return first;
    }


    public static void main(String[] args) {
        GetAndSet getAndSet = new GetAndSet();
        getAndSet.first = 23;
        getAndSet.second = "second";
        getAndSet.three = false;
        getAndSet.four = 44;

    }
}
