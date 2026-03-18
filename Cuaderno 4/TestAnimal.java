public class TestAnimal {
    public static void main(String[] args) {
        Animal a1 = new Cat("Pepe");
        Animal a2 = new Dog("Juan");
        Animal a3 = new BigDog("Martín");

        a1.greets();
        a2.greets();
        a3.greets();


        Cat c = new Cat("Lucas");
        Dog d1 = new Dog("óscar");
        Dog d2 = new Dog("Marcos");
        BigDog bd1 = new BigDog("Bartolo");
        BigDog bd2 = new BigDog("Jesús");

        c.greets();
        d1.greets();
        bd1.greets();

        d1.greets(d2);
        bd1.greets(d1);
        bd1.greets(bd2);


        Animal[] animales = new Animal[3];
        animales[0] = c;
        animales[1] = d1;
        animales[2] = bd1;

        for (Animal a : animales) {
            a.greets();
        }

        Dog d3 = (Dog) a2;
        d3.greets(d1);

        BigDog bd3 = (BigDog) a3;
        bd3.greets(bd1);
        bd3.greets(d1);
    }
}