// Calling much more object with one definition 

// Void and Static Void

public class bedaLagi {
    String namaPemain = "Caesar Hidayat" ;
    int umurOrang = 89;
    String kotaTinggal = "Malang";

    public void showData() {
        System.out.println("Nama : " + namaPemain);
        System.out.println("Umur : " + umurOrang);
        System.out.println("Tempat Tinggal Sekarang : " + kotaTinggal);
    }

    public static void main(String[] args) {
        bedaLagi tryTesting = new bedaLagi();

        // Call the method 
        tryTesting.showData();
    }
}
