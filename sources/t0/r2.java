package t0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r2 extends e1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public float f35196c;

    public r2(float f10) {
        this.f35196c = f10;
    }

    @Override // e1.a0
    public final void a(e1.a0 a0Var) {
        Intrinsics.d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f35196c = ((r2) a0Var).f35196c;
    }

    @Override // e1.a0
    public final e1.a0 b() {
        return new r2(this.f35196c);
    }
}
