import java.sql.*;

public class pra {
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:D:\\Git\\javansp\\xyz.db");
            Statement st = con.createStatement();
            st.execute("SELECT * FROM train");
            ResultSet result = st.getResultSet();
            while(result.next()){
                String name = result.getString("name");
                int price = result.getInt("price");
                String arrival = result.getString("arrival");
                System.out.println(name + " | "+ price + " | "+arrival);
            }
            result.close();
            st.close();
            con.close();;


        }catch(SQLException | ClassNotFoundException e){
            System.out.println("Something went wrong");
        }
    }
}