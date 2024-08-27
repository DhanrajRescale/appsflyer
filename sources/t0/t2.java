package t0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t2 extends e1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public int f35213c;

    public t2(int i10) {
        this.f35213c = i10;
    }

    @Override // e1.a0
    public final void a(e1.a0 a0Var) {
        Intrinsics.d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f35213c = ((t2) a0Var).f35213c;
    }

    @Override // e1.a0
    public final e1.a0 b() {
        return new t2(this.f35213c);
    }
}
