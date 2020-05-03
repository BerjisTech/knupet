package tech.berjis.knupet;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hbb20.CountryCodePicker;

public class ChangePhoneNumber extends AppCompatActivity {

    CountryCodePicker country_code_old, country_code_new;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_phone_number);

    }

}
