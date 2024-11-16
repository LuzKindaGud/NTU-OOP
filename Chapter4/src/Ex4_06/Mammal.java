package Ex4_06;

public class Mammal extends Animal{
    public Mammal(String name){
        super(name);
    }

    public String toString(){
        return "Mammal["+ super.toString() + "]";
    }
}
