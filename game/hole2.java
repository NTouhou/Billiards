import greenfoot.*;

/**
 * Write a description of class hole2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hole2 extends hole_x
{
    /**
     * Act - do whatever the hole2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int x,y,width;
    public hole2(){
        width = getImage().getWidth();
    }
    public void act() 
    {
        x = getX();
        y = getY();
    }    
    public static int get_X(){
        return x;
    }
    public static int get_Y(){
        return y;
    }
    public static int get_Width(){
        return width;
    }
}
