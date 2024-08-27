package androidx.compose.foundation.layout;

import b0.w1;
import c2.y0;
import g1.f;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/VerticalAlignElement;", "Lc2/y0;", "Lb0/w1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class VerticalAlignElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final g1.c f1276b;

    public VerticalAlignElement(f fVar) {
        this.f1276b = fVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b0.w1, g1.n] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f3031n = this.f1276b;
        return nVar;
    }

    public final boolean equals(Object obj) {
        VerticalAlignElement verticalAlignElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerticalAlignElement) {
            verticalAlignElement = (VerticalAlignElement) obj;
        } else {
            verticalAlignElement = null;
        }
        if (verticalAlignElement == null) {
            return false;
        }
        return Intrinsics.a(this.f1276b, verticalAlignElement.f1276b);
    }

    @Override // c2.y0
    public final int hashCode() {
        return Float.hashCode(((f) this.f1276b).f16396a);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        ((w1) nVar).f3031n = this.f1276b;
    }
}
