import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
<<<<<<< HEAD
    protected int score = 10000;      // initial points
    protected int lifeCount = 3;     // initial 3 lives

=======
    protected static int score = 1000;
    protected static int lifeCount = 3;
    protected Counter counter =  new  Counter();
>>>>>>> 3d1193f4033b83662cdc657eed90a216aee1ea88
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld() {
        super(1600, 650, 1); 
    }
<<<<<<< HEAD
    
   
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
=======
    /**
     * Returns the life counter
     */
    public Counter getCounter()
    {
        return counter;
    }
    public void loseCondition()
    {
    if (lifeCount<=0 && score<=0){
    showText("YOU LOST: "+ score, 800, 325); 
    }
>>>>>>> 3d1193f4033b83662cdc657eed90a216aee1ea88
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
    
    