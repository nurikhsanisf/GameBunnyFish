import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LoseLevel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoseLevel2 extends Lose
{

    /**
     * Constructor for objects of class LoseLevel2.
     * 
     */
    public LoseLevel2()
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
        addObject(textGameOver,467,183);
        PlayAgainLevel2 playAgainLevel2 = new PlayAgainLevel2();
        addObject(playAgainLevel2,758,486);
        textGameOver.setLocation(564,119);
        playAgainLevel2.setLocation(757,299);
        textGameOver.setLocation(604,113);
        playAgainLevel2.setLocation(831,372);
        textGameOver.setLocation(510,126);
    }
}
