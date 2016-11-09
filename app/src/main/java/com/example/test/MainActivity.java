package com.example.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
/**
 * 实现对listView的循环滚动 
 * @author gerry
 *
 */
public class MainActivity extends Activity{

	private ListView listView;
	private List<String> list;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView1);
        list = getList();
        new Timer().schedule(new TimeTaskScroll(this, listView,list), 20, 20);
    }

    /**
     * 获取数据
     * @return
     */
    public List<String> getList(){
    	List<String> list =  new ArrayList<String>();
    	for (int i = 0; i < 10; i++) {
			list.add(String.valueOf(i));
		}
    	return list;
    }

}
