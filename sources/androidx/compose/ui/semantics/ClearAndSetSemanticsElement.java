package androidx.compose.ui.semantics;

import c2.y0;
import g1.n;
import h2.c;
import h2.j;
import h2.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;", "Lc2/y0;", "Lh2/c;", "Lh2/k;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final /* data */ class ClearAndSetSemanticsElement extends y0 implements k {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f1439b;

    public ClearAndSetSemanticsElement(Function1 function1) {
        this.f1439b = function1;
    }

    @Override // c2.y0
    public final n d() {
        return new c(false, true, this.f1439b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && Intrinsics.a(this.f1439b, ((ClearAndSetSemanticsElement) obj).f1439b);
    }

    @Override // c2.y0
    public final int hashCode() {
        return this.f1439b.hashCode();
    }

    @Override // h2.k
    public final j i() {
        j jVar = new j();
        jVar.f17851b = false;
        jVar.f17852c = true;
        this.f1439b.invoke(jVar);
        return jVar;
    }

    @Override // c2.y0
    public final void j(n nVar) {
        ((c) nVar).f17815p = this.f1439b;
    }

    public final String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.f1439b + ')';
    }
}
