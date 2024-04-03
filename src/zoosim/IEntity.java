/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * represents an entity in the zoo
 * this interface provides common methods that animals can do
 * all entities in the zoo implement this interface
 * @author brigh
 */
public interface IEntity extends IObject {
    public void move();
    public void makeSound();
    public void eat();
    public void sleep();
}
