package com.example.firebasedatabase13072020;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1 : Lưu dữ liệu dạng string
//        myRef.child("Trungtam").setValue("Khoa Phạm Training").addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if (task.isSuccessful()){
//                    Toast.makeText(MainActivity.this, "Thêm thành công", Toast.LENGTH_SHORT).show();
//                }else{
//                    Toast.makeText(MainActivity.this, "Thất bại", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
        // 2 : Lưu dạng List
//        List<String> listNames = new ArrayList<>();
//        listNames.add("Nguyen Van A");
//        listNames.add("Nguyen Van B");
//        listNames.add("Nguyen Van C");
//        listNames.add("Nguyen Van D");
//
//        myRef.child("Listnames").setValue(listNames).addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if (task.isSuccessful()){
//                    Toast.makeText(MainActivity.this, "Thêm thành công", Toast.LENGTH_SHORT).show();
//                }else{
//                    Toast.makeText(MainActivity.this, "Thất bại", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
        // 3 : Lưu dạng object
//        Vehicle bicycle = new Vehicle("Bicycle",2);
//        myRef.child("Vehicle").setValue(bicycle).addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if (task.isSuccessful()){
//                    Toast.makeText(MainActivity.this, "Thêm thành công", Toast.LENGTH_SHORT).show();
//                }else{
//                    Toast.makeText(MainActivity.this, "Thất bại", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
        // 4 : Lưu dạng mảng object
        myRef.child("Course").push().setValue(new Course("Lập trình Android","Java,Kotlin"));
        myRef.child("Course").push().setValue(new Course("Lập trình Php","Php"));
        myRef.child("Course").push().setValue(new Course("Lập trình Ios","Swift"));

    }
}