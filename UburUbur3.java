import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UburUbur3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UburUbur3 extends UburUburIkon
{
    /**
     * Act - do whatever the UburUbur3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 2;
    private int upTurn = 50;
    private int downTurn = 260;
    public void act(){
       Actor actor = getOneIntersectingObject(null);
       setLocation ( getX() , getY() + speed );
       if(actor != null) {
            setLocation ( getX(), getY() + speed );
       }
       if (atTurningPoint()) {
            speed = -speed;
       }
    }
    public boolean atTurningPoint()
    {
        return (getY() <= upTurn || getY() >= downTurn);
 
    }   
}
