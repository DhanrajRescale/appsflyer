package androidx.compose.ui.focus;

import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.o;
import l1.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Lc2/y0;", "Ll1/q;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final /* data */ class FocusRequesterElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final o f1358b;

    public FocusRequesterElement(o oVar) {
        this.f1358b = oVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.n, l1.q] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f23917n = this.f1358b;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && Intrinsics.a(this.f1358b, ((FocusRequesterElement) obj).f1358b);
    }

    @Override // c2.y0
    public final int hashCode() {
        return this.f1358b.hashCode();
    }

    @Override // c2.y0
    public final void j(n nVar) {
        q qVar = (q) nVar;
        qVar.f23917n.f23916a.m(qVar);
        o oVar = this.f1358b;
        qVar.f23917n = oVar;
        oVar.f23916a.b(qVar);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f1358b + ')';
    }
}
