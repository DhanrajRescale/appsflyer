package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class w extends Service implements t {

    /* renamed from: a, reason: collision with root package name */
    public final h.c f1989a = new h.c(this);

    @Override // androidx.lifecycle.t
    public final o getLifecycle() {
        return (v) this.f1989a.f17583b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f1989a.Q(m.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f1989a.Q(m.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m mVar = m.ON_STOP;
        h.c cVar = this.f1989a;
        cVar.Q(mVar);
        cVar.Q(m.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i10) {
        this.f1989a.Q(m.ON_START);
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
