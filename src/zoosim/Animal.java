/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author brigh
 */
public abstract class Animal implements IEntity{
    int id;
    String name;
    String species;
    String sex;
    int age;
    int positionX;
    int positionY;
    int size;
    int speed;
    int direction;
    int hunger;
    int fatigue;
    Image image;
    String sound;
   
    public Animal(int id, String name, String species, String sex, int age, int positionX, int positionY, int size, int speed, int direction, int hunger, int fatigue,  Image image, String sound){
        this.id = id;
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.age = age;
        this.positionX = positionX;
        this.positionY = positionY;
        this.size = size;
        this.speed = speed;
        this.direction = direction;
        this.hunger = hunger;
        this.fatigue = fatigue;
        this.image = image; 
        this.sound = sound;
    }
    
    public void makeSound(){
        System.out.println("as;ldkfhaiosehgasleghsaljghasljhnlfakjsh");
    }
    
    public void move(){
        System.out.println("The " + name + "is traveling in the " + direction + " with a speed of:" + speed);
    }
    
    public void eat(){
        hunger = 100;
        System.out.println("The " + name + " hunger is " + hunger);
    }
    
    public void sleep(){
        fatigue = 0;
        System.out.println("The " + name + " is " + fatigue + " fatigue");
               
    }
    
    public void place(int x, int y){
        positionX = x;
        positionY = y;
        
    }
    
    public void turn(int degree){
        int turn = (direction + degree);
        System.out.println(name +  " turned " + turn);
    }
    
} 
