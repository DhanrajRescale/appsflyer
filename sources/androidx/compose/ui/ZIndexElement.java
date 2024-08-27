package androidx.compose.ui;

import c2.y0;
import g1.n;
import g1.t;
import kotlin.Metadata;
import nn.d;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/ZIndexElement;", "Lc2/y0;", "Lg1/t;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final /* data */ class ZIndexElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f1345b;

    public ZIndexElement(float f10) {
        this.f1345b = f10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.n, g1.t] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f16427n = this.f1345b;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.f1345b, ((ZIndexElement) obj).f1345b) == 0;
    }

    @Override // c2.y0
    public final int hashCode() {
        return Float.hashCode(this.f1345b);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        ((t) nVar).f16427n = this.f1345b;
    }

    public final String toString() {
        return d.l(new StringBuilder("ZIndexElement(zIndex="), this.f1345b, ')');
    }
}
