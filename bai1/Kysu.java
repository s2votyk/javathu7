package Bai5.bai1;

public class Kysu extends Canbo{
    private String Nghanhdaotao;

    public Kysu(String nghanhdaotao) {
        Nghanhdaotao = nghanhdaotao;
    }

    public Kysu(String hoten, int tuoi, String gioitinh, String diachi, String nghanhdaotao) {
        super(hoten, tuoi, gioitinh, diachi);
        Nghanhdaotao = nghanhdaotao;
    }

    public String getNghanhdaotao() {
        return Nghanhdaotao;
    }

    public void setNghanhdaotao(String nghanhdaotao) {
        Nghanhdaotao = nghanhdaotao;
    }

    @Override
    public String toString() {
        return "Kysu{" +
                "Nghanhdaotao='" + Nghanhdaotao + '\'' +
                "and"+super.toString();
    }
}
