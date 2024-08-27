package androidx.compose.foundation.layout;

import b0.h1;
import b0.j1;
import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t.g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesElement;", "Lc2/y0;", "Lb0/j1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PaddingValuesElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final h1 f1267b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f1268c;

    public PaddingValuesElement(h1 h1Var, g0 g0Var) {
        this.f1267b = h1Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.n, b0.j1] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f2887n = this.f1267b;
        return nVar;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement;
        if (obj instanceof PaddingValuesElement) {
            paddingValuesElement = (PaddingValuesElement) obj;
        } else {
            paddingValuesElement = null;
        }
        if (paddingValuesElement == null) {
            return false;
        }
        return Intrinsics.a(this.f1267b, paddingValuesElement.f1267b);
    }

    @Override // c2.y0
    public final int hashCode() {
        return this.f1267b.hashCode();
    }

    @Override // c2.y0
    public final void j(n nVar) {
        ((j1) nVar).f2887n = this.f1267b;
    }
}
