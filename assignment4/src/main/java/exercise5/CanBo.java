package exercise5;

public class CanBo {
    protected String hoTen;
    protected int tuoi;
    protected GioiTinh gioiTinh;
    protected String diaChi;

    public CanBo(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return String.format("%10s %5d %5s %10s", hoTen, tuoi, gioiTinh, diaChi);
    }
}
