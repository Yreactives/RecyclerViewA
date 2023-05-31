package com.ronny202102241.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView _recyclerView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _recyclerView1 = (RecyclerView) findViewById(R.id.recyclerView1);
        List<NegaraModel> negaraModelList = new ArrayList<>();

        String[] namaNegara = {"Albania", "Hungary", "Slovenia", "Belgium", "Canada"};
        ArrayList<String> deskripsiNegara = new ArrayList<>();
        ArrayList<String> urlNegara = new ArrayList<>();

        deskripsiNegara.add("Negara ini menggunakan bendera berwarna merah.");
        deskripsiNegara.add("Negara ini bernama Hungaria dalam bahasa Indonesia");
        deskripsiNegara.add("Sebuah negara di Eropa Tengah yang dikenal dengan pegunungan, ski, dan danaunya");
        deskripsiNegara.add("Namanya Belgia dalam bahasa Indonesia. Negara ini terdapat di Eropa");
        deskripsiNegara.add("Negara ini terdapat di sebelah utara negara Amerika Serikat");
        urlNegara.add("https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Flag_of_Albania.svg/1200px-Flag_of_Albania.svg.png");
        urlNegara.add("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/Flag_of_Hungary.svg/1200px-Flag_of_Hungary.svg.png");
        urlNegara.add("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f0/Flag_of_Slovenia.svg/2560px-Flag_of_Slovenia.svg.png");
        urlNegara.add("https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/Flag_of_Belgium.svg/1200px-Flag_of_Belgium.svg.png");
        urlNegara.add("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/1200px-Flag_of_Canada_%28Pantone%29.svg.png");

        for (int i = 0; i < urlNegara.size(); i++) {
            NegaraModel nm = new NegaraModel();
            nm.setNama(namaNegara[i]);
            nm.setDeskripsi(deskripsiNegara.get(i));
            nm.setUrl(urlNegara.get(i));
            negaraModelList.add(nm);
        }

        RecyclerView.LayoutManager lm = new LinearLayoutManager(MainActivity.this);
        _recyclerView1.setLayoutManager(lm);

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(), negaraModelList);
        _recyclerView1.setAdapter(na);
    }
}