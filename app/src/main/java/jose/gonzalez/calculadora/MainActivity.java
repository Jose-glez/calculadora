package jose.gonzalez.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button suma = (Button)findViewById(R.id.btncalcular);
        suma.setOnClickListener(OkLister);
    }
    private View.OnClickListener OkLister = new View.OnClickListener(){
        @Override
        public void onClick(View view){
        calcularSuma();
        }
    };
    public void calcularSuma(){
        EditText numero1 = (EditText)findViewById(R.id.numero1);
        EditText numero2 = (EditText)findViewById(R.id.numero2);
         int intnumero1 = Integer.
                parseInt(numero1.getText().toString());
        int intnumero2 = Integer.
                parseInt(numero2.getText().toString());
        int totalSuma = intnumero1 + intnumero2;
        Toast.makeText(this, "El resultado de la suma: " + totalSuma,Toast.LENGTH_LONG).show();
    }
}
