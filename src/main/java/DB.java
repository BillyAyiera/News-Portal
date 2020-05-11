import org.sql2o.*;

public class DB {
//    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/organisational_api", "billyayiera", "theboyme");
    public static String connectionString = "jdbc:postgresql://ec2-34-195-169-25.compute-1.amazonaws.com:5432/d5rs9jb23pkh5f";
    public static Sql2o sql2o = new Sql2o(connectionString, "rjurasklwumipz", "db442726015b11251659b7a3b6fddaa89463d2dbd84aafad1421693ef3b334a9");

}
