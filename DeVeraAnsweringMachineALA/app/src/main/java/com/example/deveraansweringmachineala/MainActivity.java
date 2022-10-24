package com.example.deveraansweringmachineala;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.Window;
import android.widget.Button;


import com.example.deveraansweringmachineala.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    ArrayList<InstanceModel> Instances = new ArrayList<>();

    private void createAM (){
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.addInstance.setOnClickListener(view -> instanceCreation(MainActivity.this));
    }

    public void instanceCreation(Activity activity){
        final Dialog createInstanceDialog = new Dialog(activity);
        createInstanceDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        createInstanceDialog.setCancelable(true);
        createInstanceDialog.setContentView(R.layout.create_instance);

        Button pressCreate = (Button) createInstanceDialog.findViewById(R.id.buttonCreate);

//        pressCreate.setOnClickListener(view -> );



        createInstanceDialog.show();
    }


}