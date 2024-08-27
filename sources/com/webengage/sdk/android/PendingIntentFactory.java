package com.webengage.sdk.android;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.webengage.sdk.android.actions.render.CallToAction;
import com.webengage.sdk.android.actions.render.PushNotificationData;
import com.webengage.sdk.android.actions.render.j;
import in.juspay.hyper.constants.LogCategory;

/* loaded from: classes2.dex */
public class PendingIntentFactory {
    public static PendingIntent a(long j10, Context context) {
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) WebEngageReceiver.class);
        intent.setAction("com.webengage.sdk.android.intent.ACTION");
        intent.putExtra(LogCategory.ACTION, "page_delay_event");
        intent.putExtra("delay_value", j10);
        return PendingIntent.getBroadcast(context.getApplicationContext(), ("we_wk_page_delay" + j10).hashCode(), intent, 201326592);
    }

    public static PendingIntent b(long j10, Context context) {
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) WebEngageReceiver.class);
        intent.setAction("com.webengage.sdk.android.intent.ACTION");
        intent.putExtra(LogCategory.ACTION, "session_delay_event");
        intent.putExtra("delay_value", j10);
        return PendingIntent.getBroadcast(context.getApplicationContext(), ("we_wk_session_delay" + j10).hashCode(), intent, 201326592);
    }

    public static PendingIntent c(Context context) {
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) WebEngageReceiver.class);
        intent.setAction("com.webengage.sdk.android.intent.ACTION");
        return PendingIntent.getBroadcast(context.getApplicationContext(), -332307830, intent, 201326592);
    }

    public static PendingIntent constructCarouselBrowsePendingIntent(Context context, PushNotificationData pushNotificationData, int i10, String str, String str2, Bundle bundle) {
        pushNotificationData.setCurrentIndex(i10);
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("navigation", str);
        bundle.putInt("current", i10);
        bundle.putBoolean("autcarousel_activated", false);
        return constructRerenderPendingIntent(context, pushNotificationData, str2, bundle);
    }

    public static PendingIntent constructPushClickPendingIntent(Context context, PushNotificationData pushNotificationData, CallToAction callToAction, boolean z10) {
        return new j.b(context, pushNotificationData, callToAction).b(z10).a("push_notification_click").a();
    }

    public static PendingIntent constructPushDeletePendingIntent(Context context, PushNotificationData pushNotificationData) {
        return new j.b(context, pushNotificationData, "notification_close").a();
    }

    public static PendingIntent constructPushRatingSubmitPendingIntent(Context context, PushNotificationData pushNotificationData, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("we_wk_rating", i10);
        return new j.b(context, pushNotificationData, pushNotificationData.getRatingV1().getSubmitCTA()).a("push_notification_rating_submitted").a(bundle).b("rating_v1_submit").a(false).a();
    }

    public static PendingIntent constructRerenderPendingIntent(Context context, PushNotificationData pushNotificationData, String str, Bundle bundle) {
        return new j.b(context, pushNotificationData, str).b(bundle).c(true).a();
    }

    public static PendingIntent d(Context context) {
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) WebEngageReceiver.class);
        intent.setAction("com.webengage.sdk.android.intent.ACTION");
        intent.putExtra(LogCategory.ACTION, "sync");
        return PendingIntent.getBroadcast(context.getApplicationContext(), 1217210471, intent, 201326592);
    }

    public static PendingIntent e(Context context) {
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) WebEngageReceiver.class);
        intent.setAction("com.webengage.sdk.android.intent.ACTION");
        intent.putExtra(LogCategory.ACTION, "session_destroy");
        return PendingIntent.getBroadcast(context.getApplicationContext(), -965361532, intent, 201326592);
    }

    public static PendingIntent f(Context context) {
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) WebEngageReceiver.class);
        intent.setAction("com.webengage.sdk.android.intent.ACTION");
        intent.putExtra(LogCategory.ACTION, "user_profile");
        return PendingIntent.getBroadcast(context.getApplicationContext(), 1216225589, intent, 201326592);
    }

    public static boolean g(Context context) {
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) WebEngageReceiver.class);
        intent.setAction("com.webengage.sdk.android.intent.ACTION");
        return PendingIntent.getBroadcast(context.getApplicationContext(), -332307830, intent, 603979776) != null;
    }

    public static PendingIntent a(Context context) {
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) WebEngageReceiver.class);
        intent.setAction("com.webengage.sdk.android.intent.ACTION");
        intent.putExtra(LogCategory.ACTION, "config_refresh");
        return PendingIntent.getBroadcast(context.getApplicationContext(), 200497886, intent, 201326592);
    }

    public static PendingIntent b(Context context) {
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) WebEngageReceiver.class);
        intent.setAction("com.webengage.sdk.android.intent.ACTION");
        return PendingIntent.getBroadcast(context.getApplicationContext(), -393802155, intent, 201326592);
    }

    public static PendingIntent a(Context context, int i10, int i11) {
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) WebEngageReceiver.class);
        intent.setAction("com.webengage.sdk.android.intent.ACTION");
        intent.putExtra(LogCategory.ACTION, "amplify");
        return PendingIntent.getBroadcast(context, i10, intent, i11);
    }

    public static PendingIntent a(String str, long j10, Context context) {
        if (str.equals("we_wk_page_delay")) {
            return a(j10, context);
        }
        if (str.equals("we_wk_session_delay")) {
            return b(j10, context);
        }
        return null;
    }
}
