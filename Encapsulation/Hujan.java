package Encapsulation;

public class Hujan {
    private String namaHari;
    
    // Getter 
    public String getNameHari() {
        return namaHari;
    }

    // Setter 
    public void setNameHari(String namaHari) {
        this.namaHari = namaHari;

    }

    // 
    public static void main(String[] args) {
        Hujan adalah = new Hujan();
        adalah.setNameHari("Ibukota Jakarta Hebat");
        System.out.println("Slogan Hebat nya adalah " + adalah.getNameHari());
    }
}
