package net.kwmt27.notificationlistenersample

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.util.Log

class NotificationService : NotificationListenerService() {

    companion object {
        private val TAG = NotificationService::class.java.simpleName
    }

    override fun onBind(intent: Intent?): IBinder? {
        Log.d(TAG, "onbind called")
        return super.onBind(intent)
    }

    override fun onListenerConnected() {
        Log.d(TAG, "onListenerConnected called")
        super.onListenerConnected()
    }

    override fun onListenerDisconnected() {
        Log.d(TAG, "onListenerDisconnected called")
        super.onListenerDisconnected()
    }

    override fun onNotificationPosted(sbn: StatusBarNotification?) {
        Log.d(TAG, "onNotificationPosted1 called")
        super.onNotificationPosted(sbn)
    }

    override fun onNotificationPosted(sbn: StatusBarNotification?, rankingMap: RankingMap?) {
        Log.d(TAG, "onNotificationPosted2 called")
        super.onNotificationPosted(sbn, rankingMap)
    }
}

