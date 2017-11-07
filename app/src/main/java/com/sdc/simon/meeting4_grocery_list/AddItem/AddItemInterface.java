package com.sdc.simon.meeting4_grocery_list.AddItem;

/**
 * Created by Simon on 10/30/2017.
 */

public interface AddItemInterface {

    interface View{}

    interface Presenter{
        //add an item to the mock database
        void addItem(String item);
    }
}
