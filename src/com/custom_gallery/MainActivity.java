package com.custom_gallery;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	public Boolean isOpenPic1 = false;
	public Boolean isOpenPic2 = false;
	public Boolean isOpenPic3 = false;	
	public Boolean isOpenPic4 = false;
	public Boolean isOpenPic5 = false;
	public Boolean isOpenPic6 = false;
	public Boolean isOpenPic7 = false;
	
	
	public LinearLayout TextDino_1;
	public ImageView PicDino_1;
	public TextView TextDino_2;
	public ImageView PicDino_2;
	public TextView TextDino_3;
	public ImageView PicDino_3;
	public TextView TextDino_4;
	public ImageView PicDino_4;
	public TextView TextDino_5;
	public ImageView PicDino_5;
	public TextView TextDino_6;
	public ImageView PicDino_6;
	public TextView TextDino_7;
	public ImageView PicDino_7;
	
	public Button BtnAr_1;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextDino_1 = (LinearLayout) findViewById(R.id.LinearPic1);
		TextDino_2 = (TextView) findViewById(R.id.TextDino_2);
		TextDino_3 = (TextView) findViewById(R.id.TextDino_3);
		TextDino_4 = (TextView) findViewById(R.id.TextDino_4);
		TextDino_5 = (TextView) findViewById(R.id.TextDino_5);
		TextDino_6 = (TextView) findViewById(R.id.TextDino_6);
		TextDino_7 = (TextView) findViewById(R.id.TextDino_7);
		
		PicDino_1 = (ImageView) findViewById(R.id.PicDino_1);
		PicDino_2 = (ImageView) findViewById(R.id.PicDino_2);
		PicDino_3 = (ImageView) findViewById(R.id.PicDino_3);
		PicDino_4 = (ImageView) findViewById(R.id.PicDino_4);
		PicDino_5 = (ImageView) findViewById(R.id.PicDino_5);
		PicDino_6 = (ImageView) findViewById(R.id.PicDino_6);
		PicDino_7 = (ImageView) findViewById(R.id.PicDino_7);
		
		PicDino_1.setOnClickListener(this);
		PicDino_2.setOnClickListener(this);
		PicDino_3.setOnClickListener(this);
		PicDino_4.setOnClickListener(this);
		PicDino_5.setOnClickListener(this);
		PicDino_6.setOnClickListener(this);
		PicDino_7.setOnClickListener(this);
		
		BtnAr_1 = (Button) findViewById(R.id.BtnAr_1);
		BtnAr_1.setOnClickListener(this);
		//BtnAr_1.setBackgroundColor(Color.TRANSPARENT);
		//BtnAr_1.setTextColor(Color.TRANSPARENT);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {

		case R.id.PicDino_1:
			//Toast.makeText(getBaseContext(), "State isOpenPic1: " +isOpenPic1,Toast.LENGTH_SHORT).show();
			isOpenPic1 = !isOpenPic1;
			if (isOpenPic1 == true) {
				TextDino_1.setVisibility(View.VISIBLE);
				TextDino_2.setVisibility(View.GONE);
				TextDino_3.setVisibility(View.GONE);
				TextDino_4.setVisibility(View.GONE);
				TextDino_5.setVisibility(View.GONE);
				TextDino_6.setVisibility(View.GONE);
				TextDino_7.setVisibility(View.GONE);
				
				isOpenPic2 = false;
				isOpenPic3 = false;
				isOpenPic4 = false;
				isOpenPic5 = false;
				isOpenPic6 = false;
				isOpenPic7 = false;
				
				//Toast.makeText(getBaseContext(), "Visible_Pic1",Toast.LENGTH_SHORT).show();
			} else
				TextDino_1.setVisibility(View.GONE);
			break;

		case R.id.PicDino_2:
			//Toast.makeText(getBaseContext(), "State isOpenPic2: " +isOpenPic2,Toast.LENGTH_SHORT).show();
			isOpenPic2 = !isOpenPic2;
			if (isOpenPic2 == true) {
				TextDino_1.setVisibility(View.GONE);
				TextDino_2.setVisibility(View.VISIBLE);
				TextDino_3.setVisibility(View.GONE);
				TextDino_4.setVisibility(View.GONE);
				TextDino_5.setVisibility(View.GONE);
				TextDino_6.setVisibility(View.GONE);
				TextDino_7.setVisibility(View.GONE);

				isOpenPic1 = false;
				isOpenPic3 = false;
				isOpenPic4 = false;
				isOpenPic5 = false;
				isOpenPic6 = false;
				isOpenPic7 = false;
				//Toast.makeText(getBaseContext(), "Visible_Pic2",Toast.LENGTH_SHORT).show();
			}

			else
				TextDino_2.setVisibility(View.GONE);
			break;

		case R.id.PicDino_3:
			//Toast.makeText(getBaseContext(), "State isOpenPic2: " +isOpenPic2,Toast.LENGTH_SHORT).show();
			isOpenPic3 = !isOpenPic3;
			if (isOpenPic3 == true) {
				TextDino_1.setVisibility(View.GONE);
				TextDino_2.setVisibility(View.GONE);
				TextDino_3.setVisibility(View.VISIBLE);
				TextDino_4.setVisibility(View.GONE);
				TextDino_5.setVisibility(View.GONE);
				TextDino_6.setVisibility(View.GONE);
				TextDino_7.setVisibility(View.GONE);

				isOpenPic1 = false;
				isOpenPic2 = false;
				isOpenPic4 = false;
				isOpenPic5 = false;
				isOpenPic6 = false;
				isOpenPic7 = false;
				//Toast.makeText(getBaseContext(), "Visible_Pic2",Toast.LENGTH_SHORT).show();
			}

			else
				TextDino_3.setVisibility(View.GONE);
			break;
			
		case R.id.PicDino_4:
			//Toast.makeText(getBaseContext(), "State isOpenPic2: " +isOpenPic2,Toast.LENGTH_SHORT).show();
			isOpenPic4 = !isOpenPic4;
			if (isOpenPic4 == true) {
				TextDino_1.setVisibility(View.GONE);
				TextDino_2.setVisibility(View.GONE);
				TextDino_3.setVisibility(View.GONE);
				TextDino_4.setVisibility(View.VISIBLE);
				TextDino_5.setVisibility(View.GONE);
				TextDino_6.setVisibility(View.GONE);
				TextDino_7.setVisibility(View.GONE);

				isOpenPic1 = false;
				isOpenPic2 = false;
				isOpenPic3 = false;
				isOpenPic5 = false;
				isOpenPic6 = false;
				isOpenPic7 = false;
				//Toast.makeText(getBaseContext(), "Visible_Pic2",Toast.LENGTH_SHORT).show();
			}

			else
				TextDino_4.setVisibility(View.GONE);
			break;
			
		case R.id.PicDino_5:
			//Toast.makeText(getBaseContext(), "State isOpenPic2: " +isOpenPic2,Toast.LENGTH_SHORT).show();
			isOpenPic5 = !isOpenPic5;
			if (isOpenPic5 == true) {
				TextDino_1.setVisibility(View.GONE);
				TextDino_2.setVisibility(View.GONE);
				TextDino_3.setVisibility(View.GONE);
				TextDino_4.setVisibility(View.GONE);
				TextDino_5.setVisibility(View.VISIBLE);
				TextDino_6.setVisibility(View.GONE);
				TextDino_7.setVisibility(View.GONE);

				isOpenPic1 = false;
				isOpenPic2 = false;
				isOpenPic3 = false;
				isOpenPic4 = false;
				isOpenPic6 = false;
				isOpenPic7 = false;
				//Toast.makeText(getBaseContext(), "Visible_Pic2",Toast.LENGTH_SHORT).show();
			}

			else
				TextDino_5.setVisibility(View.GONE);
			break;
			
		case R.id.PicDino_6:
			//Toast.makeText(getBaseContext(), "State isOpenPic2: " +isOpenPic2,Toast.LENGTH_SHORT).show();
			isOpenPic6 = !isOpenPic6;
			if (isOpenPic6 == true) {
				TextDino_1.setVisibility(View.GONE);
				TextDino_2.setVisibility(View.GONE);
				TextDino_3.setVisibility(View.GONE);
				TextDino_4.setVisibility(View.GONE);
				TextDino_5.setVisibility(View.GONE);
				TextDino_6.setVisibility(View.VISIBLE);
				TextDino_7.setVisibility(View.GONE);

				isOpenPic1 = false;
				isOpenPic2 = false;
				isOpenPic3 = false;
				isOpenPic4 = false;
				isOpenPic5 = false;
				isOpenPic7 = false;
				//Toast.makeText(getBaseContext(), "Visible_Pic2",Toast.LENGTH_SHORT).show();
			}

			else
				TextDino_6.setVisibility(View.GONE);
			break;
			
		case R.id.PicDino_7:
			//Toast.makeText(getBaseContext(), "State isOpenPic2: " +isOpenPic2,Toast.LENGTH_SHORT).show();
			isOpenPic7 = !isOpenPic7;
			if (isOpenPic7 == true) {
				TextDino_1.setVisibility(View.GONE);
				TextDino_2.setVisibility(View.GONE);
				TextDino_3.setVisibility(View.GONE);
				TextDino_4.setVisibility(View.GONE);
				TextDino_5.setVisibility(View.GONE);
				TextDino_6.setVisibility(View.GONE);
				TextDino_7.setVisibility(View.VISIBLE);

				isOpenPic1 = false;
				isOpenPic2 = false;
				isOpenPic3 = false;
				isOpenPic4 = false;
				isOpenPic5 = false;
				isOpenPic6 = false;
				//Toast.makeText(getBaseContext(), "Visible_Pic2",Toast.LENGTH_SHORT).show();
			}

			else
				TextDino_7.setVisibility(View.GONE);
			break;	
		
		case R.id.BtnAr_1:
			Toast.makeText(getBaseContext(), "AR_1",Toast.LENGTH_SHORT).show();
			break;
		
		default:

			break;
		}

	}
}
