package andriod.landaverdej.blogreader;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;


public class BlogActivity extends Activity {
    protected ProgressBar progressBar;
    protected ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);


        progressBar = (ProgressBar)findViewById(R.id.ProgressBar);
        listView = (ListView)findViewById(R.id.listView);

        listView.setEmptyView(progressBar);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("BlogActivity", "Title: " + BlogPostParser.get().posts.get(position).title);
            }
        });


        new BlogPostTask().execute(this);

    }



}
