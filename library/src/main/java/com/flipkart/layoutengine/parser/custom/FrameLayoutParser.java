package com.flipkart.layoutengine.parser.custom;

import android.app.Activity;

import com.flipkart.layoutengine.parser.Parser;
import com.flipkart.layoutengine.parser.ViewParser;
import com.flipkart.layoutengine.parser.WrappableParser;
import com.flipkart.layoutengine.widgets.AspectRatioFrameLayout;

/**
 * Created by kiran.kumar on 12/05/14.
 */
public class FrameLayoutParser extends WrappableParser<AspectRatioFrameLayout>{

    public FrameLayoutParser(Parser<AspectRatioFrameLayout> parentParser)
    {
        super(AspectRatioFrameLayout.class,parentParser);
    }

    @Override
    protected void prepareHandlers(Activity activity) {
        super.prepareHandlers(activity);
        addHandler("heightRatio",new AttributeProcessor<AspectRatioFrameLayout>() {
            @Override
            public void handle(String attributeKey, String attributeValue, AspectRatioFrameLayout view) {
                view.setAspectRatioHeight(Integer.parseInt(attributeValue));

            }
        });
        addHandler("widthRatio",new AttributeProcessor<AspectRatioFrameLayout>() {
            @Override
            public void handle(String attributeKey, String attributeValue, AspectRatioFrameLayout view) {
                view.setAspectRatioWidth(Integer.parseInt(attributeValue));

            }
        });
    }
}