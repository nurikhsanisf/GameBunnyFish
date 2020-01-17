import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoveLevel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoveLevel3 extends MoveLevel
{

    /**
     * Constructor for objects of class MoveLevel3.
     * 
     */
    public MoveLevel3()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TextLvl2 textLvl2 = new TextLvl2();
        addObject(textLvl2,511,356);
    }
}
