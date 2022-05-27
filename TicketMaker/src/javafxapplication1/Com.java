/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.util.ArrayList;

/**
 *
 * @author Saad
 */
public class Com {

    private String reqTim,comTim, it, typ, desc;
    public static ArrayList<Com> cList= new ArrayList<Com>();
    
    public Com() {
    }
    public Com(String reqTim, String comTim, String it, String typ, String desc) {
        this.reqTim = reqTim;
        this.comTim = comTim;
        this.it=it;
        this.typ = typ;
        this.desc = desc;
        cList.add(this);
    }

    /**
     * @return the reqTim
     */
    public String getReqTim() {
        return reqTim;
    }

    /**
     * @param reqTim the reqTim to set
     */
    public void setReqTim(String reqTim) {
        this.reqTim = reqTim;
    }

    /**
     * @return the comTim
     */
    public String getComTim() {
        return comTim;
    }

    /**
     * @param comTim the comTim to set
     */
    public void setComTim(String comTim) {
        this.comTim = comTim;
    }

    /**
     * @return the it
     */
    public String getIt() {
        return it;
    }

    /**
     * @param it the it to set
     */
    public void setIt(String it) {
        this.it = it;
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
}
