package com.pascua.studentinfosystem;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
public class RegistrationActivity extends AppCompatActivity {
    private EditText edtStudentNumber;
    private EditText edtLastName;
    private EditText edtFirstName;
    private EditText edtMiddleName;
    private Spinner spinnerProgram;
    private Spinner spinnerYear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        // Connect input fields
        edtStudentNumber = findViewById(R.id.edtStudentNumber);
        edtLastName = findViewById(R.id.edtLastName);
        edtFirstName = findViewById(R.id.edtFirstName);
        edtMiddleName = findViewById(R.id.edtMiddleName);
        spinnerProgram = findViewById(R.id.spinnerProgram);
        spinnerYear = findViewById(R.id.spinnerYear);
        // Program choices
        String[] programs = {
                "Select Program",
                "BSCS-DF",
                "BSCS-ML"
        };
        // Year level choices
        String[] years = {
                "Select Year Level",
                "1st Year",
                "2nd Year",
                "3rd Year",
                "4th Year"
        };
        // Program adapter
        ArrayAdapter<String> programAdapter =
                new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_spinner_item,
                        programs
                );
        programAdapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );
        spinnerProgram.setAdapter(programAdapter);
        // Year adapter
        ArrayAdapter<String> yearAdapter =
                new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_spinner_item,
                        years
                );
        yearAdapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );
        spinnerYear.setAdapter(yearAdapter);
        // Clear button - visual prototype interaction
        Button btnClear = findViewById(R.id.btnClearForm);
        btnClear.setOnClickListener(v -> {
            edtStudentNumber.setText("");
            edtLastName.setText("");
            edtFirstName.setText("");
            edtMiddleName.setText("");
            spinnerProgram.setSelection(0);
            spinnerYear.setSelection(0);
        });
    }
}