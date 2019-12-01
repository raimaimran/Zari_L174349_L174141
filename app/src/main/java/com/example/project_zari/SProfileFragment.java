package com.example.project_zari;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.io.IOException;

public class SProfileFragment extends Fragment {

    private StorageReference mStorageRef;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_seller_profile,container,false);

//        mStorageRef = FirebaseStorage.getInstance().getReference();
//
//        File localFile = null;
//        try {
//            localFile = File.createTempFile("logo", "jpg");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        mStorageRef.getFile(localFile)
//                .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
//                    @Override
//                    public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
//                        // Successfully downloaded data to local file
//                        // ...
//                    }
//                }).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception exception) {
//                // Handle failed download
//                // ...
//            }
//        });


//        Button savebtn = view.findViewById(R.id.buttonBtn);
//        savebtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                {
//                    EditText name = view.findViewById(R.id.nameeditText);
//                    if (name.getText().toString().isEmpty()){
//                        Toast.makeText(getContext(), "You must enter your brand name", Toast.LENGTH_SHORT).show();
//                        return;
//                    }
//                    EditText desc = view.findViewById(R.id.desceditText);
//                    if (desc.getText().toString().isEmpty()){
//                        Toast.makeText(getContext(), "You must enter your description", Toast.LENGTH_SHORT).show();
//                        return;
//                    }
//                    EditText phone = view.findViewById(R.id.phoneeditText);
//                    if (phone.getText().toString().isEmpty()){
//                        Toast.makeText(getContext(), "You must enter your phone number", Toast.LENGTH_SHORT).show();
//                        return;
//                    }
//                    EditText add = view.findViewById(R.id.addedittext);
//                    if (add.getText().toString().isEmpty()){
//                        Toast.makeText(getContext(), "You must enter your address", Toast.LENGTH_SHORT).show();
//                        return;
//                    }
//                    Toast.makeText(getContext(), "Your changes have been saved!", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
        return view;
    }
}
