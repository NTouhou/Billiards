import greenfoot.*;

/**
 * Write a description of class cue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cue extends Actor
{
    /**
     * Act - do whatever the cue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    double x,y;
    public cue(){
        setRotation(137);
        GreenfootImage myImage = getImage();
        myImage.scale(250,250);
        setLocation(getImage().getWidth()/4-185, getImage().getHeight()/2);
    }
    public void act() 
    {
        if(Greenfoot.isKeyDown("ENTER") && ball.speed>0){
            getImage().setTransparency(0);
        }else{
            int rotation = shot_ball.get_Rotation();
            x = (shot_ball.x)-185*Math.cos(rotation*(2*Math.PI/360));
            y = (shot_ball.y)-185*Math.sin(rotation*(2*Math.PI/360));
            setLocation((int)x, (int)y);
            setRotation(137+rotation);    //白球とrotationを同期する
            getImage().setTransparency(255);
        }
    }    
}
