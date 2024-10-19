public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        //Bình thường
        Dog dog  = new Dog();
        Cat cat = new Cat();
        //ĐẶC BIỆT
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        //animal1.bark();//lỗi
        //animal2.meow();//lỗi
        Dog dog1 = (Dog) animal1;
        Cat cat1 = (Cat) animal2;
        //((Dog)animal1).bark();//Đúng
        //((Cat)animal2).meow();//Đúng

//        Cat cat2 = new Animal(); //lỗi
    }
}