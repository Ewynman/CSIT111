public class Lights {

    public static void main(String[] args) {
        Bulb bulb1 = new Bulb (true);

        Bulb bulb2 = new Bulb (false);
        System.out.println ("Bulb 1 is now: " +bulb1.getLight());

        System.out.println ("Bulb 2 is now: " +bulb2.getLight());
        bulb1.turnOff();

        bulb2.turnOn();

        System.out.println ("Bulb 1 is now: " +bulb1.getLight());

        System.out.println ("Bulb 2 is now: " +bulb2.getLight());

    } 
}

