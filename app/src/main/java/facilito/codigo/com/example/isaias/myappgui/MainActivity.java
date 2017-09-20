package facilito.codigo.com.example.isaias.myappgui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import facilito.codigo.com.example.isaias.myappgui.data.entities.Friend;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FriendsAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv_friends);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new FriendsAdapter(this, getData());
        recyclerView.setAdapter(adapter);


    }

    private List<Friend> getData() {
        List<Friend> items = new ArrayList<>();
        items= new ArrayList();
        for(int i=0; i<4; i++)
        {
            String title = "Tarjeta A " + i;
            String name = "Name A "+ i;
            String lastName = "Last Name A "+ i;
            String url = "www.juanito.com "+ i;
            items.add(new Friend(title,name,lastName,url));
        }
        for(int i=0; i<4; i++)
        {
            String title = "Tarjeta B " + i;
            String name = "Name B "+ i;
            String lastName = "Last Name B "+ i;
            String url = "www.juanito.com "+ i;
            items.add(new Friend(title,name,lastName,url));
        }

        return items;
    }
}
