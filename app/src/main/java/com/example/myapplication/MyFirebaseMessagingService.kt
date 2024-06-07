package com.example.myapplication

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        Log.e("anime", remoteMessage.notification?.body.toString())
    }

    override fun onNewToken(newToken: String) {
        super.onNewToken(newToken)
        Log.e("anime", "onNewToken $newToken")
    }
}
