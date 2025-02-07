package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ContactsWindow {

    private ArrayList<ContactsList> contactsList=new ArrayList<>();
    private DefaultListModel<String> contactLisstModel;
    private JFrame contacts;private JPanel northPanel,southPanel,westPanel,centerPanel,formPanel,newPanel,listPanel;
    private  JTextField field,field2,field3;
    private String text,text2,text3;
    private JLabel label2,label1,label3,labelOutput1,labelOutput2,labelOutput3;
    JList contactListview;
    private JButton saveButton,cancelButton,EditButton,AddButton,backToListButton,deleteButton,viewButton;
    private CardLayout cardLayout = new CardLayout();
    actionListner al=new actionListner();

//constructure which calls the method ContactsWindow method
public ContactsWindow() {
    this.ContactsWindow();
}

    //creating JFrame
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

    /*
    *panels that help size up the to be used center Space for the cardLayout
     */

    public JPanel north(){
        northPanel= new JPanel();
        northPanel.setPreferredSize(new Dimension(100,250));
        return northPanel;
    }
    public JPanel south(){
        southPanel= new JPanel();
        southPanel.setPreferredSize(new Dimension(100,200));
        return southPanel;
    }

    public JPanel west(){
        westPanel= new JPanel();
        westPanel.setPreferredSize(new Dimension(250,100));

        return westPanel;
    }
    public JPanel nullPanel(){
        JPanel right=new JPanel();
        right.setPreferredSize(new Dimension(200,100));
        return right;
    }
/*
* Parent pannel which is to contain the cardLayouts
* that make up the UI
* */
public JPanel center(){
    centerPanel= new JPanel();
    centerPanel.setLayout(cardLayout);
    centerPanel.add(this.contactList(),"contactList");
    centerPanel.add(this.creationForm(),"creationForm");
    centerPanel.add(this.contactDetails(),"contactDetails");
    centerPanel.setBackground(Color.blue);
    centerPanel.setPreferredSize(new Dimension(100,100));
    centerPanel.setForeground(Color.white);
    return centerPanel;
}

}
