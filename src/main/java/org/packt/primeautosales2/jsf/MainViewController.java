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

    /**
     * Creates a new instance of MainViewController
     */
    public MainViewController() {
    }
    
    public void layoutResizeEvent (ResizeEvent event){
        System.out.println("The layout has been sized: " + event.getComponent());
    }
    
}
