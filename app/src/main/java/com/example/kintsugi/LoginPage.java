package com.example.kintsugi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity
{

    EditText RegisterNo_text, Password_text;
    Button button_Login;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain1);

        RegisterNo_text = (EditText) findViewById(R.id.Register_input);
        Password_text = (EditText) findViewById(R.id.Password_input);

        button_Login = (Button) findViewById(R.id.button);
        radioGroup = (RadioGroup) findViewById(R.id.groupradio);

        // Uncheck or reset the radio buttons initially
        radioGroup.clearCheck();

        // Add the Listener to the RadioGroup
        radioGroup.setOnCheckedChangeListener(
                new RadioGroup
                        .OnCheckedChangeListener() {
                    @Override

                    // The flow will come here when
                    // any of the radio buttons in the radioGroup
                    // has been clicked

                    // Check which radio button has been clicked
                    public void onCheckedChanged(RadioGroup group,
                                                 int checkedId)
                    {

                        // Get the selected Radio Button
                        RadioButton
                                radioButton
                                = (RadioButton)group
                                .findViewById(checkedId);
                    }
                });

        // Add the Listener to the Submit Button
        button_Login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {

                // When submit button is clicked,
                // Ge the Radio Button which is set
                // If no Radio Button is set, -1 will be returned
                String Register_Number = RegisterNo_text.getText().toString();
                String Password = Password_text.getText().toString();
                int selectedId = radioGroup.getCheckedRadioButtonId();

                if ((selectedId != -1) && (Register_Number.equals("7111") && (Password.equals("1234")))) {
                    RadioButton radioButton = (RadioButton)radioGroup.findViewById(selectedId);
                    Toast.makeText(LoginPage.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), home.class);
                    startActivity(intent);

                }
                else {
                    Toast.makeText(LoginPage.this, "No answer has been selected", Toast.LENGTH_SHORT).show();
                }
            }

        });



    }
}







