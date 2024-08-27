package androidx.compose.foundation;

import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x.o2;
import x.q2;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Lc2/y0;", "Lx/q2;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final o2 f1207b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1208c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1209d;

    public ScrollingLayoutElement(o2 o2Var, boolean z10, boolean z11) {
        this.f1207b = o2Var;
        this.f1208c = z10;
        this.f1209d = z11;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x.q2, g1.n] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f39697n = this.f1207b;
        nVar.f39698o = this.f1208c;
        nVar.f39699p = this.f1209d;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        if (!Intrinsics.a(this.f1207b, scrollingLayoutElement.f1207b) || this.f1208c != scrollingLayoutElement.f1208c || this.f1209d != scrollingLayoutElement.f1209d) {
            return false;
        }
        return true;
    }

    @Override // c2.y0
    public final int hashCode() {
        return Boolean.hashCode(this.f1209d) + v.e.d(this.f1208c, this.f1207b.hashCode() * 31, 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        q2 q2Var = (q2) nVar;
        q2Var.f39697n = this.f1207b;
        q2Var.f39698o = this.f1208c;
        q2Var.f39699p = this.f1209d;
    }
}
