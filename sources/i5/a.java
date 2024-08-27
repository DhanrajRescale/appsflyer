package i5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes.dex */
public final class a extends BroadcastReceiver implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f19342a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f19343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f19344c;

    public a(b bVar, Handler handler, d0 d0Var) {
        this.f19344c = bVar;
        this.f19343b = handler;
        this.f19342a = d0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f19343b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f19344c.f19358b) {
            this.f19342a.f19384a.U(-1, 3, false);
        }
    }
}
