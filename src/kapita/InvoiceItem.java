/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapita;

/**
 *
 * @author 62822
 */
//memanggil class dan Atribut Invoice Item 
public class InvoiceItem {

    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    //mendeklarasikan nilai dari attribute
    public InvoiceItem() {
        id = " ";
        desc = " ";
        qty = 0;
        unitPrice = 0.0;
    }

    //method get
    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getunitPrice() {
        return unitPrice;
    }

    //method set
    public void setId(String id) {
        this.id = id;
    }

    //attribute
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setunitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // method get total
    public double getTotal() {
        return unitPrice * qty; //menghitung total dari unitprice * qty
    }

    @Override
    public String toString() {
        return "InvoiceItem{" + "id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + '}';
    }

}
