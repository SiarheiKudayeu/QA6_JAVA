package lesson8.class_pack;

public class Animal {
    //поля
    public String name;
    public String species;
    public int age;
    public boolean result;

    //метод который ничего не возвращает и ничего не принимает
    public void getInfoAboutYourAnimal() {
        System.out.println("Name of the animal: " + name + ".");
        System.out.println("Specie of the animal: " + species + ".");
        System.out.println("Age of the animal: " + age + ".");
    }

    //метод который возвращает значение и ничего не принимает
    public int returnAgeOfTheAnimal(){
        int ageOfPet = age;
        return ageOfPet;
    }

    //метод который ничего не возвращает и принимает аргументы
    public void someActionOfAnimal(String action, int count){
        System.out.println("Your animal can " + action + " " + count + " times.");
    }
    public void someActionOfAnimal2(int count, String action){
        System.out.println("Your animal can " + action + " " + count + " times.");
    }

    //метод который возвращает значеник и принимает аргументы
    public int howMuchOurPetCanLeaveMore(int averageAge){
        return averageAge - age;
    }

}
