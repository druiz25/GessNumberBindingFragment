package com.example.gessnumberbindingfragment.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.gessnumberbindingfragment.R;
import com.example.gessnumberbindingfragment.data.PartidaGuessNumer;
import com.example.gessnumberbindingfragment.databinding.FragmentConfigBinding;

public class FragmentConfig extends Fragment {

    private FragmentConfigBinding binding;

    interface OnSetDataPartida {
        void onSetDataMessage(PartidaGuessNumer partida);
    }

    public FragmentConfig() {
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
        binding = FragmentConfigBinding.inflate(inflater);
        if (savedInstanceState != null) {
            binding.setPartida(savedInstanceState.getParcelable("partida"));
        } else
            binding.setPartida(new PartidaGuessNumer());
        binding.btnJugar.setOnClickListener(view -> { enviarBundle(); });
        return binding.getRoot();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if(binding!=null)
            outState.putParcelable("partida", binding.getPartida());
    }

    public void enviarBundle() {
        if (binding.etUser.getText().toString().trim().equals("") || binding.etNumTries.getText().toString().trim().equals("")) {

            return;
        }
        binding.getPartida().setNumTries(Integer.parseInt(binding.etNumTries.getText().toString()));
        binding.getPartida().setVecFalladas(0);
        binding.getPartida().setVictoria(false);
        binding.getPartida().setNumSecreto(PartidaGuessNumer.genNumSecreto());
        Bundle bundle = new Bundle();
        bundle.putParcelable("partida", binding.getPartida());
        NavHostFragment.findNavController(this).navigate(R.id.action_fragmentConfig_to_fragmentPlay, bundle);
    }
}