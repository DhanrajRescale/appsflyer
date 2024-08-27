package a2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d0 implements k1 {

    /* renamed from: a, reason: collision with root package name */
    public w2.k f49a = w2.k.f38800b;

    /* renamed from: b, reason: collision with root package name */
    public float f50b;

    /* renamed from: c, reason: collision with root package name */
    public float f51c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f52d;

    public d0(i0 i0Var) {
        this.f52d = i0Var;
    }

    @Override // w2.b
    public final float Y() {
        return this.f51c;
    }

    @Override // a2.r
    public final boolean a0() {
        int i10 = this.f52d.f70a.f1423x.f7815c;
        if (i10 != 4 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override // w2.b
    public final float b() {
        return this.f50b;
    }

    @Override // a2.r
    public final w2.k getLayoutDirection() {
        return this.f49a;
    }

    @Override // a2.k1
    public final List k(Object obj, Function2 function2) {
        boolean z10;
        androidx.compose.ui.node.a aVar;
        i0 i0Var = this.f52d;
        i0Var.d();
        androidx.compose.ui.node.a aVar2 = i0Var.f70a;
        int i10 = aVar2.f1423x.f7815c;
        if (i10 != 1 && i10 != 3 && i10 != 2 && i10 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            HashMap hashMap = i0Var.f76g;
            Object obj2 = hashMap.get(obj);
            Object obj3 = obj2;
            if (obj2 == null) {
                androidx.compose.ui.node.a aVar3 = (androidx.compose.ui.node.a) i0Var.f79j.remove(obj);
                if (aVar3 != null) {
                    int i11 = i0Var.f84o;
                    if (i11 > 0) {
                        i0Var.f84o = i11 - 1;
                        aVar = aVar3;
                    } else {
                        t0.t.C0("Check failed.");
                        throw null;
                    }
                } else {
                    androidx.compose.ui.node.a j10 = i0Var.j(obj);
                    if (j10 == null) {
                        int i12 = i0Var.f73d;
                        androidx.compose.ui.node.a aVar4 = new androidx.compose.ui.node.a(2, true, 0);
                        aVar2.f1411l = true;
                        aVar2.w(i12, aVar4);
                        aVar2.f1411l = false;
                        aVar = aVar4;
                    } else {
                        aVar = j10;
                    }
                }
                hashMap.put(obj, aVar);
                obj3 = aVar;
            }
            androidx.compose.ui.node.a aVar5 = (androidx.compose.ui.node.a) obj3;
            if (vt.g0.x(i0Var.f73d, aVar2.o()) != aVar5) {
                int indexOf = aVar2.o().indexOf(aVar5);
                int i13 = i0Var.f73d;
                if (indexOf >= i13) {
                    if (i13 != indexOf) {
                        aVar2.f1411l = true;
                        aVar2.G(indexOf, i13, 1);
                        aVar2.f1411l = false;
                    }
                } else {
                    throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
                }
            }
            i0Var.f73d++;
            i0Var.g(aVar5, obj, function2);
            if (i10 != 1 && i10 != 3) {
                return aVar5.k();
            }
            return aVar5.l();
        }
        t0.t.C0("subcompose can only be used inside the measure or layout blocks");
        throw null;
    }

    @Override // a2.o0
    public final n0 u(int i10, int i11, Map map, Function1 function1) {
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            return new c0(i10, i11, map, this, this.f52d, function1);
        }
        t0.t.C0("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }
}
