## LoadingLayout

方便的切换到加载中，空页面，出错页面和内容页面

![效果图](https://github.com/XMFE-TEAM/LoadingLayout/raw/master/demo/demo.gif)

LoadingLayout集成自Framelayout，默认把第一个子view当做内容视图，其他的子view会被忽略

使用如下：

```
<com.xiaomagouche.loadinglayout.library.LoadingLayout
    android:id="@+id/loading_layout"
    android:layout_width="match_parent"
    android:layout_height="0dp"
    android:layout_weight="1">
  <RelativeLayout
      android:layout_width="match_parent"
      android:layout_height="match_parent"
      >
    <TextView
        android:layout_centerInParent="true"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="This is Content View"
        />
  </RelativeLayout>
</com.xiaomagouche.loadinglayout.library.LoadingLayout>
```

可以通过代码来切换到不同的view

```
final LoadingLayout loadingLayout = (LoadingLayout) findViewById(R.id.loading_layout);
findViewById(R.id.btn_show_content).setOnClickListener((view) -> loadingLayout.showContent());
findViewById(R.id.btn_show_error).setOnClickListener((view) -> loadingLayout.showError());
findViewById(R.id.btn_show_empty).setOnClickListener((view) -> loadingLayout.showEmpty());
findViewById(R.id.btn_show_loading).setOnClickListener((view) -> loadingLayout.showLoading());
```

另外，针对errorView和emptyView，提供了两个重新加载的按钮。
需要注意的是,这里的重新加载的按钮的id必须是btn_error_retry或者btn_empty_retry
```
loadingLayout.setOnRetryClickListener((view) -> loadingLayout.showLoading());
```

当然，你也可以自己自定义各种视图
```
<com.xiaomagouche.loadinglayout.library.LoadingLayout
      android:id="@+id/loading_layout"
      android:layout_width="match_parent"
      android:layout_height="0dp"
      android:layout_weight="1"
      app:emptyView="@layout/custom_empty_view"
      app:loadingView="@layout/custom_loading_view">
    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        >
      <TextView
          android:layout_centerInParent="true"
          android:layout_width="wrap_content"
          android:layout_height="wrap_content"
          android:text="This is Content View"
          />
    </RelativeLayout>
</com.xiaomagouche.loadinglayout.library.LoadingLayout>
```

## Gradle中使用

推荐使用jitpack
```
repositories {
    // ...
    maven { url "https://jitpack.io" }
}

dependencies {
    compile 'com.github.lzyzsd:XMFE-TEAM:LoadingLayout:0.1.0'
}
```


## License

MIT
