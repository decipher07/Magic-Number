package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {
        int number;

        public boolean isSquare ()
        {
            double squareRoot = Math.sqrt(number);
            if (squareRoot == Math.floor(squareRoot))
                return true;
            return false ;
        }

        public boolean isTriangular ()
        {
            for (int i = 0 ; i < 10 ; i++)
                if ( (i*(i+1))/2 == number)
                    return true ;

            return false ;
        }

    }

    public void testNumber (View view){

        Log.i("info","Button Pressed");

        EditText editText = (EditText) findViewById(R.id.editText);

        String message ;

        if (editText.getText().toString().isEmpty())
            message = "Plz Enter A Number";

        Number myNum = new Number();

        myNum.number = Integer.parseInt(editText.getText().toString());

        message = editText.getText().toString();

        if (myNum.isSquare() && myNum.isTriangular())
            message = editText.getText().toString() + " is Both Triangular And Square";
        else if (myNum.isTriangular())
            message = editText.getText().toString()+ " is Only Triangular";
        else if (myNum.isSquare())
            message = editText.getText().toString()+ " is Only Square";
        else
            message = editText.getText().toString()+ "is Nothing";

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
