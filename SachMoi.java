package quanlinhanvienmoi;

public class SachMoi {
    private String id;
    private String tensach;
    private String tacgia;
    private String tennhaxuatban;

    public SachMoi(String id, String tensach, String tacgia, String tennhaxuatban) {
        this.id = id;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.tennhaxuatban = tennhaxuatban;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getTennhaxuatban() {
        return tennhaxuatban;
    }

    public void setTennhaxuatban(String tennhaxuatban) {
        this.tennhaxuatban = tennhaxuatban;
    }

    @Override
    public String toString() {
        return "------------------------------------------\n" +
                "ID sách: " + id + ", Tên sách: " + tensach + ", Tác giả: " + tacgia + ", Nhà xuất bản: " + tennhaxuatban;
    }
}
