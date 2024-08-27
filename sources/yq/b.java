package yq;

import androidx.compose.foundation.layout.e;
import b5.r0;
import e1.d0;
import e1.e0;
import e1.h;
import e1.i;
import e1.o;
import e1.p;
import e5.m;
import e5.x;
import ek.u;
import hr.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.d;
import o5.j;
import o5.k;
import t0.f2;
import t0.i3;
import tu.k1;
import vt.g0;
import x.z;
import z5.b0;
import z5.r;
import z5.y;

/* loaded from: classes2.dex */
public final class b implements d, j, r {

    /* renamed from: b, reason: collision with root package name */
    public static b f41803b;

    /* renamed from: a, reason: collision with root package name */
    public final int f41804a;

    public /* synthetic */ b(int i10) {
        this.f41804a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(c cVar) {
        k1 k1Var;
        w0.d dVar;
        z0.b bVar;
        int i10;
        Object obj;
        k1 k1Var2 = f2.f34996v;
        do {
            k1Var = f2.f34996v;
            dVar = (w0.d) k1Var.getValue();
            bVar = (z0.b) dVar;
            y0.d dVar2 = bVar.f41895d;
            z0.a aVar = (z0.a) dVar2.get(cVar);
            if (aVar != null) {
                boolean z10 = false;
                if (cVar != null) {
                    i10 = cVar.hashCode();
                } else {
                    i10 = 0;
                }
                y0.r rVar = dVar2.f41018d;
                y0.r v10 = rVar.v(i10, 0, cVar);
                if (rVar != v10) {
                    if (v10 == null) {
                        dVar2 = y0.d.f41017f;
                        Intrinsics.d(dVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
                    } else {
                        dVar2 = new y0.d(v10, dVar2.size() - 1);
                    }
                }
                a1.b bVar2 = a1.b.f21a;
                Object obj2 = aVar.f41890a;
                if (obj2 != bVar2) {
                    z10 = true;
                }
                Object obj3 = aVar.f41891b;
                if (z10) {
                    V v11 = dVar2.get(obj2);
                    Intrinsics.c(v11);
                    dVar2 = dVar2.g(obj2, new z0.a(((z0.a) v11).f41890a, obj3));
                }
                if (obj3 != bVar2) {
                    V v12 = dVar2.get(obj3);
                    Intrinsics.c(v12);
                    dVar2 = dVar2.g(obj3, new z0.a(obj2, ((z0.a) v12).f41891b));
                }
                if (obj2 != bVar2) {
                    obj = bVar.f41893b;
                } else {
                    obj = obj3;
                }
                if (obj3 != bVar2) {
                    obj2 = bVar.f41894c;
                }
                bVar = new z0.b(obj, obj2, dVar2);
            }
            if (dVar == bVar) {
                return;
            }
        } while (!k1Var.l(dVar, bVar));
    }

    public static i h() {
        return (i) p.f14904a.a();
    }

    public static i i(i iVar) {
        if (iVar instanceof d0) {
            d0 d0Var = (d0) iVar;
            if (d0Var.f14867u == dp.b.f1()) {
                d0Var.f14865s = null;
                return iVar;
            }
        }
        if (iVar instanceof e0) {
            e0 e0Var = (e0) iVar;
            if (e0Var.f14874j == dp.b.f1()) {
                e0Var.f14873i = null;
                return iVar;
            }
        }
        i g10 = p.g(iVar, null, false);
        g10.j();
        return g10;
    }

    public static Object j(Function1 function1, Function0 function0) {
        e1.c cVar;
        i d0Var;
        if (function1 == null) {
            return function0.mo2invoke();
        }
        i iVar = (i) p.f14904a.a();
        if (iVar instanceof d0) {
            d0 d0Var2 = (d0) iVar;
            if (d0Var2.f14867u == dp.b.f1()) {
                Function1 function12 = d0Var2.f14865s;
                Function1 function13 = d0Var2.f14866t;
                try {
                    ((d0) iVar).f14865s = p.j(function1, function12, true);
                    ((d0) iVar).f14866t = p.a(null, function13);
                    return function0.mo2invoke();
                } finally {
                    d0Var2.f14865s = function12;
                    d0Var2.f14866t = function13;
                }
            }
        }
        if (iVar != null && !(iVar instanceof e1.c)) {
            if (function1 == null) {
                return function0.mo2invoke();
            }
            d0Var = iVar.t(function1);
        } else {
            if (iVar instanceof e1.c) {
                cVar = (e1.c) iVar;
            } else {
                cVar = null;
            }
            d0Var = new d0(cVar, function1, null, true, false);
        }
        try {
            i j10 = d0Var.j();
            try {
                return function0.mo2invoke();
            } finally {
                i.p(j10);
            }
        } finally {
            d0Var.c();
        }
    }

    public static h k(e eVar) {
        i3 i3Var = p.f14904a;
        p.e(o.f14902c);
        synchronized (p.f14905b) {
            p.f14910g = g0.J(eVar, p.f14910g);
            Unit unit = Unit.f23355a;
        }
        return new h(eVar, 0);
    }

    public static void l(i iVar, i iVar2, Function1 function1) {
        if (iVar == iVar2) {
            if (iVar instanceof d0) {
                ((d0) iVar).f14865s = function1;
                return;
            } else if (iVar instanceof e0) {
                ((e0) iVar).f14873i = function1;
                return;
            } else {
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + iVar).toString());
            }
        }
        iVar2.getClass();
        i.p(iVar);
        iVar2.c();
    }

