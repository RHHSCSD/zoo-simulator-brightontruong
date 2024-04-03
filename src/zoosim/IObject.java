/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * represents objects in the zoo
 * common behaviors that objects can perform
 * objects in the zoo have to implements this
 * @author brigh
 */
public interface IObject {
    public void turn(int degrees);
    public void place(int x, int y);
}
