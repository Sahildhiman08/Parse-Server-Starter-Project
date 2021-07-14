/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Switch;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseAnonymousUtils;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;

import java.util.List;


public class MainActivity extends AppCompatActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

/*
  how to insert in to parse server

  ParseObject score =new ParseObject("Score");
    score.put("username", "Blackhat");
    score.put("score", 56);
    score.saveInBackground(new SaveCallback() {
      @Override
      public void done(ParseException e) {
        if (e == null){
          //OK
          Log.i("Success", "We saved the score");
        }else {
          e.printStackTrace();
        }
      }
    });

    //// how to extract data from parse server

    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");
    query.getInBackground("7DZQqaDWQA", new GetCallback<ParseObject>() {
      @Override
      public void done(ParseObject object, ParseException e) {
        if (e == null && object != null){

          object.put("score", 95);
          object.saveInBackground();

         Log.i("username",object.getString("username") );


          Log.i("score",Integer.toString(object.getInt("score")) );

        }
      }
    });
    */

 /// new parse
    /*
    ParseObject tweet = new ParseObject("Tweet");
    tweet.put("username", "Ram");
    tweet.saveInBackground(new SaveCallback() {
      @Override
      public void done(ParseException e) {
        if(e == null){
          //ok
          Log.i("Success", "We saved the info");
        }else {
          e.printStackTrace();
        }
      }
    });

    ParseQuery<ParseObject> query = ParseQuery.getQuery("Tweet");
    query.getInBackground("p7RzR4bFUV", new GetCallback<ParseObject>() {
      @Override
      public void done(ParseObject object, ParseException e) {
        if (e == null && object != null){
          object.put("tweet", "jai shri ram");
          object.saveInBackground();

          Log.i("username",object.getString("username") );
        }
      }
    });





    //// how to get all the score out from data

    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");

    query.whereEqualTo("username", "Blackhat");
    query.setLimit(1);

    query.findInBackground(new FindCallback<ParseObject>() {
      @Override
      public void done(List<ParseObject> objects, ParseException e) {
        if (e == null){
          if(objects.size() > 0){
            for (ParseObject object : objects){
              Log.i("Username", object.getString("username"));
              Log.i("Score", Integer.toString(object.getInt("score")));
            }
          }
        }
      }
    });

         // how to add 20 points in score particularly

    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");

    query.whereGreaterThan("score", 50);

    query.findInBackground(new FindCallback<ParseObject>() {
      @Override
      public void done(List<ParseObject> objects, ParseException e) {
        if (e == null && objects !=null){

            for (ParseObject score : objects){
              score.put("score", score.getInt("score") + 20);
              score.saveInBackground();
            }
          }
        }

    });


    //// How to make a parse user  signup///////////////

    ParseUser user = new ParseUser();

    user.setUsername("nick");
    user.setPassword("mypass");

    user.signUpInBackground(new SignUpCallback() {
      @Override
      public void done(ParseException e) {
        if (e == null ) {
          //OK
          Log.i("Sign up okay!","Successful");
        }     else {
          e.printStackTrace();
        }
      }
    });


    ////// How to login parse user////////

    ParseUser.logInInBackground("nick", "mypass", new LogInCallback() {
      @Override
      public void done(ParseUser user, ParseException e) {
        if (user != null){
          Log.i("Success", "We logged in");
        }else{
          e.printStackTrace();
        }
      }
    });
         */



    // log out///
           ParseUser.logOut();

    //// how to check if parse user is looged in or not and also how to log out////

    if (ParseUser.getCurrentUser() != null){
      Log.i("Signed in User", ParseUser.getCurrentUser().getUsername());

    } else {
            Log.i("not luck","not signed in") ;
    }





    ParseAnalytics.trackAppOpenedInBackground(getIntent());
  }

}