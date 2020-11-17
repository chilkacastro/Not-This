import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    protected int score = 10000;      // initial points
    protected int lifeCount = 3;     // initial 3 lives

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld() {
        super(1600, 650, 1); 
    }
    
   
    /**
     * addScore() - To decrease or increase the score of the player.
     */
    public void addScore(int points) {
        score = score + points;
        showScore();
        if (score <= 0) {
         showText("You lost!", 600, 600); 
         Greenfoot.stop();
         
          
        }
    }
    
    /**
     * lifeCount() - To decrease or increase the life count of Toby.
     */
    public void lifeCount(int lives) {
        lifeCount = lifeCount + lives;
        showLife();
        if (lifeCount <= 0) {
            showText("No more lives left!", 600, 600);
        
        }
    }
    
    /**
     * showScore() - To print the score.
     */
     public void showScore() {
        showText("Score: "+ score, 80, 25);
    }
    
    
    /**
     * showLife() - To show how many lives does Toby has.
     */
    public void showLife() {
        showText("Lives:" + lifeCount, 200, 25);
    }
    
    public int getScore(int score) {
        return score;
    }
}
    
    