package e1;

import kotlin.jvm.functions.Function1;
import t0.i3;

/* loaded from: classes.dex */
public final class e extends i {

    /* renamed from: f, reason: collision with root package name */
    public final i f14868f;

    /* renamed from: g, reason: collision with root package name */
    public final Function1 f14869g;

    public e(int i10, n nVar, Function1 function1, i iVar) {
        super(i10, nVar);
        this.f14868f = iVar;
        iVar.k();
        if (function1 != null) {
            Function1 f10 = iVar.f();
            if (f10 != null) {
                function1 = new a(function1, f10, 1);
            }
        } else {
            function1 = iVar.f();
        }
        this.f14869g = function1;
    }

    @Override // e1.i
    public final void c() {
        if (!this.f14882c) {
            int i10 = this.f14881b;
            i iVar = this.f14868f;
            if (i10 != iVar.d()) {
                a();
            }
            iVar.l();
            super.c();
        }
    }

    @Override // e1.i
    public final Function1 f() {
        return this.f14869g;
    }

    @Override // e1.i
    public final boolean g() {
        return true;
    }

    @Override // e1.i
    public final Function1 i() {
        return null;
    }

    @Override // e1.i
    public final void k() {
        vl.b.p0();
        throw null;
    }

    @Override // e1.i
    public final void l() {
        vl.b.p0();
        throw null;
    }

    @Override // e1.i
    public final void m() {
    }

    @Override // e1.i
    public final void n(y yVar) {
        i3 i3Var = p.f14904a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @Override // e1.i
    public final i t(Function1 function1) {
        return new e(this.f14881b, this.f14880a, function1, this.f14868f);
    }
}
