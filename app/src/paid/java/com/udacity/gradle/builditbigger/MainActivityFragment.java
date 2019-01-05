package com.udacity.gradle.builditbigger;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import com.uproject.shola.myandroidjokelibrary.JokeServerActivity;


/**
 * A simple {@link Fragment} subclass.
 */

public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    ProgressBar progressBar = null;
    public String fetchJoke = null;
    public boolean testIndicator = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);


        // Set onClickListener for the button
        Button button = (Button) root.findViewById(R.id.joke_btn);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                getJoke();
            }
        });

        progressBar = (ProgressBar) root.findViewById(R.id.joke_progressbar);
        progressBar.setVisibility(View.GONE);


        return root;
    }

    public void getJoke(){

        new ServerAsyncTask().execute(this);
    }

    public void launchDisplayJokeActivity(){
        if (!testIndicator) {
            Context context = getActivity();
            Intent intent = new Intent(context, JokeServerActivity.class);
            intent.putExtra(JokeServerActivity.EXTRAS_JOKE, fetchJoke);
            //Toast.makeText(context, fetchJoke, Toast.LENGTH_LONG).show();
            context.startActivity(intent);
            progressBar.setVisibility(View.GONE);
        }
    }

}