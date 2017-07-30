package com.example.djibril.inventaireprod;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private RecyclerView recyclerView;

    private List<MyObject> produit = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //remplir la liste
        ajouterProduit();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        //définit l'agencement des cellules, ici de façon verticale, comme une ListView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //pour adapter en grille comme une RecyclerView, avec 2 cellules par ligne
        //recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        //puis créer un MyAdapter, lui fournir notre liste de produit.
        //cet adapter servira à remplir notre recyclerview
        recyclerView.setAdapter(new MyAdapter(produit));
        recyclerView.setHasFixedSize(true);
    }

    private void ajouterProduit() {
        produit.add(new MyObject("1","ORDINATEUR"));
        produit.add(new MyObject("2","ROUTEUR"));
        produit.add(new MyObject("3","CABLE"));
        produit.add(new MyObject("4","COMMUTATEUR"));
        produit.add(new MyObject("5","SERVEUR"));
        produit.add(new MyObject("6","PORTABLE"));
        produit.add(new MyObject("7","TABLETTE"));
        produit.add(new MyObject("8","CLE USB"));
        produit.add(new MyObject("9","DISQUE DURE"));

    }


}
