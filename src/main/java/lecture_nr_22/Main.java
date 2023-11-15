package lecture_nr_22;

import java.sql.*;
import java.util.*;

public class Main {

    private static final String connectionString = "jdbc:postgresql://localhost/employee_db";
    private static final String selectAllFromEmployeeInfoTable = "SELECT * FROM DEPARTMENTS";
    private static final String insertANewEmployeeIntoTheTable = "INSERT INTO EMPLOYEE_INFO(NAME, SURNAME, AGE, WEIGHT) VALUES ('TEST', 'TESTSURNAME', 30, 90)";

    public static void main(String[] args) {

        try(Connection connection = DriverManager.getConnection(connectionString)){

            System.out.println("The connection has been established!");
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(selectAllFromEmployeeInfoTable);

            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            List<String> columnList = new ArrayList<>();
            for(int index = 1; index != resultSetMetaData.getColumnCount() + 1; index++){
                columnList.add(resultSetMetaData.getColumnLabel(index));
            }

            while(resultSet.next()){
                for (String element :
                        columnList) {
                    System.out.println("Column name: " + element + " " + resultSet.getString(element));
                }
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

        try(Connection connection = DriverManager.getConnection(connectionString)){
            Statement statement = connection.createStatement();

            statement.executeUpdate(insertANewEmployeeIntoTheTable);
            System.out.println("A new employee has been inserted!");
        } catch (SQLException e){
            e.printStackTrace();
        }

        try(Connection connection = DriverManager.getConnection(connectionString)){

            PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.INSERT_INTO_ALL_COLUMNS_QUERY.query);

            preparedStatement.setString(1, "TestPreparedStatement");
            preparedStatement.setString(2, "TestPreparedStatementSurname");
            preparedStatement.setInt(3, 100);
            preparedStatement.setInt(4, 780);

            preparedStatement.execute();
            System.out.println("The prepared statement has been executed successfully!");
        } catch (SQLException e){
            e.printStackTrace();
        }

        getAllFromDBAndReturnMap();
    }

    public static Map<String, List<String>> getAllFromDBAndReturnMap(){

        Map<String, List<String>> returnMap = new HashMap<>();
        try(Connection conn = DriverManager.getConnection(connectionString)){

            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(SQLQueries.SELECT_ALL_COLUMN.query);
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            for(int index = 1; index != resultSetMetaData.getColumnCount() + 1; index++){
                returnMap.put(resultSetMetaData.getColumnLabel(index), new ArrayList<>());
            }

            while(resultSet.next()){
                Set<String> keySet = returnMap.keySet();

                keySet.forEach(e -> {
                    try {
                        returnMap.get(e).add(resultSet.getString(e));
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                });
            }



        } catch (SQLException e){
            e.printStackTrace();
        }

        return returnMap;
    }
}
