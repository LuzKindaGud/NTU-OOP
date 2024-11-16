package Ex6_06;

public class BigDog extends Dog{
    public BigDog(String name){
        super(name);
    }

    public void greets(){
        System.out.println("Woow");
    }

    @Override
    public void greets(Dog another) {
        super.greets(another);
        System.out.println("Wooooow");
    }

    public void greets(BigDog another){
        System.out.println("Wooooooooow");
    }
}
