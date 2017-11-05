package com.qizu.chenming20171101;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.qizu.chenming20171101.adapter.Myadapter;
import com.qizu.chenming20171101.bean.MyBean;
import com.qizu.chenming20171101.xlistview.XListView;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity  {

    private List<MyBean.DataBean> data = new ArrayList<>();
    private XListView xListView;
    private Handler handler;
    private DrawerLayout drawerLayout;
    private ImageView image;
    private Myadapter myadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        initView();
//        handler = new Handler() {
//            @Override
//            public void publish(LogRecord record) {
//
//            }
//
//            @Override
//            public void flush() {
//
//            }
//
//            @Override
//            public void close() throws SecurityException {
//
//            }
//        };
//            myadapter = new Myadapter();
//        initdata();
//    }
//
//    private void initView() {
//        xListView = (XListView) findViewById(R.id.xlistview);
//        drawerLayout = (DrawerLayout) findViewById(R.id.draw);
//        image = (ImageView) findViewById(R.id.image);
//        xListView.setPullLoadEnable(true);
//        //接口回调一定要配, 容易忘记;
//        xListView.setXListViewListener(this);
//    }
//
//    private void initdata(){
//        new MyAsyncTaskString().execute("http://120.27.23.105/product/getProducts?pscid=39&page=1");
//    }
//
//    @Override
//    public void onRefresh() {
//        data.clear();
//        initdata();
//        onLoad();
//    }
//
//    @Override
//    public void onLoadMore() {
//        initdata();
//        onLoad();
//    }
//
//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
//            this.finish();
//        }
//        return false;
//    }
//    class MyAsyncTaskString extends AsyncTask<String,Void,String>{
//
//        @Override
//        protected String doInBackground(String... params) {
//            return null;
//        }
//
//        @Override
//        protected void onPreExecute() {
//            super.onPreExecute();
//        }
//
//        @Override
//        protected void onPostExecute(String s) {
//            super.onPostExecute(s);
//            Gson gson = new Gson();
//            MyBean.DataBean goods = gson.fromJson(s, MyBean.DataBean.class);
//            int tempList = goods.getPscid();
//            myadapter.notifyDataSetChanged();
//
//        }
//    }
//    class MyAsyncTaskImage extends AsyncTask<String, Void,Bitmap>{
//        private ImageView image;
//        public MyAsyncTaskImage(ImageView image) {
//            this.image = image;
//        }
//        @Override
//        protected Bitmap doInBackground(String... params) {
//            return null;
//        }
//
//        @Override
//        protected void onPreExecute() {
//            super.onPreExecute();
//        }
//
//        @Override
//        protected void onPostExecute(Bitmap bitmap) {
//            super.onPostExecute(bitmap);
//            image.setImageBitmap(bitmap);
//        }
//
//        @Override
//        protected void onProgressUpdate(Void... values) {
//            super.onProgressUpdate(values);
//        }
//
//    }
//
//    public void onLoad() {
//        xListView.stopRefresh();
//        xListView.stopLoadMore();
//        xListView.setRefreshTime("刚刚");
//    }
    }
}