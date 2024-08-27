package f0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends a {

    /* renamed from: p, reason: collision with root package name */
    public f f15885p;

    public g(f fVar) {
        this.f15885p = fVar;
    }

    @Override // g1.n
    public final void I0() {
        f fVar = this.f15885p;
        if (fVar instanceof f) {
            Intrinsics.d(fVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            fVar.f15884a.m(this);
        }
        if (fVar instanceof f) {
            fVar.f15884a.b(this);
        }
        this.f15885p = fVar;
    }

    @Override // g1.n
    public final void J0() {
        f fVar = this.f15885p;
        if (fVar instanceof f) {
            Intrinsics.d(fVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            fVar.f15884a.m(this);
        }
    }
}
