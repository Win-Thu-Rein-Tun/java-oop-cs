package demo;

public class TrainToyFactory extends ToyFactoryAbstraction{
    @Override
    public IToy makeToy() {
        return new TrainToy();
    }
}
