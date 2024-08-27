package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.u;
import androidx.work.w;
import androidx.work.x;
import b8.l;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2602a = u.C("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = f2602a;
        u.w().u(str, "Requesting diagnostics", new Throwable[0]);
        try {
            l.c(context).a((x) new w(DiagnosticsWorker.class).a());
        } catch (IllegalStateException e10) {
            u.w().v(str, "WorkManager is not initialized", e10);
        }
    }
}
