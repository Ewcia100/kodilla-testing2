package com.kodilla.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException{
        //Given
        DbManager dbManager=DbManager.getInstance();
        String sqlUpdate="UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement=dbManager.getConnection().createStatement();
        statement.execute(sqlUpdate);

        //When
        String sqlProcedureCall="Call UpdateVipLevels()";
        statement.execute(sqlProcedureCall);

        //Then
        String sqlCheckTable="SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs=statement.executeQuery(sqlCheckTable);
        int howMany=-1;
        if(rs.next()){
            howMany=rs.getInt("HOW_MANY");

        }
        assertEquals(0, howMany);

    }

    @Test
    public void testUpdateBestsellers() throws SQLException{
        //Given
        DbManager dbManager=DbManager.getInstance();
        String sqlUpdate="UPDATE BOOKS SET BESTSELLER=0";
        Statement statement=dbManager.getConnection().createStatement();
        statement.execute(sqlUpdate);

        //When
        String sqlProcedureCall="Call UpdateBestsellers()";
        statement.execute(sqlProcedureCall);

        //Then
        String sqlCheckTable="SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER=1";
        ResultSet rs=statement.executeQuery(sqlCheckTable);
        int howMany=-1;
        if(rs.next()){
            howMany=rs.getInt("HOW_MANY");

        }
        assertEquals(3, howMany);

    }

}

