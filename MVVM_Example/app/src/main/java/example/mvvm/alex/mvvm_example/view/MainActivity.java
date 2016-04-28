package example.mvvm.alex.mvvm_example.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import example.mvvm.alex.mvvm_example.R;
import example.mvvm.alex.mvvm_example.databinding.ActivityMainBinding;
import example.mvvm.alex.mvvm_example.model.Group;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupRecyclerView(binding.groupsRecyclerView);
    }

    private void setupRecyclerView(RecyclerView recyclerView) {
        Group group = new Group("Test group1");


        GroupAdapter adapter = new GroupAdapter();
        adapter.setItems(getStubItems());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    public List<Group> getStubItems() {
        List<Group> items = new ArrayList<>();
        for (int i=0; i <= 30; i++){
            items.add(new Group("Group "+i));
        }
        return items;
    }
}
