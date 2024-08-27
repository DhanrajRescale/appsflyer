package androidx.compose.foundation.layout;

import b0.h0;
import c2.y0;
import g1.n;
import kotlin.Metadata;
import w.k;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Lc2/y0;", "Lb0/h0;", "b0/g0", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FillElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f1250b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1251c;

    public FillElement(int i10, float f10) {
        this.f1250b = i10;
        this.f1251c = f10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b0.h0, g1.n] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f2869n = this.f1250b;
        nVar.f2870o = this.f1251c;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        if (this.f1250b == fillElement.f1250b && this.f1251c == fillElement.f1251c) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        return Float.hashCode(this.f1251c) + (k.e(this.f1250b) * 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        h0 h0Var = (h0) nVar;
        h0Var.f2869n = this.f1250b;
        h0Var.f2870o = this.f1251c;
    }
}
