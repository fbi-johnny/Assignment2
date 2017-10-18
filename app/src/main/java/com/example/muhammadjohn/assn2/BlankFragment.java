package com.example.muhammadjohn.assn2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        ListView listView = (ListView) view.findViewById(R.id.list1);

        ArrayList<Person> arrayList = new ArrayList<>();

        for (int i = 1; i < 1000; i++) {
            arrayList.add(new Person("name" + i, "0300000000" + i, i + "@gmail.com" , ""+i));
        }

        Log.d("BTAG","second");
        PersonAdapter userAdapter = new PersonAdapter(getActivity(), arrayList);
        listView.setAdapter(userAdapter);

        return view;
    }


}
