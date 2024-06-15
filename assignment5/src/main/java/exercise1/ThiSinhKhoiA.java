package exercise1;

public class ThiSinhKhoiA extends ThiSinh{
    public ThiSinhKhoiA(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String monThi() {
        return String.format("%5s %5s %5s", "Toán", "Lý", "Hóa");
    }
}
