package gmailsample.vectorx.com.gmailsmaple.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import gmailsample.vectorx.com.gmailsmaple.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PhotosFragment extends Fragment {


    public PhotosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_photos, container, false);
    }

}
