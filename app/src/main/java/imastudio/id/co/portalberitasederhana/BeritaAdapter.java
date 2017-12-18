package imastudio.id.co.portalberitasederhana;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import javax.sql.StatementEvent;

/**
 * Created by rizkisyaputra on 18/12/17.
 */

public class BeritaAdapter extends ArrayAdapter<String> {

    private Activity context;
    private String[] categori;
    private String[] title;
    private String[] desc;
    private  int[] imageId;

    public BeritaAdapter(Activity context, String[] categori, String[] title, String[] desc, int[] imageId) {
        super(context, R.layout.item_berita, categori);
        this.context = context;
        this.categori = categori;
        this.title = title;
        this.desc = desc;
        this.imageId = imageId;
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rootView = inflater.inflate(R.layout.item_berita, null, true);

        TextView txtKategori = (TextView)rootView.findViewById(R.id.txtKategori);
        TextView txtJudul = (TextView)rootView.findViewById(R.id.txtJudul);
        TextView txtDesk = (TextView)rootView.findViewById(R.id.txtDeskripsi);
        ImageView imgGambar = (ImageView)rootView.findViewById(R.id.imgGambar);

        //menampilkan ke widget masing2
        txtDesk.setText(desc[position]);
        txtJudul.setText(title[position]);
        txtKategori.setText(categori[position]);
        imgGambar.setImageResource(imageId[position]);

        return rootView;

    }
}
