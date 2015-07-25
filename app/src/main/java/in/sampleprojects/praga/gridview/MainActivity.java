package in.sampleprojects.praga.gridview;

import android.os.Bundle;
import android.widget.GridView;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.grid_layout);

            GridView gridView = (GridView) findViewById(R.id.grid_view);

            // Instance of ImageAdapter Class
            gridView.setAdapter(new ImageAdapter(this));
            gridView.setOnItemClickListener(new OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                    Toast.makeText(getApplicationContext(), "" + position, Toast.LENGTH_SHORT).show();
                }
            });
        }
}
