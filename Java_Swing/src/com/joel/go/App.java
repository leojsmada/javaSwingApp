package com.joel.go;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;

public class App
{
    private JButton button1;
    private JPanel panel1;
    private JTextField textField1;

    public App()
    {
        button1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "Hello World");
            }
        });
    }


    public static class SwingContainerDemo
    {
        private JFrame mainFrame;
        private JLabel headerLabel;
        private JLabel statusLabel;
        private JPanel controlPanel;
        private JLabel msglabel;

        public SwingContainerDemo(){
            prepareGUI();
        }
        private void prepareGUI()
        {
            mainFrame = new JFrame("Java Swing Examples");
            mainFrame.setSize(400,400);
            mainFrame.setLayout(new GridLayout(3, 1));

            mainFrame.addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent windowEvent)
                {
                    System.exit(0);
                }
            });

            headerLabel = new JLabel("", JLabel.CENTER);
            statusLabel = new JLabel("",JLabel.CENTER);
            statusLabel.setSize(350,100);
            msglabel = new JLabel("Welcome to TutorialsPoint SWING Tutorial.", JLabel.CENTER);

            controlPanel = new JPanel();
            controlPanel.setLayout(new FlowLayout());

            mainFrame.add(headerLabel);
            mainFrame.add(controlPanel);
            mainFrame.add(statusLabel);
            mainFrame.setVisible(true);
        }
        private void showJFrameDemo()
        {

            headerLabel.setText("Container in action: JFrame");
            final JFrame frame = new JFrame();
            frame.setSize(300, 300);
            frame.setLayout(new FlowLayout());
            frame.add(msglabel);

            frame.addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent windowEvent)
                {
                    frame.dispose();
                }
            });

            JButton okButton = new JButton("Open a Frame");
            okButton.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    statusLabel.setText("A Frame shown to the user.");
                    frame.setVisible(true);
                }
            });
            controlPanel.add(okButton);
            mainFrame.setVisible(true);
        }
    }

    public static void main(String[] args) {//used psvm

        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panel1);
        frame.setContentPane(new App().textField1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        SwingContainerDemo  swingContainerDemo = new SwingContainerDemo();
        swingContainerDemo.showJFrameDemo();
    }

}





