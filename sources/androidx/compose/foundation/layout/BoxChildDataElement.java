package androidx.compose.foundation.layout;

import b0.p;
import c2.y0;
import g1.g;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "Lc2/y0;", "Lb0/p;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BoxChildDataElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final g1.d f1248b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1249c;

    public BoxChildDataElement(g gVar, boolean z10) {
        this.f1248b = gVar;
        this.f1249c = z10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.n, b0.p] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f2969n = this.f1248b;
        nVar.f2970o = this.f1249c;
        return nVar;
    }

    public final boolean equals(Object obj) {
        BoxChildDataElement boxChildDataElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof BoxChildDataElement) {
            boxChildDataElement = (BoxChildDataElement) obj;
        } else {
            boxChildDataElement = null;
        }
        if (boxChildDataElement == null) {
            return false;
        }
        if (Intrinsics.a(this.f1248b, boxChildDataElement.f1248b) && this.f1249c == boxChildDataElement.f1249c) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        return Boolean.hashCode(this.f1249c) + (this.f1248b.hashCode() * 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        p pVar = (p) nVar;
        pVar.f2969n = this.f1248b;
        pVar.f2970o = this.f1249c;
    }
}
