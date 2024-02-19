/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fakeDatabase;
import java.util.ArrayList;
import newpackage.moduls.DangKy;
import newpackage.moduls.TaiKhoan;
/**
 *
 * @author 84376
 */
public class database {
    private static ArrayList<DangKy> list = new ArrayList<>();

  
    public static ArrayList<TaiKhoan> account()
    {
        ArrayList<TaiKhoan> list_user = new ArrayList<>();
        TaiKhoan a = new TaiKhoan("admin", "123@abc", "admin");
        TaiKhoan b = new TaiKhoan("user", "123@abc", "user");
        list_user.add(a);
        list_user.add(b);
        return list_user;
    }
    public static ArrayList<DangKy> getList() {
        return list;
    }

    public static void setList(ArrayList<DangKy> list) {
        database.list = list;
    }
}
