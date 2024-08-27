package androidx.compose.foundation.layout;

import b0.r1;
import c2.y0;
import g1.n;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Lc2/y0;", "Lb0/r1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SizeElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f1269b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1270c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1271d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1272e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1273f;

    public SizeElement(float f10, float f11, float f12, float f13, boolean z10, int i10) {
        this((i10 & 1) != 0 ? Float.NaN : f10, (i10 & 2) != 0 ? Float.NaN : f11, (i10 & 4) != 0 ? Float.NaN : f12, (i10 & 8) != 0 ? Float.NaN : f13, z10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b0.r1, g1.n] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f2987n = this.f1269b;
        nVar.f2988o = this.f1270c;
        nVar.f2989p = this.f1271d;
        nVar.f2990q = this.f1272e;
        nVar.f2991r = this.f1273f;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        if (w2.e.a(this.f1269b, sizeElement.f1269b) && w2.e.a(this.f1270c, sizeElement.f1270c) && w2.e.a(this.f1271d, sizeElement.f1271d) && w2.e.a(this.f1272e, sizeElement.f1272e) && this.f1273f == sizeElement.f1273f) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        return Boolean.hashCode(this.f1273f) + v.e.a(this.f1272e, v.e.a(this.f1271d, v.e.a(this.f1270c, Float.hashCode(this.f1269b) * 31, 31), 31), 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        r1 r1Var = (r1) nVar;
        r1Var.f2987n = this.f1269b;
        r1Var.f2988o = this.f1270c;
        r1Var.f2989p = this.f1271d;
        r1Var.f2990q = this.f1272e;
        r1Var.f2991r = this.f1273f;
    }

    public SizeElement(float f10, float f11, float f12, float f13, boolean z10) {
        this.f1269b = f10;
        this.f1270c = f11;
        this.f1271d = f12;
        this.f1272e = f13;
        this.f1273f = z10;
    }
}
