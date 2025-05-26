package Homework5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PreschoolTraining extends JFrame {

    private static JFrame window;
    private static JPanel centerPanel;
    private static JLabel imageLabel;
    private static JTextField answerField;
    private static JLabel resultLabel;


    private static final String[][] QUESTIONS = {
            {"images/cat.jpg", "c"},
            {"images/dog.jpg", "d"},
            {"images/lion.jpg", "l"}

    };

    private static int currentQuestion = 0;

    public static void main(String[] args) {
        window = new JFrame("Preschool Training");
        centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));


        JLabel welcomeLabel = new JLabel("Welcome to the picture game");
        welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton startButton = new JButton("Click here to continue");
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        centerPanel.add(welcomeLabel);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        centerPanel.add(startButton);

        window.add(centerPanel, BorderLayout.CENTER);

        startButton.addActionListener(e -> showRules());

        window.setSize(500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    private static void showRules() {
        centerPanel.removeAll();

        JLabel rulesLabel = new JLabel("Rules: ");
        JLabel ruleOne = new JLabel("Write the first letter of the animals name you see.");
        JLabel ruleTwo = new JLabel("There are 3 animals to guess.");
        JButton startGameButton = new JButton("Click here to start");

        rulesLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        ruleOne.setAlignmentX(Component.CENTER_ALIGNMENT);
        ruleTwo.setAlignmentX(Component.CENTER_ALIGNMENT);
        startGameButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        centerPanel.add(rulesLabel);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        centerPanel.add(ruleOne);
        centerPanel.add(ruleTwo);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        centerPanel.add(startGameButton);

        centerPanel.revalidate();
        centerPanel.repaint();

        startGameButton.addActionListener(e -> showQuestion(0));
    }

    private static void showQuestion(int index) {
        if (index >= QUESTIONS.length) {
            return;
        }

        currentQuestion = index;
        centerPanel.removeAll();

        String imagePath = QUESTIONS[index][0];
        String correctAnswer = QUESTIONS[index][1];

        ImageIcon image = new ImageIcon(QUESTIONS[index][0]);
        imageLabel = new JLabel(image);


        answerField = new JTextField(15);
        answerField.setMaximumSize(new Dimension(100, 25));
        answerField.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton checkButton = new JButton("Check answer");
        checkButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        resultLabel = new JLabel();
        resultLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        centerPanel.add(imageLabel);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        centerPanel.add(answerField);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        centerPanel.add(checkButton);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        centerPanel.add(resultLabel);

        centerPanel.revalidate();
        centerPanel.repaint();

        checkButton.addActionListener(e -> {
            String input = answerField.getText().trim().toLowerCase();
            if (input.equals(correctAnswer)) {
                resultLabel.setText("Correct Letter!");
            } else {
                resultLabel.setText("Wrong Letter!");
            }
            showContinueButton();
        });
    }

    private static void showContinueButton() {
        JButton continueButton = new JButton("Continue");
        continueButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        centerPanel.add(continueButton);
        centerPanel.revalidate();
        centerPanel.repaint();

        continueButton.addActionListener(e -> showQuestion(currentQuestion + 1));
    }





}
