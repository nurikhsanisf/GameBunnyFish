import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish3 extends Mangsa
{
    /**
     * Act - do whatever the Fish3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         setLocation(getX() +4,getY());
    if(getX() >= 899){
        setLocation(0, getY());
}
    }    
}
