package com.example.ev_t3_app_moviles.adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.ev_t3_app_moviles.MainActivity;
import com.example.ev_t3_app_moviles.R;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;


public class adapter extends RecyclerView.Adapter<adapter.AdapterViewHolder>{

    private boolean favorito = false;
    ArrayList<MainActivity.Anime> mData;

    public adapter(ArrayList<MainActivity.Anime> anime) {
        mData = anime;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_anime, parent, false);
        adapter.AdapterViewHolder vh = new adapter.AdapterViewHolder(v,context); // este necesita un view, y para hacerlo tenemos que instanciar todon lo de arriba
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {
        Context context = holder.contex;
        TextView nombre = holder.itemView.findViewById(R.id.nombre);
        TextView descri = holder.itemView.findViewById(R.id.descripcion);
        ImageView image = holder.itemView.findViewById(R.id.imagen);

        ImageButton boton = holder.itemView.findViewById(R.id.imageButton);

        boton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(favorito){
                    favorito = false;
                    boton.setImageResource(R.drawable.ic_baseline_star_24);
                    Toast.makeText(context.getApplicationContext(),"Añadido a favoritos", Toast.LENGTH_LONG).show();
                }else
                {
                    favorito = true;
                    boton.setImageResource(R.drawable.ic_baseline_star_border_24);
                    Toast.makeText(context.getApplicationContext(),"Eliminado de favoritos", Toast.LENGTH_LONG).show();

                }
            }
        });


        String nomb = mData.get(position).getTitulo();
        String desc = mData.get(position).getDescripcion();
        String imag = mData.get(position).getImage();

        Picasso.get().load(imag).into(image);
        nombre.setText(nomb);
        descri.setText(desc);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public class AdapterViewHolder extends RecyclerView.ViewHolder{
        Context contex;
        public AdapterViewHolder(@NonNull View itemView,Context contex) {
            super(itemView);
            this.contex = contex;
        }
    }

}