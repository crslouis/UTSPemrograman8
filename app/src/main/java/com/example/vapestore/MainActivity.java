package com.example.vapestore;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.productRecyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        // Initialize product list with example items
        productList = new ArrayList<>();
        productList.add(new Product(R.drawable.vape1, "Salt Anggur Merah 30ml"));
        productList.add(new Product(R.drawable.vape2, "Tobacco rasa E-Liquid 30ml"));
        productList.add(new Product(R.drawable.vape2, "Lite Berry 30 ml"));
        productList.add(new Product(R.drawable.vape1, "Reat Salt nic Vanila 30ml"));

        productAdapter = new ProductAdapter(productList);
        recyclerView.setAdapter(productAdapter);
    }
}
