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
            if(isAtEdge()) {
                turn(45);
                move(20);
                turn(45);
                move(-1);
        
            } 
            if(isTouching(Toby.class))
            {
                Greenfoot.playSound("tireSkid.wav");
            }
        }
      public void removeToby() {
            if(isTouching(Toby.class)) {
                removeTouching(Toby.class);
            }
        }
}
