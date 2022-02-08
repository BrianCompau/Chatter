package com.example.chatter;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        TextView textentry = view.findViewById(R.id.textentry);
        textentry.setHint("Type Here");

        TextView textdisplay = view.findViewById(R.id.textdisplay);

        ImageButton sendarrow = view.findViewById(R.id.sendarrow);
        sendarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String entry = textentry.getText().toString();
                if (!entry.isEmpty()) {
                    textdisplay.append("\n" + textentry.getText().toString());
                    textentry.setText("");
                }
            }
        });

        return view;

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

}