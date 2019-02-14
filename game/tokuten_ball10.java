import greenfoot.*;

/**
 * Write a description of class tokuten_ball10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tokuten_ball10 extends bound_ball
{
    /**
     * Act - do whatever the tokuten_ball10 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int tokuten_rotation;
    static double tokuten_speed;
    
    public tokuten_ball10(){
        tokuten_speed = 0;
        tokuten_rotation = 0;
    }
    
    public void act() 
    {
        Actor actor = getOneObjectAtOffset( 0, 0, shot_ball.class );
        if( actor != null ){
            tokuten_speed = shot_ball.speed;
            tokuten_rotation = shot_ball.rotation;
        }
        kabehansya();
    }  
    
    public void kabehansya(){   //オーバーライド
        double rads = Math.toRadians(tokuten_rotation);
        int x = getX();
        int y = getY();
        
        x+=Math.round(Math.cos(rads) * tokuten_speed);  
        y+=Math.round(Math.sin(rads) * tokuten_speed);
            
        if (tokuten_speed > 0) 
        {
         tokuten_speed=tokuten_speed-0.3;
            
         if (tokuten_speed<=0)
         {
                    tokuten_speed=0;
         }
        }
        
        if (y >= 579-36)
        {
            setRotation(360-tokuten_rotation);
        }
        
        
        if (y <= 0 )
        {
             setRotation(360-tokuten_rotation);
        }
            
        
        if (x >= 1008-36)
        {
            setRotation(180-tokuten_rotation);
        }
        
        if(x <= 0)
        {
            setRotation(180-tokuten_rotation);
        }
        setLocation(x,y);
    } 
}
