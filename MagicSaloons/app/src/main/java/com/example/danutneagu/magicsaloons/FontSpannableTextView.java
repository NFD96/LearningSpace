package com.example.danutneagu.magicsaloons;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v7.widget.AppCompatTextView;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.Log;

/**
 * Created by Danut Neagu on 9/18/2017.
 */

public class FontSpannableTextView extends AppCompatTextView {

    public FontSpannableTextView(Context context) {
        super(context);
    }

    public FontSpannableTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setColorPartialString(context, attrs);
    }

    public FontSpannableTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setColorPartialString(context, attrs);
    }

    private void setColorPartialString(Context context, AttributeSet attrs) {
        if (isInEditMode()) {
            return;
        }
        String partialText = null;
        int partialTextColor = Integer.MIN_VALUE;

        if (attrs != null) {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.FontSpannableTextView);
            for (int i = 0; i < a.getIndexCount(); i++) {
                int attr = a.getIndex(i);
                switch (attr) {
                    case R.styleable.FontSpannableTextView_fontspannabletextview_partialText:
                        partialText = a.getString(attr);
                        break;
                    case R.styleable.FontSpannableTextView_fontspannabletextview_partialTextColor:
                        partialTextColor = a.getColor(attr, Color.BLACK);
                        break;
                }
            }
            a.recycle();
        }

        if (partialText != null && partialTextColor != Integer.MIN_VALUE) {
            String wholeText = getText().toString();
            Spannable spannable = new SpannableString(wholeText);
            spannable.setSpan(new ForegroundColorSpan(partialTextColor),
                    wholeText.indexOf(partialText),
                    wholeText.indexOf(partialText) + partialText.length(),
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            setText(spannable);
        } else {
            Log.e("TextView Color Changer:"," You must provide both partialText and partialTextColor values");
        }
    }
}
