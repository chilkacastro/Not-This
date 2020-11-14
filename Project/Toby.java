import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Toby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Toby extends Actor
{
    private GreenfootImage image1 = null;
    private GreenfootImage image2 = null;
    private GreenfootImage image4 = null;
    private GreenfootImage image5 = null;
    private GreenfootImage image6 = null;
    private GreenfootImage image7 = null;
    private GreenfootImage image9 = null;
    private GreenfootImage image10 = null;
    private int counter=0;


/**
 * 
 */  
public Toby()
{
image1 =  new  GreenfootImage("Right1.png");
image2 =  new  GreenfootImage("Right2.png");
image4 =  new  GreenfootImage("Left1.png");
image5 =  new  GreenfootImage("Left2.png");
image6 =  new  GreenfootImage("Back1.png");
image7 =  new  GreenfootImage("Back2.png");
image9 =  new  GreenfootImage("Front1.png");
image10 =  new  GreenfootImage("Front2.png");


}
/**
 * Act - do whatever the Toby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
public void act() 
{
 keyDown();
 counter();
} 
/**
 * this method is controlling the direction of Toby
 */
 public void keyDown()
 {
     if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 8);
        if (getImage() == image6) {
                setImage(image7);
            }
            else {
                setImage(image6);
            }
        }
     if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 8);
        if (getImage() == image9) {
                setImage(image10);
            }
            else {
                setImage(image9);
            }
        }
     if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 8, getY());
        if (getImage() == image1) {
                setImage(image2);
            }
            else {
                setImage(image1);
            }
     }
        
    if (Greenfoot.isKeyDown("left")) {
        setLocation(getX() - 8, getY());
        if (getImage() == image4) {
                setImage(image5);
            }
            else {
                setImage(image4);
            }
        }
    }
 public void counter(){
    if (counter==100){
    keyDown();
    counter=0;
    }
    else {
    counter= counter+1;
    }
    }
   
}