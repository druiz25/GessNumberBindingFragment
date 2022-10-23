package com.example.gessnumberbindingfragment.ui;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.gessnumberbindingfragment.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.example.gessnumberbindingfragment.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
    }
}