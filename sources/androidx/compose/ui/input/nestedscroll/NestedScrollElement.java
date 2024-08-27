package androidx.compose.ui.input.nestedscroll;

import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import w1.d;
import w1.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "Lc2/y0;", "Lw1/g;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NestedScrollElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final w1.a f1387b;

    /* renamed from: c, reason: collision with root package name */
    public final d f1388c;

    public NestedScrollElement(w1.a aVar, d dVar) {
        this.f1387b = aVar;
        this.f1388c = dVar;
    }

    @Override // c2.y0
    public final n d() {
        return new g(this.f1387b, this.f1388c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        if (!Intrinsics.a(nestedScrollElement.f1387b, this.f1387b) || !Intrinsics.a(nestedScrollElement.f1388c, this.f1388c)) {
            return false;
        }
        return true;
    }

    @Override // c2.y0
    public final int hashCode() {
        int i10;
        int hashCode = this.f1387b.hashCode() * 31;
        d dVar = this.f1388c;
        if (dVar != null) {
            i10 = dVar.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    @Override // c2.y0
    public final void j(n nVar) {
        g gVar = (g) nVar;
        gVar.f38771n = this.f1387b;
        d dVar = gVar.f38772o;
        if (dVar.f38757a == gVar) {
            dVar.f38757a = null;
        }
        d dVar2 = this.f1388c;
        if (dVar2 == null) {
            gVar.f38772o = new d();
        } else if (!Intrinsics.a(dVar2, dVar)) {
            gVar.f38772o = dVar2;
        }
        if (gVar.f16417m) {
            d dVar3 = gVar.f38772o;
            dVar3.f38757a = gVar;
            dVar3.f38758b = new x.a(gVar, 25);
            dVar3.f38759c = gVar.E0();
        }
    }
}
