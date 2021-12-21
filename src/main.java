import java.sql.*;

public class main {
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:D:\\Git\\javansp\\abc.db");
            Statement st = con.createStatement();
            st.execute("CREATE TABLE IF NOT EXISTS student"+
                    "(name TEXT,phone INTEGER,email TEXT)");
            st.execute("SELECT * FROM student");
            ResultSet result = st.getResultSet();
            while(result.next()){
                String name = result.getString("name");
                int branch = result.getInt("phone");
                String email = result.getString("email");
                System.out.println(name + " | "+ branch + " | "+email);
            }
            result.close();
            st.close();
            con.close();;


        }catch(SQLException | ClassNotFoundException e){
            System.out.println("Something went wrong");
        }
    }
}
