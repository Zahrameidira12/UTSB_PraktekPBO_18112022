/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSB_PraktekPBO_18112022;

/**
 *
 * @author HP
 */
public class peminjamanzahra2101092026 {
    
       private int kodepeminjaman ; 
       private  int jumlahpeminjaman;
       private  int kodenasabah; 
       private  int lamapeminjaman;
       private String namanasabah; 
       private  String tanggal;
       private double bunga;
       private  double angsuranpokok; 
       private double angsuranperbulan;
       private  double total;       
       
       
       private static int peminjamanzahra2101092026;
        public int getKodepeminjaman(){ 
            return kodepeminjaman; 
        }
        
         public void setKodepeminjaman( int kodepeminjaman ){ 
             this. kodepeminjaman = kodepeminjaman; 
        }
       
       
        public int getJumlahpeminjaman(){ 
            return jumlahpeminjaman; 
        }
        
         public void setJumlahpeminjaman( int jumlahpeminjaman ){ 
             this. jumlahpeminjaman = jumlahpeminjaman; 
        }
        
        
        public int getKodenasabah(){ 
            return kodenasabah; 
        }
         
        public void setKodenasabah( int kodenasabah ){ 
             this. kodenasabah = kodenasabah; 
        }
        
                
        public int getLamapeminjaman(){ 
            return lamapeminjaman; 
        }
            
        public void setLamapeminjaman( int lamapeminjaman ){ 
             this. lamapeminjaman = lamapeminjaman; 
        }
        
       public String getNamanasabah(){ 
            return namanasabah; 
        } 
       public void setNamanasabah( String namanasabah ){ 
             this. namanasabah = namanasabah; 
        } 
       
       public String getTanggal(){ 
            return tanggal; 
        } 
       public void setTanggal( String tanggal ){ 
             this. tanggal = tanggal; 
        } 
      
       
       public double getBunga() { 
            bunga = ( 0.12 *jumlahpeminjaman);
            return bunga; 
        } 
       
       public double getAngsuranpokok() { 
            angsuranpokok = ( jumlahpeminjaman/lamapeminjaman);
            return angsuranpokok; 
        }
       
       public double getAngsuranperbulan(){ 
            angsuranperbulan = bunga + angsuranpokok;
            return angsuranperbulan; 
        }
       
       public double getTotal(){ 
            total = jumlahpeminjaman + bunga;
            return total; 
        }
   
        /*angsuranpokok=jumlahpeminjaman/lamapeminjaman;
        bunga= 0.12 *jumlahpeminjaman;
        bungab= bunga / lamapeminjaman;
        angsuranperbulan = bungab + angsuranpokok;
        total = jumlahpeminjaman + bunga;
        */
}

    

       