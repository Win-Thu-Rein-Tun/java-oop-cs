package demo;

public class Boss implements Observer{
    @Override
    public void update(String operation, String record) {
        System.out.println("Boss say : " +operation + " operation take place on record:: "+ record);
    }
}
