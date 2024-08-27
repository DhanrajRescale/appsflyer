package x5;

import android.os.Handler;
import b5.p1;
import h.m0;
import i5.d0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f39980a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f39981b;

    public e(Handler handler, d0 d0Var) {
        this.f39980a = handler;
        this.f39981b = d0Var;
    }

    public final void a(p1 p1Var) {
        Object obj = this.f39980a;
        if (((Handler) obj) != null) {
            ((Handler) obj).post(new m0(16, this, p1Var));
        }
    }
}
