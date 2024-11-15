package quanlinhanvienmoi;

import java.util.ArrayList;

public class SachQLMoi {
    private ArrayList<SachMoi> sachs;

    public SachQLMoi() {
        sachs = new ArrayList<>();
    }

    // Thêm sách
    public void addSach(SachMoi sach) {
        sachs.add(sach);
    }

    // Sửa thông tin sách theo mã ID
    public boolean editSach(String id, String tensach, String tacgia, String tennhaxuatban) {
        for (SachMoi sach : sachs) {
            if (sach.getId().equals(id)) {
                sach.setTensach(tensach);
                sach.setTacgia(tacgia);
                sach.setTennhaxuatban(tennhaxuatban);
                return true;
            }
        }
        return false;
    }

    // Hiển thị danh sách sách
    public void displaySach() {
        for (SachMoi sach : sachs) {
            System.out.println( sach );
        }
    }
}
