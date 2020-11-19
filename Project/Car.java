import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    private int speed = 2;
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
      relocateToby();
      setLocation(getX()-speed, getY());
      if (getX() == 0) {
            getWorld().removeObject(this);    // problem with this and Toby --> Chilka: Error appears...I will try to fix this
            // possible solution-> put the cars in initial position again???
          setLocation(getX()-2, getY());
          // Removes Toby and plays crying sound while also removing 1 life (life counter to be implemented)
        
      }
      
      if (isTouching(Toby.class)) {
            World myWorld = getWorld();
            Level1 level1 = (Level1)myWorld;
            MyWorld myworld = (MyWorld)myWorld;
            Counter counter = level1.getCounter();
            Greenfoot.playSound("tireSkid.wav");
            counter.minLife();
            removeTouching(Toby.class);
            getWorld().showText("You lose a life!",500, 500);
            Greenfoot.stop();

        }
        
    } 
    
    /**
     * relocateToby() - to bring back Toby his initial position in that level once he is hit by car. 
     */
    public void relocateToby() { // should only relocate when he still has remaining lives 
       if (isTouching(Toby.class)) {
           Greenfoot.playSound("tireSkid.wav");
           // if getScore() != 0 then addObject-> Toby
           // put blood here?? if Toby gets hit by a car
           ((MyWorld)getWorld()).lifeCount(-1);
           ((MyWorld)getWorld()).addScore(-10000);  // automatic dead (0 pts) once hit by a car.
            // put sound here -> dog cry
            //().showText("You lose a life!",360, 370);
            

       }     
    }
     
    /**
     * printText() - tells that Toby loses a life.
     */
     public void printText() {
         getWorld().showText("You lost a life!", 800, 400);
     }

}
