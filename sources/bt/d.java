package bt;

import android.os.Handler;
import android.os.Message;
import at.i;
import at.k;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class d extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f7312a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7313b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f7314c;

    public d(Handler handler, boolean z10) {
        this.f7312a = handler;
        this.f7313b = z10;
    }

    @Override // ct.b
    public final void a() {
        this.f7314c = true;
        this.f7312a.removeCallbacksAndMessages(this);
    }

    @Override // at.k
    public final ct.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable != null) {
            if (timeUnit != null) {
                boolean z10 = this.f7314c;
                ft.c cVar = ft.c.f16242a;
                if (z10) {
                    return cVar;
                }
                Handler handler = this.f7312a;
                i iVar = new i(handler, runnable);
                Message obtain = Message.obtain(handler, iVar);
                obtain.obj = this;
                if (this.f7313b) {
                    obtain.setAsynchronous(true);
                }
                this.f7312a.sendMessageDelayed(obtain, timeUnit.toMillis(j10));
                if (this.f7314c) {
                    this.f7312a.removeCallbacks(iVar);
                    return cVar;
                }
                return iVar;
            }
            throw new NullPointerException("unit == null");
        }
        throw new NullPointerException("run == null");
    }
}
