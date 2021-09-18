package com.ylzpay.addfluttertoappdemo

import android.app.Application
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.embedding.engine.dart.DartExecutor

/**
 *  Author:      SherlockShi
 *  Email:       sherlock_shi@163.com
 *  Date:        2021-09-18 14:03
 *  Description:
 */
class MyApplication : Application() {

    lateinit var flutterEngine : FlutterEngine

    override fun onCreate() {
        super.onCreate()

        // Instantiate a FlutterEngine.
        flutterEngine = FlutterEngine(this)

        // Start executing Dart code to pre-warm the FlutterEngine.
        flutterEngine.dartExecutor.executeDartEntrypoint(
            DartExecutor.DartEntrypoint.createDefault()
        )

        // Cache the FlutterEngine to be used by FlutterActivity.
        FlutterEngineCache
            .getInstance()
            .put(Constants.FLUTTER_ENGINE_ID, flutterEngine)
    }
}