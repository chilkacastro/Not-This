    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
<<<<<<< HEAD
 public class MyWorld extends World {

    protected int score;                // initial points
    protected int lifeCount;            // initial 3 lives
    protected static int zeroScore;

        /**
         * Constructor for objects of class MyWorld.
         * 
         */
        public MyWorld() {
            super(1600, 650, 1); 
            score = 10000;
            lifeCount = 3;
            zeroScore = 0;
        }
        
        // GETTERS
        /**
         * getScore() - To allow the actor classes to access the score.
         */
      
         public int getScore() {
            return score;
        } 
        /**
         * getLifeCount() - To allow the actor classes to access the lifeCount.
         */
        public int getLifeCount() {
            return lifeCount;
        }
    
        // SCORE
        /**
         * addScore() - To decrease or increase the score of the player.
         */
        public void addScore(int points) {
            score += points;
            showScore();
        }
        /**
         * showScore() - To print the score.
         */
         public void showScore() {
            if (score > 0) {
                showText("Score: "+ score, 80, 25);
            }
            else {
                showText("Score:" + zeroScore, 80, 25);
                if (score > 0) {
                    showText("Score:" + zeroScore, 80, 25);   
                }
            }
        }
        
        // LIFE 
        /**
         * lifeCount() - To decrease or increase the life count of Toby.
         */
        public void lifeCount(int lives) {
            lifeCount += lives;
            showLife();
        }
        /**
         * showLife() - To show how many lives does Toby has and if player lost.
         */
        public void showLife() {
            showText("Lives:" + lifeCount, 200, 25);
            if (lifeCount <= 0){
                showText("YOU LOST!", 800, 325); 
                if (score > 0) {
                    showText("Score:  " + score, 800, 420); 
                }
                if (score <= 0) {
                    showText("Score:  " + zeroScore, 800, 420); 
                }
            }
        }
        
        /**
         * stopGame() - To stop the game when life count reaches to 0.
         */
        public void stopGame() {
            if (lifeCount <= 0) {
                Greenfoot.stop();
                lifeCount = 0;
                score = 10000;
            }
        }
=======
public class MyWorld extends World
{
    protected static int score = 1000;
    protected static int lifeCount = 3;
    protected Counter counter =  new  Counter();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 650, 1); 
    }
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
    Greenfoot.stop();
    }
    }
    
    /**
     * addScore() - To show the score of the player.
     */
    public void addScore(int points) {
        if(points <= 0) {
            score = score + points;
        }
    }
    
    /**
     * showScore() - To print the score.
     */
     public void showScore() {
        showText("Score: "+ score, 80, 25);
    }
>>>>>>> d00ab9526adbc520d6367d7d63905e611f1aa673
}

