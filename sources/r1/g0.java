package r1;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g0 extends i0 implements Iterable, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f32916a;

    /* renamed from: b, reason: collision with root package name */
    public final float f32917b;

    /* renamed from: c, reason: collision with root package name */
    public final float f32918c;

    /* renamed from: d, reason: collision with root package name */
    public final float f32919d;

    /* renamed from: e, reason: collision with root package name */
    public final float f32920e;

    /* renamed from: f, reason: collision with root package name */
    public final float f32921f;

    /* renamed from: g, reason: collision with root package name */
    public final float f32922g;

    /* renamed from: h, reason: collision with root package name */
    public final float f32923h;

    /* renamed from: i, reason: collision with root package name */
    public final List f32924i;

    /* renamed from: j, reason: collision with root package name */
    public final List f32925j;

    public g0(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2) {
        this.f32916a = str;
        this.f32917b = f10;
        this.f32918c = f11;
        this.f32919d = f12;
        this.f32920e = f13;
        this.f32921f = f14;
        this.f32922g = f15;
        this.f32923h = f16;
        this.f32924i = list;
        this.f32925j = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g0)) {
            g0 g0Var = (g0) obj;
            if (Intrinsics.a(this.f32916a, g0Var.f32916a) && this.f32917b == g0Var.f32917b && this.f32918c == g0Var.f32918c && this.f32919d == g0Var.f32919d && this.f32920e == g0Var.f32920e && this.f32921f == g0Var.f32921f && this.f32922g == g0Var.f32922g && this.f32923h == g0Var.f32923h && Intrinsics.a(this.f32924i, g0Var.f32924i) && Intrinsics.a(this.f32925j, g0Var.f32925j)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32925j.hashCode() + nn.d.e(this.f32924i, v.e.a(this.f32923h, v.e.a(this.f32922g, v.e.a(this.f32921f, v.e.a(this.f32920e, v.e.a(this.f32919d, v.e.a(this.f32918c, v.e.a(this.f32917b, this.f32916a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f0(this);
    }
}
