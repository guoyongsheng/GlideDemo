package xmen.doshr.com.glidedemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends Activity
{
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView()
    {
        imageView = (ImageView) findViewById(R.id.image_view);
       // String url = "file:///storage/emulated/0/MIUI/Gallery/cloud/.thumbnailFile/0ae4bc0bfc9cd78e9446cd53dec5f8b916c6114c.jpg";
        //String url = "content://media/external/images/media/44732";
        String url = "http://www.baodaogardenhotel.net/article/UploadPic/2007/11/1/200711171421180.gif";
        Glide.with(this).load(url).asGif().into(imageView);
    }
}
