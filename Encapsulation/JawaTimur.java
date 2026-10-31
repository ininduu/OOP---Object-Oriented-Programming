package Encapsulation;

public class JawaTimur {
    private String nameWarga ;

    public String getNameWarga() {
        return nameWarga;
    }

    // Setter Method of to set value Nama Warga
    public void setNameWarga(String nameWarga) {
        this.nameWarga = nameWarga;
    }

    public static void main(String[] args) {
        JawaTimur wargaMalang = new JawaTimur();
        wargaMalang.setNameWarga("Malang Kucewara");
        System.out.println("Arek Malang due semboyan " + wargaMalang.getNameWarga());
    }
}
