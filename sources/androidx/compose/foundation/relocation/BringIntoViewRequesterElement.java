package androidx.compose.foundation.relocation;

import c2.y0;
import f0.f;
import f0.g;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "Lc2/y0;", "Lf0/g;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final f f1293b;

    public BringIntoViewRequesterElement(f fVar) {
        this.f1293b = fVar;
    }

    @Override // c2.y0
    public final n d() {
        return new g(this.f1293b);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BringIntoViewRequesterElement) {
                if (Intrinsics.a(this.f1293b, ((BringIntoViewRequesterElement) obj).f1293b)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // c2.y0
    public final int hashCode() {
        return this.f1293b.hashCode();
    }

    @Override // c2.y0
    public final void j(n nVar) {
        g gVar = (g) nVar;
        f fVar = gVar.f15885p;
        if (fVar instanceof f) {
            Intrinsics.d(fVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            fVar.f15884a.m(gVar);
        }
        f fVar2 = this.f1293b;
        if (fVar2 instanceof f) {
            fVar2.f15884a.b(gVar);
        }
        gVar.f15885p = fVar2;
    }
}
