package com.example.seccion9_fragments.Activities;

import androidx.appcompat.app.AppCompatActivity;

import com.example.seccion9_fragments.Fragments.DetailsFragment;
import com.example.seccion9_fragments.R;

import android.os.Bundle;

public class DetailsActivity extends AppCompatActivity {
  private String text;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_details);

    if (getIntent().getExtras() != null){
      text = getIntent().getStringExtra("text");
    }

    DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
    detailsFragment.renderText(text);
  }
}