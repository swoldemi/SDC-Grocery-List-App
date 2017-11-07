package com.sdc.simon.meeting4_grocery_list;

import java.util.ArrayList;

/**
 * Created by Simon on 10/23/2017.
 */

public class MockDatabase {
    private ArrayList<String> db = new ArrayList<>();
    private static MockDatabase instance;

    private MockDatabase(){}

    public static synchronized MockDatabase getInstance(){
        if(instance == null){
            instance = new MockDatabase();
        }
        return instance; //"singleton"
    }
    public void add(String item){
        db.add(item);
    }

    public ArrayList<String> getAll(){
        return db;
    }
}
