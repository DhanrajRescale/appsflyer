package androidx.compose.ui.draw;

import c2.y0;
import g1.n;
import k1.c;
import k1.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithCacheElement;", "Lc2/y0;", "Lk1/c;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final /* data */ class DrawWithCacheElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f1347b;

    public DrawWithCacheElement(Function1 function1) {
        this.f1347b = function1;
    }

    @Override // c2.y0
    public final n d() {
        return new c(new d(), this.f1347b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && Intrinsics.a(this.f1347b, ((DrawWithCacheElement) obj).f1347b);
    }

    @Override // c2.y0
    public final int hashCode() {
        return this.f1347b.hashCode();
    }

    @Override // c2.y0
    public final void j(n nVar) {
        c cVar = (c) nVar;
        cVar.f21892p = this.f1347b;
        cVar.Q0();
    }

    public final String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.f1347b + ')';
    }
}
