import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends BunnyFishWorld
{
    GreenfootSound BGM = new GreenfootSound("bg_music.mp3");
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Play play = new Play();
        addObject(play,148,520);
        About about = new About();
        addObject(about,475,515);
        Tutorial tutorial = new Tutorial();
        addObject(tutorial,785,514);
        tutorial.setLocation(803,325);
        about.setLocation(521,334);
        play.setLocation(174,354);
        tutorial.setLocation(883,347);
        about.setLocation(526,327);
        tutorial.setLocation(779,321);
        about.setLocation(428,350);
        tutorial.setLocation(780,348);
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
}
