public class hariBaik {
    String namaTumbuhan = "Raflesia Arnoldi";
    String asalNegara = "Indonesia";

    public void higlightTumbuhan() {
        System.out.println("Tumbuhan ini adalah : " + namaTumbuhan);
        System.out.println("Saat ini hanya ada di : " + asalNegara);
    }

    public static void main(String[] args) {
        hariBaik kamis = new hariBaik();

        // call the mthod
        kamis.higlightTumbuhan();
    }
}
