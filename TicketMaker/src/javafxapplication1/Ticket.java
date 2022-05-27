/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.util.ArrayList;
import javafx.scene.control.CheckBox;

/**
 *
 * @author Saad
 */

public class Ticket {
    public static ArrayList<Ticket> tList= new ArrayList<Ticket>(); 
    
    public Ticket(){}
    private String tim,urg, typ, desc, reqstr;
    private CheckBox c=new CheckBox();
    public Ticket(String tim,String reqstr,String urg, String typ,String desc){
    this.tim=tim;
    this.urg=urg;
    this.typ=typ;
    this.desc=desc;
    this.reqstr=reqstr;
    tList.add(this);
}

    /**
     * @return the tim
     */
    public String getTim() {
        return tim;
    }

    /**
     * @param tim the tim to set
     */
    public void setTim(String tim) {
        this.tim = tim;
    }

    /**
     * @return the urg
     */
    public String getUrg() {
        return urg;
    }

    /**
     * @param urg the urg to set
     */
    public void setUrg(String urg) {
        this.urg = urg;
    }

    /**
     * @return the typ
     */
    public String getTyp() {
        return typ;
    }

    /**
     * @param typ the typ to set
     */
    public void setTyp(String typ) {
        this.typ = typ;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the c
     */
    public CheckBox getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(CheckBox c) {
        this.c = c;
    }

    /**
     * @return the reqstr
     */
    public String getReqstr() {
        return reqstr;
    }

    /**
     * @param reqstr the reqstr to set
     */
    public void setReqstr(String reqstr) {
        this.reqstr = reqstr;
    }
}
