import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BouncingBall extends JPanel implements Runnable {
    private int ballX = 100, ballY = 100, ballDiameter = 30;
    private int ballXSpeed = 5, ballYSpeed = 5;
    private boolean isMoving = false;

    public BouncingBall() {
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter() {
                        public void mousePressed(MouseEvent e) {
                if (!isMoving) {
                    isMoving = true;
                    new Thread(BouncingBall.this).start();
                }
            }
        };
    }


    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(ballX, ballY, ballDiameter, ballDiameter);
    }

    
    public void run() {
        while (isMoving) {
            ballX += ballXSpeed;
            ballY += ballYSpeed;

            // Check for collision with the edges
            if (ballX < 0 || ballX + ballDiameter > getWidth()) {
                ballXSpeed = -ballXSpeed; // Reverse horizontal direction
            }
            if (ballY < 0 || ballY + ballDiameter > getHeight()) {
                ballYSpeed = -ballYSpeed; // Reverse vertical direction
            }

                            Thread.sleep(20);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball");
        BouncingBall bouncingBall = new BouncingBall();
        frame.add(bouncingBall);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}