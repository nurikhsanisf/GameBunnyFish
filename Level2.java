import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends BunnyFishWorld
{
    GreenfootSound BGM = new GreenfootSound("bg_music.mp3");
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {
        prepare();
    }
    
    private void prepare()
    {
        FishJahat2 fishJahat2 = new FishJahat2();
        addObject(fishJahat2,294,211);
        FishJahat2 fishJahat22 = new FishJahat2();
        addObject(fishJahat22,824,418);
        removeObject(fishJahat22);

        Fish2 fish2 = new Fish2();
        addObject(fish2,293,220);
        Fish1 fish1 = new Fish1();
        addObject(fish1,299,317);
        Fish3 fish3 = new Fish3();
        addObject(fish3,492,268);
        fishJahat2.setLocation(318,265);
        fish2.setLocation(405,271);
        fishJahat2.setLocation(104,318);
        Crab crab = new Crab();
        addObject(crab,234,557);
        Crab crab2 = new Crab();
        addObject(crab2,403,573);
        Crab crab3 = new Crab();
        addObject(crab3,587,566);
        FishJahat2 fishJahat23 = new FishJahat2();
        addObject(fishJahat23,160,304);
        removeObject(fishJahat23);
        removeObject(fishJahat2);
        FishJahat2 fishJahat24 = new FishJahat2();
        addObject(fishJahat24,151,347);
        Buble buble = new Buble();
        addObject(buble,754,353);
        Fish1 fish12 = new Fish1();
        addObject(fish12,317,154);
        Fish2 fish22 = new Fish2();
        addObject(fish22,258,479);
        Fish3 fish32 = new Fish3();
        addObject(fish32,41,218);
        fish2.setLocation(477,414);
        fish1.setLocation(295,286);
        Fish1 fish13 = new Fish1();
        addObject(fish13,543,154);
        buble.setLocation(646,360);
        Fish2 fish23 = new Fish2();
        addObject(fish23,646,360);

        buble.setLocation(621,471);
        Fish2 fish24 = new Fish2();
        addObject(fish24,621,471);
        Fish3 fish33 = new Fish3();
        addObject(fish33,612,317);
        BomAir bomAir = new BomAir();
        addObject(bomAir,194,51);
        BomAir bomAir2 = new BomAir();
        addObject(bomAir2,473,146);
        BomAir bomAir3 = new BomAir();
        addObject(bomAir3,716,38);
        buble.setLocation(900,295);
        BomAir bomAir4 = new BomAir();
        addObject(bomAir4,900,295);
        BomAir bomAir5 = new BomAir();
        addObject(bomAir5,52,166);
        fishJahat24.setLocation(146,256);
        removeObject(fishJahat24);
        buble.setLocation(841,351);

        buble.setLocation(803,393);
        FishJahat2 fishJahat25 = new FishJahat2();
        addObject(fishJahat25,803,393);
        buble.setLocation(706,566);
        buble.setLocation(858,381);
        fishJahat25.setLocation(855,392);
        buble.setLocation(869,388);
        IkanBeracun ikanBeracun = new IkanBeracun();
        addObject(ikanBeracun,75,345);
        IkanBeracun ikanBeracun2 = new IkanBeracun();
        addObject(ikanBeracun2,145,175);
        IkanBeracun ikanBeracun3 = new IkanBeracun();
        addObject(ikanBeracun3,159,467);
        IkanBeracun ikanBeracun4 = new IkanBeracun();
        addObject(ikanBeracun4,316,332);
        BomAir bomAir6 = new BomAir();
        addObject(bomAir6,581,47);
        BomAir bomAir7 = new BomAir();
        addObject(bomAir7,313,85);
        buble.setLocation(790,388);
        buble.setLocation(741,507);
        buble.setLocation(850,384);
        buble.setLocation(661,404);
        buble.setLocation(761,351);
        buble.setLocation(698,469);
        buble.setLocation(556,414);
        buble.setLocation(570,534);
        fishJahat25.setLocation(713,215);
        buble.setLocation(751,254);
        buble.setLocation(608,419);
        buble.setLocation(839,149);
        buble.setLocation(710,214);
        buble.setLocation(834,193);
        buble.setLocation(704,422);
        buble.setLocation(839,126);
        buble.setLocation(881,526);
        fishJahat25.setLocation(861,111);
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
