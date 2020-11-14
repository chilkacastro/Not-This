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
    private GreenfootImage image3 = null;
    private GreenfootImage image4 = null;
    private GreenfootImage image5 = null;
    private GreenfootImage image6 = null;
    private GreenfootImage image7 = null;
    private GreenfootImage image8 = null;
    private GreenfootImage image9 = null;
    private GreenfootImage image10 = null;
    private GreenfootImage image11 = null;


/**
 * 
 */  
public Toby()
{
image1 =  new  GreenfootImage("dogside.png");
image2 =  new  GreenfootImage("dogside2.png");
image3 =  new  GreenfootImage("dogside3.png");
image4 =  new  GreenfootImage("dogsideleft.png");
image5 =  new  GreenfootImage("dogsideleft2.png");
image6 =  new  GreenfootImage("dogback.png");
image7 =  new  GreenfootImage("dogback2.png");
image8 =  new  GreenfootImage("dogback3.png");
image9 =  new  GreenfootImage("dogfront.png");
image10 =  new  GreenfootImage("dogfront2.png");
image11 =  new  GreenfootImage("dogfront3.png");


}
/**
 * Act - do whatever the Toby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
public void act() 
{
 // Add your action code here.
} 
/**
 * this method is controlling the direction of Toby
 */
 public void keyDown()
 {
     if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 5);
             if (getImage() == image6) {
            setImage(image7);
             }
        else if (getImage() == image7) {
            setImage(image8);
        }
        else if (getImage() == image8) {
            setImage(image6);
        }
        }
     if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 5);
             if (getImage() == image9) {
            setImage(image10);
             }
        else if (getImage() == image10) {
            setImage(image11);
        }
        else if (getImage() == image11) {
            setImage(image9);
        }
        }
     if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 4, getY());
             if (getImage() == image1) {
                setImage(image2);
             }
        else if (getImage() == image2) {
            setImage(image3);
        }
        else if (getImage() == image3) {
            setImage(image1);
        }
    }
        
    if (Greenfoot.isKeyDown("left")) {
        setLocation(getX() - 4, getY());
        if (getImage() == image4) {
                setImage(image5);
            }
            else {
                setImage(image4);
            }
        }
    }

   
}