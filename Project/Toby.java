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
    

/**
 * 
 */  
public Toby()
{
image1 =  new  GreenfootImage(".png");
image2 =  new  GreenfootImage(".png");
image3 =  new  GreenfootImage(".png");
image4 =  new  GreenfootImage(".png");
}
/**
     * this method is controlling the direction of Toby
     */
    public void keyDown()
    {
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 5);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 5);
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 4, getY());
            if (getImage() == image1) {
                setImage(image2);
            }
        }
        else {
            setImage(image1);
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 4, getY());
            if (getImage() == image3) {
                setImage(image4);
            }
            else {
                setImage(image4);
            }
        }
    }
/**
     * Act - do whatever the Toby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
