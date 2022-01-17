package com.example.booklibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {
    EditText inputTitle, inputAuthor, inputPages;
    Button addBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        inputTitle = findViewById(R.id.tittle_input);
        inputAuthor = findViewById(R.id.author_input);
        inputPages = findViewById(R.id.pages_input);

        addBtn = findViewById(R.id.addtolibraryBtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(AddActivity.this);
                myDB.addBook(inputTitle.getText().toString().trim(),
                        inputAuthor.getText().toString().trim(),
                        Integer.valueOf(inputPages.getText().toString().trim()));
            }
        });
    }
}