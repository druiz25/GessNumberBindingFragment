package com.example.gessnumberbindingfragment.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.example.gessnumberbindingfragment.R;
import com.example.gessnumberbindingfragment.databinding.FragmentPlayBinding;

public class FragmentPlay extends Fragment {
    private FragmentPlayBinding binding;
    private String estadoResultado;

    public FragmentPlay() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPlayBinding.inflate(inflater);
        binding.btnResponder.setOnClickListener(view -> comprobarRespuesta());
        return binding.getRoot();
    }

    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (binding != null) {
            outState.putParcelable("partida", binding.getPartida());
            outState.putString("respuesta", binding.etRespuesta.getText().toString());
            outState.putString("estadoResultado",estadoResultado);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        assert getArguments() != null;
        if (getArguments().getParcelable("partida")!=null)
            binding.setPartida(getArguments().getParcelable("partida"));
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null) {
            binding.setPartida(savedInstanceState.getParcelable("partida"));
            binding.etRespuesta.setText(savedInstanceState.getString("respuesta"));
            binding.tvResultado.setText(savedInstanceState.getString("estadoResultado"));
        }
    }

    public void comprobarRespuesta() {
        if (binding.etRespuesta.getText().toString().trim().equals(""))
            return;
        int tmp = Integer.parseInt(binding.etRespuesta.getText().toString());

        if (binding.etRespuesta.getText().toString().equals(binding.getPartida().getNumSecreto().toString())) {
            binding.getPartida().setVictoria(true);
            Bundle bundle = new Bundle();
            bundle.putParcelable("partida", binding.getPartida());
            NavHostFragment.findNavController(this).navigate(R.id.action_fragmentPlay_to_fragmentEndPlay, bundle);
        } else {
            if (tmp < binding.getPartida().getNumSecreto()) {
                estadoResultado = "El numero introducido es menor que el numero secreto";
                binding.tvResultado.setText(R.string.txtResultMenor);
            }else {
                estadoResultado = "El numero introducido es mayor que el numero secreto";
                binding.tvResultado.setText(R.string.txtResultMayor);
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