    public static void m() {
        boolean z10;
        synchronized (p.f14905b) {
            v0.c cVar = ((e1.b) p.f14912i.get()).f14850i;
            z10 = false;
            if (cVar != null) {
                if (cVar.g()) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            p.e(o.f14901b);
        }
    }

    public static e1.c n(t.g0 g0Var, z zVar) {
        e1.c cVar;
        e1.c B;
        i i10 = p.i();
        if (i10 instanceof e1.c) {
            cVar = (e1.c) i10;
        } else {
            cVar = null;
        }
        if (cVar != null && (B = cVar.B(g0Var, zVar)) != null) {
            return B;
        }
        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
    }

    @Override // o5.j
    public k a(o5.i iVar) {
        int i10;
        int i11 = x.f15050a;
        if (i11 >= 23 && ((i10 = this.f41804a) == 1 || (i10 == 0 && i11 >= 31))) {
            int h10 = r0.h(iVar.f29627c.f3652l);
            m.e("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + x.z(h10));
            return new i5.b(h10, false).a(iVar);
        }
        return new ni.j(11).a(iVar);
    }

    @Override // le.d
    public void b() {
    }

    @Override // z5.r
    public void c() {
        switch (this.f41804a) {
            case 0:
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // z5.r
    public void d(y yVar) {
        switch (this.f41804a) {
            case 0:
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // le.d
    public void e(boolean z10) {
        switch (this.f41804a) {
            case 0:
            case 1:
                return;
            default:
                Object[] objArr = new Object[0];
                Intrinsics.checkNotNullParameter("ChatChannelManager", "tag");
                com.google.android.gms.internal.p002firebaseauthapi.a.g("disconnected", "s", objArr, "params", "ChatChannelManager").getClass();
                u.A(objArr);
                return;
        }
    }

    @Override // z5.r
    public b0 f(int i10, int i11) {
        switch (this.f41804a) {
            case 0:
                return new z5.o();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        this(1);
        this.f41804a = i10;
        switch (i10) {
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                this(26);
                return;
            case 27:
                this(27);
                return;
            case 28:
                this(28);
                return;
            case 29:
                this(29);
                return;
            default:
                return;
        }
    }

    public b() {
        this.f41804a = 0;
    }
}
