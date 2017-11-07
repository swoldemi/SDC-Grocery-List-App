package com.sdc.simon.meeting4_grocery_list.GroceryList;

import java.util.ArrayList;

/**
 * Created by Simon on 10/23/2017.
 */

public interface GroceryListInterface {

    interface View{
        void showGroceryList(ArrayList<String> groceryList);
    }

    interface Presenter{
        void updateGroceryList();
        void startAddItemActivity();
    }
}
