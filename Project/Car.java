import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    private int speed;
    /**
     * Removes the car when it reaches the edge
     */
    public void act() {
      setLocation(getX()-2, getY());
      // Removes Toby and plays crying sound while also removing 1 life (life counter to be implemented)
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
        if(isAtEdge()) {
             getWorld().removeObject(this);
      } 
   } 
}
