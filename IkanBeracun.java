import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IkanBeracun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IkanBeracun extends Rintangan
{
    /**
     * Act - do whatever the IkanBeracun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX() +3,getY());
    if(getX() >= 899){
        setLocation(0, getY());
}
    }    
}
