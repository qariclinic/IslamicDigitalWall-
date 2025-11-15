package com.example.islamicdigitalwall

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import androidx.core.app.NotificationCompat
import androidx.work.Worker
import androidx.work.WorkerParameters

class NotificationWorker(context: Context, params: WorkerParameters) : Worker(context, params) {
    override fun doWork(): Result {
        val notificationManager = applicationContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val channel = NotificationChannel("adhan", "Adhan Notifications", NotificationManager.IMPORTANCE_HIGH)
        notificationManager.createNotificationChannel(channel)

        val notification = NotificationCompat.Builder(applicationContext, "adhan")
            .setContentTitle("آذان کا وقت")
            .setContentText("نماز کا وقت ہو گیا ہے!")
            .setSmallIcon(R.drawable.ic_mosque)
            .setSound(android.net.Uri.parse("android.resource://${applicationContext.packageName}/${R.raw.adhan_sound}"))
            .build()

        notificationManager.notify(1, notification)
        return Result.success()
    }
}
