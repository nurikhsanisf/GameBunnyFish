import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish2 extends Mangsa
{
    /**
     * Act - do whatever the Fish2 wants to do. This method is called whenever
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
