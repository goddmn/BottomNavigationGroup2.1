package pro.mitapp.bottomnavigationgroup21;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBottomNavigation();
    }

    private void initBottomNavigation() {
        navigationView = findViewById(R.id.bottom_nav);
        navigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.navigation_main:
                        Toast.makeText(MainActivity.this, "Main", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.navigation_notes:
                        Toast.makeText(MainActivity.this, "Notes", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.navigation_profile:
                        Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}