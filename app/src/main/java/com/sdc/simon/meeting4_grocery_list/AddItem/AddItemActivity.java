package com.sdc.simon.meeting4_grocery_list.AddItem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.sdc.simon.meeting4_grocery_list.R;

public class AddItemActivity extends AppCompatActivity implements AddItemInterface.View {
    private EditText newItemEditText;
    private AddItemPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
        newItemEditText = (EditText) findViewById(R.id.item_name);
        presenter = new AddItemPresenter();
    }

    public void addItem(View view){
        String item = newItemEditText.getText().toString();
        presenter.addItem(item);
        this.finish();
    }
}
