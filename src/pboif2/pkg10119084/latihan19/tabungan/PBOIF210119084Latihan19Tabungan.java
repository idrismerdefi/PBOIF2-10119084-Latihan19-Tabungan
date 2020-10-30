/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan19.tabungan;

/**
 * @author  
 * Nama  : Muhammad Idris Merdefi
 * Kelas : PBOIF2
 * NIM   : 10119084
 * Deskripsi Program : Program ini berisi program untuk menampilkan Program Tabungan
 **/
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
public class PBOIF210119084Latihan19Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
       //Format number
        DecimalFormat kursIndonesia = (DecimalFormat) 
        DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);

        
        int lama,i;
        float bunga;
        double saldoAwal, saldoTotal;
        
        System.out.print("Saldo Awal      : Rp. ");
        saldoAwal=input.nextDouble();
        System.out.print("Bunga/bulan(%): ");
        bunga=input.nextFloat();
        System.out.print("Lama (bulan) : ");
        lama=input.nextInt();
        
        bunga = (float) (bunga/100);
        System.out.println(bunga);
        
        for (i=1;i<=lama;i++){
            saldoTotal = (saldoAwal * 0.15) + saldoAwal;
            System.out.println("Saldo dibulan ke-" + i + "%s %n"+kursIndonesia.format(saldoTotal));
            saldoAwal  = saldoTotal;
        }
        System.out.println("===============================================");
        System.out.println("Developed by Muhammad Idris Merdefi");
    }
    
}
