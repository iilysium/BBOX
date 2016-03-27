package anna.banana.bbox;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.Arrays;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private MovieDbAdapter movieAdapter;

    MoviePoster[] moviePosters = {
            new MoviePoster("String", "String", R.drawable.ic_launcher),


    };

        public MainActivityFragment(){
        }

        @Override
        public View onCreateView(LayoutInflater inflater,ViewGroup container,
        Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            movieAdapter = new MovieDbAdapter(getActivity(), Arrays.asList(moviePosters));

            GridView gridView = (GridView) rootView.findViewById(R.id.movies_grid);
            gridView.setAdapter(movieAdapter);

        return rootView;
        }
}
