package com.example.gessnumberbindingfragment.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.gessnumberbindingfragment.R;
import com.example.gessnumberbindingfragment.data.PartidaGuessNumer;
import com.example.gessnumberbindingfragment.databinding.FragmentConfigBinding;
import com.example.gessnumberbindingfragment.databinding.FragmentPlayBinding;

import java.util.Random;


public class FragmentPlay extends Fragment {
    private FragmentPlayBinding binding;
    private final Random rnd = new Random();
    private String numInten;
    private String usuario;


    public FragmentPlay() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPlayBinding.inflate(inflater);
        binding.btnResponder.setOnClickListener(view -> {
            comprobarRespuesta();
        });
        return binding.getRoot();
    }

    /*@Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //binding.setPartida(getArguments().getParcelable("partida"));
        if (savedInstanceState != null) {
            binding.setPartida(savedInstanceState.getParcelable("partida"));
        }else
            binding.setPartida(new PartidaGuessNumer());
    }*/

    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (binding != null) {
            outState.putParcelable("partida", binding.getPartida());
            outState.putString("respuesta", binding.etRespuesta.getText().toString());
        }
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //if (savedInstanceState!=null)
            binding.setPartida(getArguments().getParcelable("partida"));
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null) {
            binding.setPartida(savedInstanceState.getParcelable("partida"));
            binding.etRespuesta.setText(savedInstanceState.getString("respuesta"));
        }
    }

    public void comprobarRespuesta() {
        Integer tmp = Integer.parseInt(binding.etRespuesta.getText().toString());

        if (binding.etRespuesta.getText().toString().equals(binding.getPartida().getNumSecreto().toString())) {
            binding.getPartida().setVictoria(true);
            Bundle bundle = new Bundle();
            bundle.putParcelable("partida", binding.getPartida());
            NavHostFragment.findNavController(this).navigate(R.id.action_fragmentPlay_to_fragmentEndPlay, bundle);
        } else {
            if (tmp < binding.getPartida().getNumSecreto()) {
                binding.tvResultado.setText("El numero introducido es menor que el numero secreto");
            }else {
                binding.tvResultado.setText("El numero introducido es mayor que el numero secreto");
            }
            binding.getPartida().restarIntento();
            binding.getPartida().sumarFallo();
        }
        if (binding.getPartida().getNumTries() == 0) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("partida", binding.getPartida());
            NavHostFragment.findNavController(this).navigate(R.id.action_fragmentPlay_to_fragmentEndPlay, bundle);
        }
        binding.etRespuesta.setText("");
    }

    @Override
    public void onDestroyView() {
        binding = null;
        super.onDestroyView();
    }
}