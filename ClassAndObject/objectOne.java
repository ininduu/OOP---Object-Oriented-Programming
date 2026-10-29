// Class

// Object in OOP - Object Oriented Programming is a Defining variable
// when like in general programming (name, NoHp, Address, Age);

public class objectOne {
    String namaNasabah = "Tegar Setyadin";
    int noHP = 847584;
    String Address = "Wonokromo Surabaya";

    public static void main(String[] args) {
        objectOne nasabah = new objectOne();
        objectOne number = new objectOne();
        objectOne alamat = new objectOne();

        System.out.println(nasabah.namaNasabah);
        System.out.println(number.noHP);
        System.out.println(alamat.Address);
    }
}
