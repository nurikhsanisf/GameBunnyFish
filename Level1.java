import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends BunnyFishWorld
{
    GreenfootSound BGM = new GreenfootSound("bg_music.mp3");
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        FishJahat fishJahat = new FishJahat();
        addObject(fishJahat,148,166);
        Fish1 fish1 = new Fish1();
        addObject(fish1,315,200);
        Fish1 fish12 = new Fish1();
        addObject(fish12,100,273);
        Fish1 fish13 = new Fish1();
        addObject(fish13,252,293);
        removeObject(fish13);
        Fish2 fish2 = new Fish2();
        addObject(fish2,246,317);
        Fish3 fish3 = new Fish3();
        addObject(fish3,428,137);
        BomAir bomAir = new BomAir();
        addObject(bomAir,200,30);
        BomAir bomAir2 = new BomAir();
        addObject(bomAir2,457,56);
        BomAir bomAir3 = new BomAir();
        addObject(bomAir3,772,29);
        Crab crab = new Crab();
        addObject(crab,205,565);
        Crab crab2 = new Crab();
        addObject(crab2,564,569);
        Fish1 fish14 = new Fish1();
        addObject(fish14,355,268);
        Fish1 fish15 = new Fish1();
        addObject(fish15,642,158);
        Fish2 fish22 = new Fish2();
        addObject(fish22,542,304);
        Fish2 fish23 = new Fish2();
        addObject(fish23,460,431);
        Fish2 fish24 = new Fish2();
        addObject(fish24,382,347);
        Fish1 fish16 = new Fish1();
        addObject(fish16,477,248);
        Fish1 fish17 = new Fish1();
        addObject(fish17,696,250);
        Fish3 fish32 = new Fish3();
        addObject(fish32,584,222);
        Fish3 fish33 = new Fish3();
        addObject(fish33,601,388);
        fishJahat.setLocation(68,214);
        bomAir.setLocation(861,122);
        fish14.setLocation(20,403);
        fish12.setLocation(31,478);
        fish2.setLocation(6,91);
        fish1.setLocation(181,323);
        fish24.setLocation(282,176);
        fish24.setLocation(229,190);
        fish23.setLocation(343,515);
        fish33.setLocation(697,477);
        fish22.setLocation(430,425);
        fish16.setLocation(401,296);
        fish17.setLocation(688,348);
        fish32.setLocation(594,294);
        fish15.setLocation(609,194);
        fish24.setLocation(245,106);
        fishJahat.setLocation(66,246);
        Buble buble = new Buble();
        addObject(buble,759,343);
        removeObject(buble);
        Buble buble2 = new Buble();
        addObject(buble2,729,320);
    }
    
    public void started(){
        music();
    }
    
    public void music()
    {        
        if(!BGM.isPlaying()){
        BGM.playLoop();
        BGM.setVolume(70);
        }
    }
    
    public void stopmusic(){
        BGM.stop();
    }
    
    public void musicLose(){
        stopmusic();
        Greenfoot.playSound("loose.mp3");
    }
    
    public void musicNextStep(){
        stopmusic();
        Greenfoot.playSound("fanfare.wav");
    }
    
    
}
