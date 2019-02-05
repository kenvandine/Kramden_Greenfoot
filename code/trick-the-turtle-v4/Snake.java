import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A snake in my game that can eat turtles.
 * 
 * @author mik
 * @version 1.0
 */
public class Snake extends Animal
{
    public void act()
    {
        move(4);
        randomTurn();
        turnAtEdge();
        tryToEatTurtle();
    }
    
    /**
     * With a 10% probability, turn a bit right or left.
     */
    public void randomTurn()
    {
        if ( Greenfoot.getRandomNumber(100) < 10 )
        {
            turn( Greenfoot.getRandomNumber(40)-20 );
        }        
    }
    
    /**
     * If we reach the edge of the world, turn a little bit.
     */
    public void turnAtEdge()
    {
        if (atWorldEdge())
        {
            turn(7);
        }
    }
    
    /**
     * Check whether we can see Lettuce. If we can, eat it.
     */
    public void tryToEatTurtle()
    {
        if (canSee(Turtle.class) )
        {
            eat(Turtle.class);
        }
    }
}
