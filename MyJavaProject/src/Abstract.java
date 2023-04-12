public class Abstract {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.goFast();
        car1.soundHorn();
    }
}
// Abstraction
interface vehicle {

    public void soundHorn();

    public void goFast();
}

class Car implements vehicle {

    @Override
    public void soundHorn() {
        System.out.println("Sounding Horn");
    }

    @Override
    public void goFast() {
        System.out.println("Going Fast");
    }
}