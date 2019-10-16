/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan33login;

/**
  * @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deksripsi Program : Program ini berisi program untuk membuat halaman dan 
 * proses login serta berbasis objek oriented
 */
public class User {
    private boolean statusAkun;
    private String username = "RizkiAdam";
    private String password = "terbaikselalu";
    
    private boolean cekAkun(String parUserName, String parPassword){
       if(parUserName.equals(username) && parPassword.equals(password)){
           statusAkun = true;
       } else {
           statusAkun = false;
       }
       return statusAkun;
    }
    
    private void hasilLogin(boolean statusAkun, String parUserName){
        if(statusAkun){
            System.out.println("****** HALLO "+username.toUpperCase()+" ******");
            System.out.println("Selamat Datang di Aplikasi ini");
        } else {
            System.out.println("Ooops, Username Atau Password Anda Salah");
        }
    }
    
    public void pengecekkanLogin(String parUserName, String parPassword){
        System.out.println(cekAkun(parUserName,parPassword));
        hasilLogin(statusAkun,parUserName);
    } 
}
