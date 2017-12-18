package imastudio.id.co.portalberitasederhana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] kategoriBerita = {"Foto News", "Geography", "Nusantara", "Seni"};
    String[] judulBerita = {
            "Potret Jokowi dan Sultan di Apel Kokam-Banser",
            "Masih Bingung Cari Perabot Rumah? Ini Referensinya",
            "Tim Survei Sungai Citarum, Kodam Siliwangi: Banyak Lahan Gundul",
            "Ini St Petersburg, Kota Cantik yang Diselamatkan CIA dari Teror ISIS"
    };
    String[] deskripsiBerita = {
            "Yogyakarta detikNews - Foto Sultan HB X yang berdiri di belakang Presiden Jokowi saat Apel Kokam-Banser jadi sorotan. Faktanya, Sultan juga foto bersama Jokowi. Ini potretnya",
            "Jakarta -\n" +
                    "Memiliki tempat tinggal yang nyaman, baik rumah atau apartemen tentu menjadi impian semua orang. Karena itu, banyak orang rela menabung bertahun-tahun atau mengajukan kredit pemilikan rumah (KPR) agar bisa tinggal di istana yang mereka dambakan.",
            "Bandung - Tim survei penanganan sungai Citarum Kodam III Siliwangi menemukan permasalahan di sungai Citarum. Selama dua pekan pemantauan, tim menemukan banyak lahan gundul sepanjang sungai tersebut.",
            "Jakarta detikNews - CIA memberikan informasi berharga ke Rusia mengenai serangan ISIS. Kota St Petersburg yang indah ini pun selamat dari teror. Berikut potret keindahan kota itu."
    };

    int[] gambar = {R.drawable.gambar1, R.drawable.gambar2, R.drawable.gambar3, R.drawable.gambar4};

    ListView lsberita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lsberita = (ListView)findViewById(R.id.listBerita);

        //memasukkan kedalam beritaadapter
        BeritaAdapter beritaAdapter = new BeritaAdapter(this, kategoriBerita, judulBerita, deskripsiBerita, gambar);
        lsberita.setAdapter(beritaAdapter);
    }
}
