package com.example.sudokuappsolver;

import static com.facebook.appevents.codeless.internal.ViewHierarchy.setOnClickListener;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sudokuappsolver.databinding.ActivityMainBinding;
import com.facebook.login.LoginManager;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import java.io.File;

public class SecondActivity extends AppCompatActivity {

    Button logOutbtn;
    Button solve;
    Button library;
    //Button btnTakePicture;
    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
    ActivityMainBinding mainBinding;
    /*ActivityResultLauncher<Uri> takePictureLauncher;
    Uri imageUri;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        //setContentView(mainBinding.getRoot());
        setContentView(R.layout.activity_second);

        //imageUri = createUri();

       // mainBinding.btnTakePicture.setOnClickListener(view -> {

      //  });






        solve = findViewById(R.id.solve);
        logOutbtn = findViewById(R.id.logout);
        library = findViewById(R.id.library);
        //btnTakePicture = findViewById(R.id.btnTakePicture);
//FACEBOOK
/*
        logOutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginManager.getInstance().logOut();
                startActivity(new Intent(SecondActivity.this, MainActivity.class));
                signOut();
            }
        });
        solve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this,SolveActivity.class));
            }
        });
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this,LibaryActivity.class));
            }
        });*/
// GOOGLE
        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc = GoogleSignIn.getClient(this, gso);
        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        if (acct!=null){
            String personName = acct.getDisplayName();
            Toast.makeText(SecondActivity.this, "Bine ai venit" + " " + personName, Toast.LENGTH_SHORT).show();
        }

        logOutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signOut();
            }
        });

    }

    /*private Uri createUri()
    {
        File imageFile = new File(getApplicationContext().getFilesDir(), "camera_photo.jpg");
        return FileProvider.getUriForFile(getApplicationContext(), "com.example.sudokuappsolver.fileProvider", imageFile);
    }*/
    //FACEBOOK
   /* void signOut(){
        gsc.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                finish();
                startActivity(new Intent(SecondActivity.this, MainActivity.class));
            }
        });
    }*/
    //GOOGLE
    void signOut(){
        gsc.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                finish();
                startActivity(new Intent(SecondActivity.this, MainActivity.class));
            }
        });
    }

   /* private void registerPictureLauncher(){
        takePictureLauncher = registerForActivityResult(
                new ActivityResultContracts.TakePicture(), new ActivityResultCallback<Boolean>() {
                    @Override
                    public void onActivityResult(Boolean result) {
                        try{
                            if (result){
                                mainBinding.ivUser.setImageUri(null);
                            }
                        }

                    }
                }
        );*/
    //}
}