import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextLvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextLvl2 extends Tulisan
{
    /**
     * Act - do whatever the TextLvl2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Level3 worldbaru = new Level3();
            worldbaru.started();
            Greenfoot.setWorld(worldbaru);
        }
    }    
}
