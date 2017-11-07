package com.sdc.simon.meeting4_grocery_list.GroceryList;

import android.content.Context;
import android.content.Intent;

import com.sdc.simon.meeting4_grocery_list.AddItem.AddItemActivity;
import com.sdc.simon.meeting4_grocery_list.MockDatabase;

import java.util.ArrayList;

/**
 * Created by Simon on 10/23/2017.
 */

public class GroceryListPresenter implements GroceryListInterface.Presenter{
    private MockDatabase db;
    private Context appContext;
    private GroceryListInterface.View view;

    public GroceryListPresenter(GroceryListInterface.View groceryView, Context context){
        db = MockDatabase.getInstance();
        appContext = context;
        view = groceryView;
    }
    @Override
    public void updateGroceryList() {
        ArrayList<String> groceries = db.getAll();
        view.showGroceryList(groceries);
    }

    @Override
    public void startAddItemActivity() {
        Intent addItemIntent = new Intent(appContext, AddItemActivity.class);
        appContext.startActivity(addItemIntent);
    }
}
