package nayax.com.parx;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    final ArrayList<Info> items = new ArrayList<Info>();

    public MainFragment() {
        // Required empty public constructor
    }
    @Override
    public void onResume() {
        super.onResume();
        ActionBar actionBar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        if (actionBar!=null) {
            actionBar.setTitle(getString(R.string.app_name));
        }
        DrawerLayout drawer = (DrawerLayout) getActivity().findViewById(R.id.drawer_layout);
        drawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        final ArrayList<Info> items = new ArrayList<Info>();
        items.add(new Info("Kobi S","63-925-33","kobi@nayax.com","0546647991"));
        items.add(new Info("Doron M","11-234-55","doron@nayax.com","052881420"));

        final InfoAdapter adapter = new InfoAdapter(getActivity(), items);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
        return rootView;
    }


}
