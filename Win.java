import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win extends BunnyFishWorld
{
    /**
     * Constructor for objects of class Win.
     * 
     */

    public Win()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayAgainLevel1 playAgainLevel1 = new PlayAgainLevel1();
        addObject(playAgainLevel1,785,506);
        playAgainLevel1.setLocation(783,331);
    }
}
