package androidx.compose.foundation.layout;

import b0.u1;
import c2.y0;
import g1.n;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "Lc2/y0;", "Lb0/u1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class UnspecifiedConstraintsElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f1274b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1275c;

    public UnspecifiedConstraintsElement(float f10, float f11) {
        this.f1274b = f10;
        this.f1275c = f11;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.n, b0.u1] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f3019n = this.f1274b;
        nVar.f3020o = this.f1275c;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        if (!w2.e.a(this.f1274b, unspecifiedConstraintsElement.f1274b) || !w2.e.a(this.f1275c, unspecifiedConstraintsElement.f1275c)) {
            return false;
        }
        return true;
    }

    @Override // c2.y0
    public final int hashCode() {
        return Float.hashCode(this.f1275c) + (Float.hashCode(this.f1274b) * 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        u1 u1Var = (u1) nVar;
        u1Var.f3019n = this.f1274b;
        u1Var.f3020o = this.f1275c;
    }
}
