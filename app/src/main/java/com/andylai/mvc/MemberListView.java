package com.andylai.mvc;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import com.andylai.mvc.MVCModel.MemberInfo;

import java.util.ArrayList;

public class MemberListView extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_list_view);
        ListView listView = findViewById(R.id.memberListView);
        // add data
        ArrayList<MemberInfo> list = new ArrayList<>();
        list.add(new MemberInfo("Andy", "badboyandy13@gmail.com", true));
        list.add(new MemberInfo("Justine", "justineyaya@gmail.com", false));
        MemberListAdapter adapter = new MemberListAdapter(list,this);
        listView.setAdapter(adapter);
    }

    class MemberListAdapter extends BaseAdapter {
        ArrayList<MemberInfo> memberList;
        LayoutInflater inflater;

        public MemberListAdapter(@NonNull ArrayList<MemberInfo> list, Context context) {
            memberList = list;
            inflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return memberList.size();
        }

        @Override
        public Object getItem(int position) {
            return memberList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if (convertView == null) {
                holder = new ViewHolder();
                convertView = inflater.inflate(R.layout.listview_member_list, null);
                holder.name = convertView.findViewById(R.id.name);
                holder.email = convertView.findViewById(R.id.email);
                holder.isVIP = convertView.findViewById(R.id.isVIP);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            holder.name.setText(memberList.get(position).name);
            holder.email.setText(memberList.get(position).email);
            holder.isVIP.setChecked(memberList.get(position).isVIP);
            return convertView;
        }

        public final class ViewHolder {
            private TextView name;
            private TextView email;
            private CheckBox isVIP;
        }
    }
}
