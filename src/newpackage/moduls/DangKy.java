/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.moduls;

/**
 *
 * @author 84376
 */
public class DangKy {
    private String HocPhan;
    private String ToaNha;
    private String phongTH;
    private String Ca;
    private String Trangthai;

    public DangKy(String HocPhan, String ToaNha, String phongTH, String Ca, String Trangthai) {
        this.HocPhan = HocPhan;
        this.ToaNha = ToaNha;
        this.phongTH = phongTH;
        this.Ca = Ca;
        this.Trangthai = Trangthai;
    }

    public String getHocPhan() {
        return HocPhan;
    }

    public void setHocPhan(String HocPhan) {
        this.HocPhan = HocPhan;
    }

    public String getToaNha() {
        return ToaNha;
    }

    public void setToaNha(String ToaNha) {
        this.ToaNha = ToaNha;
    }

    public String getPhongTH() {
        return phongTH;
    }

    public void setPhongTH(String phongTH) {
        this.phongTH = phongTH;
    }

    public String getCa() {
        return Ca;
    }

    public void setCa(String Ca) {
        this.Ca = Ca;
    }

    public String getTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(String Trangthai) {
        this.Trangthai = Trangthai;
    }

    
}