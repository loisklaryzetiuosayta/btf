/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import java.util.Date;

/**
 *
 * @author earleenjanefuentes
 */
public class TransactionBean {
    private int transactionID;
    private Date date;
     private String type;
    
    public TransactionBean(){
        
    }
    
    public TransactionBean(Date d, RawBean r, String t){
        date = d;
        type = t;
    }

    public Date getDate() {
        return date;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public String getType() {
        return type;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
