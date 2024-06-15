package exercise5;

public class KySu extends CanBo{
    protected String nganhDaoTao;
    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public KySu(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return String.format("%20s %10d %10s %15s %15s", hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
    }
}
