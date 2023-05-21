# Pong-Game-JAVA
This is a simple Pong game implemented in Java. 
The game allows two players to compete against each other by moving paddles up and down to hit the ball and score points.One who miss the ball will not score any point and the opponent will get one point for the same.

#How to Run
To run the game, you need to compile all the .java files that do not have the main function first. Then, compile the .java file with the main function to start the game. Here are the steps:
javac GamePanel.java
javac Ball.java
javac Paddle.java
javac Score.java
javac GameFrame.java  //it contains main function where program starts it execution

and then last command-
java GameFrame

#Controls-
Left player (Player 1) controls the paddle using the 'W' and 'S' keys.
Right player (Player 2) controls the paddle using the 'I' and 'K' keys.

#Game End
The game ends as soon as one player scores 10 points. At the end of the game, the name of the winner will be displayed for 3 seconds, and then the game window will be automatically closed.
