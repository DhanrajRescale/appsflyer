package nl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f28833a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final LinkedBlockingDeque f28834b = new LinkedBlockingDeque();

    public final IBinder a() {
        if (!this.f28833a.compareAndSet(true, true)) {
            Object take = this.f28834b.take();
            Intrinsics.checkNotNullExpressionValue(take, "queue.take()");
            return (IBinder) take;
        }
        throw new IllegalStateException("Binder already consumed".toString());
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                this.f28834b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
