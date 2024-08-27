package zi;

import kotlin.jvm.internal.Intrinsics;
import qj.z;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final float f42508a;

    /* renamed from: b, reason: collision with root package name */
    public final float f42509b;

    /* renamed from: c, reason: collision with root package name */
    public final float f42510c;

    /* renamed from: d, reason: collision with root package name */
    public final float f42511d;

    /* renamed from: e, reason: collision with root package name */
    public final String f42512e;

    /* renamed from: f, reason: collision with root package name */
    public final String f42513f;

    /* renamed from: g, reason: collision with root package name */
    public final k f42514g;

    public o(float f10, float f11, float f12, float f13, String sliderTitle, String str, k kVar) {
        Intrinsics.checkNotNullParameter(sliderTitle, "sliderTitle");
        this.f42508a = f10;
        this.f42509b = f11;
        this.f42510c = f12;
        this.f42511d = f13;
        this.f42512e = sliderTitle;
        this.f42513f = str;
        this.f42514g = kVar;
    }

    public final z a() {
        return new z(this.f42508a, this.f42509b, this.f42510c, this.f42511d, this.f42512e, this.f42513f, this.f42514g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f42508a, oVar.f42508a) == 0 && Float.compare(this.f42509b, oVar.f42509b) == 0 && Float.compare(this.f42510c, oVar.f42510c) == 0 && Float.compare(this.f42511d, oVar.f42511d) == 0 && Intrinsics.a(this.f42512e, oVar.f42512e) && Intrinsics.a(this.f42513f, oVar.f42513f) && Intrinsics.a(this.f42514g, oVar.f42514g);
    }

    public final int hashCode() {
        int hashCode;
        int g10 = jr.h.g(this.f42512e, v.e.a(this.f42511d, v.e.a(this.f42510c, v.e.a(this.f42509b, Float.hashCode(this.f42508a) * 31, 31), 31), 31), 31);
        int i10 = 0;
        String str = this.f42513f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (g10 + hashCode) * 31;
        k kVar = this.f42514g;
        if (kVar != null) {
            i10 = kVar.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "StockAnalysisInputConfig(min=" + this.f42508a + ", max=" + this.f42509b + ", step=" + this.f42510c + ", defaultValue=" + this.f42511d + ", sliderTitle=" + this.f42512e + ", hint=" + this.f42513f + ", narration=" + this.f42514g + ")";
    }
}
