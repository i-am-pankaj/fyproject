package com.example.mathsmodule;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgramAdapter extends RecyclerView.Adapter<ProgramAdapter.ViewHolder> {

    Context context;
    String[] ntitle;
    String[] ndes;
    int[] images;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView rown;
        TextView rownn;
        ImageView rowi;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            rown = itemView.findViewById(R.id.nn1);
            rownn = itemView.findViewById(R.id.nn2);
            rowi = itemView.findViewById(R.id.imageView);
        }
    }

    public ProgramAdapter(Context context,String[] ntitle,String[] ndes,int[] images){
        this.context = context;
        this.ntitle = ntitle;
        this.ndes = ndes;
        this.images = images;
    }


    @NonNull
    @Override
    public ProgramAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.single_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProgramAdapter.ViewHolder holder, int position) {
        holder.rown.setText(ntitle[position]);
        holder.rownn.setText(ndes[position]);
        holder.rowi.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return ntitle.length;
    }
}