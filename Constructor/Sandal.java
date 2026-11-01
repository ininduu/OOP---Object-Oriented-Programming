package Constructor;

// in this Type of Constructor we are a using parameter
// In the previ

public class Sandal {
    int ukuranBaju;

    public Sandal(int ukuranCelana) {
        ukuranBaju = ukuranCelana;
    }

    public static void main(String[] args) {
        Sandal beli = new Sandal(45);
        System.out.println(beli.ukuranBaju);
    }
}
