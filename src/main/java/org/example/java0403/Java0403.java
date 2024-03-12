package org.example.java0403;

public class Java0403 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.name = "Mir";
        animal1.age = 10;
        System.out.println(animal1.name+' '+animal1.age);

        Cat myCat = new Cat();
        Cat secondCat = new Cat(1,"Mira");
        System.out.println(secondCat.name+" "+secondCat.age);

        Cat freeCat = new Cat() ;
        freeCat.name = "Free";
        freeCat.age = 2;
        System.out.println(freeCat.age+" "+freeCat.name);

    }
}
