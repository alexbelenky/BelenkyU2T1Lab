public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Jake", 5, 2.5);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Drake", 14, 10.9);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
