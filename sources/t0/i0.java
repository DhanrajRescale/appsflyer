package t0;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i0 extends e1.a0 {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f35047h = new Object();

    /* renamed from: c, reason: collision with root package name */
    public int f35048c;

    /* renamed from: d, reason: collision with root package name */
    public int f35049d;

    /* renamed from: e, reason: collision with root package name */
    public t.y f35050e;

    /* renamed from: f, reason: collision with root package name */
    public Object f35051f;

    /* renamed from: g, reason: collision with root package name */
    public int f35052g;

    public i0() {
        t.y yVar = t.e0.f34851a;
        Intrinsics.d(yVar, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f35050e = yVar;
        this.f35051f = f35047h;
    }

    @Override // e1.a0
    public final void a(e1.a0 a0Var) {
        Intrinsics.d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        i0 i0Var = (i0) a0Var;
        this.f35050e = i0Var.f35050e;
        this.f35051f = i0Var.f35051f;
        this.f35052g = i0Var.f35052g;
    }

    @Override // e1.a0
    public final e1.a0 b() {
        return new i0();
    }

    public final boolean c(k0 k0Var, e1.i iVar) {
        boolean z10;
        boolean z11;
        Object obj = e1.p.f14905b;
        synchronized (obj) {
            z10 = true;
            if (this.f35048c == iVar.d()) {
                if (this.f35049d == iVar.h()) {
                    z11 = false;
                }
            }
            z11 = true;
        }
        if (this.f35051f == f35047h || (z11 && this.f35052g != d(k0Var, iVar))) {
            z10 = false;
        }
        if (z10 && z11) {
            synchronized (obj) {
                this.f35048c = iVar.d();
                this.f35049d = iVar.h();
                Unit unit = Unit.f23355a;
            }
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d5, code lost:
    
        r3 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(t0.k0 r21, e1.i r22) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.i0.d(t0.k0, e1.i):int");
    }
}
