package com.example.homework9.catalogGoods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.homework9.R;

public class DetailProductActivity extends AppCompatActivity {

    private final String[] nameProduct = {"Samsung Galaxy A34 6/128GB Light Green (SM-A346ELGASEK)",
            "Apple MacBook Air 13\" M1 8/256GB 2020 (MGN63) Space Gray",
            "Bluetooth BASEUS Encok Wireless headphone D02 Pro BT5.0, AUX Black (NGD02-C01)"};
    private final String[] productDesription = {"best phone", "best laptop", "best headphone"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_product);

        ImageView productImage = findViewById(R.id.productImage);
        TextView textViewProductName = findViewById(R.id.textViewProductName);
        TextView textViewDescription = findViewById(R.id.textViewDescription);

        int productId = getIntent().getIntExtra("idProduct", 0);
        switch (productId){
            case 1:
                productImage.setImageResource(R.drawable.phone);
                textViewProductName.setText(nameProduct[0]);
                textViewDescription.setText(productDesription[0]);
                break;
            case 2:
                productImage.setImageResource(R.drawable.laptop);
                textViewProductName.setText(nameProduct[1]);
                textViewDescription.setText(productDesription[1]);
                break;
            case 3:
                productImage.setImageResource(R.drawable.headphone);
                textViewProductName.setText(nameProduct[2]);
                textViewDescription.setText(productDesription[2]);
                break;
        }
    }
}