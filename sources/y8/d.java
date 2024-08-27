package y8;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import qu.b0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.o f41316a;

    /* renamed from: b, reason: collision with root package name */
    public final z8.h f41317b;

    /* renamed from: c, reason: collision with root package name */
    public final z8.f f41318c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f41319d;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f41320e;

    /* renamed from: f, reason: collision with root package name */
    public final b0 f41321f;

    /* renamed from: g, reason: collision with root package name */
    public final b0 f41322g;

    /* renamed from: h, reason: collision with root package name */
    public final c9.e f41323h;

    /* renamed from: i, reason: collision with root package name */
    public final z8.d f41324i;

    /* renamed from: j, reason: collision with root package name */
    public final Bitmap.Config f41325j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f41326k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f41327l;

    /* renamed from: m, reason: collision with root package name */
    public final b f41328m;

    /* renamed from: n, reason: collision with root package name */
    public final b f41329n;

    /* renamed from: o, reason: collision with root package name */
    public final b f41330o;

    public d(androidx.lifecycle.o oVar, z8.h hVar, z8.f fVar, b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, c9.e eVar, z8.d dVar, Bitmap.Config config, Boolean bool, Boolean bool2, b bVar, b bVar2, b bVar3) {
        this.f41316a = oVar;
        this.f41317b = hVar;
        this.f41318c = fVar;
        this.f41319d = b0Var;
        this.f41320e = b0Var2;
        this.f41321f = b0Var3;
        this.f41322g = b0Var4;
        this.f41323h = eVar;
        this.f41324i = dVar;
        this.f41325j = config;
        this.f41326k = bool;
        this.f41327l = bool2;
        this.f41328m = bVar;
        this.f41329n = bVar2;
        this.f41330o = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (Intrinsics.a(this.f41316a, dVar.f41316a) && Intrinsics.a(this.f41317b, dVar.f41317b) && this.f41318c == dVar.f41318c && Intrinsics.a(this.f41319d, dVar.f41319d) && Intrinsics.a(this.f41320e, dVar.f41320e) && Intrinsics.a(this.f41321f, dVar.f41321f) && Intrinsics.a(this.f41322g, dVar.f41322g) && Intrinsics.a(this.f41323h, dVar.f41323h) && this.f41324i == dVar.f41324i && this.f41325j == dVar.f41325j && Intrinsics.a(this.f41326k, dVar.f41326k) && Intrinsics.a(this.f41327l, dVar.f41327l) && this.f41328m == dVar.f41328m && this.f41329n == dVar.f41329n && this.f41330o == dVar.f41330o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24 = 0;
        androidx.lifecycle.o oVar = this.f41316a;
        if (oVar != null) {
            i10 = oVar.hashCode();
        } else {
            i10 = 0;
        }
        int i25 = i10 * 31;
        z8.h hVar = this.f41317b;
        if (hVar != null) {
            i11 = hVar.hashCode();
        } else {
            i11 = 0;
        }
        int i26 = (i25 + i11) * 31;
        z8.f fVar = this.f41318c;
        if (fVar != null) {
            i12 = fVar.hashCode();
        } else {
            i12 = 0;
        }
        int i27 = (i26 + i12) * 31;
        b0 b0Var = this.f41319d;
        if (b0Var != null) {
            i13 = b0Var.hashCode();
        } else {
            i13 = 0;
        }
        int i28 = (i27 + i13) * 31;
        b0 b0Var2 = this.f41320e;
        if (b0Var2 != null) {
            i14 = b0Var2.hashCode();
        } else {
            i14 = 0;
        }
        int i29 = (i28 + i14) * 31;
        b0 b0Var3 = this.f41321f;
        if (b0Var3 != null) {
            i15 = b0Var3.hashCode();
        } else {
            i15 = 0;
        }
        int i30 = (i29 + i15) * 31;
        b0 b0Var4 = this.f41322g;
        if (b0Var4 != null) {
            i16 = b0Var4.hashCode();
        } else {
            i16 = 0;
        }
        int i31 = (i30 + i16) * 31;
        c9.e eVar = this.f41323h;
        if (eVar != null) {
            i17 = eVar.hashCode();
        } else {
            i17 = 0;
        }
        int i32 = (i31 + i17) * 31;
        z8.d dVar = this.f41324i;
        if (dVar != null) {
            i18 = dVar.hashCode();
        } else {
            i18 = 0;
        }
        int i33 = (i32 + i18) * 31;
        Bitmap.Config config = this.f41325j;
        if (config != null) {
            i19 = config.hashCode();
        } else {
            i19 = 0;
        }
        int i34 = (i33 + i19) * 31;
        Boolean bool = this.f41326k;
        if (bool != null) {
            i20 = bool.hashCode();
        } else {
            i20 = 0;
        }
        int i35 = (i34 + i20) * 31;
        Boolean bool2 = this.f41327l;
        if (bool2 != null) {
            i21 = bool2.hashCode();
        } else {
            i21 = 0;
        }
        int i36 = (i35 + i21) * 31;
        b bVar = this.f41328m;
        if (bVar != null) {
            i22 = bVar.hashCode();
        } else {
            i22 = 0;
        }
        int i37 = (i36 + i22) * 31;
        b bVar2 = this.f41329n;
        if (bVar2 != null) {
            i23 = bVar2.hashCode();
        } else {
            i23 = 0;
        }
        int i38 = (i37 + i23) * 31;
        b bVar3 = this.f41330o;
        if (bVar3 != null) {
            i24 = bVar3.hashCode();
        }
        return i38 + i24;
    }
}
