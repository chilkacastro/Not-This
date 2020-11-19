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
            relocateToby();
            if(isAtEdge()) {
                turn(45);
                move(20);
                turn(45);
                move(-1);
        
            } 

            
       }
      
      /**
       * relocateToby() - puts Toby in his initial position in that level.
       */
      public void relocateToby() {
          if (isTouching(Toby.class)) {
            Greenfoot.playSound("tireSkid.wav");
            ((MyWorld)getWorld()).lifeCount(-1);
            ((MyWorld)getWorld()).addScore(-10000);  
            
            printText();
            // put sound here -> dog cry
            //().showText("You lose a life!",360, 370);
            // put blood here?? if Toby gets hit by a car

         }     
         
     }
    
      /**
       * printText() - tells that Toby loses a life.
       */
     public void printText() {
         getWorld().showText("You lost a life!", 800, 400);
     }
    
    }
      

