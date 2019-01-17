import greenfoot.*;

/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
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
    
}
