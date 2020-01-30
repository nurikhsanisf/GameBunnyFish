import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FishJahat3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FishJahat3 extends Player
{
    public int jumlahFishDimakan = 0;
    public int bomDimakan = 0;
    /**
     * Act - do whatever the FishJahat3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      keyboardControls();
      eatFish();
      eatBom();
      eatIkanBeracun();
      kenaUburUbur3();
      kenaUburUbur2();
      kenaUburUbur1();
      kenaUburUbur();
      cekScore();
    }  
    
    public void keyboardControls()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            this.setImage("ikanjahat3leftT.png");
            this.setLocation(this.getX()-5, this.getY());
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            this.setImage("ikanjahat3tea.png");
            this.setLocation(this.getX()+5, this.getY());
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            //this.setImage("fishMain.png");
            this.setLocation(this.getX(), this.getY()-5);
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            //this.setImage("fishMain.png");
            this.setLocation(this.getX(), this.getY()+5);
        }
        
    }
    
    public void eatFish()
    {
        Actor getFish1 = getOneIntersectingObject(Fish1.class);
        Actor getFish2 = getOneIntersectingObject(Fish2.class);
        Actor getFish3 = getOneIntersectingObject(Fish3.class);
        if(getFish1 != null || getFish2 != null || getFish3 != null)
        {
            this.setImage("ikanjahat3Rightc.png");
            getWorld().removeObject(getFish1);
            getWorld().removeObject(getFish2);
            getWorld().removeObject(getFish3);
            Greenfoot.playSound("eating.wav");
            jumlahFishDimakan++;
        }
        getWorld().showText("score="+ jumlahFishDimakan, 100, 50);
    }
    
    public void eatBom()
    {
         Actor getBom = getOneIntersectingObject(BomAir.class);
        
        if(getBom != null)
        {
            getWorld().removeObject(getBom);
            Level3 musicLose = (Level3)getWorld();
            musicLose.musicLose();
            bomDimakan++;
        }
    }
    
    public void eatIkanBeracun()
    {
        Actor getIkanBeracun = getOneIntersectingObject(IkanBeracun.class);
        
        if(getIkanBeracun != null)
        {
            getWorld().removeObject(getIkanBeracun);
            Level3 musicLose = (Level3)getWorld();
            musicLose.musicLose();
             bomDimakan++;
        }
    }
    
    public void kenaUburUbur3()
    {
        Actor getUburUbur3 = getOneIntersectingObject(UburUbur3.class);
        
        if(getUburUbur3 != null)
        {
            getWorld().removeObject(getUburUbur3);
            Level3 musicLose = (Level3)getWorld();
            musicLose.musicLose();
            bomDimakan++;
        }
    }
    
    public void kenaUburUbur2()
    {
        Actor getUburUbur2 = getOneIntersectingObject(UburUbur2.class);
        
        if(getUburUbur2 != null)
        {
            getWorld().removeObject(getUburUbur2);
            Level3 musicLose = (Level3)getWorld();
            musicLose.musicLose();
            bomDimakan++;
        }
    }
    
    public void kenaUburUbur1()
    {
        Actor getUburUbur1 = getOneIntersectingObject(UburUbur1.class);
        
        if(getUburUbur1 != null)
        {
            getWorld().removeObject(getUburUbur1);
            Level3 musicLose = (Level3)getWorld();
            musicLose.musicLose();
            bomDimakan++;
        }
    }
    
    public void kenaUburUbur()
    {
        Actor getUburUbur = getOneIntersectingObject(UburUbur.class);
        
        if(getUburUbur != null)
        {
            getWorld().removeObject(getUburUbur);
            Level3 musicLose = (Level3)getWorld();
            musicLose.musicLose();
            bomDimakan++;
        }
    }
    
    public void cekScore()
    {
        World world=getWorld();
        if(bomDimakan >0)
        {
            LoseLevel3 loseLevel3 = new LoseLevel3();
            Greenfoot.setWorld(loseLevel3);
        }
        
        if(jumlahFishDimakan >=10)
        {
            Level3 musicNextStep = (Level3)getWorld();
            musicNextStep.musicNextStep();
            Win worldbaru = new Win();
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

