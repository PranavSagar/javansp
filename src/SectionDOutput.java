import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
public class SectionDOutput extends JFrame implements ActionListener {
    static JFrame f;
    static JButton b;
    static JTextArea jt;
    public static void main(String[] args)
    {
        f = new JFrame("Section D");
       b = new JButton("show");
        SectionDOutput te = new SectionDOutput();
        b.addActionListener(te);
        jt = new JTextArea(40, 40);
        JPanel p = new JPanel();
        p.add(jt);
        p.add(b);
        f.add(p);
        f.setSize(800, 450);
//        f.show();
        f.setVisible(true);
    }
   // int count = 0;

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == b){
            try {
                Class.forName("org.sqlite.JDBC");
                Connection connection = DriverManager.getConnection("jdbc:sqlite:D:\\Git\\javansp\\reg.db");
                Statement stmt = connection.createStatement();
                stmt.execute("SELECT * FROM section");
                ResultSet result = stmt.getResultSet();
                while(result.next()){
                    String first_name = result.getString("first_name");
                    String last_name = result.getString("last_name");
                    String password = result.getString("password");
                    String username = result.getString("user_name");

                    System.out.println("Student : " +first_name + " "+ last_name + " has Username : "+username+ " and Password :  "+password);
                 //   count++;
                    jt.setText("Student : " +first_name + " "+ last_name + " has Username : "+username+" and Password :  "+password);
                }
                result.close();
                stmt.close();
                connection.close();
            } catch (Exception exception) {
                System.out.println("something wrong");
            }
        }
        //System.out.println(count);
    }
}

