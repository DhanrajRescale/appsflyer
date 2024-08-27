package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.u;
import b8.l;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2595a = u.C("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        u.w().u(f2595a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            l c10 = l.c(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            c10.getClass();
            synchronized (l.f4107l) {
                try {
                    c10.f4116i = goAsync;
                    if (c10.f4115h) {
                        goAsync.finish();
                        c10.f4116i = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IllegalStateException e10) {
            u.w().v(f2595a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
