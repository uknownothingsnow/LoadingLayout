package com.xiaomagouche.com.loadinglayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.xiaomagouche.loadinglayout.library.LoadingLayout;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final LoadingLayout loadingLayout = (LoadingLayout) findViewById(R.id.loading_layout);
    findViewById(R.id.btn_show_content).setOnClickListener((view) -> loadingLayout.showContent());
    findViewById(R.id.btn_show_error).setOnClickListener((view) -> loadingLayout.showError());
    findViewById(R.id.btn_show_empty).setOnClickListener((view) -> loadingLayout.showEmpty());
    findViewById(R.id.btn_show_loading).setOnClickListener((view) -> loadingLayout.showLoading());

    loadingLayout.setOnRetryClickListener((view) -> loadingLayout.showLoading());
  }
}
