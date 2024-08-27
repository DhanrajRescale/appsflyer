package bt;

import android.os.Handler;
import android.os.Message;
import at.i;
import at.k;
import at.l;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class e extends l {

    /* renamed from: b, reason: collision with root package name */
    public final Handler f7315b;

    public e(Handler handler) {
        this.f7315b = handler;
    }

    @Override // at.l
    public final k a() {
        return new d(this.f7315b, false);
    }

    @Override // at.l
    public final ct.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable != null) {
            if (timeUnit != null) {
                Handler handler = this.f7315b;
                i iVar = new i(handler, runnable);
                handler.sendMessageDelayed(Message.obtain(handler, iVar), timeUnit.toMillis(j10));
                return iVar;
            }
            throw new NullPointerException("unit == null");
        }
        throw new NullPointerException("run == null");
    }
}
