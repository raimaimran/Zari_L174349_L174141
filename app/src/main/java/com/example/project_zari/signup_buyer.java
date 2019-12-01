package com.example.project_zari;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.database.repository.customer_repo;

import java.util.Calendar;

import static android.R.style.Theme_Light;
import static android.R.style.Theme_Material_Dialog_MinWidth;
import static android.R.style.Theme_Material_Light_Dialog_MinWidth;

public class signup_buyer extends AppCompatActivity {

    private DatePickerDialog.OnDateSetListener onDateSetListener;
    Button btn;
    String dob;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btnDisplay;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_buyer);

        btn = (Button) findViewById(R.id.buyerdob);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();

                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_WEEK);

                DatePickerDialog dialog = new DatePickerDialog(signup_buyer.this , Theme_Material_Dialog_MinWidth, onDateSetListener, year, month, day );

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));

                dialog.show();
            }
        });

        onDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month +1;
               /* Log.d(TAG, "onDateSet: mm/dd/yyyy " + month + "/" + day + "/" + year);*/

                String date = month + "/" + day + "/" + year;
                dob = date;
                btn.setText(date);
            }
        };

        //checks
        Button btn1 = (Button) findViewById(R.id.buyersu);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText name = findViewById(R.id.bsuname);
                if (name.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "You must enter your name", Toast.LENGTH_SHORT).show();
                    return;
                }
                EditText email = findViewById(R.id.bsuemail);
                if (email.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "You must enter your email", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (email.getText().toString().contains("@") != true)
                {
                    Toast.makeText(getApplicationContext(), "You must enter a valid email", Toast.LENGTH_SHORT).show();
                    return;
                }
                EditText pass = findViewById(R.id.bsupass);
                if (pass.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "You must enter a password", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (pass.getText().toString().length()<8){
                    Toast.makeText(getApplicationContext(), "You password must be greater than 8 characters", Toast.LENGTH_SHORT).show();
                    return;
                }
                EditText cpass = findViewById(R.id.bsuconfirmpass);
                if (cpass.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "You must enter re-enter your password", Toast.LENGTH_SHORT).show();
                    return;
                }
                /*if (cpass.getText().toString() != pass.getText().toString())
                {
                    Toast.makeText(getApplicationContext(), "Passwords do not match", Toast.LENGTH_SHORT).show();
                    return;
                }*/



                //insert into db
                String customeremail = email.getText().toString();
                String customerpass = pass.getText().toString();
                String customername = name.getText().toString();
                final String[] gender = new String[1];

                radioGroup = (RadioGroup) findViewById(R.id.gendergroup);

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioButton = (RadioButton) findViewById(selectedId);

                Toast.makeText(signup_buyer.this,
                        radioButton.getText(), Toast.LENGTH_SHORT).show();
                gender[0] =radioButton.getText().toString();



                //customer_repo.insertTask(customeremail, customerpass, customername, dob, gender[0]);

                Intent intent = new Intent(signup_buyer.this, buyer_homepage.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
