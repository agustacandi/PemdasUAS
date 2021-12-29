/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemdasuas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author candiagusta
 */
public class Wishlist {

    private static ArrayList myWishlist = new ArrayList();
    private static Scanner scan = new Scanner(System.in);

    private static void tambahWishlist() {
        System.out.print("Masukan Wishlist : ");
        String wish = scan.nextLine();
        myWishlist.add(wish);
        tampilMenu();
    }

    private static void hapusWishList() {
        System.out.print("Pilih angka wishlist yang ingin dihapus : ");
        String wish = scan.nextLine();
        myWishlist.remove(myWishlist.get(Integer.parseInt(wish) - 1));
        tampilMenu();
    }

    private static void tampilMenu() {

        System.out.println("===============================");
        System.out.println("=         Wishlist Ku         =");
        System.out.println("===============================");
        for (int i = 0; i < myWishlist.size(); i++) {
            System.out.println((i + 1) + ". " + myWishlist.get(i));
        }
        System.out.println();
        System.out.println("Menu ");
        System.out.println("1. Tambah Wishlist");
        System.out.println("2. Hapus Wishlist");
        System.out.println("3. Keluar");
        System.out.print("Silahkan pilih menu (1, 2 atau 3) : ");
        String menu = scan.nextLine();
        switch (menu) {
            case "1":
                tambahWishlist();
                break;
            case "2":
                hapusWishList();
                break;
            case "3":
                System.out.println("Selamat tinggal!");
                break;
            default:
                System.out.println("Pilih menu dengan benar, pilih 1, 2 atau 3");
                tampilMenu();
                break;
        }

    }

    public static void main(String[] args) {
        tampilMenu();
    }
}
