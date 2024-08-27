package r1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n1.s0;

/* loaded from: classes.dex */
public final class k0 extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f32967a;

    /* renamed from: b, reason: collision with root package name */
    public final List f32968b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32969c;

    /* renamed from: d, reason: collision with root package name */
    public final n1.p f32970d;

    /* renamed from: e, reason: collision with root package name */
    public final float f32971e;

    /* renamed from: f, reason: collision with root package name */
    public final n1.p f32972f;

    /* renamed from: g, reason: collision with root package name */
    public final float f32973g;

    /* renamed from: h, reason: collision with root package name */
    public final float f32974h;

    /* renamed from: i, reason: collision with root package name */
    public final int f32975i;

    /* renamed from: j, reason: collision with root package name */
    public final int f32976j;

    /* renamed from: k, reason: collision with root package name */
    public final float f32977k;

    /* renamed from: l, reason: collision with root package name */
    public final float f32978l;

    /* renamed from: m, reason: collision with root package name */
    public final float f32979m;

    /* renamed from: n, reason: collision with root package name */
    public final float f32980n;

    public k0(String str, List list, int i10, n1.p pVar, float f10, n1.p pVar2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        this.f32967a = str;
        this.f32968b = list;
        this.f32969c = i10;
        this.f32970d = pVar;
        this.f32971e = f10;
        this.f32972f = pVar2;
        this.f32973g = f11;
        this.f32974h = f12;
        this.f32975i = i11;
        this.f32976j = i12;
        this.f32977k = f13;
        this.f32978l = f14;
        this.f32979m = f15;
        this.f32980n = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            if (Intrinsics.a(this.f32967a, k0Var.f32967a) && Intrinsics.a(this.f32970d, k0Var.f32970d) && this.f32971e == k0Var.f32971e && Intrinsics.a(this.f32972f, k0Var.f32972f) && this.f32973g == k0Var.f32973g && this.f32974h == k0Var.f32974h && s0.e(this.f32975i, k0Var.f32975i) && s0.f(this.f32976j, k0Var.f32976j) && this.f32977k == k0Var.f32977k && this.f32978l == k0Var.f32978l && this.f32979m == k0Var.f32979m && this.f32980n == k0Var.f32980n && this.f32969c == k0Var.f32969c && Intrinsics.a(this.f32968b, k0Var.f32968b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int e10 = nn.d.e(this.f32968b, this.f32967a.hashCode() * 31, 31);
        int i11 = 0;
        n1.p pVar = this.f32970d;
        if (pVar != null) {
            i10 = pVar.hashCode();
        } else {
            i10 = 0;
        }
        int a10 = v.e.a(this.f32971e, (e10 + i10) * 31, 31);
        n1.p pVar2 = this.f32972f;
        if (pVar2 != null) {
            i11 = pVar2.hashCode();
        }
        return Integer.hashCode(this.f32969c) + v.e.a(this.f32980n, v.e.a(this.f32979m, v.e.a(this.f32978l, v.e.a(this.f32977k, da.e.f(this.f32976j, da.e.f(this.f32975i, v.e.a(this.f32974h, v.e.a(this.f32973g, (a10 + i11) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
