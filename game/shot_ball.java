import greenfoot.*;

/**
 * Write a description of class shot_ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shot_ball extends ball
{
    int x, y;
    public void act() 
    {
        x = getX();
        y = getY();
        if(isBallRemove(x,y) == true){

            //getWorld().removeObject(this);
            //その後ゲームオーバー処理を書く、もしくはゲームオーバーフラグみたいなのをtrueにする。
            getWorld().showText( "ゲームオーバー", 100, 50 );
            Greenfoot.stop();
        }
        int shot = 0;
        
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(getRotation()+1);
        }
        
        else if(Greenfoot.isKeyDown("right"))
        {
            setRotation(getRotation()-1);           
        }// Add your action code here.
        
        if (Greenfoot.isKeyDown("up"))
        {
            speed+=1;
            if (speed>100)
            {
                speed=speedlimit;
            }
        }
        
        if (Greenfoot.isKeyDown("down"))
        {
            speed-=1;
            if (speed<0)
            {
                speed=0;
            }
        }
        
        if(Greenfoot.isKeyDown("ENTER"))
        {      
            shot = 1;
        }
        if(shot == 1){
            kabehansya();
        }
        if(speed == 0){
            shot = 0;
        }
    }    
}
