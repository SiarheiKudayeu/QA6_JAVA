package lesson12.abstract_class.ex2;

public class ChildClass extends AbstractClass implements Interface1, Interface2{

    @Override
    void doSmth() {
        System.out.println("doSmth");
    }

    @Override
    public void abstractMethodEverywhere() {
        System.out.println("abstractMethodEverywhere");
    }

    @Override
    public void interface2() {
        System.out.println("interface2");
    }


    @Override
    public void interface1() {
        System.out.println("interface1");
    }

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.abstractMethodEverywhere();
        AbstractClass abstractClass = new ChildClass();
        Interface1 interface1 = new ChildClass();
    }
}
