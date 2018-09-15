package com.example.user.cloneinstagram;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by USER on 15-Sep-18.
 */

public class Myadapter extends RecyclerView.Adapter<Myadapter.Myhoder> {

    List<Item> mItem;
    Context context;

    public Myadapter(List<Item> mItem, Context context) {
        this.mItem = mItem;
        this.context = context;
    }

    @Override
    public Myhoder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.card_item, parent, false);

        return new Myhoder(view);
    }

    @Override
    public void onBindViewHolder(Myhoder holder, int position) {

          holder.username.setText(mItem.get(position).getUser_id());
          holder.imageView.setImageResource(mItem.get(position).getThubmail());
    }

    @Override
    public int getItemCount() {
        return mItem.size();
    }

    public class Myhoder extends RecyclerView.ViewHolder{

        TextView username;
        ImageView imageView;
        public Myhoder(View itemView) {
            super(itemView);

            username = itemView.findViewById(R.id.name);
            imageView =itemView.findViewById(R.id.image);
        }
    }
}
