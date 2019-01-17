import greenfoot.*;

/**
 * Write a description of class shot_ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shot_ball extends ball
{
    /**
     * Act - do whatever the shot_ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
    }    
    public void addedToWorld(World World)
    {
        placeNewtokuten_ball1();// Add your action code here.
        placeNewtokuten_ball2();
        placeNewtokuten_ball3();
        placeNewtokuten_ball4();
        placeNewtokuten_ball5();
        placeNewtokuten_ball6();
        placeNewtokuten_ball7();
        placeNewtokuten_ball8();
        placeNewtokuten_ball9();
        placeNewtokuten_ball10();
        placeNewtokuten_ball11();
        placeNewtokuten_ball12();
        placeNewtokuten_ball13();
        placeNewtokuten_ball14();
        placeNewtokuten_ball15();
    }
    public void placeNewtokuten_ball1()
    {
        World myWorld = getWorld();
        myWorld.addObject(new tokuten_ball1(),myWorld.getWidth()/3*2,getY());
    }
    public void placeNewtokuten_ball2()
    {
        World myWorld = getWorld();
        myWorld.addObject(new tokuten_ball2(),getWorld().getWidth()/3*2+36,getY()+18);
    }
    public void placeNewtokuten_ball3()
    {
        World myWorld = getWorld();
        myWorld.addObject(new tokuten_ball3(),myWorld.getWidth()/3*2+36,getY()-18);
    }
    public void placeNewtokuten_ball4()
    {
         World myWorld = getWorld();
        myWorld.addObject(new tokuten_ball4(),myWorld.getWidth()/3*2+72,getY()+36);
    }
    public void placeNewtokuten_ball5()
    {
         World myWorld = getWorld();
        myWorld.addObject(new tokuten_ball5(),myWorld.getWidth()/3*2+72,getY());
    }
    public void placeNewtokuten_ball6()
    {
         World myWorld = getWorld();
        myWorld.addObject(new tokuten_ball6(),myWorld.getWidth()/3*2+72,getY()-36);
    }
    public void placeNewtokuten_ball7()
    {
         World myWorld = getWorld();
        myWorld.addObject(new tokuten_ball7(),myWorld.getWidth()/3*2+108,getY()+54);
    }
    public void placeNewtokuten_ball8()
    {
         World myWorld = getWorld();
        myWorld.addObject(new tokuten_ball8(),myWorld.getWidth()/3*2+108,getY()+18);
    }
    public void placeNewtokuten_ball9()
    {
         World myWorld = getWorld();
        myWorld.addObject(new tokuten_ball9(),myWorld.getWidth()/3*2+108,getY()-18);
    }
    public void placeNewtokuten_ball10()
    {
         World myWorld = getWorld();
        myWorld.addObject(new tokuten_ball10(),myWorld.getWidth()/3*2+108,getY()-54);
    }
    public void placeNewtokuten_ball11()
    {
         World myWorld = getWorld();
        myWorld.addObject(new tokuten_ball11(),myWorld.getWidth()/3*2+144,getY()+72);
    }
    public void placeNewtokuten_ball12()
    {
         World myWorld = getWorld();
        myWorld.addObject(new tokuten_ball12(),myWorld.getWidth()/3*2+144,getY()+36);
    }
    public void placeNewtokuten_ball13()
    {
         World myWorld = getWorld();
        myWorld.addObject(new tokuten_ball13(),myWorld.getWidth()/3*2+144,getY());
    }
    public void placeNewtokuten_ball14()
    {
         World myWorld = getWorld();
        myWorld.addObject(new tokuten_ball14(),myWorld.getWidth()/3*2+144,getY()-36);
    }
     public void placeNewtokuten_ball15()
    {
         World myWorld = getWorld();
        myWorld.addObject(new tokuten_ball15(),myWorld.getWidth()/3*2+144,getY()-72);
    }
}
