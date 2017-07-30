package com.example.djibril.inventaireprod;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Creer par  djibril sarr le 7/28/17.
 */

public class MyViewHolder  extends RecyclerView.ViewHolder{

    private TextView textViewView ;



    //itemView est la vue correspondante à 1 cellule
    public MyViewHolder(View itemView) {
        super(itemView);

        //c'est ici que l'on fait nos findView;
        textViewView = (TextView) itemView.findViewById(R.id.text);


    }

    //puis ajouter une fonction pour remplir la cellule en fonction d'un MyObject
    public void bind(MyObject myObject){
        textViewView.setText(myObject.getNumb() +" - "+ myObject.getText());

    }


}
