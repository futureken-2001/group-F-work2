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

}
