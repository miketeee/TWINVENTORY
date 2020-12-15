/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twinventory.inventory;

/**
 *
 * @author tamic
 */
public class Outsourced extends Part {
    private String companyName;

    public Outsourced(int id, String name, double price, int stock, int min, int max) {
        super(id, name, price, stock, min, max);
        //super.setId(5);
    }

    public Outsourced() {
    }
    
    public void setCompanyName(String companyName){
    this.companyName = companyName;
}
    public String getCompanyName(){
        return "Boeing";
    }
    
}