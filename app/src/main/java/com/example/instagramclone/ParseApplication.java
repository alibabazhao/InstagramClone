package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        // set applicationId, and server server based on the values in the back4app settings.
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("FGWuFz8y9TyystAvyz9vQQBaRfmdeEXDkN8IMNwU")
                .clientKey("X6CAz8W8I8xvkKN5Bq80muEhCBbVvFc0HktIZOA5")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
