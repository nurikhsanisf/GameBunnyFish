import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextLvl1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextLvl1 extends Tulisan
{
    /**
     * Act - do whatever the TextLvl1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Level2 worldbaru = new Level2();
            worldbaru.started();
            Greenfoot.setWorld(worldbaru);
        }
    }    
}
