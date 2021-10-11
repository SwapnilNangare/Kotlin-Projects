package com.example.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.os.Message
import android.util.Log
import android.view.View
import java.security.Provider

class Service: Service()
{
    val TAG="Service"
    override fun onBind(intent: Intent?): IBinder? {
       // ShowLog("onBind")

        return null
    }

    override fun onCreate() {
        ShowLog("onCreate")
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        ShowLog("onStartCommand")


        val runable= Runnable { for(i in 1..5)
        {
            ShowLog("i am swapnil "+i.toString())
            Thread.sleep(1000)
        }
        }

        val thred=Thread(runable)
        thred.start()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        ShowLog("onDestroy")
        super.onDestroy()
    }

    fun ShowLog(message: String) {
        Log.d(TAG,message)
    }
}