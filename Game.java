import javax.swing.*;

class Game{
    public static void main(String[] args) {
        int width = 360;
        int height = 640;

        JFrame frame = new JFrame("Flappy Bird");
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}