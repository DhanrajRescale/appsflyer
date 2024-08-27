package g7;

import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final a[] f16699a;

    /* renamed from: b, reason: collision with root package name */
    public final w0[] f16700b;

    /* renamed from: c, reason: collision with root package name */
    public final vt.q f16701c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16702d;

    public d() {
        int length = b1.values().length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            aVarArr[i10] = a.f16640a;
        }
        this.f16699a = aVarArr;
        int length2 = b1.values().length;
        w0[] w0VarArr = new w0[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            w0VarArr[i11] = null;
        }
        this.f16700b = w0VarArr;
        this.f16701c = new vt.q();
    }

    public final void a(b1 loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        vt.d0.p(this.f16701c, new c2.e1(loadType, 12));
    }

    public final z0 b(b1 b1Var) {
        a aVar = this.f16699a[b1Var.ordinal()];
        vt.q qVar = this.f16701c;
        if (!(qVar instanceof Collection) || !qVar.isEmpty()) {
            Iterator it = qVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((b) it.next()).f16657a == b1Var) {
                    if (aVar != a.f16641b) {
                        return x0.f17118b;
                    }
                }
            }
        }
        w0 w0Var = this.f16700b[b1Var.ordinal()];
        if (w0Var != null) {
            return w0Var;
        }
        int ordinal = aVar.ordinal();
        y0 y0Var = y0.f17134c;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return y0Var;
            }
            if (c.f16681a[b1Var.ordinal()] != 1) {
                return y0.f17133b;
            }
            return y0Var;
        }
        return y0Var;
    }

    public final void c(b1 loadType, a state) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f16699a[loadType.ordinal()] = state;
    }
}
