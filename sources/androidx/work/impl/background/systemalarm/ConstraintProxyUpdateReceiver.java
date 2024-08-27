package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.u;
import b8.l;
import h.c;
import l.g;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2594a = u.C("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            u.w().u(f2594a, String.format("Ignoring unknown action %s", str), new Throwable[0]);
        } else {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            ((c) l.c(context).f4111d).n(new g(this, intent, context, goAsync, 1));
        }
    }
}
