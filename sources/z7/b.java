package z7;

import android.os.Handler;
import androidx.lifecycle.m;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import h.q0;

/* loaded from: classes.dex */
public final class b implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f42155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f42156b;

    public b(Handler handler, q0 q0Var) {
        this.f42155a = handler;
        this.f42156b = q0Var;
    }

    @Override // androidx.lifecycle.r
    public final void c(t tVar, m mVar) {
        if (mVar == m.ON_DESTROY) {
            this.f42155a.removeCallbacks(this.f42156b);
            tVar.getLifecycle().c(this);
        }
    }
}
