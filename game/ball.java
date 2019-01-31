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
        boolean p1 = ((x-hole1.get_X())*(x-hole1.get_X())+(y-hole1.get_Y())*(y-hole1.get_Y())) < (hole1.get_Width())*(hole1.get_Width()/9);
        boolean p2 = ((x-hole2.get_X())*(x-hole2.get_X())+(y-hole2.get_Y())*(y-hole2.get_Y())) < (hole2.get_Width())*(hole2.get_Width()/9);
        boolean p3 = ((x-hole3.get_X())*(x-hole3.get_X())+(y-hole3.get_Y())*(y-hole3.get_Y())) < (hole3.get_Width())*(hole3.get_Width()/9);
        boolean p4 = ((x-hole4.get_X())*(x-hole4.get_X())+(y-hole4.get_Y())*(y-hole4.get_Y())) < (hole4.get_Width())*(hole4.get_Width()/9);
        boolean p5 = ((x-hole5.get_X())*(x-hole5.get_X())+(y-hole5.get_Y())*(y-hole5.get_Y())) < (hole5.get_Width())*(hole5.get_Width()/9);
        boolean p6 = ((x-hole6.get_X())*(x-hole6.get_X())+(y-hole6.get_Y())*(y-hole6.get_Y())) < (hole6.get_Width())*(hole6.get_Width()/9);
        if(p1||p2||p3||p4||p5||p6){
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
    
