package org.example.test.java;

import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.core.Robot;

import org.example.Contacts;
import org.testng.annotations.Test;



public class ContactsIntegrationTest {
    public FrameFixture window;
    Robot robot;




    protected void onSetUp() {
        // Ensure the Swing robot is initialized
        Contacts frame = GuiActionRunner.execute(() -> new Contacts());


        window = new FrameFixture(robot, String.valueOf(frame));
        window.show(); // Shows the frame for testing
    }

    @Test
    public void testAddContact() {
        window.button("Add New Contact").click();
        window.textBox("field1").enterText("John Doe");
        window.textBox("field2").enterText("1234567890");
        window.textBox("field3").enterText("john.doe@example.com");
        window.button("Save Contact").click();

        // Verify that the contact was added
        window.list("contactListView");
    }


    protected void onTearDown() {
        window.cleanUp();
    }
}