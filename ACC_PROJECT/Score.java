import java.awt.*;
import javax.swing.*;

public class Score extends Rectangle {
    int width;
    int height;
    int player1;
    int player2;
    boolean gameOver;
   
    Score(int width,int height)
    {
        this.height=height;
        this.width=width;
        this.gameOver = false; // Initialize the flag as false
        //this.ball = ball;

    }
    public void draw(Graphics g)
    {
        g.setColor(Color.white);
        g.setFont(new Font("Consolas",Font.PLAIN,60));
        //this will check if any of the player has scored1 10
        //Onw who scores 10 Points First will be the Winner
        if ((player1 >= 10 || player2 >= 10) )
        {
            g.setFont(new Font("Consolas", Font.PLAIN, 40));
            g.drawString("Game Over", width/2 - 100, height/2);
            if(player1==10)
            {
                g.drawString("WINNER:P1", width/2 - 150, (height/2)+(height/4));
            }
            else{
                g.drawString("WINNER:P2", width/2 - 120, (height/2)+(height/4));
            }
            gameOver = true; // Set the game over flag

            // Schedule a Timer to exit the game after 2 seconds
            Timer timer = new Timer(4000, (e) -> System.exit(0));
            timer.setRepeats(false); // Only trigger the timer once
            timer.start();

        }
        g.drawString(String.valueOf(player1),width/2-60,100);
        g.drawString(String.valueOf(player2),width/2+20,100);

       
        
           

        

          
}
 }
        
    


