package example.mvvm.alex.mvvm_example.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import example.mvvm.alex.mvvm_example.R;
import example.mvvm.alex.mvvm_example.databinding.ActivityMainBinding;
import example.mvvm.alex.mvvm_example.model.Group;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Group group = new Group("Test group1");
        binding.setGroup(group);
    }
}
