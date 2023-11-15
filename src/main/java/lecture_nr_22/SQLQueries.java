package lecture_nr_22;

public enum SQLQueries {

    INSERT_INTO_ALL_COLUMNS_QUERY("insert into employee_info(name, surname, age, weight) values (?, ?, ?, ?)"),
    INSERT_INTO_NAME_QUERY("insert into employee_info(name) values (?)"),
    SELECT_ALL_COLUMN("select * from employee_info");

    final String query;

    SQLQueries(String query) {
        this.query = query;
    }
}
