package unj.adefault.com.tebakwarna.halaman_kuis;

import android.content.Intent;
import android.media.Image;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import unj.adefault.com.tebakwarna.R;

public class MerahActivity extends AppCompatActivity {

    Button btnCek;
    EditText etJawab;
    ImageView imgSad, imgSmile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merah);

        inisialisasi();

        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jawaban = etJawab.getText().toString().toLowerCase();

                if(jawaban.equals("merah")){ //untuk membandingkan string
                    Toast.makeText(getApplicationContext(), "Jawaban Benar", Toast.LENGTH_SHORT).show();

                    //akan memunculkan smile
                    imgSmile.setVisibility(View.VISIBLE);

                    int secondsDelayed = 3;
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            imgSmile.setVisibility(View.INVISIBLE);

                            Intent intent = new Intent(getApplicationContext(), KuningActivity.class);
                            startActivity(intent);
                            
                            finish();
                        }
                    }, secondsDelayed * 1000);



                } else {
                    Toast.makeText(getApplicationContext(), "Jawaban Salah", Toast.LENGTH_SHORT).show();

                    //akan memunculkan sad
                    imgSad.setVisibility(View.VISIBLE);

                    int secondsDelayed = 3;
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            imgSad.setVisibility(View.INVISIBLE);
                            finish();
                        }
                    }, secondsDelayed * 1000);
                }
            }
        });
    }

    public void inisialisasi(){
        btnCek = (Button) findViewById(R.id.btnCek);
        etJawab = (EditText) findViewById(R.id.editText);
        imgSad = (ImageView) findViewById(R.id.imgSad);
        imgSmile = (ImageView) findViewById(R.id.imgSmile);
    }
}
