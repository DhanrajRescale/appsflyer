package a2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b0 implements k1, o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f35a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f36b;

    public b0(i0 i0Var) {
        this.f36b = i0Var;
        this.f35a = i0Var.f77h;
    }

    @Override // w2.b
    public final long H(float f10) {
        return this.f35a.H(f10);
    }

    @Override // w2.b
    public final float N(int i10) {
        return this.f35a.N(i10);
    }

    @Override // w2.b
    public final float P(float f10) {
        return this.f35a.P(f10);
    }

    @Override // w2.b
    public final float Y() {
        return this.f35a.f51c;
    }

    @Override // a2.r
    public final boolean a0() {
        return this.f35a.a0();
    }

    @Override // w2.b
    public final float b() {
        return this.f35a.f50b;
    }

    @Override // w2.b
    public final float c0(float f10) {
        return this.f35a.b() * f10;
    }

    @Override // a2.r
    public final w2.k getLayoutDirection() {
        return this.f35a.f49a;
    }

    @Override // w2.b
    public final int h0(long j10) {
        return this.f35a.h0(j10);
    }

    @Override // a2.k1
    public final List k(Object obj, Function2 function2) {
        List list;
        i0 i0Var = this.f36b;
        androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) i0Var.f76g.get(obj);
        if (aVar != null) {
            list = aVar.l();
        } else {
            list = null;
        }
        if (list != null) {
            return list;
        }
        v0.h hVar = i0Var.f82m;
        int i10 = hVar.f37655c;
        int i11 = i0Var.f74e;
        if (i10 >= i11) {
            if (i10 == i11) {
                hVar.b(obj);
            } else {
                hVar.p(i11, obj);
            }
            i0Var.f74e++;
            HashMap hashMap = i0Var.f79j;
            if (!hashMap.containsKey(obj)) {
                i0Var.f81l.put(obj, i0Var.f(obj, function2));
                androidx.compose.ui.node.a aVar2 = i0Var.f70a;
                if (aVar2.f1423x.f7815c == 3) {
                    aVar2.P(true);
                } else {
                    androidx.compose.ui.node.a.Q(aVar2, true, 2);
                }
            }
            androidx.compose.ui.node.a aVar3 = (androidx.compose.ui.node.a) hashMap.get(obj);
            if (aVar3 != null) {
                List u02 = aVar3.f1423x.f7827o.u0();
                v0.e eVar = (v0.e) u02;
                int i12 = eVar.f37647a.f37655c;
                for (int i13 = 0; i13 < i12; i13++) {
                    ((c2.n0) eVar.get(i13)).E.f7814b = true;
                }
                return u02;
            }
            return vt.i0.f38321a;
        }
        throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.".toString());
    }

    @Override // w2.b
    public final int m0(float f10) {
        return this.f35a.m0(f10);
    }

    @Override // a2.o0
    public final n0 n0(int i10, int i11, Map map, Function1 function1) {
        return this.f35a.u(i10, i11, map, function1);
    }

    @Override // w2.b
    public final long o(float f10) {
        return this.f35a.o(f10);
    }

    @Override // w2.b
    public final long p(long j10) {
        return this.f35a.p(j10);
    }

    @Override // w2.b
    public final long s0(long j10) {
        return this.f35a.s0(j10);
    }

    @Override // a2.o0
    public final n0 u(int i10, int i11, Map map, Function1 function1) {
        return this.f35a.u(i10, i11, map, function1);
    }

    @Override // w2.b
    public final float x(long j10) {
        return this.f35a.x(j10);
    }

    @Override // w2.b
    public final float x0(long j10) {
        return this.f35a.x0(j10);
    }
}
