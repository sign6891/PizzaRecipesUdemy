package com.example.pizzarecipesudemy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        ImageView imageView = findViewById(R.id.pizzaIV);
        TextView title = findViewById(R.id.titleTextView);
        TextView recipe = findViewById(R.id.recipeTextView);

        Intent intent = getIntent();
        if (intent != null) {
            imageView.setImageResource(intent.getIntExtra("imageResource", 0));
            title.setText(intent.getStringExtra("title"));
            recipe.setText(intent.getStringExtra("recipe"));

        }
    }
}
