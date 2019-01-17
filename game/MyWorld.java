import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int height;
    private int width;
    
    public static shot_ball shot_ball;
    public MyWorld()
    {    
        super(1008,579, 1); 
        shot_ball = new shot_ball();
        addObject (shot_ball, getWidth()/4, getHeight()/2);
        
        addObject(new tokuten_ball1(),getWidth()/3*2,getHeight()/2);
        addObject(new tokuten_ball2(),getWidth()/3*2+36,getHeight()/2+18);
        addObject(new tokuten_ball3(),getWidth()/3*2+36,getHeight()/2-18);
        addObject(new tokuten_ball4(),getWidth()/3*2+72,getHeight()/2+36);
        addObject(new tokuten_ball5(),getWidth()/3*2+72,getHeight()/2);
        addObject(new tokuten_ball6(),getWidth()/3*2+72,getHeight()/2-36);
        addObject(new tokuten_ball7(),getWidth()/3*2+108,getHeight()/2+54);
        addObject(new tokuten_ball8(),getWidth()/3*2+108,getHeight()/2+18);
        addObject(new tokuten_ball9(),getWidth()/3*2+108,getHeight()/2-18);
        addObject(new tokuten_ball10(),getWidth()/3*2+108,getHeight()/2-54);
        addObject(new tokuten_ball11(),getWidth()/3*2+144,getHeight()/2+72);
        addObject(new tokuten_ball12(),getWidth()/3*2+144,getHeight()/2+36);
        addObject(new tokuten_ball13(),getWidth()/3*2+144,getHeight()/2);
        addObject(new tokuten_ball14(),getWidth()/3*2+144,getHeight()/2-36);
        addObject(new tokuten_ball15(),getWidth()/3*2+144,getHeight()/2-72);
    }
}
