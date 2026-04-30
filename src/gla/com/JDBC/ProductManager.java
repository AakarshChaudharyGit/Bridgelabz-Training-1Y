package gla.com.JDBC;

import java.sql.*;

public class ProductManager {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();

        // CREATE TABLE
        st.execute("CREATE TABLE IF NOT EXISTS product(pid INT, pname VARCHAR(50), qty INT)");

        // INSERT
        st.executeUpdate("INSERT INTO product VALUES (1,'Pen',5),(2,'Book',20),(3,'Bag',8)");

        // READ (low stock)
        ResultSet rs = st.executeQuery("SELECT * FROM product WHERE qty < 10");
        while (rs.next()) {
            System.out.println(rs.getString("pname") + " " + rs.getInt("qty"));
        }

        // UPDATE
        st.executeUpdate("UPDATE product SET qty = qty + 10 WHERE pid = 1");

        // DELETE
        st.executeUpdate("DELETE FROM product WHERE pid = 3");

        con.close();
    }
}
