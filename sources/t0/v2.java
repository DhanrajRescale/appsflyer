package t0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v2 extends e1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public long f35223c;

    public v2(long j10) {
        this.f35223c = j10;
    }

    @Override // e1.a0
    public final void a(e1.a0 a0Var) {
        Intrinsics.d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f35223c = ((v2) a0Var).f35223c;
    }

    @Override // e1.a0
    public final e1.a0 b() {
        return new v2(this.f35223c);
    }
}
