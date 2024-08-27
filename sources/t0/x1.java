package t0;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class x1 implements w1 {

    /* renamed from: a, reason: collision with root package name */
    public int f35242a;

    /* renamed from: b, reason: collision with root package name */
    public y1 f35243b;

    /* renamed from: c, reason: collision with root package name */
    public d f35244c;

    /* renamed from: d, reason: collision with root package name */
    public Function2 f35245d;

    /* renamed from: e, reason: collision with root package name */
    public int f35246e;

    /* renamed from: f, reason: collision with root package name */
    public t.y f35247f;

    /* renamed from: g, reason: collision with root package name */
    public t.z f35248g;

    public x1(y yVar) {
        this.f35243b = yVar;
    }

    public final boolean a() {
        d dVar;
        if (this.f35243b != null && (dVar = this.f35244c) != null && dVar.a()) {
            return true;
        }
        return false;
    }

    public final int b(Object obj) {
        int d10;
        y1 y1Var = this.f35243b;
        if (y1Var == null || (d10 = y1Var.d(this, obj)) == 0) {
            return 1;
        }
        return d10;
    }

    public final void c() {
        y1 y1Var = this.f35243b;
        if (y1Var != null) {
            y1Var.b();
        }
        this.f35243b = null;
        this.f35247f = null;
        this.f35248g = null;
    }

    public final void d(boolean z10) {
        if (z10) {
            this.f35242a |= 32;
        } else {
            this.f35242a &= -33;
        }
    }

    public final void e(Function2 function2) {
        this.f35245d = function2;
    }
}
