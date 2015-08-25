package chatapp.magadistudio.com.newapp;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Dell on 8/25/2015.
 */
public class ChattApplication extends Application {

    public static final String APP_KEY_ID ="N4glr6IQJ2GiM77iLFgUogyrJSyi6roQPrOAlHBZ";
    public static final String APP_CLIENT_ID ="I0imXSxPqTPTZCNckGAR7b48YeOoJpknkEAWUsEk";
    @Override
    public void onCreate()
{
    super.onCreate();
    Parse.enableLocalDatastore(this);
    Parse.initialize(this, APP_KEY_ID, APP_CLIENT_ID);
}
}
