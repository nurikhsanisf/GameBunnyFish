import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BomAir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BomAir extends Rintangan
{
    /**
     * Act - do whatever the BomAir wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation(getX(), getY()+1);
        if (getY()>this.getWorld().getHeight()-getImage().getHeight()/2){
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()), 0);
    }    
    }    
}
