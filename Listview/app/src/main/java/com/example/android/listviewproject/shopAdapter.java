package com.example.android.listviewproject;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

class ItemAdapter extends ArrayAdapter<Items> {

    List<Items> items;

    final AlertDialog.Builder alert = new AlertDialog.Builder(getContext());

    public ItemAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);
        this.items = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {

        view = LayoutInflater.from(getContext()).inflate(R.layout.list_item1, parent, false);

        Items currentItem = items.get(position);

        TextView Name = view.findViewById(R.id.itemName);
        Name.setText(currentItem.getTextFood());


        ImageView shapeImageTextView = view.findViewById(R.id.ImageView);
        shapeImageTextView.setImageResource(currentItem.getImagefood());
        TextView price = view.findViewById(R.id.itemprice);

        price.setText(currentItem.getTextPrice() + "");

        ImageView RemoveImg = view.findViewById(R.id.delete);
        RemoveImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(getContext())
                        .setTitle("Are you sure about that?")
                        .setPositiveButton("Yes" , new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int x){
                                items.remove(position);
                                notifyDataSetChanged();

                            }
                                }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
                                    @Override
                            public void onClick(DialogInterface dialogInterface, int x) {
                                      dialogInterface.dismiss();
                                    }
                                }).show();
                          alertDialog.create();

            }
        });



     
        return view;
    }
}
