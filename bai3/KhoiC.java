package Bai5.bai3;

public class KhoiC extends Thisinh{
    private String monthi = "Văn, sử, địa";

    public KhoiC() {
    }

    public KhoiC(int sobaodanh, String hoten, String diachi, int mucuutien) {
        super(sobaodanh, hoten, diachi, mucuutien);
    }

    @Override
    public String toString() {
        return "KhoiC{" +super.toString()+"and"+
                "monthi='" + monthi + '\'' +
                '}';
    }
}
