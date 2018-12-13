import greenfoot.*;

/**
 * Write a description of class Taro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Taro extends Actor
{
    /**
     * Act - do whatever the Taro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        if( Greenfoot.isKeyDown( "right" ) ){
            setRotation(0);
            move(1);
        }
        if( Greenfoot.isKeyDown( "down" ) ){
            setRotation(90);
            move(1);
        }
        if( Greenfoot.isKeyDown( "up" ) ){
            setRotation(270);
            move(4);
        }
    }    
}
