package androidx.compose.foundation.layout;

import b0.o;
import c2.y0;
import g1.n;
import jr.h;
import kotlin.Metadata;
import s0.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioElement;", "Lc2/y0;", "Lb0/o;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AspectRatioElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f1246b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1247c;

    public AspectRatioElement(float f10, boolean z10) {
        this.f1246b = f10;
        this.f1247c = z10;
        if (f10 > g.f34069a) {
        } else {
            throw new IllegalArgumentException(h.m("aspectRatio ", f10, " must be > 0").toString());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b0.o, g1.n] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f2957n = this.f1246b;
        nVar.f2958o = this.f1247c;
        return nVar;
    }

    public final boolean equals(Object obj) {
        AspectRatioElement aspectRatioElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AspectRatioElement) {
            aspectRatioElement = (AspectRatioElement) obj;
        } else {
            aspectRatioElement = null;
        }
        if (aspectRatioElement == null) {
            return false;
        }
        if (this.f1246b == aspectRatioElement.f1246b) {
            if (this.f1247c == ((AspectRatioElement) obj).f1247c) {
                return true;
            }
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        return Boolean.hashCode(this.f1247c) + (Float.hashCode(this.f1246b) * 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        o oVar = (o) nVar;
        oVar.f2957n = this.f1246b;
        oVar.f2958o = this.f1247c;
    }
}
