package exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    public static List<CanBo> canBoList = new ArrayList<>();
    public static void main(String[] args) {
        while (true) {
            showSelection();
            Scanner scanner = new Scanner(System.in);
            String menu = scanner.nextLine();
            switch (menu) {
                case "1":
                    addCanBo();
                    break;
                case "2":
                    searchHoTen();
                    break;
                case "3":
                    for (CanBo canbo: canBoList) {
                        System.out.println(canbo);
                    }
                    break;
                case "4":
                    deleteCanBo();
                    break;
                case "5":
                    System.out.println("Thoát khỏi chương trình");
                    return;
            }
        }
    }
    public static void showSelection() {
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Chương trình có các chức năng sau:");
        System.out.println("1. Thêm mới cán bộ");
        System.out.println("2. Tìm kiếm theo họ tên");
        System.out.println("3. Hiển thị về thông tin danh sách cán bộ");
        System.out.println("4. Nhập vào tên cán bộ và delete cán bộ đó");
        System.out.println("5. Thoát khỏi trương trình");
        System.out.println("Nhập lựa chọn");
    }

    public static void addCanBo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập loại cán bộ muốn nhập thêm");
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư");
        System.out.println("3. Nhân viên");
        String menuCanBo = scanner.nextLine();
        switch (menuCanBo) {
            case "1":
                System.out.println("Nhập thông tin công nhân");
                addCongNhan();
                break;
            case "2":
                System.out.println("Nhập thông tin kỹ sư");
                addKySu();
                break;
            case "3":
                System.out.println("Nhập thông tin nhân viên");
                addNhanVien();
                break;
        }
    }

    public static void addCongNhan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thêm họ và tên");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập vào tuổi");
        int tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính");
        GioiTinh gioiTinh;
        System.out.println("1. NAM");
        System.out.println("2. NU");
        System.out.println("3. KHAC");
        String menu = scanner.nextLine();
        switch (menu) {
            case "1":
                gioiTinh = GioiTinh.NAM;
                break;
            case "2":
                gioiTinh = GioiTinh.NU;
                break;
            default:
                gioiTinh = GioiTinh.KHAC;
                break;
        }
        System.out.println("Nhập vào địa chỉ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập bậc của công nhân");
        int bac = Integer.parseInt(scanner.nextLine());
        CongNhan congNhan = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
        canBoList.add(congNhan);
    }

    public static void addKySu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thêm họ và tên");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập vào tuổi");
        int tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính");
        GioiTinh gioiTinh;
        System.out.println("1. NAM");
        System.out.println("2. NU");
        System.out.println("KHAC");
        String menu = scanner.nextLine();
        switch (menu) {
            case "1":
                gioiTinh = GioiTinh.NAM;
                break;
            case "2":
                gioiTinh = GioiTinh.NU;
                break;
            default:
                gioiTinh = GioiTinh.KHAC;
                break;
        }
        System.out.println("Nhập vào địa chỉ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập ngành đào tạo");
        String nganhDaoTao = scanner.nextLine();
        KySu kySu = new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
        canBoList.add(kySu);
    }

    public static void addNhanVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thêm họ và tên");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập vào tuổi");
        int tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính");
        GioiTinh gioiTinh;
        System.out.println("1. NAM");
        System.out.println("2. NU");
        System.out.println("KHAC");
        String menu = scanner.nextLine();
        switch (menu) {
            case "1":
                gioiTinh = GioiTinh.NAM;
                break;
            case "2":
                gioiTinh = GioiTinh.NU;
                break;
            default:
                gioiTinh = GioiTinh.KHAC;
                break;
        }
        System.out.println("Nhập vào địa chỉ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập công việc");
        String congViec = scanner.nextLine();
        NhanVien nhanVien = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
        canBoList.add(nhanVien);
    }

    public static void searchHoTen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên muốn tìm kiếm");
        String ten = scanner.nextLine();
        for (CanBo canBo : canBoList) {
            if (canBo.hoTen.contains(ten)) {
                System.out.println("Thông tin cán bộ tìm được");
                System.out.println(canBo);
                return;
            }
        }
    }

    public static void deleteCanBo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên cán bộ vào delete cán bộ đó");
        String ten = scanner.nextLine();
        for (CanBo canBo : canBoList) {
            if (canBo.hoTen.contains(ten)) {
                System.out.println("Thông tin cán bộ bị xóa");
                System.out.println(canBo);
                canBoList.remove(canBo);
                return;
            }
        }
    }
}
