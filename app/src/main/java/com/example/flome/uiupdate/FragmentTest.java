package com.example.flome.uiupdate;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.flome.testdp.R;

/**
 * Created by flome on 3/8/2016.
 */
public class FragmentTest extends Fragment {


    private Button button;
    private TextView textView;

    UpdateHandler handler = new UpdateHandler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 1) {
                textView.setText("Success");
            }
        }
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmet_text, null);


        initView(view);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), UpdateActivity.class);


                startActivity(intent);
            }
        });
        return view;

    }

    private void initView(View view) {
        button = ((Button) view.findViewById(R.id.fragment_button));

        textView = ((TextView) view.findViewById(R.id.fragment_text));

    }
}
