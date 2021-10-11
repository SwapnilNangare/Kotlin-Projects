package com.example.intentservice

import android.app.IntentService
import android.content.Intent
import android.util.Log

class Myintenat:IntentService("Myintenat")
{
    override fun onHandleIntent(p0: Intent?) {
   for(i in 1..5)
    {
     Log.d("Myintenat","Service doing someting. "+i)
      Thread.sleep(1000)
     }


    }
}