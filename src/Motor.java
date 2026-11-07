public class Motor extends Kendaraan implements Pengisian {
    private String tipeMotor;

    public Motor(String platNomor, double kapasitasTangki, String tipeMotor) {
        super(platNomor, kapasitasTangki);
        this.tipeMotor = tipeMotor;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tipe Motor  : " + this.tipeMotor);
    }

    @Override
    public void isiBahanBakar(double liter) {
        if (liter <= 0) {
            System.out.println("[GAGAL] Jumlah liter tidak valid!");
        } else if (getIsiTangki() + liter > getKapasitasTangki()) {
            System.out.println("[GAGAL] Bensin meluap! Kapasitas motor hanya " + getKapasitasTangki() + "L");
        } else {
            setIsiTangki(getIsiTangki() + liter);
            System.out.println("[BERHASIL] Berhasil mengisi " + liter + " Liter BBM ke Motor (" + getPlatNomor() + ").");
        }
    }

    @Override
    public void isiBBM(double liter) {
        isiBahanBakar(liter);
    }
}