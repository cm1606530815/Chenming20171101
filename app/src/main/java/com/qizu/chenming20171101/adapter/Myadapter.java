package com.qizu.chenming20171101.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.qizu.chenming20171101.R;
import com.qizu.chenming20171101.bean.MyBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiuhao on 2017/11/01.
 * data 2017/11/01
 * time 上午 09:07
 */

public class Myadapter extends BaseAdapter{
    Context context;

    private List<MyBean.DataBean> list = new ArrayList<>();
    public Myadapter() {
        super();
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = View.inflate(context, R.layout.item,null);
        ImageView tv = convertView.findViewById(R.id.image);
        TextView goodName = convertView.findViewById(R.id.goodName);
        TextView goodName1 = convertView.findViewById(R.id.goodName1);
        TextView goodPrice = convertView.findViewById(R.id.goodPrice);
        TextView goodPrice1  = convertView.findViewById(R.id.goodPrice1);
        goodName.setText(list.get(position).getTitle());
        goodName1.setText(list.get(position).getTitle());
        goodPrice.setText(list.get(position).getPscid());
        goodPrice1.setText(list.get(position).getPid());
        return convertView;
    }
}
