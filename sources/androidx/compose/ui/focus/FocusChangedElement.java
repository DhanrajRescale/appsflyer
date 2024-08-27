package androidx.compose.ui.focus;

import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusChangedElement;", "Lc2/y0;", "Ll1/a;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final /* data */ class FocusChangedElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f1355b;

    public FocusChangedElement(Function1 function1) {
        this.f1355b = function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.n, l1.a] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f23881n = this.f1355b;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && Intrinsics.a(this.f1355b, ((FocusChangedElement) obj).f1355b);
    }

    @Override // c2.y0
    public final int hashCode() {
        return this.f1355b.hashCode();
    }

    @Override // c2.y0
    public final void j(n nVar) {
        ((l1.a) nVar).f23881n = this.f1355b;
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f1355b + ')';
    }
}
