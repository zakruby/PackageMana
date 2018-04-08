package com.example.hp.packagemana;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FilterApplication  extends AppCompatActivity implements OnClickListener{

	private Button btallapp; // 所有应用程序
	private Button btsystemapp;// 系统程序
	private Button btthirdapp; // 第三方应用程序
	private Button btsdcardapp; // 安装在SDCard的应用程序
	
	private int filter = MainActivity.FILTER_ALL_APP; 
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		// 初始化控件并监听
		btallapp =  findViewById(R.id.btallapp);
		btsystemapp = findViewById(R.id.btsystemapp);
		btthirdapp =  findViewById(R.id.btthirdapp);
		btsdcardapp = findViewById(R.id.btsdcardapp);
		btallapp.setOnClickListener(this);
		btsystemapp.setOnClickListener(this);
		btthirdapp.setOnClickListener(this);
		btsdcardapp.setOnClickListener(this);
	}
	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		System.out.println(""+view.getId());
		switch(view.getId()){
		case R.id.btallapp	:
			filter = MainActivity.FILTER_ALL_APP ;
			break ;
		case R.id.btsystemapp:
			filter = MainActivity.FILTER_SYSTEM_APP ;
			break ;
		case R.id.btthirdapp:
			filter = MainActivity.FILTER_THIRD_APP ;
			break ;
		case R.id.btsdcardapp:
			filter = MainActivity.FILTER_SDCARD_APP ;
			break ;
		}
		Intent intent = new Intent(getBaseContext(),MainActivity.class) ;
		intent.putExtra("filter", filter) ;
		startActivity(intent);
	}

}
