package exercise5;

public class NhanVien extends CanBo {

    protected String congViec;

    public NhanVien(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return String.format("%20s %10d %10s %15s %15s", hoTen, tuoi, gioiTinh, diaChi, congViec);
    }
}
