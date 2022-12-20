import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bow extends Actor
{
    public bow(){
        GreenfootImage image = new GreenfootImage(10, 10);
        image.fillOval(0, 0, 10,10);
        setImage(image);
    }

    public void act(){
        MouseInfo info = Greenfoot.getMouseInfo();
        if(info != null){
            int x = info.getX();
            int y = info.getY();
            setLocation(x, y);
        }
        
    }
}
