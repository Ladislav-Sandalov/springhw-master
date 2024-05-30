package springhw.Interaction;


import springhw.Connection.Database;
import springhw.Connection.Relation;

public class UserInteraction {
    private Database database = new Database();
    private Relation relation = new Relation();
    public void select (String tableName, String columnName ){
        relation.Conn();
        String querySelect = "SELECT " + columnName + " FROM " + tableName + ";";


    }
}
