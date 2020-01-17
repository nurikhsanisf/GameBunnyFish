import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LoseLevel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoseLevel3 extends Lose
{

    /**
     * Constructor for objects of class LoseLevel3.
     * 
     */
    public LoseLevel3()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TextGameOver textGameOver = new TextGameOver();
        addObject(textGameOver,470,172);
        PlayAgainLevel3 playAgainLevel3 = new PlayAgainLevel3();
        addObject(playAgainLevel3,759,487);
    }
}
