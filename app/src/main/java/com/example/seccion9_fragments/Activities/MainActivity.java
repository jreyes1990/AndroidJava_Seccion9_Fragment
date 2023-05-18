package com.example.seccion9_fragments.Activities;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.example.seccion9_fragments.Fragments.DataFragment;
import com.example.seccion9_fragments.Fragments.DetailsFragment;
import com.example.seccion9_fragments.R;

public class MainActivity extends FragmentActivity implements DataFragment.DataListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  @Override
  public void sendData(String text) {
    /* Llamar al metodo renderizarTexto de el DetailsFragment,
       pasando el texto que recibimos por parametro en este mismo metodo */
    DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
    detailsFragment.renderText(text);
  }

  @Override
  public void onPointerCaptureChanged(boolean hasCapture) {
    super.onPointerCaptureChanged(hasCapture);
  }
}