package com.assetgro.stockgro.ui.social.presentation;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/assetgro/stockgro/ui/social/presentation/SocialShareBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SocialShareBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
            Intent intent2 = new Intent("SOCIAL_SHARE_ACTION");
            if (componentName != null) {
                str = componentName.getPackageName();
            } else {
                str = null;
            }
            Intent putExtra = intent2.putExtra("TARGET_APP", String.valueOf(str));
            Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
            context.sendBroadcast(putExtra);
        } catch (Exception e10) {
            FirebaseCrashlytics.getInstance().recordException(e10);
        }
    }
}
