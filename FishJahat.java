import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FishJahat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FishJahat extends Player
{
    public int jumlahFishDimakan = 0;
    public int bomDimakan = 0;
    /**
     * Act - do whatever the FishJahat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      keyboardControls();
      eatFish();
      eatBom();
      cekScore();
    }
    
    public void keyboardControls(){
        if(Greenfoot.isKeyDown("left"))
        {
            this.setImage("fishMainleft.png");
            this.setLocation(this.getX()-5, this.getY());
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            this.setImage("fishMain.png");
            this.setLocation(this.getX()+5, this.getY());
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            this.setImage("fishMain.png");
            this.setLocation(this.getX(), this.getY()-5);
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            this.setImage("fishMain.png");
            this.setLocation(this.getX(), this.getY()+5);
        }
    }
    
    public void eatFish(){
        Actor getFish1 = getOneIntersectingObject(Fish1.class);
        Actor getFish2 = getOneIntersectingObject(Fish2.class);
        Actor getFish3 = getOneIntersectingObject(Fish3.class);
        if(getFish1 != null || getFish2 != null || getFish3 != null)
        {
            this.setImage("fishMain2.png");
            getWorld().removeObject(getFish1);
            getWorld().removeObject(getFish2);
            getWorld().removeObject(getFish3);
            Greenfoot.playSound("eating.wav");
            jumlahFishDimakan++;
        }
        getWorld().showText("score="+ jumlahFishDimakan, 100, 50);
    }
    
    public void eatBom(){
        Actor getBom = getOneIntersectingObject(BomAir.class);
        
        if(getBom != null)
        {
            getWorld().removeObject(getBom);
            Level1 level1 = (Level1)getWorld();
            level1.musicLose();
            bomDimakan++;
        }
    }
    
    public void cekScore(){
        World world=getWorld();
        if(bomDimakan >0)
        {
            LoseLevel1 loseLevel1 = new LoseLevel1();
            Greenfoot.setWorld(loseLevel1);
        }
        
        if(jumlahFishDimakan >=10)
        {
            Level1 level1 = (Level1)getWorld();
            level1.musicNextStep();
            MoveLevel2 worldbaru = new MoveLevel2();
            Greenfoot.setWorld(worldbaru);
        }
    }
    
    public void turnAtEdge()
    {
        if(getX() <= 10 || getX() >= getWorld().getWidth() - 10)
        {
            turn(180);
        }
        
        if(getY() <= 10 || getY() >= getWorld().getWidth() - 10)
        {
            turn(180);
        }
    }
    
    /*public int getJumlahFishDimakan(){
        return jumlahFishDimakan;
    }*/
}
