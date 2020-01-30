import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoveLevel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoveLevel2 extends MoveLevel
{

    /**
     * Constructor for objects of class MoveLevel2.
     * 
     */
    public MoveLevel2()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TextLvl1 textLvl1 = new TextLvl1();
        addObject(textLvl1,489,381);
        textLvl1.setLocation(539,243);
        textLvl1.setLocation(548,229);
        textLvl1.setLocation(510,226);
        textLvl1.setLocation(563,260);
        textLvl1.setLocation(599,283);
        textLvl1.setLocation(585,242);
        textLvl1.setLocation(546,220);
    }
}
