import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        //creating size+labels
        super(800, 800, 1); 
        //title label
        Label titleLabel = new Label("Aim Trainer",100);
        addObject(titleLabel,400,300);
        //controls for changing crosshair colours
        Label controls = new Label("click left or right arrow key to change crosshair", 40);
        addObject(controls,400,400);
        //instructions for how to play the game
        Label instructions = new Label("move your mouse to where the targets are and click", 40);
        addObject(instructions,400,500);
        bow bow = new bow();
        
        addObject(bow, -10, -10);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
