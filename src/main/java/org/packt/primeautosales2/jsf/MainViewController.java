/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.packt.primeautosales2.jsf;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.event.ResizeEvent;

/**
 *
 * @author Caleb
 */
@Named(value = "mainViewController")
@RequestScoped
public class MainViewController {
    
    private String selectionType;
    /**
     * Creates a new instance of MainViewController
     */
    public MainViewController() {
    }
    
    public void layoutResizeEvent (ResizeEvent event){
        System.out.println("The layout has been sized: " + event.getComponent());
    }

    /**
     * @return the selectionType
     */
    public String getSelectionType() {
        return selectionType;
    }

    /**
     * @param selectionType the selectionType to set
     */
    public void setSelectionType(String selectionType) {
        this.selectionType = selectionType;
    }
    
    public String navigateToA1(){
        selectionType="specification1";
        return "automobile";
    }
    
    public String navigateToA2(){
        selectionType="specification2";
        return "automobile";
    }
    
    public String navigateToA3(){
        selectionType="specification3";
        return "automobile";
    }
    
}
