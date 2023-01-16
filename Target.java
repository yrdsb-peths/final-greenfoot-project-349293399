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
    public void act()
    {
        TargetTimer.mark();
        //removes the target when target is clicked
        if (Greenfoot.mouseClicked(this)){
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            hitTarget.play();
            getWorld().removeObject(this);
        }
        for(int i=0; i<Target.length; i++)
        {
            Target[i] = new GreenfootImage("images/Target/"+i+".png");
        }
        setImage(Target[0]);
        for(int i=0; i<Target.length; i++)
        {
            if(TargetTimer.millisElapsed() > 200)
            {
                setImage(Target[i]);
            }
        }
        if(TargetTimer.millisElapsed() > 200){
            TargetTimer.mark();
            getWorld().removeObject(this);
        }
        
    }
}
