package abdullah.mansour.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView resultA,resultB;
    Button A3,A2,A1,B3,B2,B1,reset;

    int A = 0;
    int B = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultA = findViewById(R.id.resultA);
        resultB = findViewById(R.id.resultB);

        A3 = findViewById(R.id.A3);
        A2 = findViewById(R.id.A2);
        A1 = findViewById(R.id.A1);
        B3 = findViewById(R.id.B3);
        B2 = findViewById(R.id.B2);
        B1 = findViewById(R.id.B1);
        reset = findViewById(R.id.reset);

        resultA.setText(A + "");
        resultB.setText(B + "");

        A3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                A = A + 3;
                resultA.setText(A + "");
            }
        });

        reset.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                A = 0;
                resultA.setText(A + "");
            }
        });
    }
}
