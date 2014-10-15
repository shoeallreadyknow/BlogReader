package andriod.landaverdej.blogreader;

import android.util.Log;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BlogPostParser {
private  static  BlogPostParser parser;
    private BlogPostParser(){

    }
 public static BlogPostParser get(){
    if(parser == null){
      parser= new BlogPostParser();
    }
     return parser;
 }
    public JSONObject parse(InputStream inputStream){
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
       StringBuilder builder= new StringBuilder();
        JSONObject jsonObject = null;
     String line;
        try {

            while ((line = reader.readLine()) != null) {
                    builder.append(line);
            }
            Log.i("andriod.landaverdej.blogreader.BlogPostParser", "Input Stream String: " + builder.toString());
        }
        catch (IOException error){
            Log.e("andriod.landaverdej.blogreader.BlogPostParser", "IOException" + error);
        }
        return jsonObject;
    }

}