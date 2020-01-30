import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BgTutorial extends BunnyFishWorld
{

    /**
     * Constructor for objects of class Tutorial.
     * 
     */
    public BgTutorial()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Back2 back2 = new Back2();
        addObject(back2,773,509);
        back2.setLocation(828,348);
    }
}
