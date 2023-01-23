import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Target here.
 * 
 * @author Daniel
 * @version Jan 16, 2023
 */
public class Target extends Actor
{
    /**
     * Act - do whatever the Target wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Target array creation
    GreenfootImage[] Target=new GreenfootImage[4];
    
    //Timer for target array
    SimpleTimer TargetTimer = new SimpleTimer();
    
    //Sound for hitting target
    GreenfootSound hitTarget = new GreenfootSound("ding.mp3");
    int count=0;
    int imageIndex=0;
    
    public void act()
    {
        //removes the target when target is clicked
        if (Greenfoot.mouseClicked(this)){
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            hitTarget.play();
            getWorld().removeObject(this);
        }
        
        //plays the shrinkingTarget method
        shrinkingTarget();
        
        //makes it so after a current amount of time the target leaves
        if(count==75)
        {
            count=0;
            getWorld().removeObject(this);
        }
        
    }
    public Target()
    {
        //adds all target images into an array
        for(int i=0; i<Target.length; i++)
        {
            Target[i] = new GreenfootImage("images/Target/"+i+".png");
            setImage(Target[i]);
        }
        TargetTimer.mark();
    }
    public void shrinkingTarget()
    {
        //increasing count
        if(TargetTimer.millisElapsed() < 300)
        {
            count++;
            return;
        }
        
        //shrinks target
        TargetTimer.mark();
        setImage(Target[imageIndex]);
        imageIndex = (imageIndex+1)%Target.length;
    }
}
