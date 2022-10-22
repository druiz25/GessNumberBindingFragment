package com.example.gessnumberbindingfragment.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gessnumberbindingfragment.R;
import com.example.gessnumberbindingfragment.data.PartidaGuessNumer;
import com.example.gessnumberbindingfragment.databinding.FragmentEndPlayBinding;

public class FragmentEndPlay extends Fragment {
private FragmentEndPlayBinding binding;

    public FragmentEndPlay() {
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
        binding = FragmentEndPlayBinding.inflate(inflater);
        return binding.getRoot();
    }

    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (binding != null) {
            outState.putParcelable("partida", binding.getPartida());
            outState.putString("final", binding.tvTextoFinal.getText().toString());
        }
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.setPartida(getArguments().getParcelable("partida"));
        finalPartida();
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null) {
            binding.setPartida(savedInstanceState.getParcelable("partida"));
            binding.tvTextoFinal.setText(savedInstanceState.getString("final"));
        }
    }

    public void finalPartida()
    {
        if (binding.getPartida().isVictoria())
            binding.tvTextoFinal.setText("!Felicidades¡ Acertaste despues de fallar "+binding.getPartida().getVecFalladas()+" veces.");
        else
            binding.tvTextoFinal.setText("!Fallaste¡ el número secreto era "+binding.getPartida().getNumSecreto());
    }
}