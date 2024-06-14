package Jdbc.Test;

import Jdbc.database.JDBCUtil;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection collection = JDBCUtil.getJDBCConnection();
        System.out.println(collection);
    }
}
