package e1;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public w0.c f14915c;

    /* renamed from: d, reason: collision with root package name */
    public int f14916d;

    /* renamed from: e, reason: collision with root package name */
    public int f14917e;

    public r(w0.c cVar) {
        this.f14915c = cVar;
    }

    @Override // e1.a0
    public final void a(a0 a0Var) {
        synchronized (t.f14919a) {
            Intrinsics.d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
            this.f14915c = ((r) a0Var).f14915c;
            this.f14916d = ((r) a0Var).f14916d;
            this.f14917e = ((r) a0Var).f14917e;
            Unit unit = Unit.f23355a;
        }
    }

    @Override // e1.a0
    public final a0 b() {
        return new r(this.f14915c);
    }
}
