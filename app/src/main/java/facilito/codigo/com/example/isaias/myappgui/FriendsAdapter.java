package facilito.codigo.com.example.isaias.myappgui;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import facilito.codigo.com.example.isaias.myappgui.data.entities.Friend;

/**
 * Created by isaia on 9/20/2017.
 */

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.FriendsViewHolder> {

    private static final String TAG = "FriendsAdapterTAG_";
    public static List<Friend> items;
    public static Activity activity;

    public FriendsAdapter(Activity activity, List <Friend> items){
        this.items = items;
        this.activity = activity;
        Log.d(TAG, "FriendsAdapter: " + items.toString());


    }


    @Override
    public FriendsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_friend, parent, false);
        return new FriendsAdapter.FriendsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FriendsViewHolder holder, int position) {

        holder.txtTitle.setText(items.get(position).getTitle());
        holder.txtName.setText(items.get(position).getLastName());
        holder.txtSurname.setText(items.get(position).getLastName());
        holder.txtUrl.setText(items.get(position).getUrl());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class FriendsViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle, txtName, txtSurname, txtUrl;
        LinearLayout itm_friend;

        public FriendsViewHolder(View itemView) {
            super(itemView);
            itm_friend =  itemView.findViewById(R.id.item_friend);
            txtTitle = itemView.findViewById(R.id.title);
            txtName = itemView.findViewById(R.id.txtName);
            txtSurname = itemView.findViewById(R.id.txtSurname);
            txtUrl = itemView.findViewById(R.id.txtUrl);
        }
    }
}
