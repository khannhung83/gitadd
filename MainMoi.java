package quanlinhanvienmoi;

import java.util.Scanner;

public class MainMoi {
    public static void main(String[] args) {
        SachQLMoi manager = new SachQLMoi();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("----------------------------------");
            System.out.println("1. Hiển thị danh sách sách");
            System.out.println("2. Thêm sách");
            System.out.println("3. Sửa thông tin sách theo ID");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Xử lý dòng mới

            switch (choice) {
                case 1:
                    manager.displaySach();
                 break;
                case 2:
                    System.out.print("Nhập mã sách: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhập tên sách: ");
                    String tensach = scanner.nextLine();
                    System.out.print("Nhập tên tác giả: ");
                    String tacgia = scanner.nextLine();
                    System.out.print("Nhập tên nhà xuất bản: ");
                    String tennhaxuatban = scanner.nextLine();
                    manager.addSach(new SachMoi(id, tensach, tacgia, tennhaxuatban));
                    break;
                case 3:
                    System.out.print("Nhập mã sách cần cập nhật: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Nhập tên sách mới: ");
                    String newTensach = scanner.nextLine();
                    System.out.print("Nhập tên tác giả mới: ");
                    String newTacgia = scanner.nextLine();
                    System.out.print("Nhập tên nhà xuất bản mới: ");
                    String newTennhaxuatban = scanner.nextLine();
                    if (manager.editSach(updateId, newTensach, newTacgia, newTennhaxuatban)) {
                        System.out.println("Cập nhật thông tin sách thành công.");
                    } else {
                        System.out.println("Không tìm thấy sách với mã đã nhập.");
                    }
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");

                break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
