package tu;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u0 implements qu.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final w0 f36554a;

    /* renamed from: b, reason: collision with root package name */
    public final long f36555b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f36556c;

    /* renamed from: d, reason: collision with root package name */
    public final yt.a f36557d;

    public u0(w0 w0Var, long j10, Object obj, qu.i iVar) {
        this.f36554a = w0Var;
        this.f36555b = j10;
        this.f36556c = obj;
        this.f36557d = iVar;
    }

    @Override // qu.t0
    public final void a() {
        w0 w0Var = this.f36554a;
        synchronized (w0Var) {
            if (this.f36555b >= w0Var.r()) {
                Object[] objArr = w0Var.f36576h;
                Intrinsics.c(objArr);
                long j10 = this.f36555b;
                if (objArr[((int) j10) & (objArr.length - 1)] == this) {
                    x0.c(objArr, j10, x0.f36585a);
                    w0Var.m();
                    Unit unit = Unit.f23355a;
                }
            }
        }
    }
}
