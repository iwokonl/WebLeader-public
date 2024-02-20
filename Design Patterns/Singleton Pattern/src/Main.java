import Singleton.Singleton;

public class Main {
    public static void main(String[] args){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1.getValue()); //null
        System.out.println(s2.getValue()); //null
        s2.setValue("Set Value");
        System.out.println(s1.getValue()); //Set Value
        System.out.println(s2.getValue()); //Set Value
    }
}
