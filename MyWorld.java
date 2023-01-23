import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Daniel 
 * @version 1.00
 */
public class MyWorld extends World
{
    //creating score
    public int score = 0;
    Label scoreLabel;
    
    //adding timer
    SimpleTimer TargetTimer = new SimpleTimer();
    public MyWorld()
    {   
        
        super(1200, 600, 1, false);
        
        TargetTimer.mark();
        
        //creating crosshair
        bow bow = new bow();
        
        addObject(bow, -10, -10);
        
        //creating label for score
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
    }
    public int randomNumber(int min, int max)
    {
        //random number gen
        int result= Greenfoot.getRandomNumber(max-min+1);
        return result + min;
    }
    public void createTarget()
    {
        //creating targets
        Target target = new Target();
        int x=randomNumber(150, 1050);
        int y=randomNumber(150, 450);
        addObject(target,x,y);
    }
    public void increaseScore()
    {
        //increases your score
        score+=1;
        scoreLabel.setValue(score);
    }
    public void act()
    {
        //increasing target spawn rate as score increases
        if(score<=9)
        {
            if(TargetTimer.millisElapsed() > 1500)
            {
            createTarget();
            TargetTimer.mark();
            }
        }
        else if(10<=score && score<=19)
        {
            if(TargetTimer.millisElapsed() > 1250)
            {
            createTarget();
            TargetTimer.mark();
            }
        }
        else if(20<=score && score<=29)
        {
            if(TargetTimer.millisElapsed() > 1000)
            {
            createTarget();
            TargetTimer.mark();
            }
        }
        else if(30<=score && score<=39)
        {
            if(TargetTimer.millisElapsed() > 750)
            {
            createTarget();
            TargetTimer.mark();
            }
        }
        else if(40<=score && score<=49)
        {
            if(TargetTimer.millisElapsed() > 500)
            {
            createTarget();
            TargetTimer.mark();
            }
        }
        //brings the player to the endscreen
        else if(50<=score)
        {
            Endscreen end = new Endscreen();
            Greenfoot.setWorld(end);
        }
    }
    


}
