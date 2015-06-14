package uqbar.conversor_android_studio;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import uqbar.conversor_android_studio.model.Conversor;


public class ConversorActivity extends Activity implements View.OnClickListener {

        private Conversor conversor = new Conversor();

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_conversor);

          //  findViewById(R.id.conversor_convertir).setOnClickListener(this);
        }

        public void onClick(View view) {
            String millas = ((EditText) findViewById(R.id.conversor_millas)).getText().toString();
            conversor.setMillas(Double.valueOf(millas));
            conversor.convertir();
            ((TextView) findViewById(R.id.conversor_kilometros)).setText(String.valueOf(conversor.getKilometros()));
        }

    public void convertimeEsto(View view) {
        onClick(view);
    }
}
