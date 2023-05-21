import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle{
   int xVelocity;
   int yVelocity;
   int initialSpeed=8;
   Random random;
  
    Ball(int x,int y,int width,int height)
    {
        super(x,y,width,height);
        random=new Random();
        //this will generate random integer in the range of 0 to 1;
        int RandomXDirection=random.nextInt(2);
        if(RandomXDirection==0)
        {
            RandomXDirection--;
        }else {

        }
        setXDirection(RandomXDirection);


        int RandomYDirection=random.nextInt(2);
        if(RandomYDirection==0)
        {
            RandomYDirection--;
        }
        setYDirection(RandomYDirection);


    }

    public void setYDirection(int randomYDirection) {
        yVelocity=randomYDirection;
    }

    public void setXDirection(int randomXDirection) {
        xVelocity=randomXDirection;
    }
    //deciding about movement of ball
    public void move()
    {
        
      x+=xVelocity;
      y+=yVelocity;
    }
    public void draw(Graphics g)
    {
      g.setColor(Color.red);
      g.fillOval(x,y,width,height);

      g.setColor(Color.white);
      g.drawLine(1000/2,0,1000/2,555);
    }
    
}
