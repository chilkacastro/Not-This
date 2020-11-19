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
            // Removes Toby and plays crying sound while also removing 1 life (life counter to be implemented)
            if(isTouching(Toby.class)) {
                Greenfoot.playSound("tireSkid.wav");
                removeTouching(Toby.class);
                getWorld().showText("You lose a life!",500, 500);
                Greenfoot.stop();
        }
      }
}
