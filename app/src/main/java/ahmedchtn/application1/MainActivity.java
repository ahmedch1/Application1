package ahmedchtn.application1;

import android.app.Application;

import com.parse.Parse;


public class MainActivity extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this);
    }
}
