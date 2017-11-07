package com.sdc.simon.meeting4_grocery_list.AddItem;

import com.sdc.simon.meeting4_grocery_list.MockDatabase;

/**
 * Created by Simon on 10/30/2017.
 */

public class AddItemPresenter implements AddItemInterface.Presenter {
    private MockDatabase groceryModel;

    public AddItemPresenter(){
        groceryModel = MockDatabase.getInstance();
    }

    @Override
    public void addItem(String item) {
        groceryModel.add(item);
    }


}
