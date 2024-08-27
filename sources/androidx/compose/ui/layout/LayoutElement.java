package androidx.compose.ui.layout;

import a2.z;
import c2.y0;
import g1.n;
import hu.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "Lc2/y0;", "La2/z;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final /* data */ class LayoutElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final c f1396b;

    public LayoutElement(c cVar) {
        this.f1396b = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a2.z, g1.n] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f133n = this.f1396b;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && Intrinsics.a(this.f1396b, ((LayoutElement) obj).f1396b);
    }

    @Override // c2.y0
    public final int hashCode() {
        return this.f1396b.hashCode();
    }

    @Override // c2.y0
    public final void j(n nVar) {
        ((z) nVar).f133n = this.f1396b;
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.f1396b + ')';
    }
}
