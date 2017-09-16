package unj.adefault.com.tebakwarna.halaman_kuis;

import android.media.Image;
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

                } else {
                    Toast.makeText(getApplicationContext(), "Jawaban Salah", Toast.LENGTH_SHORT).show();

                    //akan memunculkan sad
                    imgSad.setVisibility(View.VISIBLE);

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
