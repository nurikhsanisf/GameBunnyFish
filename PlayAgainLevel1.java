import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayAgainLevel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayAgainLevel1 extends PlayAgain
{
    /**
     * Act - do whatever the PlayAgainLevel1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            World Start = getWorld();
            Start = new Menu();
            Start.started();
            Greenfoot.setWorld(Start);
        }
    }    
}
