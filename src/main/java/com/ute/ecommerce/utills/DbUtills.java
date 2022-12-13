package com.ute.ecommerce.utills;

import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class DbUtills {
    static Sql2o sql2o = new Sql2o("jdbc:mysql://localhost:3306/data", "root", "");
    public static Connection getConnection () {
        return sql2o.open();
    }
}
