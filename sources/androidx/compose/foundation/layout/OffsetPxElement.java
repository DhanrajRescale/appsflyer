package androidx.compose.foundation.layout;

import b0.d1;
import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v.c0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "Lc2/y0;", "Lb0/d1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OffsetPxElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f1260b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f1261c;

    public OffsetPxElement(Function1 function1, c0 c0Var) {
        this.f1260b = function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.n, b0.d1] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f2848n = this.f1260b;
        nVar.f2849o = true;
        return nVar;
    }

    public final boolean equals(Object obj) {
        OffsetPxElement offsetPxElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetPxElement) {
            offsetPxElement = (OffsetPxElement) obj;
        } else {
            offsetPxElement = null;
        }
        if (offsetPxElement == null) {
            return false;
        }
        return Intrinsics.a(this.f1260b, offsetPxElement.f1260b);
    }

    @Override // c2.y0
    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f1260b.hashCode() * 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        d1 d1Var = (d1) nVar;
        d1Var.f2848n = this.f1260b;
        d1Var.f2849o = true;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f1260b + ", rtlAware=true)";
    }
}
