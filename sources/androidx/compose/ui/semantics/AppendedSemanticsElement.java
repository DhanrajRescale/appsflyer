package androidx.compose.ui.semantics;

import c2.y0;
import g1.n;
import h2.c;
import h2.j;
import h2.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "Lc2/y0;", "Lh2/c;", "Lh2/k;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final /* data */ class AppendedSemanticsElement extends y0 implements k {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1437b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f1438c;

    public AppendedSemanticsElement(Function1 function1, boolean z10) {
        this.f1437b = z10;
        this.f1438c = function1;
    }

    @Override // c2.y0
    public final n d() {
        return new c(this.f1437b, false, this.f1438c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f1437b == appendedSemanticsElement.f1437b && Intrinsics.a(this.f1438c, appendedSemanticsElement.f1438c);
    }

    @Override // c2.y0
    public final int hashCode() {
        return this.f1438c.hashCode() + (Boolean.hashCode(this.f1437b) * 31);
    }

    @Override // h2.k
    public final j i() {
        j jVar = new j();
        jVar.f17851b = this.f1437b;
        this.f1438c.invoke(jVar);
        return jVar;
    }

    @Override // c2.y0
    public final void j(n nVar) {
        c cVar = (c) nVar;
        cVar.f17813n = this.f1437b;
        cVar.f17815p = this.f1438c;
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f1437b + ", properties=" + this.f1438c + ')';
    }
}
