        import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
        
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
<<<<<<< HEAD
public class Car extends Actor {
    private int speed = 5;
        
        /**
         * Default constructor 
         */
         public Car() {
            // Chilka: I am trying to make a constructor here. If you have an idea, add something to the parameter.
            
        } 
        
        
       /**
        * Act - do whatever the Car wants to do. This method is called whenever
        * the 'Act' or 'Run' button gets pressed in the environment.
        */
        public void act() {
           setLocation(getX()-speed, getY());
           removeToby();
          
           if (getX() == 0) {
              getWorld().removeObject(this);  
              
           }

       }
        
        /**
         * removeToby() - to remove Toby from the World and bring him back to his initial position in that level.
         */
        public void removeToby() {
            if (isTouching(Toby.class)) {
                removeTouching(Toby.class);
                deductPoints();
                MyWorld myWorld = (MyWorld)getWorld();
                if (myWorld.getLifeCount() > 0) {
                    reviveToby();
                }   
    
            }
        }
    
        /**
         * deductPoints() - to remove points when Toby touches the traffic cones.
         */
         public void deductPoints() {
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.lifeCount(-1);
    
        }
    
        /**
         * reviveToby() - bring back Toby
         */
        public void reviveToby() {
            Level1 myLevel1 = (Level1)getWorld();
            myLevel1.addObject(new Toby(), 800, 640);
           
        }

=======
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
>>>>>>> d00ab9526adbc520d6367d7d63905e611f1aa673
}
