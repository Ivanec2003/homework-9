package com.example.homework9.catalogGoods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import com.example.homework9.R;

public class CatalogGoodsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog_goods);
        ImageButton imageButtonPhone = findViewById(R.id.imageButtonPhone);
        ImageButton imageButtonHeadPhone = findViewById(R.id.imageButtonHeadPhone);
        ImageButton imageButtonLaptop = findViewById(R.id.imageButtonLaptop);

        imageButtonPhone.setOnClickListener(v->{
            sendProductDetail(1);
        });
        imageButtonLaptop.setOnClickListener(v -> {
            sendProductDetail(2);
        });
        imageButtonHeadPhone.setOnClickListener(v -> {
            sendProductDetail(3);
        });
    }
    private void sendProductDetail(int idProduct){
        Intent intent = new Intent(this, DetailProductActivity.class);
        intent.putExtra("idProduct", idProduct);
        startActivity(intent);
    }
}