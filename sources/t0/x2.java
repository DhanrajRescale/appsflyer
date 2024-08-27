package t0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x2 extends e1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public Object f35249c;

    public x2(Object obj) {
        this.f35249c = obj;
    }

    @Override // e1.a0
    public final void a(e1.a0 a0Var) {
        Intrinsics.d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f35249c = ((x2) a0Var).f35249c;
    }

    @Override // e1.a0
    public final e1.a0 b() {
        return new x2(this.f35249c);
    }
}
