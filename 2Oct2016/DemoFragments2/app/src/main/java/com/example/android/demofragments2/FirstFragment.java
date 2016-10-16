package com.example.android.demofragments2;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {


    private FirstFragmentCallBack myActivity;

    public FirstFragment() {
        // Required empty public constructor
    }

    public interface FirstFragmentCallBack {
        void doSomeWork(String message);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_first, container, false);
        Context c = getContext();
        Activity a = getActivity();
        System.out.println(">>>>>> "+c.getClass());
        System.out.println(">>>>>> "+a.getClass());
        Button btn = (Button) rootView.findViewById(R.id.btn1);
        final EditText editText = (EditText) rootView.findViewById(R.id.fragment1Text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),editText.getText().toString(),Toast.LENGTH_SHORT).show();
                myActivity.doSomeWork(editText.getText().toString());
            }
        });

        return rootView;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        myActivity = (FirstFragmentCallBack) context;
    }
}
