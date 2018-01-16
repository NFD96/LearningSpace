package com.example.danutneagu.magicsaloons.com.example.danutneagu.magicsaloons;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;

/**
 * Created by Danut Neagu on 1/12/2018.
 */

//public class RecyclerItemClickListener implements RecyclerView.OnItemTouchListener {
//    private AdapterView.OnItemClickListener mListener;
//
//    public interface OnItemClickListener {
//        public void onItemClick(View view, int position);
//    }
//
//    GestureDetector mGestureDetector;
//
//    public RecyclerItemClickListener(Context context, OnItemClickListener listener) {
//        this.mListener = (AdapterView.OnItemClickListener) listener;
//        mGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
//            @Override
//            public boolean onSingleTapUp(MotionEvent e) {
//                return true;
//            }
//        });
//    }
//
//
//    @Override
//    public boolean onInterceptTouchEvent(RecyclerView view, MotionEvent e) {
//        View childView = view.findChildViewUnder(e.getX(), e.getY());
//        if (childView != null && mListener != null && mGestureDetector.onTouchEvent(e)) {
//            mListener.onItemClick(childView, view.getChildAdapterPosition(childView));
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public void onTouchEvent(RecyclerView view, MotionEvent motionEvent) {
//
//    }
//
//    @Override
//    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
//
//    }
//
//
//}
