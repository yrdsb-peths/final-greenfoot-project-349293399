import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Daniel 
 * @version 1.00
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    SimpleTimer TargetTimer = new SimpleTimer();
    public MyWorld()
    {    
        super(1200, 600, 1, false);
        
        TargetTimer.mark();
        
        bow bow = new bow();
        
        addObject(bow, -10, -10);
        
        //creating label for score
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
    }
    public int randomNumber(int min, int max)
    {
        int result= Greenfoot.getRandomNumber(max-min+1);
        return result + min;
    }
    public void createTarget()
    {
        Target target = new Target();
        int x=randomNumber(150, 1050);
        int y=randomNumber(150, 450);
        addObject(target,x,y);
    }
    public void increaseScore()
    {
        score+=10;
        scoreLabel.setValue(score);
    }
    public void act(){
        if(score<=9)
        {
            if(TargetTimer.millisElapsed() > 1500)
            {
            createTarget();
            createTarget();
            TargetTimer.mark();
            }
        }
        else if(10<=score && score<=19)
        {
            if(TargetTimer.millisElapsed() > 1250)
            {
            createTarget();
            createTarget();
            TargetTimer.mark();
            }
        }
        else if(20<=score && score<=29)
        {
            if(TargetTimer.millisElapsed() > 1000)
            {
            createTarget();
            createTarget();
            TargetTimer.mark();
            }
        }
        else if(30<=score && score<=39)
        {
            if(TargetTimer.millisElapsed() > 750)
            {
            createTarget();
            createTarget();
            TargetTimer.mark();
            }
        }
        else if(40<=score && score<=49)
        {
            if(TargetTimer.millisElapsed() > 500)
            {
            createTarget();
            createTarget();
            TargetTimer.mark();
            }
        }
        else if(50<=score)
        {
            Endscreen end = new Endscreen();
            Greenfoot.setWorld(end);
        }
        
    }
    


}
