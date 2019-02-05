import greenfoot.*; 

public class Turtle extends Animal
{
    private int lettuceEaten = 0;
    public void act()
    {
        move(4);
        checkKeys();
        tryToEatLettuce();
    }
    
    /**
     * Check whether the control keys are being pressed, and turn
     * if they are.
     */
    public void checkKeys()
    {
        if ( Greenfoot.isKeyDown("left") )
        {
            turn(-5);
        }
        if ( Greenfoot.isKeyDown("right") )
        {
            turn(5);
        }
    }
    
    /**
     * Check whether we can see Lettuce. If we can, eat it.
     */
    public void tryToEatLettuce()
    {
        if (canSee(Lettuce.class) )
        {
            eat(Lettuce.class);
            lettuceEaten++;
            Greenfoot.playSound("slurp.wav");
            if (lettuceEaten == 10)
            {
                gameOver();
            }
        }
    }
    
    public void gameOver()
    {
            Greenfoot.playSound("fanfare.wav");
            Greenfoot.stop();
    }
}
