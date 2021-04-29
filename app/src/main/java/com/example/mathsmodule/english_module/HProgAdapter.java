package com.example.mathsmodule.english_module;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mathsmodule.R;

public class HProgAdapter extends RecyclerView.Adapter<HProgAdapter.ViewHolder>{

    Context context;
    String[] alpList;
    String[] alpTap;
    int[] images;
    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView alpName;
        TextView alpDescription;
        ImageView alpImages;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            alpName=itemView.findViewById(R.id.HtextView1);
            alpDescription=itemView.findViewById(R.id.HtextView2);
            alpImages=itemView.findViewById(R.id.himageView);
        }
    }
    public HProgAdapter(Context context, String[] alpList, String[] alpTap, int[] images){
        this.context=context;
        this.alpList=alpList;
        this.alpTap=alpTap;
        this.images=images;

    }

    @NonNull
    @Override
    public com.example.mathsmodule.english_module.HProgAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater hinflater= LayoutInflater.from(context);
        View hview=hinflater.inflate(R.layout.hsingle_item, parent, false);
        ViewHolder hviewHolder=new ViewHolder(hview);
        return hviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HProgAdapter.ViewHolder holder, int position) {
        holder.alpName.setText(alpList[position]);
        holder.alpDescription.setText(alpTap[position]);
        holder.alpImages.setImageResource(images[position]);



    }

    @Override
    public int getItemCount() {
        return alpList.length;
    }
}
