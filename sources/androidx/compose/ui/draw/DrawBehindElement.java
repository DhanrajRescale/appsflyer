package androidx.compose.ui.draw;

import c2.y0;
import g1.n;
import k1.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawBehindElement;", "Lc2/y0;", "Lk1/e;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final /* data */ class DrawBehindElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f1346b;

    public DrawBehindElement(Function1 function1) {
        this.f1346b = function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.n, k1.e] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f21895n = this.f1346b;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && Intrinsics.a(this.f1346b, ((DrawBehindElement) obj).f1346b);
    }

    @Override // c2.y0
    public final int hashCode() {
        return this.f1346b.hashCode();
    }

    @Override // c2.y0
    public final void j(n nVar) {
        ((e) nVar).f21895n = this.f1346b;
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.f1346b + ')';
    }
}
