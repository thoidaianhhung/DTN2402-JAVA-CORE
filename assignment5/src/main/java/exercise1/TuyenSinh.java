package exercise1;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh{
    private List<ThiSinh> thiSinhList = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        while (true) {
            System.out.println("1. Thêm thí sinh");
            System.out.println("2. Hiển thị danh sách thi sinh");
            System.out.println("3. Tìm kiếm");
            System.out.println("4. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng");
            int menu = Integer.parseInt(scanner.nextLine());
            if (menu == 1) {
                themThiSinh();
            } else if (menu == 2) {
                hienThiDTTS();
            } else if (menu == 3) {
                timKiemThiSinhTheoSBD();
            } else if (menu == 4) {
                return;
            } else {
                System.out.println("Vui lòng chọn đúng chức năng");
            }
        }
    }
    @Override
    public void themThiSinh() {
        System.out.println("Nhập vào số báo danh");
        int soBaoDanh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào họ tên");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập mức ưu tiên");
        int mucUuTien = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào khối thi");
        String khoiThi = scanner.nextLine();
        ThiSinh thiSinh;
        if (khoiThi.equals("A")) {
            thiSinh = new ThiSinhKhoiA(soBaoDanh, hoTen, diaChi, mucUuTien);
        } else if (khoiThi.equals("B")) {
            thiSinh = new ThiSinhKhoiB(soBaoDanh, hoTen, diaChi, mucUuTien);
        } else {
            thiSinh = new ThiSinhKhoiC(soBaoDanh, hoTen, diaChi, mucUuTien);
        }
        thiSinhList.add(thiSinh);
    }

    @Override
    public void hienThiDTTS() {
        System.out.println("+-------+--------------------+--------------------+-------+-------------------+");
        System.out.println("| SBD   | HO TEN             |  DIA CHI           | MUT   |         MON THI   |");
        System.out.println("+-------+--------------------+--------------------+-------+-------------------+");
        for (ThiSinh thiSinh : thiSinhList) {
            System.out.printf("| %-5s | %-18s | %-18s | %-5s | %-18s |%n",
                    thiSinh.soBaoDanh, thiSinh.hoTen, thiSinh.diaChi, thiSinh.mucUuTien, thiSinh.monThi());
            System.out.println("+-------+--------------------+--------------------+-------+-------------------+");
        }
    }

    @Override
    public void timKiemThiSinhTheoSBD() {
        System.out.println("Nhập số báo danh");
        int soBaoDanh = Integer.parseInt(scanner.nextLine());
        System.out.println("+-------+--------------------+--------------------+-------+-------------------+");
        System.out.println("| SBD   | HO TEN             |  DIA CHI           | MUT   |         MON THI   |");
        System.out.println("+-------+--------------------+--------------------+-------+-------------------+");
        for (ThiSinh thiSinh : thiSinhList) {
            System.out.printf("| %-5s | %-18s | %-18s | %-5s | %-18s |%n",
                    thiSinh.soBaoDanh, thiSinh.hoTen, thiSinh.diaChi, thiSinh.mucUuTien, thiSinh.monThi());
            System.out.println("+-------+--------------------+--------------------+-------+-------------------+");
        }
    }
}
