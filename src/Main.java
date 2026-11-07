public class Main {
    public static void main(String[] args) {
        System.out.println("SISTEM MANAJEMEN " + Kendaraan.NAMA_SPBU);

        Pengisian pengisianMobil = new Mobil("B 1234 ABC", 40.0, "SUV");
        Pengisian pengisianMotor = new Motor("R 5678 XYZ", 5.0, "Matic");

        System.out.println("PENGISIAN MOBIL");
        pengisianMobil.isiBBM(25.0);
        pengisianMobil.isiBBM(30.0);

        System.out.println("\nPENGISIAN MOTOR");
        pengisianMotor.isiBBM(4.0);

        System.out.println("\nDETAIL MOBIL & STRUK");
        Mobil mobilSaya = (Mobil) pengisianMobil;
        mobilSaya.tampilkanInfo();

        double hargaPerLiter = 10000;
        double totalHarga = mobilSaya.getIsiTangki() * hargaPerLiter;
        mobilSaya.cetakStruk(totalHarga);

        System.out.println("\nDETAIL MOTOR");
        Motor motorSaya = (Motor) pengisianMotor;
        motorSaya.tampilkanInfo();
    }
}
