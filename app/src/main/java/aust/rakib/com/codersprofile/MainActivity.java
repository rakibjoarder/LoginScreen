package aust.rakib.com.codersprofile;
//https://www.youtube.com/watch?v=DZPxiZtL4H0
//https://www.materialui.co/colors
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText passet;
    EditText useret;
    TextView signuptv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        passet=(EditText) findViewById(R.id.password_edittext);
        useret=(EditText) findViewById(R.id.username_edittext);
        signuptv=(TextView) findViewById(R.id.signuptext);

        signuptv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RegisterIntert=new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(RegisterIntert);
            }
        });


    }
    public void LogIn(View view)
    {
        String etusername=useret.getText().toString();
        String etpassword=passet.getText().toString();
        String username="rakibjoarder";
        String password="123456";

        if(etusername.equals(username))
        {
            startActivity(new Intent(this,Main2Activity.class));
        }
    }


}
