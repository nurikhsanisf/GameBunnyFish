import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayAgainLevel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayAgainLevel3 extends PlayAgain
{
    /**
     * Act - do whatever the PlayAgainLevel3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            World Start = getWorld();
            Start = new Level3();
            Start.started();
            Greenfoot.setWorld(Start);
        }
    }

}