package mohamed.com.drinks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[] , s2[] , s3[];
    int images[] = {R.drawable.coffe,R.drawable.espresso,R.drawable.milkshake
            ,R.drawable.strawberryjuice,R.drawable.tea,R.drawable.cola};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.N_Drinks);
        s2 = getResources().getStringArray(R.array.P_Drinks);

        MyAdapter5 myAdapter = new MyAdapter5(this , s1 , s2 ,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}