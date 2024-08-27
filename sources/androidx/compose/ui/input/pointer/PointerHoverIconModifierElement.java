package androidx.compose.ui.input.pointer;

import c2.g;
import c2.y0;
import g1.n;
import iu.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v.e;
import x1.a;
import x1.m;
import x1.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "Lc2/y0;", "Lx1/n;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final /* data */ class PointerHoverIconModifierElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final p f1389b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1390c;

    public PointerHoverIconModifierElement(a aVar, boolean z10) {
        this.f1389b = aVar;
        this.f1390c = z10;
    }

    @Override // c2.y0
    public final n d() {
        return new x1.n(this.f1389b, this.f1390c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return Intrinsics.a(this.f1389b, pointerHoverIconModifierElement.f1389b) && this.f1390c == pointerHoverIconModifierElement.f1390c;
    }

    @Override // c2.y0
    public final int hashCode() {
        return Boolean.hashCode(this.f1390c) + (((a) this.f1389b).f39823b * 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        x1.n nVar2 = (x1.n) nVar;
        p pVar = nVar2.f39892n;
        p pVar2 = this.f1389b;
        if (!Intrinsics.a(pVar, pVar2)) {
            nVar2.f39892n = pVar2;
            if (nVar2.f39894p) {
                nVar2.S0();
            }
        }
        boolean z10 = nVar2.f39893o;
        boolean z11 = this.f1390c;
        if (z10 != z11) {
            nVar2.f39893o = z11;
            if (z11) {
                if (nVar2.f39894p) {
                    nVar2.Q0();
                    return;
                }
                return;
            }
            boolean z12 = nVar2.f39894p;
            if (z12 && z12) {
                if (!z11) {
                    z zVar = new z();
                    g.C(nVar2, new m(1, zVar));
                    x1.n nVar3 = (x1.n) zVar.f20560a;
                    if (nVar3 != null) {
                        nVar2 = nVar3;
                    }
                }
                nVar2.Q0();
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerHoverIconModifierElement(icon=");
        sb2.append(this.f1389b);
        sb2.append(", overrideDescendants=");
        return e.k(sb2, this.f1390c, ')');
    }
}
