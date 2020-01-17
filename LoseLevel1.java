import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LoseLevel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoseLevel1 extends Lose
{

    /**
     * Constructor for objects of class LoseLevel1.
     * 
     */
    public LoseLevel1()
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
        addObject(playAgainLevel1,809,507);
        TextGameOver textGameOver = new TextGameOver();
        addObject(textGameOver,476,176);
    }
}
