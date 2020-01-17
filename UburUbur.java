import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UburUbur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UburUbur extends UburUburIkon
{
    /**
     * Act - do whatever the UburUbur wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 2;
    private int upTurn = 78;
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
