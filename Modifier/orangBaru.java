package Modifier;

public class orangBaru {
    public String name;

    public void infoNdan() {
        System.out.println("Ayo kopag");
    }

    public void infoLokasi() {
        System.out.println("Lokasi Berada di mbah tekluk Ponorogo");
    }

    public static void main(String[] args) {
        orangBaru testing = new orangBaru();

        testing.infoNdan();
        testing.infoLokasi();
    }
}