     import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
     /**
     * Write a description of class Toby here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
<<<<<<< HEAD
     public class Toby extends Actor {
    
=======
    public class Toby extends Actor {
>>>>>>> 9545277f10b56749adcd242d1665d377db9f604a
        private GreenfootImage image1 = null;
        private GreenfootImage image3 = null;
        private GreenfootImage image4 = null;
        private GreenfootImage image6 = null;
        private GreenfootImage image7 = null;
        private GreenfootImage image9 = null;
        private GreenfootImage image10 = null;
        private GreenfootImage image12 = null;
        private int slow = 0;
<<<<<<< HEAD
        
            /**
             * To create objects.
             */  
             public Toby() {
                image1 = new GreenfootImage("Right1.png");
                image3 = new GreenfootImage("Right3.png");
                image4 = new GreenfootImage("Left1.png");
                image6 = new GreenfootImage("Left3.png");
                image7 = new GreenfootImage("Back1.png");
                image9 = new GreenfootImage("Back3.png");
                image10 = new GreenfootImage("Front1.png");
                image12 = new GreenfootImage("Front3.png");
                setImage(image7);
                
            }
            /**
             * Act - do whatever the Toby wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
             */
             public void act() {
                checkKeyPressed();
                slowDown();
                nextLevel();
            }
            
            /**
             *  nextLevel() - to move Toby to the next level.
             */
             public void nextLevel() {
                // Level 2
               if (isTouching(KeyPass.class)) {
                    //((MyWorld)getWorld()).addObject(this, 10, 200);
                    Greenfoot.setWorld(new Level2());
                } 
                // Level 3
               if (isTouching(KeyPass2.class)) {
                    //((MyWorld)getWorld()).addObject(this, 10, 200);
                    Greenfoot.setWorld(new Level3());
               }  
                
            }  
    
            /**
             * checkKeyPressed - to move or control Toby whenever a key is pressed.
             */
             public void checkKeyPressed() {
                // Helps Toby to move forward
                if (Greenfoot.isKeyDown("up")) {
                    setLocation(getX(), getY() - 4);
                    // Animates Toby when going up
                    if (getImage() == image7) {
                        setImage(image9);
                    }
                    else {
                        setImage(image7);
                    }
                        
                }  
                
                // Helps Toby to move downwards
                if (Greenfoot.isKeyDown("down")) {
                    setLocation(getX(), getY() + 4);
                    // Animates Toby when going down
                    if (getImage() == image10) {
                        setImage(image12);
                    }
                    else {
                        setImage(image10);
                    }
=======
        /**
         * To create objects.
         */  
        public Toby()
        {
            image1 = new GreenfootImage("Right1.png");
            image3 = new GreenfootImage("Right3.png");
            image4 = new GreenfootImage("Left1.png");
            image6 = new GreenfootImage("Left3.png");
            image7 = new GreenfootImage("Back1.png");
            image9 = new GreenfootImage("Back3.png");
            image10 = new GreenfootImage("Front1.png");
            image12 = new GreenfootImage("Front3.png");
            setImage(image7);
        
        }
        /**
         * Act - do whatever the Toby wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
         */
        public void act() 
        {
            checkKeyPressed();
            slowDown();
            deductPoints();
        } 
        
       if (isTouching(Car.class)) {
                    World myWorld = getWorld();
                    World Level1 = getWorld();
                    Greenfoot.playSound("Crying.wav");
                    Level1 level1 = (Level1)myWorld;
                    Counter counter = level1.getCounter();
                    counter.minLife();  
            } 
        }  
    
        /**
         * checkKeyPressed - to move or control Toby whenever a key is pressed.
         */
         public void checkKeyPressed() {
            // Helps Toby to move forward
            if (Greenfoot.isKeyDown("up")) {
                setLocation(getX(), getY() - 4);
                // Animates Toby when going up
                if (getImage() == image7) {
                    setImage(image9);
                }
                else {
                    setImage(image7);
                }
                    
            }  
            // Helps Toby to move downwards
            if (Greenfoot.isKeyDown("down")) {
                setLocation(getX(), getY() + 4);
                // Animates Toby when going down
                if (getImage() == image10) {
                      setImage(image12);
                }
                else {
                    setImage(image10);
                }
            }
            // Helps Toby to move to the right side.
            if (Greenfoot.isKeyDown("right")) {
                setLocation(getX() + 4, getY());
                // Animates Toby when going to the right
                if (getImage() == image1) {
                    setImage(image3);
>>>>>>> d00ab9526adbc520d6367d7d63905e611f1aa673
                }
                
                // Helps Toby to move to the right side.
                if (Greenfoot.isKeyDown("right")) {
                    setLocation(getX() + 4, getY());
                    // Animates Toby when going to the right
                    if (getImage() == image1) {
                        setImage(image3);
                    }
                    else {
                        setImage(image1);
                    }
                }
                
                // Helps Toby to move to the left side
                if (Greenfoot.isKeyDown("left")) {
                    setLocation(getX() - 4, getY());
                    // Animates Toby when going to the left
                    if (getImage() == image4) {
                        setImage(image6);
                    }
                    else {
                        setImage(image4);
                    }
                }
            }
<<<<<<< HEAD
            
            /**
             * slowDown - to slow down Toby's movement.
             */
             public void slowDown(){
                // Helps slow down Toby's movement.
                if (slow == 50){
                    checkKeyPressed();
                    slow = 0;
=======
            // Helps Toby to move to the left side
            if (Greenfoot.isKeyDown("left")) {
                setLocation(getX() - 4, getY());
                // Animates Toby when going to the left
                if (getImage() == image4) {
                    setImage(image6);
>>>>>>> d00ab9526adbc520d6367d7d63905e611f1aa673
                }
                else {
                    slow += 1;
                }
            }
<<<<<<< HEAD
    }
=======
        }
        /**
         * slowDown - to slow down Toby's movement.
         */
         public void slowDown(){
            // Helps slow down Toby's movement.
            if (slow == 50){
                checkKeyPressed();
                slow = 0;
            }
            else {
                slow += 1;
            }
        }
        public void deductPoints() {
            if(isTouching(TrafficCone.class)) {
                MyWorld myWorld = (MyWorld)getWorld();
                myWorld.addScore(-100);
            }
        }
}
>>>>>>> d00ab9526adbc520d6367d7d63905e611f1aa673
