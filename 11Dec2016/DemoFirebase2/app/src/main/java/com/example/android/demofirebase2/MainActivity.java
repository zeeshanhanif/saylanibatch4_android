package com.example.android.demofirebase2;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


    private EditText emailEditText;
    private EditText passwordEditText;

    //Auth
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailEditText = (EditText) findViewById(R.id.emailEditText);
        passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        addInFirebase();
        firebaseAuthSetup();

    }

    private void firebaseAuthSetup(){
        mAuth = FirebaseAuth.getInstance();

        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    // User is signed in
                    Log.d("FAuth", "onAuthStateChanged:signed_in:" + user.getUid());
                } else {
                    // User is signed out
                    Log.d("FAuth", "onAuthStateChanged:signed_out");
                }
                // ...
            }
        };
    }

    private void addInFirebase(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");
    }

    public void signup(View view) {
        mAuth.createUserWithEmailAndPassword(emailEditText.getText().toString(),passwordEditText.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d("FAuth",  "createUserWithEmail:onComplete:" + task.isSuccessful());

                        if(task.isSuccessful()){
                            Log.d("FAuth", "Registration SuccessFull");
                        }
                        else {
                            Log.d("FAuth", "Registration InWithEmail:failed"+task.getException());
                            Log.d("FAuth", "Registration Failed");
                        }

                    }
                });
    }

    public void signin(View view) {
        mAuth.signInWithEmailAndPassword(emailEditText.getText().toString(),passwordEditText.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d("FAuth", "signInWithEmail:onComplete:" + task.isSuccessful());
                        if (!task.isSuccessful()) {
                            Log.d("FAuth", "signInWithEmail:failed"+task.getException());
                            Log.d("FAuth", "Login Failed");
                        }
                        else {
                            Log.d("FAuth", "Login successful");
                        }

                    }
                });
    }


    @Override
    public void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mAuthListener != null) {
            mAuth.removeAuthStateListener(mAuthListener);
        }
    }
}
