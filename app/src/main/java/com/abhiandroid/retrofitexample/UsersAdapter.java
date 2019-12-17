package com.abhiandroid.retrofitexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by jarviisinfotech on 03/01/18.
 */

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UsersViewHolder> {

    Context context;
    UsersAdapter  usersAdapter;
    List<UserListResponse> userListResponseData;

    public UsersAdapter(Context context, List<UserListResponse> userListResponseData) {
        this.userListResponseData = userListResponseData;
        this.context = context;
        this.usersAdapter=this;
    }

    @Override
    public UsersViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.users_list_items, null);
        UsersViewHolder usersViewHolder = new UsersViewHolder(view);
        return usersViewHolder;
    }

    @Override
    public void onBindViewHolder(UsersViewHolder holder, final int position) {
        // set the data
        holder.company.setText("Company Name: " + userListResponseData.get(position).getCompany_name());
        holder.odate.setText("Order Date: " + userListResponseData.get(position).getOrder_date());
        holder.delivery.setText("Delivery Date: " + userListResponseData.get(position).getDelivery_date());
        // implement setONCLickListtener on itemView
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // display a toast with user name
                userListResponseData.remove(position); //Actually change your list of items here
                usersAdapter.notifyItemRemoved(position);
                usersAdapter.notifyDataSetChanged();
                Toast.makeText(context, userListResponseData.get(position).getCompany_name(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return userListResponseData.size(); // size of the list items
    }

    class UsersViewHolder extends RecyclerView.ViewHolder {
        // init the item view's
        TextView company, odate,delivery;

        public UsersViewHolder(View itemView) {
            super(itemView);
            // get the reference of item view's
            company = (TextView) itemView.findViewById(R.id.company);
            odate = (TextView) itemView.findViewById(R.id.odate);
            delivery=(TextView)itemView.findViewById(R.id.ddate);
        }
    }
}
