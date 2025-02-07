package org.example;

import javax.swing.*;
import java.awt.*;




public class Contacts {
    JFrame contacts;
    JPanel northPanel,southPanel,westPanel,centerPanel,formPanel,newPanel,listPanel;
    CardLayout cardLayout = new CardLayout();



    public Contacts() {
        this.ContactsWindow();
    }

    public JFrame ContactsWindow(){
        contacts=new JFrame("Contacts");
        contacts.setMinimumSize(new Dimension(800,600));
        contacts.setExtendedState(JFrame.MAXIMIZED_BOTH);
        contacts.setVisible(true);
        contacts.setLayout(new BorderLayout());
        contacts.add(this.north(),BorderLayout.NORTH);
        contacts.add(this.west(),BorderLayout.WEST);
        contacts.add(this.south(),BorderLayout.SOUTH);
        contacts.add(this.center(),BorderLayout.CENTER);
        contacts.add(this.nullPanel(),BorderLayout.EAST);
        return contacts;
    }

    public JPanel north(){
        northPanel= new JPanel();
        northPanel.setBackground(Color.lightGray);
        northPanel.setPreferredSize(new Dimension(100,250));
        return northPanel;
    }
    public JPanel south(){
        southPanel= new JPanel();
        southPanel.setBackground(Color.lightGray);
        southPanel.setPreferredSize(new Dimension(100,200));
        return southPanel;
    }

    public JPanel west(){
        westPanel= new JPanel();
        westPanel.setBackground(Color.lightGray);
        westPanel.setPreferredSize(new Dimension(250,100));

        return westPanel;
    }
    public JPanel center(){
        centerPanel= new JPanel();
        centerPanel.setLayout(cardLayout);
        centerPanel.setBackground(Color.blue);
        centerPanel.setPreferredSize(new Dimension(100,100));
        centerPanel.setForeground(Color.white);
        return centerPanel;
    }
    public JPanel nullPanel(){
        JPanel right=new JPanel();
        right.setPreferredSize(new Dimension(200,100));
        right.setBackground(Color.lightGray);
        return right;
    }


}
