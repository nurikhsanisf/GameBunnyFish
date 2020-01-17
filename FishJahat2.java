import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FishJahat2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FishJahat2 extends Player
{
    public int jumlahFishDimakan = 0;
    public int bomDimakan = 0;
    /**
     * Act - do whatever the FishJahat2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      keyboardControls();
      eatFish();
      eatBom();
      eatIkanBeracun();
      cekScore();
    }
    
    public void keyboardControls(){
        if(Greenfoot.isKeyDown("left"))
        {
            this.setImage("ikanjahat2LeftT.png");
            this.setLocation(this.getX()-5, this.getY());
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            this.setImage("ikanjahat2LeftT2.png");
            this.setLocation(this.getX()+5, this.getY());
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            /*this.setImage("fishMain.png");*/
            this.setLocation(this.getX(), this.getY()-5);
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            /*this.setImage("fishMain.png");*/
            this.setLocation(this.getX(), this.getY()+5);
        }
    }
    
    public void eatFish(){
        Actor getFish1 = getOneIntersectingObject(Fish1.class);
        Actor getFish2 = getOneIntersectingObject(Fish2.class);
        Actor getFish3 = getOneIntersectingObject(Fish3.class);
        if(getFish1 != null || getFish2 != null || getFish3 != null)
        {
            this.setImage("ikanjahat2left.png");
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
            Level2 level2 = (Level2)getWorld();
            level2.musicLose();
            bomDimakan++;
        }
    }
    
    public void eatIkanBeracun()
    {
        Actor getIkanBeracun = getOneIntersectingObject(IkanBeracun.class);
        
        if(getIkanBeracun != null)
        {
            getWorld().removeObject(getIkanBeracun);
            Level2 level2 = (Level2)getWorld();
            level2.musicLose();
            bomDimakan++;
        }
    }
    
    public void cekScore(){
        World world=getWorld();
        if(bomDimakan >0)
        {
            LoseLevel2 loseLevel2 = new LoseLevel2();
            Greenfoot.setWorld(loseLevel2);
        }
        
        if(jumlahFishDimakan >=10)
        {
            Level2 level2 = (Level2)getWorld();
            level2.musicNextStep();
            MoveLevel3 worldbaru = new MoveLevel3();
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
    
    public int getJumlahFishDimakan(){
        return jumlahFishDimakan;
    }
}
