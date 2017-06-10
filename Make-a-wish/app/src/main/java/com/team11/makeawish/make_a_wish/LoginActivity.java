package com.team11.makeawish.make_a_wish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by kelennaamadi on 10/06/2017.
 */

public class LoginActivity extends AppCompatActivity {
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        Button loginButton = (Button) findViewById(R.id.LoginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
/**intent*/
            }
        });


        Button facebookButton = (Button) findViewById(R.id.FacebookButton);
        facebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        TextView usernamelabel = (TextView) findViewById(R.id.usernameLabel);
        usernamelabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        TextView passwordlabel = (TextView) findViewById(R.id.passwordLabel);
        passwordlabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




    }
}
