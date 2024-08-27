package androidx.compose.ui.layout;

import a2.u0;
import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedElement;", "Lc2/y0;", "La2/u0;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OnGloballyPositionedElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f1398b;

    public OnGloballyPositionedElement(Function1 function1) {
        this.f1398b = function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.n, a2.u0] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f124n = this.f1398b;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnGloballyPositionedElement)) {
            return false;
        }
        return Intrinsics.a(this.f1398b, ((OnGloballyPositionedElement) obj).f1398b);
    }

    @Override // c2.y0
    public final int hashCode() {
        return this.f1398b.hashCode();
    }

    @Override // c2.y0
    public final void j(n nVar) {
        ((u0) nVar).f124n = this.f1398b;
    }
}
