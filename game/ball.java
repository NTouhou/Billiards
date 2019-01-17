import greenfoot.*;

/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    double speed = 0;
    double speedlimit = 100;
    
    /**
     * Act - do whatever the ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ball(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/10;
        int myNewWidth = (int)myImage.getWidth()/10;
        myImage.scale(36,36);
        
        
    }
    
    public void act() 
    {
        
    }
    
    public boolean isBallRemove(int x, int y){
        boolean p=false;
        if((x<36&&y<36) || (x>1008/2-18&&x>1008/2+18&&y<36) || (x>1008-36&&y<579-36) || (x<36&&y>579-36) 
            || (x>1008/2-18&&x>1008/2+18&&y>579-36) || (x>1008-36&&y>579-36)){
            p=true;
        }
        return p;
    }

    public void kabehansya(){
        double rads = Math.toRadians(getRotation());
        int x = getX();
        int y = getY();
        
        x+=Math.round(Math.cos(rads) * speed);        
        y+=Math.round(Math.sin(rads) * speed);
            
        if (speed > 0) 
        {
         speed=speed-0.5;
            
         if (speed<=0)
         {
                    speed=0;
         }
        }
        
        if (y >= 579-36)
        {
            setRotation(360-getRotation());
        }
        
        
        if (y <= 0 )
        {
             setRotation(360-getRotation());
        }
            
        
        if (x >= 1008-36)
        {
            setRotation(180-getRotation());
        }
        
        if(x <= 0)
        {
            setRotation(180-getRotation());
        }
        setLocation(x,y);
    }

}    
    
