package androidx.compose.ui.draw;

import c2.y0;
import g1.n;
import k1.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithContentElement;", "Lc2/y0;", "Lk1/h;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final /* data */ class DrawWithContentElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f1348b;

    public DrawWithContentElement(Function1 function1) {
        this.f1348b = function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k1.h, g1.n] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f21897n = this.f1348b;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && Intrinsics.a(this.f1348b, ((DrawWithContentElement) obj).f1348b);
    }

    @Override // c2.y0
    public final int hashCode() {
        return this.f1348b.hashCode();
    }

    @Override // c2.y0
    public final void j(n nVar) {
        ((h) nVar).f21897n = this.f1348b;
    }

    public final String toString() {
        return "DrawWithContentElement(onDraw=" + this.f1348b + ')';
    }
}
