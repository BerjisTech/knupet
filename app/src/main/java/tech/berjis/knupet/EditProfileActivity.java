package tech.berjis.knupet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hbb20.CountryCodePicker;

public class EditProfileActivity extends AppCompatActivity {

    CountryCodePicker ccp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        ccp = findViewById(R.id.country_code);
    }

    public void onCountryPickerClick(View view) {
        ccp.setOnCountryChangeListener(new CountryCodePicker.OnCountryChangeListener() {
            @Override
            public void onCountrySelected() {
                Toast.makeText(EditProfileActivity.this, "Alert : " + ccp.getSelectedCountryCodeWithPlus(), Toast.LENGTH_SHORT).show();
                String selected_country_code = ccp.getSelectedCountryCodeWithPlus();
            }
        });
    }
}
