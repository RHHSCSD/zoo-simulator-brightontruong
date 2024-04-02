/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brigh
 */
public class Zoo {
    ArrayList<Animal> animals = new ArrayList<Animal>();

    
    
    public void addAniamls(Animal ann){
        animals.add(ann);
    }

    void Stats() {
        System.out.println("test");
    }

    void FeedALl() {
        if(hunger < 50){
            hunger = 100;
            
        }
    }

    void SleepAll() {
        if(faitgue > 50)
         faitgue = 0;
    }

    void move() {
       
    }
   
    
}
