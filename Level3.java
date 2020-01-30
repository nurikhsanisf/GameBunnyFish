import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends BunnyFishWorld
{
    GreenfootSound BGM = new GreenfootSound("bg_music.mp3");
    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {
        prepare();
    }
    
    private void prepare()
    {
        FishJahat3 fishJahat3 = new FishJahat3();
        addObject(fishJahat3,150,325);
        Fish1 fish1 = new Fish1();
        addObject(fish1,324,265);
        Fish1 fish12 = new Fish1();
        addObject(fish12,333,366);
        Fish2 fish2 = new Fish2();
        addObject(fish2,415,328);
        Fish3 fish3 = new Fish3();
        addObject(fish3,505,244);
        Crab crab = new Crab();
        addObject(crab,195,570);
        Crab crab2 = new Crab();
        addObject(crab2,432,575);
        Crab crab3 = new Crab();
        addObject(crab3,617,574);
        fishJahat3.setLocation(89,255);
        fish12.setLocation(38,432);
        fish1.setLocation(37,171);
        fish2.setLocation(120,536);
        fish3.setLocation(301,360);
        BomAir bomAir = new BomAir();
        addObject(bomAir,247,551);
        BomAir bomAir2 = new BomAir();
        addObject(bomAir2,465,76);
        BomAir bomAir3 = new BomAir();
        addObject(bomAir3,629,33);
        BomAir bomAir4 = new BomAir();
        addObject(bomAir4,191,65);

        UburUbur uburUbur = new UburUbur();
        addObject(uburUbur,328,197);
        UburUbur uburUbur2 = new UburUbur();
        addObject(uburUbur2,621,201);
        UburUbur uburUbur3 = new UburUbur();
        addObject(uburUbur3,485,313);
        UburUbur uburUbur4 = new UburUbur();
        addObject(uburUbur4,776,74);
        uburUbur3.setLocation(486,314);
        fish12.setLocation(461,210);
        fish2.setLocation(674,391);

        removeObject(uburUbur3);
        UburUbur1 uburUbur1 = new UburUbur1();
        addObject(uburUbur1,490,290);
        removeObject(uburUbur4);
        UburUbur2 uburUbur22 = new UburUbur2();
        addObject(uburUbur22,756,98);
        bomAir3.setLocation(891,63);
        bomAir2.setLocation(454,84);
        bomAir4.setLocation(163,66);
        uburUbur1.setLocation(485,485);
        uburUbur2.setLocation(657,311);
        uburUbur.setLocation(209,249);
        removeObject(uburUbur2);
        UburUbur1 uburUbur12 = new UburUbur1();
        addObject(uburUbur12,639,287);
        bomAir.setLocation(248,488);
        fish3.setLocation(355,397);

        UburUbur uburUbur5 = new UburUbur();
        addObject(uburUbur5,666,161);
        removeObject(uburUbur22);
        uburUbur5.setLocation(757,108);
        UburUbur1 uburUbur13 = new UburUbur1();
        addObject(uburUbur13,733,445);
        removeObject(uburUbur13);
        removeObject(uburUbur12);
        uburUbur1.setLocation(494,486);
        removeObject(uburUbur1);
        removeObject(uburUbur);

        UburUbur1 uburUbur14 = new UburUbur1();
        addObject(uburUbur14,676,305);
        UburUbur2 uburUbur23 = new UburUbur2();
        addObject(uburUbur23,450,420);
        UburUbur3 uburUbur32 = new UburUbur3();
        addObject(uburUbur32,232,224);
        uburUbur5.setLocation(790,82);
        uburUbur14.setLocation(697,293);
        uburUbur23.setLocation(506,397);
        uburUbur32.setLocation(205,208);

        bomAir2.setLocation(543,70);
        bomAir2.setLocation(572,81);
        fish12.setLocation(532,207);
        fish2.setLocation(717,458);
        fish3.setLocation(342,445);
        fishJahat3.setLocation(81,306);

        uburUbur14.setLocation(690,271);
        uburUbur5.setLocation(787,98);

        uburUbur23.setLocation(409,354);
        uburUbur14.setLocation(683,310);
        uburUbur32.setLocation(182,178);
        uburUbur14.setLocation(686,284);
        Fish1 fish13 = new Fish1();
        addObject(fish13,354,168);
        Fish2 fish22 = new Fish2();
        addObject(fish22,262,306);
        Fish3 fish32 = new Fish3();
        addObject(fish32,566,406);
        Fish3 fish33 = new Fish3();
        addObject(fish33,839,332);
        Fish2 fish23 = new Fish2();
        addObject(fish23,723,170);
        Fish1 fish14 = new Fish1();
        addObject(fish14,519,545);
        Fish2 fish24 = new Fish2();
        addObject(fish24,364,98);
        Fish3 fish34 = new Fish3();
        addObject(fish34,150,429);
        bomAir4.setLocation(84,74);
        bomAir4.setLocation(93,177);
        uburUbur23.setLocation(407,324);
        uburUbur23.setLocation(413,342);
        removeObject(uburUbur23);

        UburUbur2 uburUbur24 = new UburUbur2();
        addObject(uburUbur24,408,345);
        uburUbur32.setLocation(138,69);
        uburUbur24.setLocation(311,325);

        IkanBeracun ikanBeracun = new IkanBeracun();
        addObject(ikanBeracun,207,190);
        IkanBeracun ikanBeracun2 = new IkanBeracun();
        addObject(ikanBeracun2,94,483);
        IkanBeracun ikanBeracun3 = new IkanBeracun();
        addObject(ikanBeracun3,411,294);
        uburUbur32.setLocation(177,56);
        Buble buble = new Buble();
        addObject(buble,789,334);
        fishJahat3.setLocation(76,369);
        fish34.setLocation(232,383);
        fishJahat3.setLocation(112,313);
        ikanBeracun2.setLocation(559,305);
        fish32.setLocation(634,372);
        fish14.setLocation(536,391);
        fish3.setLocation(355,391);
        fish2.setLocation(791,376);
        fish2.setLocation(720,394);
        fishJahat3.setLocation(85,351);
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
