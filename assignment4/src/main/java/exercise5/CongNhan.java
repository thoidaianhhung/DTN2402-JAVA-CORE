package exercise5;

public class CongNhan extends CanBo{
    protected int bac;

    public CongNhan(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return String.format("%20s %10d %10s %15s %15d", hoTen, tuoi, gioiTinh, diaChi, bac);
    }
}
