package com.example.mytestlibad;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ToastMessage {

    public static void showSimpleToast(Context context, String message) {
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_toast_layout, null, false);
        TextView textView = view.findViewById(R.id.toastText);
        textView.setText(message);
        view.setBackground(context.getResources().getDrawable(R.drawable.normal_shape));
        toast.setView(view);
        toast.show();
    }

    public static void showSuccessToast(Context context, String message, int drawable) {
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        View view = LayoutInflater.from(context).inflate(R.layout.success_toast_layout, null, false);
        TextView textView = view.findViewById(R.id.tvSuccess);
        ImageView imageView = view.findViewById(R.id.imgView);
        textView.setText(message);
        imageView.setImageDrawable(context.getResources().getDrawable(drawable));
        view.setBackground(context.getResources().getDrawable(R.drawable.shape_rect));

        toast.setView(view);
        toast.show();
    }

    public static void showSuccessToast(Context context, String message) {
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        View view = LayoutInflater.from(context).inflate(R.layout.success_toast_layout, null, false);
        TextView textView = view.findViewById(R.id.tvSuccess);
        ImageView imageView = view.findViewById(R.id.imgView);
        textView.setText(message);
        imageView.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_success_white));
        view.setBackground(context.getResources().getDrawable(R.drawable.shape_rect));
        toast.setView(view);
        toast.show();
    }


    public static void showErrorToast(Context context, String message, int drawable) {
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        View view = LayoutInflater.from(context).inflate(R.layout.success_toast_layout, null, false);
        TextView textView = view.findViewById(R.id.tvSuccess);
        ImageView imageView = view.findViewById(R.id.imgView);
        textView.setText(message);
        imageView.setImageDrawable(context.getResources().getDrawable(drawable));
        view.setBackground(context.getResources().getDrawable(R.drawable.failure_rect_shape));
        toast.setView(view);
        toast.show();
    }

    public static void showErrorToast(Context context, String message) {
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        View view = LayoutInflater.from(context).inflate(R.layout.success_toast_layout, null, false);
        TextView textView = view.findViewById(R.id.tvSuccess);
        ImageView imageView = view.findViewById(R.id.imgView);
        textView.setText(message);
        imageView.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_error));
        view.setBackground(context.getResources().getDrawable(R.drawable.failure_rect_shape));
        toast.setView(view);
        toast.show();
    }
}
