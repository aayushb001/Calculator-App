package com.ab.mycompany.my_calculator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

//my imports
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MyCalculator extends AppCompatActivity /*implements View.*/ {

    double num1; //first input number
    double num2; //second input number
    double ans; //answer number

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_calculator);


        /*InputNumber will convert string inputs to double value we
        can work with*/
        final InputNumbers inputObject = new InputNumbers();

        //Linking button ids to button objects
        Button btnPlus = (Button)findViewById(R.id.btnPlus);
        Button btnMinus = (Button)findViewById(R.id.btnMinus);
        Button btnMultiply = (Button)findViewById(R.id.btnMultiply);
        Button btnDivide = (Button)findViewById(R.id.btnDivide);


        final EditText numDisplay1 = (EditText)findViewById(R.id.numDisp1);
        final EditText numDisplay2 = (EditText)findViewById(R.id.numDisp2);
        final TextView answerDisplay = (TextView)findViewById(R.id.ansDisp);


        btnPlus.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {

                        double num1 = 0; //first input number
                        double num2 = 0; //second input number
                        double ans = 0;  //Answer

                        //checks if values have been entered in the edit boxes.
                        if(numDisplay1.getText().toString().trim().length() == 0 || numDisplay2.getText().toString().trim().length() == 0){
                            answerDisplay.setText("Please enter valid values.");
                        }
                        else{
                            //passing the input text into the convert to double function
                            inputObject.convertNumbers(numDisplay1.getText().toString(), numDisplay2.getText().toString());

                            //getting the double values back
                            num1 = inputObject.getNumber1();
                            num2 = inputObject.getNumber2();

                            ans = num1 + num2;
                            answerDisplay.setText(""+ ans);
                        }
                    }

                });
        btnDivide.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {

                        double num1 = 0; //first input number
                        double num2 = 0; //second input number
                        double ans = 0;  //Answer
                        //checks if values have been entered in the edit boxes.
                        if(numDisplay1.getText().toString().trim().length() == 0 || numDisplay2.getText().toString().trim().length() == 0){
                            answerDisplay.setText("Please enter valid values.");
                        }
                        else{
                            //passing the input text into the convert to double function
                            inputObject.convertNumbers(numDisplay1.getText().toString(), numDisplay2.getText().toString());

                            //getting the double values back
                            num1 = inputObject.getNumber1();
                            num2 = inputObject.getNumber2();

                            ans = num1 / num2;
                            answerDisplay.setText(""+ ans);
                        }
                    }

                });

        btnMinus.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {

                        double num1 = 0; //first input number
                        double num2 = 0; //second input number
                        double ans = 0;  //Answer

                        //checks if values have been entered in the edit boxes.
                        if(numDisplay1.getText().toString().trim().length() == 0 || numDisplay2.getText().toString().trim().length() == 0){
                            answerDisplay.setText("Please enter valid values.");
                        }
                        else{
                            //passing the input text into the convert to double function
                            inputObject.convertNumbers(numDisplay1.getText().toString(), numDisplay2.getText().toString());

                            //getting the double values back
                            num1 = inputObject.getNumber1();
                            num2 = inputObject.getNumber2();

                            ans = num1 - num2;
                            answerDisplay.setText(""+ ans);
                        }
                    }

                });
        btnMultiply.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {

                        double num1=0; //first input number
                        double num2=0; //second input number
                        double ans=0;  //Answer
                        //checks if values have been entered in the edit boxes.
                        if(numDisplay1.getText().toString().trim().length() == 0 || numDisplay2.getText().toString().trim().length() == 0){
                            answerDisplay.setText("Please enter valid values.");
                        }
                        else{
                            //passing the input text into the convert to double function
                            inputObject.convertNumbers(numDisplay1.getText().toString(), numDisplay2.getText().toString());

                            //getting the double values back
                            num1 = inputObject.getNumber1();
                            num2 = inputObject.getNumber2();

                            ans = num1 * num2;
                            answerDisplay.setText(""+ ans);
                        }
                    }

                });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
