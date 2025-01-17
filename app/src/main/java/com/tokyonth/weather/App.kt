package com.tokyonth.weather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import com.biubiu.eventbus.EventBusInitializer

class App : Application() {

    companion object {

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
            private set

    }

    override fun onCreate() {
        super.onCreate()


        //嘿嘿测试
        //继续提交
        //1
        EventBusInitializer.init(this)
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        if (base != null) {
            context = base
        }
    }

}
