import org.sql2o.*;

public class DB {
//    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/organisational_api", "billyayiera", "theboyme");
      public static String connectionString = "jdbc:postgresql://ec2-52-44-166-58.compute-1.amazonaws.com:5432/darf6sp6jvjv2t";
      public static Sql2o sql2o = new Sql2o(connectionString, "rqtlzrsvcyhwda", "5bcd875a19df92217d320e214bec1d1b3b32e719a4af60cf81cbfc7289f6f300");

}
