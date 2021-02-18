package mohamed.com.drinks;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter5 extends RecyclerView.Adapter<MyAdapter5.MyViewHolder> {

    String data1[], data2[];
    int images[];
    Context context;


    public MyAdapter5(Context ct, String s1[], String s2[],int img[]) {
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    }

    @NonNull
    @Override
    public MyAdapter5.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_screen_drinks, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter5.MyViewHolder holder, int position) {
        holder.img_Drinks.setImageResource(images[position]);
        holder.N_Drinks.setText(data1[position]);
        holder.P_Drinks.setText(data2[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView img_Drinks;
        TextView N_Drinks, P_Drinks;
        ConstraintLayout mainLayout;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img_Drinks = itemView.findViewById(R.id.img_Drinks);
            N_Drinks = itemView.findViewById(R.id.N_Drinks);
            P_Drinks = itemView.findViewById(R.id.P_Drinks);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}