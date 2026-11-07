public class Mobil extends Kendaraan implements Pengisian, Pembayaran {
    private String jenisMobil;

    public Mobil(String platNomor, double kapasitasTangki, String jenisMobil) {
        super(platNomor, kapasitasTangki);
        this.jenisMobil = jenisMobil;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mobil : " + this.jenisMobil);
    }

    @Override
    public void isiBahanBakar(double liter) {
        if (liter <= 0) {
            System.out.println("[GAGAL] Jumlah liter harus lebih dari 0!");
        } else if (getIsiTangki() + liter > getKapasitasTangki()) {
            System.out.println("[GAGAL] Pengisian " + liter + "L melebihi kapasitas! Sisa tempat: " + hitungSisaKapasitas() + "L");
        } else {
            // Membaca dan mengubah state internal (isiTangki)
            setIsiTangki(getIsiTangki() + liter);
            System.out.println("[BERHASIL] Berhasil mengisi " + liter + " Liter BBM ke Mobil (" + getPlatNomor() + ").");
        }
    }

    @Override
    public void isiBBM(double liter) {
        isiBahanBakar(liter);
    }

    @Override
    public void cetakStruk(double totalHarga) {
        System.out.println("=== STRUK PEMBAYARAN " + NAMA_SPBU + " ===");
        System.out.println("Kendaraan   : Mobil (" + getPlatNomor() + ")");
        System.out.println("Total Bayar : Rp " + String.format("%,.0f", totalHarga));
    }
}