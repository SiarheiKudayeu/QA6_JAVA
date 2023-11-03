package lesson9.constructor;

public class Home {
    private String address;
    private int capacity;
    private int countOfFloors;
    private boolean isNew;

    public Home(String address, int capacity, int countOfFloors, boolean isNew){
        this.address = address;
        this.capacity = capacity;
        this.countOfFloors = countOfFloors;
        this.isNew = isNew;
    }
    public Home(int capacity, int countOfFloors, boolean isNew, String address){
        this.address = address;
        this.capacity = capacity;
        this.countOfFloors = countOfFloors;
        this.isNew = isNew;
    }

    public Home(boolean isNew, String address){
        this.address = address;
        this.isNew = isNew;
    }

    public Home(boolean isNew, int capacity, int countOfFloors, String address){
        this(isNew,address);
        this.capacity = capacity;
        this.countOfFloors = countOfFloors;
    }


    public Home(){}

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCountOfFloors() {
        return countOfFloors;
    }

    public void setCountOfFloors(int countOfFloors) {
        this.countOfFloors = countOfFloors;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
    public void getInfo(){
        System.out.println("This address " + address);
        System.out.println("This capacity " + capacity);
        System.out.println("This countOfFloors " + countOfFloors);
        System.out.println("isNew? " + isNew);
    }
}
