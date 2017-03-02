package com.nineinfosys.android.recyclerviewadswithazure;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by Dev on 02-03-2017.
 */

public class ContentHolder extends FrameLayout{
    TextView textViewContent;
    public ContentHolder (Context context){
        super(context);
        inflate(context, R.layout.content_holder, this);
        textViewContent = (TextView)findViewById(R.id.textViewContent);
    }
    public void bind(String str){
        textViewContent.setText(str);
    }
}
