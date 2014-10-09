package andriod.landaverdej.blogreader;


import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONObject;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class BlogPostTask  extends AsyncTask<Activity,Void,JSONObject> {
    @Override
    protected JSONObject doInBackground(Activity... activities) {
        try {
            URL blodFeedUrl = new URL("http://blog.teamtreehouse.com/api/get_recent_summary/?count=10");
            HttpURLConnection connection = blogFeedUrl.openConection();

        }
        catch(MalformedURLException error){
            Log.e("BlogPostTask", "Malformed URL:" + error);
        }
        return null;
    }
}
