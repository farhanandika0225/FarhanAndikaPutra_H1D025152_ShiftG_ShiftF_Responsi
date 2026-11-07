public abstract class Kendaraan {
    public static final String NAMA_SPBU = "SPBU PERTAMINA PURBALINGGA";

    private final String platNomor;

    private double kapasitasTangki;
    private double isiTangki;

    public Kendaraan(String platNomor) {
        if (platNomor == null || platNomor.trim().isEmpty()) {
            throw new IllegalArgumentException("Plat nomor tidak boleh kosong!");
        }
        this.platNomor = platNomor;
        this.kapasitasTangki = 30.0;
        this.isiTangki = 0.0;
    }

    public Kendaraan(String platNomor, double kapasitasTangki) {
        if (platNomor == null || platNomor.trim().isEmpty()) {
            throw new IllegalArgumentException("Plat nomor tidak boleh kosong!");
        }
        if (kapasitasTangki <= 0) {
            throw new IllegalArgumentException("Kapasitas tangki harus lebih dari 0!");
        }
        this.platNomor = platNomor;
        this.kapasitasTangki = kapasitasTangki;
        this.isiTangki = 0.0;
    }

    public String getPlatNomor() {
        return this.platNomor;
    }

    public double getKapasitasTangki() {
        return this.kapasitasTangki;
    }

    public void setKapasitasTangki(double kapasitasTangki) {
        if (kapasitasTangki <= 0) {
            System.out.println("[GAGAL] Kapasitas tangki harus lebih dari 0!");
        } else {
            this.kapasitasTangki = kapasitasTangki;
        }
    }

    public double getIsiTangki() {
        return this.isiTangki;
    }

    public void setIsiTangki(double isiTangki) {
        this.isiTangki = isiTangki;
    }

    public double hitungSisaKapasitas() {
        return this.kapasitasTangki - this.isiTangki;
    }

    public void tampilkanInfo() {
        System.out.println("Plat Nomor  : " + this.platNomor);
        System.out.println("Kapasitas   : " + this.kapasitasTangki + " Liter");
        System.out.println("Isi Tangki  : " + this.isiTangki + " Liter");
    }

    public abstract void isiBahanBakar(double liter);
}