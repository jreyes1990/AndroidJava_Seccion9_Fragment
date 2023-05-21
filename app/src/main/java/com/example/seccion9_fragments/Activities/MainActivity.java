package com.example.seccion9_fragments.Activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.example.seccion9_fragments.Fragments.DataFragment;
import com.example.seccion9_fragments.Fragments.DetailsFragment;
import com.example.seccion9_fragments.R;

public class MainActivity extends FragmentActivity implements DataFragment.DataListener {
  private boolean isMultiPanel;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    setMultiPanel();
  }

  @Override
  public void sendData(String text) {
    if (isMultiPanel){
      /* Llamar al metodo renderizarTexto de el DetailsFragment,
       pasando el texto que recibimos por parametro en este mismo metodo */
      DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
      detailsFragment.renderText(text);
    }else {
      Intent intent = new Intent(this, DetailsActivity.class);
      intent.putExtra("text", text);
      startActivity(intent);
    }
  }

  @Override
  public void onPointerCaptureChanged(boolean hasCapture) {
    super.onPointerCaptureChanged(hasCapture);
  }

  private void setMultiPanel(){
    isMultiPanel = (getSupportFragmentManager().findFragmentById(R.id.detailsFragment) != null);
  }
}