/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumahsakit;

/**
 *
 * @author AndhikaUtamiP
 */
public class Ruangan {
    private Pasien[] p;
    private String nama_ruang;
    private int kelas_r;
    
    public Ruangan(String nama_ruang, int kelas_r){
        this.nama_ruang = nama_ruang;
        this.kelas_r = kelas_r;
        if (kelas_r == 1){
            p = new Pasien[2];
        }
        else if(kelas_r == 2){
            p = new Pasien[5];
        }
        else {
            p = new Pasien[10];
        }
    }
    
    public int getKelasr_r(){
        return kelas_r;
    }
}
