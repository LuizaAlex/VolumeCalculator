package com.example.volumecalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Shape> {

    private ArrayList<Shape> shapeArrayList;
    Context context;

   public MyCustomAdapter(ArrayList<Shape> shapeArrayList, Context context){
       super(context, R.layout.grid_item_layout, shapeArrayList);
       this.shapeArrayList = shapeArrayList;
       this.context = context;
   }

   //View Holder
   private static class MyViewHolder{
       TextView shapeName;
       ImageView shapeImg;
   }

   //GetView


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

       //Get the shape of the current position
        Shape shapes = getItem(position);

        //Inflating Layout
        MyViewHolder myViewHolder;

        if(convertView == null){
            myViewHolder = new MyViewHolder();
            LayoutInflater  inflater = LayoutInflater.from(getContext());

            convertView = inflater.inflate(
                    R.layout.grid_item_layout,
                    parent,
                    false);

            //Finding the Views
            myViewHolder.shapeName = (TextView) convertView.findViewById(R.id.textView);
            myViewHolder.shapeImg = (ImageView) convertView.findViewById(R.id.imageView);

            convertView.setTag(myViewHolder);
        }else{
            myViewHolder = (MyViewHolder) convertView.getTag();

        }

        //Getting the data from the model class (Shape)
        myViewHolder.shapeName.setText(shapes.getShapeName());
        myViewHolder.shapeImg.setImageResource(shapes.getShapeImg());

        return convertView;
    }
}
