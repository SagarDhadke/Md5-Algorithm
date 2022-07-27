package net.uniquecomputer.md5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnMD5(View v){
        EditText etInput = (EditText) findViewById(R.id.etInput);
        TextView tvOutPut = (TextView) findViewById(R.id.tvOutPut);

        byte[] md5Input = etInput.getText().toString().getBytes();
        BigInteger md5Data = null;

        try {
            md5Data = new BigInteger(1,md5.encryptMD5(md5Input));
        } catch (Exception e) {
            e.printStackTrace();
        }

        String md5Str = md5Data.toString(16);

        tvOutPut.setText(md5Str);
    }

}