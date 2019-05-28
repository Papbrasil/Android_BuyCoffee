package br.com.dfilitto.buycoffee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int numbercoffee = 0;
    private int priceCoffe = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onAdd(View view){
        numbercoffee++;
        TextView tv = (TextView) findViewById(R.id.tvQuantity);
        tv.setText(""+numbercoffee);

        TextView tvp = (TextView) findViewById(R.id.tvPrice);
        tvp.setText(""+(priceCoffe*numbercoffee));
    }
    public void onDec(View view){
        if(numbercoffee > 0){
            numbercoffee--;
        }
        TextView tv = (TextView) findViewById(R.id.tvQuantity);
        tv.setText(""+numbercoffee);

        TextView tvp = (TextView) findViewById(R.id.tvPrice);
        tvp.setText(""+(priceCoffe*numbercoffee));
    }


}
