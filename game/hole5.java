import greenfoot.*;

/**
 * Write a description of class hole5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hole5 extends hole_x
{
    /**
     * Act - do whatever the hole5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int x,y,width;
    public hole5(){
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
