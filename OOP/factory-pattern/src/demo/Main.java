package demo;

public class Main {

    public static void main(String[] args) {
        ToyFactoryAbstraction factoryAbstraction=new BerbieToyFactory();
        IToy toy=factoryAbstraction.makeToy();
        System.out.println(toy.makeToy());
    }
}
