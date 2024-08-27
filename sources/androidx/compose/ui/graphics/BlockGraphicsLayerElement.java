package androidx.compose.ui.graphics;

import c2.g;
import c2.i1;
import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n1.o;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;", "Lc2/y0;", "Ln1/o;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final /* data */ class BlockGraphicsLayerElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f1368b;

    public BlockGraphicsLayerElement(Function1 function1) {
        this.f1368b = function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.n, n1.o] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f28159n = this.f1368b;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && Intrinsics.a(this.f1368b, ((BlockGraphicsLayerElement) obj).f1368b);
    }

    @Override // c2.y0
    public final int hashCode() {
        return this.f1368b.hashCode();
    }

    @Override // c2.y0
    public final void j(n nVar) {
        o oVar = (o) nVar;
        oVar.f28159n = this.f1368b;
        i1 i1Var = g.x(oVar, 2).f7722l;
        if (i1Var != null) {
            i1Var.p1(oVar.f28159n, true);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f1368b + ')';
    }
}
