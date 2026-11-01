package Constructor;

// Create a Constructor 

// Constructor is a special method that in the class 
// Only have 1 method 

public class Keyboard {
    int cuaca;

    public Keyboard() {
        cuaca = 34;
    }

    public static void main(String[] args) {
        Keyboard keadaan = new Keyboard();
        System.out.println(keadaan.cuaca);
    }
}
