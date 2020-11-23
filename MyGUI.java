import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.awt.*;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class MyGUI implements ActionListener{
    private static JPanel panel;
    private static JFrame frame;
    private static JLabel label1;
    private static JLabel success;
    private static JTextField userText;
    private static JButton button;

    static ServiceOption so;


     public static int Search(String input) throws FileNotFoundException{
        int count = 0;
        boolean found = false;
        try{
            String line;
            
            Scanner dataFile = new Scanner(new File("input1.txt"));
            while(dataFile.hasNext())
            {
                //id = dataFile.next();
                line = dataFile.nextLine();
                if(input.equals(line))
                {
                    JOptionPane.showMessageDialog(null,line);

                    found = true;
                    break;
                }
                if(!dataFile.hasNext())      
                     System.out.println("No Properties with this criteria");
                count++;
            }
       }

       catch(IOException e)
       {
            System.out.print("File failure");
       }
       if(found){
        return count;
       }else{
        return -1;
       }
   }



    public static void main(String args[]){
            //MyGUI newObject = new MyGUI();
            so = new ServiceOption();

             panel = new JPanel();
           	 frame = new JFrame("My First GUI");
           	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          	frame.setSize(600,600);
            frame.add(panel);

            panel.setLayout(null);
            JLabel label1 = new JLabel("Enter Your Search Term");
            label1.setBounds(70,225,190,25);
            panel.add(label1);



            //JLabel label = new JLabel("Search Term");
            //label.setBounds(70,250,80,25);// x   y widrh heifht
            //panel.add(label);

             userText = new JTextField();
            userText.setBounds(70,250,165,25);
            panel.add(userText);

             button = new JButton("Search");
            button.setBounds(80,290,190,50);
            button.addActionListener(new MyGUI());
            panel.add(button);


            success = new JLabel("");
            success.setBounds(80,420,190,25);
            panel.add(success);


            frame.setVisible(true);




          //JButton button1 = new JButton("Button 1");
          	/*JButton button2 = new JButton("Search For Term");
          //frame.getContentPane().add(button1);
          	button2.setPreferredSize(new Dimension(10, 10));
        	frame.getContentPane().add(button2);
          	

	        button2.addActionListener(new ActionListener() {

	            public void actionPerformed(ActionEvent arg0) {
	                JOptionPane.showMessageDialog(frame.getComponent(0), "Hello World");
                  //newObject.getSearchCriteria();
	            }
	        });*/
          
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = userText.getText();
        //System.out.println(input);


        //if (input.equals("KING")){
        try{

          int result = Search(input);
          if(result>=0){
            success.setText("You selected: "+input);

            so.showMyFrame();
          }
        }catch(IOException eee){
          System.out.print("File failure");
        }

    }



    public static class ServiceOption implements ActionListener{

        JFrame frame;
        JLabel success;
        JButton topButton;
        JButton termButton;


        public ServiceOption(){
          JPanel panel = new JPanel();
          frame = new JFrame("Search Engine");

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600,600);
            frame.add(panel);

            panel.setLayout(null);

            success = new JLabel("success first");
            success.setBounds(80,420,190,25);
            panel.add(success);


            termButton.addActionListener(new MyGUI());

            //frame.setVisible(true);
        }

        public void showMyFrame(){
          frame.setVisible(true);
        }


        @Override
        public void actionPerformed(ActionEvent e){

        }
    }



    

}
