package mx.com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import mx.com.example.facebook.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
private List<Color> colores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

        colores=new ArrayList<>();
        colores.add(new Color("Netflix","10 min","venta fin de año camiseta Levi's por solo $405"));
        colores.add(new Color("Mercado Libre","1 hrs","venta fin de año camiseta Levi's por solo $405"));
        colores.add(new Color("Juan Perez","3min","venta fin de año camiseta Levi's por solo $405"));





binding.rclvColores.setHasFixedSize(true);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.rclvColores.setLayoutManager(layoutManager);
        ColoresAdapter adapter=new ColoresAdapter(colores);
        binding.rclvColores.setAdapter(adapter);
    }



}