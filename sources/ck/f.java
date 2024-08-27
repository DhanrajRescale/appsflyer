package ck;

import ak.e0;
import ak.r;
import ek.t;
import ek.u;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class f extends rk.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8194d = 0;

    /* renamed from: e, reason: collision with root package name */
    public Object f8195e;

    public f(long j10) {
        super(j10);
    }

    @Override // rk.g
    public final int b(Object obj) {
        switch (this.f8194d) {
            case 0:
                e0 e0Var = (e0) obj;
                if (e0Var == null) {
                    return 1;
                }
                return e0Var.c();
            default:
                return 1;
        }
    }

    @Override // rk.g
    public final void c(Object obj, Object obj2) {
        switch (this.f8194d) {
            case 0:
                e0 e0Var = (e0) obj2;
                g gVar = (g) this.f8195e;
                if (gVar != null && e0Var != null) {
                    ((r) gVar).f566e.h(e0Var, true);
                    return;
                }
                return;
            default:
                t tVar = (t) obj;
                tVar.getClass();
                ArrayDeque arrayDeque = t.f15622d;
                synchronized (arrayDeque) {
                    arrayDeque.offer(tVar);
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(u uVar) {
        super(500L);
        this.f8195e = uVar;
    }
}
