import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayAgainLevel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayAgainLevel2 extends PlayAgain
{
    /**
     * Act - do whatever the PlayAgainLevel2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            World Start = getWorld();
            Start = new Level2();
            Start.started();
            Greenfoot.setWorld(Start);
        }
    }    
}