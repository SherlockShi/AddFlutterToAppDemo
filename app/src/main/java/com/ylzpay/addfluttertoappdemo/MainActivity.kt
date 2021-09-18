package com.ylzpay.addfluttertoappdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import io.flutter.embedding.android.FlutterActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnOpenFlutterPage).setOnClickListener {
            startActivity(
                FlutterActivity
                    .withCachedEngine(Constants.FLUTTER_ENGINE_ID)
                    .build(this)
            )
        }
    }
}