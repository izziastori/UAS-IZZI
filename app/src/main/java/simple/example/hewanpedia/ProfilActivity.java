package simple.example.hewanpedia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import simple.example.hewanpedia.model.Ayam;
import simple.example.hewanpedia.model.Beruang;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kelinci;

public class ProfilActivity extends AppCompatActivity {

    Hewan hewan;
    TextView txJudul,txJenis,txAsal,txDeskripsi;
    ImageView ivFotoHewan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_ras);
        Intent intent = getIntent();
        hewan = (Hewan) intent.getSerializableExtra(DaftarHewanActivity.HEWAN_TERPILIH);
        inisialisasiView();
        tampilkanProfil(hewan);
    }

    private void inisialisasiView() {
        txJudul = findViewById(R.id.txJudul);
        txJenis = findViewById(R.id.txJenis);
        txAsal = findViewById(R.id.txAsal);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoHewan = findViewById(R.id.gambarHewan);
    }
    private void tampilkanProfil(Hewan hewan) {
        Log.d("Profil","Menampilkan "+hewan.getJenis());
        if (hewan instanceof Beruang) {
            txJudul.setText(getString(R.string.beruang));
        } else if (hewan instanceof Ayam) {
            txJudul.setText(getString(R.string.ayam));
        } else if (hewan instanceof Kelinci) {
            txJudul.setText(getString(R.string.kelinci_list_title));
        }

        txJenis.setText(hewan.getRas());
        txAsal.setText(hewan.getAsal());
        txDeskripsi.setText(hewan.getDeskripsi());
        ivFotoHewan.setImageDrawable(this.getDrawable(hewan.getDrawableRes()));
    }




}