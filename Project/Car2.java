     import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class Car2 here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Car2 extends Actor
    {
        /**
         * Act - do whatever the Car2 wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */

         public void act() {
            move(3);    
            removeToby();

        public void act() {
            move(3);
            if(isAtEdge()) {
                turn(45);
                move(20);
                turn(45);
                move(-1);
                
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
         * deducPoints() - to remove points when Toby touches the traffic cones.
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
    }
      


      

=======
            } 
            // Removes Toby and plays crying sound while also removing 1 life (life counter to be implemented)
            if(isTouching(Toby.class)) {
                Greenfoot.playSound("tireSkid.wav");
                removeTouching(Toby.class);
                getWorld().showText("You lose a life!",500, 500);
                Greenfoot.stop();
        }
      }
}
>>>>>>> d00ab9526adbc520d6367d7d63905e611f1aa673
