package cristian.checa.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView V_inicio;

    TextView V_resumen;

    TextView V_Reseteado;

    TextView V_crear;

    TextView V_parada;

    TextView V_destruido;

    TextView V_pausada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        V_inicio = findViewById(R.id.V_inicio);
        V_resumen = findViewById(R.id.V_resumen);
        V_Reseteado = findViewById(R.id.V_Reseteado);
        V_crear = findViewById(R.id.V_crear);
        V_parada = findViewById(R.id.V_parada);
        V_destruido = findViewById(R.id.V_destruido);
        V_pausada = findViewById(R.id.V_pausada);
        Toast.makeText(MainActivity.this,"Crea",Toast.LENGTH_LONG).show();
        String valorR = V_crear.getText().toString();
        int numero = Integer.parseInt(valorR);
        int resutado = numero + 1;
        V_crear.setText(String.valueOf(resutado));
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this,"Empieza",Toast.LENGTH_LONG).show();
        String valorR = V_inicio.getText().toString();
        int numero = Integer.parseInt(valorR);
        int resutado = numero + 1;
        V_inicio.setText(String.valueOf(resutado));
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(MainActivity.this,"Reinicia",Toast.LENGTH_LONG).show();
        String valorR = V_Reseteado.getText().toString();
        int numero = Integer.parseInt(valorR);
        int resutado = numero + 1;
        V_Reseteado.setText(String.valueOf(resutado));
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(MainActivity.this,"Resume",Toast.LENGTH_LONG).show();
        String valorR = V_resumen.getText().toString();
        int numero = Integer.parseInt(valorR);
        int resutado = numero + 1;
        V_resumen.setText(String.valueOf(resutado));
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(MainActivity.this,"Pausa",Toast.LENGTH_LONG).show();
        String valorR = V_pausada.getText().toString();
        int numero = Integer.parseInt(valorR);
        int resutado = numero + 1;
        V_pausada.setText(String.valueOf(resutado));
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(MainActivity.this,"Para",Toast.LENGTH_LONG).show();
        String valorR = V_parada.getText().toString();
        int numero = Integer.parseInt(valorR);
        int resutado = numero + 1;
        V_parada.setText(String.valueOf(resutado));
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(MainActivity.this,"Destruido",Toast.LENGTH_LONG).show();
    }
}