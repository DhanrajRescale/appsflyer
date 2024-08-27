package androidx.compose.foundation;

import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n1.p;
import n1.x0;
import x.c0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "Lc2/y0;", "Lx/c0;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final /* data */ class BorderModifierNodeElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f1176b;

    /* renamed from: c, reason: collision with root package name */
    public final p f1177c;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f1178d;

    public BorderModifierNodeElement(float f10, p pVar, x0 x0Var) {
        this.f1176b = f10;
        this.f1177c = pVar;
        this.f1178d = x0Var;
    }

    @Override // c2.y0
    public final n d() {
        return new c0(this.f1176b, this.f1177c, this.f1178d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return w2.e.a(this.f1176b, borderModifierNodeElement.f1176b) && Intrinsics.a(this.f1177c, borderModifierNodeElement.f1177c) && Intrinsics.a(this.f1178d, borderModifierNodeElement.f1178d);
    }

    @Override // c2.y0
    public final int hashCode() {
        return this.f1178d.hashCode() + ((this.f1177c.hashCode() + (Float.hashCode(this.f1176b) * 31)) * 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        c0 c0Var = (c0) nVar;
        float f10 = c0Var.f39514q;
        float f11 = this.f1176b;
        boolean a10 = w2.e.a(f10, f11);
        k1.b bVar = c0Var.f39517t;
        if (!a10) {
            c0Var.f39514q = f11;
            ((k1.c) bVar).Q0();
        }
        p pVar = c0Var.f39515r;
        p pVar2 = this.f1177c;
        if (!Intrinsics.a(pVar, pVar2)) {
            c0Var.f39515r = pVar2;
            ((k1.c) bVar).Q0();
        }
        x0 x0Var = c0Var.f39516s;
        x0 x0Var2 = this.f1178d;
        if (!Intrinsics.a(x0Var, x0Var2)) {
            c0Var.f39516s = x0Var2;
            ((k1.c) bVar).Q0();
        }
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) w2.e.b(this.f1176b)) + ", brush=" + this.f1177c + ", shape=" + this.f1178d + ')';
    }
}
