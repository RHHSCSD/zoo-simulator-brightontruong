/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *represents objects found in a zoo like food, rocks, and trees
 * provides information about type, position, and size of objects
 * each zoo object should extend this
 * @author brigh
 */
public abstract class ZooObjects implements IObject{
   int postitonX;
   int positionY;
   int size;
   String food;
   String rock;
   String tree;
           
   
   public ZooObjects(int positionX, int positionY, int size, String food, String rock, String tree){
       this.postitonX = positionX;
       this.positionY = positionY;
       this.size = size;
       this.food = food;
       this.rock = rock;
       this.tree = tree;
   }
   
   public void type(String food, String rock, String tree){
       
   }
   
   public void position(int positionX, int positionY){
       
   }
   
   public void size(int size){
       
   }
}