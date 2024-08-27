package g7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e1 implements k7.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final a4 f16724a;

    /* renamed from: b, reason: collision with root package name */
    public final k7.r0 f16725b;

    /* renamed from: c, reason: collision with root package name */
    public int f16726c;

    /* renamed from: d, reason: collision with root package name */
    public int f16727d;

    /* renamed from: e, reason: collision with root package name */
    public int f16728e;

    /* renamed from: f, reason: collision with root package name */
    public int f16729f;

    /* renamed from: g, reason: collision with root package name */
    public int f16730g;

    public e1(a4 oldList, a4 newList, k7.r0 callback) {
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f16724a = newList;
        this.f16725b = callback;
        z2 z2Var = (z2) oldList;
        this.f16726c = z2Var.f17163c;
        this.f16727d = z2Var.f17164d;
        this.f16728e = z2Var.f17162b;
        this.f16729f = 1;
        this.f16730g = 1;
    }

    @Override // k7.r0
    public final void a(int i10, int i11) {
        int i12 = this.f16726c;
        this.f16725b.a(i10 + i12, i11 + i12);
    }

    @Override // k7.r0
    public final void b(int i10, int i11) {
        int i12 = this.f16728e;
        e0 e0Var = e0.f16721b;
        k7.r0 r0Var = this.f16725b;
        if (i10 < i12 || this.f16730g == 2) {
            if (i10 > 0 || this.f16729f == 2) {
                r0Var.b(i10 + this.f16726c, i11);
            } else {
                int min = Math.min(i11, this.f16726c);
                if (min > 0) {
                    this.f16729f = 3;
                    r0Var.d((0 - min) + this.f16726c, min, e0Var);
                    this.f16726c -= min;
                }
                int i13 = i11 - min;
                if (i13 > 0) {
                    r0Var.b(this.f16726c, i13);
                }
            }
        } else {
            int min2 = Math.min(i11, this.f16727d);
            if (min2 > 0) {
                this.f16730g = 3;
                r0Var.d(this.f16726c + i10, min2, e0Var);
                this.f16727d -= min2;
            }
            int i14 = i11 - min2;
            if (i14 > 0) {
                r0Var.b(i10 + min2 + this.f16726c, i14);
            }
        }
        this.f16728e += i11;
    }

    @Override // k7.r0
    public final void c(int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.f16728e;
        e0 e0Var = e0.f16720a;
        a4 a4Var = this.f16724a;
        int i14 = 0;
        k7.r0 r0Var = this.f16725b;
        if (i12 < i13 || this.f16730g == 3) {
            if (i10 > 0 || this.f16729f == 3) {
                r0Var.c(i10 + this.f16726c, i11);
            } else {
                int min = Math.min(((z2) a4Var).f17163c - this.f16726c, i11);
                if (min >= 0) {
                    i14 = min;
                }
                int i15 = i11 - i14;
                if (i15 > 0) {
                    r0Var.c(this.f16726c, i15);
                }
                if (i14 > 0) {
                    this.f16729f = 2;
                    r0Var.d(this.f16726c, i14, e0Var);
                    this.f16726c += i14;
                }
            }
        } else {
            int min2 = Math.min(((z2) a4Var).f17164d - this.f16727d, i11);
            if (min2 >= 0) {
                i14 = min2;
            }
            int i16 = i11 - i14;
            if (i14 > 0) {
                this.f16730g = 2;
                r0Var.d(this.f16726c + i10, i14, e0Var);
                this.f16727d += i14;
            }
            if (i16 > 0) {
                r0Var.c(i10 + i14 + this.f16726c, i16);
            }
        }
        this.f16728e -= i11;
    }

    @Override // k7.r0
    public final void d(int i10, int i11, Object obj) {
        this.f16725b.d(i10 + this.f16726c, i11, obj);
    }
}
