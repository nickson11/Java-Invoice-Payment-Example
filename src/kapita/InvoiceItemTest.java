/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapita;

import java.util.Scanner;

/**
 *
 * @author 62822
 */
public class InvoiceItemTest {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        String id;
        String desc;
        int qty;
        double unitPrice;

        // buat invoice/instansiasi untuk object
        InvoiceItem invoiceSatu = new InvoiceItem();
        Payment Cara = new Payment();

        // invoice 1 dari user
        System.out.println("Masukkan Invoice");
        System.out.println("========================================");
        System.out.print("Masukkan ID           : ");
        id = scnr.nextLine();

        System.out.print("Masukkan Deskripsi    : ");
        desc = scnr.nextLine();

        System.out.print("Masukkan Kuantitas    : ");
        qty = scnr.nextInt();

        System.out.print("Masukkan Harga        : Rp.");
        unitPrice = scnr.nextDouble();

        System.out.println();

        // tampung data masukan invoice 1 
        invoiceSatu.setId(id);
        invoiceSatu.setDesc(desc);
        invoiceSatu.setQty(qty);
        invoiceSatu.setunitPrice(unitPrice);

        //menampilkan data yang dimasukkan
        System.out.println("Cetak Data Invoice");
        System.out.println("========================================");
        System.out.println("Id              : " + invoiceSatu.getId());
        System.out.println("Deskripsi       : " + invoiceSatu.getDesc());
        System.out.println("Kuantitas       : " + invoiceSatu.getQty());
        System.out.println("Harga           : Rp." + invoiceSatu.getunitPrice());
        System.out.printf("Total Harga     : Rp.%.1f", invoiceSatu.getTotal());
        System.out.println();
        System.out.println("Pembayaran      : " + Cara.Bayar);
        System.out.println("========================================");

    }

}
