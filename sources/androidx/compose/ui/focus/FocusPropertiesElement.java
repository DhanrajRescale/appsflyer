package androidx.compose.ui.focus;

import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesElement;", "Lc2/y0;", "Ll1/n;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final /* data */ class FocusPropertiesElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final l f1357b;

    public FocusPropertiesElement(l lVar) {
        this.f1357b = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l1.n, g1.n] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f23913n = this.f1357b;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && Intrinsics.a(this.f1357b, ((FocusPropertiesElement) obj).f1357b);
    }

    @Override // c2.y0
    public final int hashCode() {
        return this.f1357b.f23912a.hashCode();
    }

    @Override // c2.y0
    public final void j(n nVar) {
        ((l1.n) nVar).f23913n = this.f1357b;
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.f1357b + ')';
    }
}
