package androidx.compose.foundation.layout;

import a2.p;
import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s0.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;", "Lc2/y0;", "Lb0/b;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AlignmentLineOffsetDpElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final a2.a f1243b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1244c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1245d;

    public AlignmentLineOffsetDpElement(p pVar, float f10, float f11) {
        this.f1243b = pVar;
        this.f1244c = f10;
        this.f1245d = f11;
        if ((f10 < g.f34069a && !w2.e.a(f10, Float.NaN)) || (f11 < g.f34069a && !w2.e.a(f11, Float.NaN))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number".toString());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.n, b0.b] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f2822n = this.f1243b;
        nVar.f2823o = this.f1244c;
        nVar.f2824p = this.f1245d;
        return nVar;
    }

    public final boolean equals(Object obj) {
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlignmentLineOffsetDpElement) {
            alignmentLineOffsetDpElement = (AlignmentLineOffsetDpElement) obj;
        } else {
            alignmentLineOffsetDpElement = null;
        }
        if (alignmentLineOffsetDpElement == null) {
            return false;
        }
        if (Intrinsics.a(this.f1243b, alignmentLineOffsetDpElement.f1243b) && w2.e.a(this.f1244c, alignmentLineOffsetDpElement.f1244c) && w2.e.a(this.f1245d, alignmentLineOffsetDpElement.f1245d)) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        return Float.hashCode(this.f1245d) + v.e.a(this.f1244c, this.f1243b.hashCode() * 31, 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        b0.b bVar = (b0.b) nVar;
        bVar.f2822n = this.f1243b;
        bVar.f2823o = this.f1244c;
        bVar.f2824p = this.f1245d;
    }
}
