package qj;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final float f32074a;

    /* renamed from: b, reason: collision with root package name */
    public final float f32075b;

    /* renamed from: c, reason: collision with root package name */
    public final float f32076c;

    /* renamed from: d, reason: collision with root package name */
    public final float f32077d;

    /* renamed from: e, reason: collision with root package name */
    public final String f32078e;

    /* renamed from: f, reason: collision with root package name */
    public final String f32079f;

    /* renamed from: g, reason: collision with root package name */
    public final zi.k f32080g;

    public z(float f10, float f11, float f12, float f13, String sliderTitle, String str, zi.k kVar) {
        Intrinsics.checkNotNullParameter(sliderTitle, "sliderTitle");
        this.f32074a = f10;
        this.f32075b = f11;
        this.f32076c = f12;
        this.f32077d = f13;
        this.f32078e = sliderTitle;
        this.f32079f = str;
        this.f32080g = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Float.compare(this.f32074a, zVar.f32074a) == 0 && Float.compare(this.f32075b, zVar.f32075b) == 0 && Float.compare(this.f32076c, zVar.f32076c) == 0 && Float.compare(this.f32077d, zVar.f32077d) == 0 && Intrinsics.a(this.f32078e, zVar.f32078e) && Intrinsics.a(this.f32079f, zVar.f32079f) && Intrinsics.a(this.f32080g, zVar.f32080g);
    }

    public final int hashCode() {
        int hashCode;
        int g10 = jr.h.g(this.f32078e, v.e.a(this.f32077d, v.e.a(this.f32076c, v.e.a(this.f32075b, Float.hashCode(this.f32074a) * 31, 31), 31), 31), 31);
        int i10 = 0;
        String str = this.f32079f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (g10 + hashCode) * 31;
        zi.k kVar = this.f32080g;
        if (kVar != null) {
            i10 = kVar.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "MarketSliderData(min=" + this.f32074a + ", max=" + this.f32075b + ", step=" + this.f32076c + ", defaultValue=" + this.f32077d + ", sliderTitle=" + this.f32078e + ", hint=" + this.f32079f + ", narrationUiData=" + this.f32080g + ")";
    }
}
