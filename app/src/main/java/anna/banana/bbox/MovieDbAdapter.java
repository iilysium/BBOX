package anna.banana.bbox;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Anna on 3/26/16.
 */
public class MovieDbAdapter extends ArrayAdapter<MoviePoster> {
    private static final String LOG_TAG = MovieDbAdapter.class.getSimpleName();
    public MovieDbAdapter(Activity context, List<MoviePoster> moviePosters){
        super(context, 0, moviePosters);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        MoviePoster moviePoster = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.movies_list, parent, false);
        }
        ImageView iconView = (ImageView) convertView.findViewById(R.id.movie_image);
        iconView.setImageResource(moviePoster.image);

        TextView versionNameView = (TextView) convertView.findViewById(R.id.movie_text);
        versionNameView.setText(moviePoster.movieName
                + " - " + moviePoster.movieGenre );

        return convertView;
    }

}
