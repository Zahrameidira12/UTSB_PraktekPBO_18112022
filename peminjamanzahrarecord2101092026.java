/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSB_PraktekPBO_18112022;

import zahra041122.StudentRecord;

/**
 *
 * @author HP
 */
public class peminjamanzahrarecord2101092026 {
    public static void main (String[] args) {
        peminjamanzahra2101092026 nasabah1 = new peminjamanzahra2101092026();
      
        nasabah1.setKodepeminjaman(001);
        nasabah1.setKodenasabah(20);
        nasabah1.setJumlahpeminjaman(100000);
        nasabah1.setLamapeminjaman(1);
        nasabah1.setTanggal("18 November 2022");
  
        System.out.println("Kode Peminjaman   :"+nasabah1.getKodepeminjaman());
        System.out.println("Kode Nasabah      :"+nasabah1.getKodenasabah());
        System.out.println("Tanggal           :"+nasabah1.getTanggal());
        System.out.println("Jumlah Peminjaman :"+nasabah1.getJumlahpeminjaman());
        System.out.println("Lama Peminjaman   :"+nasabah1.getLamapeminjaman());
        System.out.println("Angsuranpokok     :"+nasabah1.getAngsuranpokok());
        System.out.println("Bunga             :"+nasabah1.getBunga());
        System.out.println("Angsuran perbulan :"+nasabah1.getAngsuranperbulan());
        System.out.println("Total Hutang      :"+nasabah1.getTotal());  
    }
}
