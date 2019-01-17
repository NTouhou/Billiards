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
            getWorld().removeObject(this);
            //その後ゲームオーバー処理を書く、もしくはゲームオーバーフラグみたいなのをtrueにする。
        }
    }    
}
