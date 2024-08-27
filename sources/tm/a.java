package tm;

import java.util.ArrayList;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public abstract class a extends b {

    /* renamed from: f, reason: collision with root package name */
    public vm.c f36159f;

    /* renamed from: m, reason: collision with root package name */
    public int f36166m;

    /* renamed from: n, reason: collision with root package name */
    public int f36167n;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f36176w;

    /* renamed from: g, reason: collision with root package name */
    public final int f36160g = -7829368;

    /* renamed from: h, reason: collision with root package name */
    public final float f36161h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f36162i = -7829368;

    /* renamed from: j, reason: collision with root package name */
    public float f36163j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public float[] f36164k = new float[0];

    /* renamed from: l, reason: collision with root package name */
    public float[] f36165l = new float[0];

    /* renamed from: o, reason: collision with root package name */
    public int f36168o = 6;

    /* renamed from: p, reason: collision with root package name */
    public float f36169p = 1.0f;

    /* renamed from: q, reason: collision with root package name */
    public boolean f36170q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f36171r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f36172s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f36173t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f36174u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f36175v = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f36177x = false;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f36178y = true;

    /* renamed from: z, reason: collision with root package name */
    public float f36179z = s0.g.f34069a;
    public float A = s0.g.f34069a;
    public boolean B = false;
    public boolean C = false;
    public float D = s0.g.f34069a;
    public float E = s0.g.f34069a;
    public float F = s0.g.f34069a;

    public a() {
        this.f36183d = cn.h.c(10.0f);
        this.f36181b = cn.h.c(5.0f);
        this.f36182c = cn.h.c(5.0f);
        this.f36176w = new ArrayList();
    }

    public void b(float f10, float f11) {
        float f12;
        float f13;
        if (this.B) {
            f12 = this.E;
        } else {
            f12 = f10 - this.f36179z;
        }
        if (this.C) {
            f13 = this.D;
        } else {
            f13 = f11 + this.A;
        }
        if (Math.abs(f13 - f12) == s0.g.f34069a) {
            f13 += 1.0f;
            f12 -= 1.0f;
        }
        this.E = f12;
        this.D = f13;
        this.F = Math.abs(f13 - f12);
    }

    public final String c() {
        String str;
        int i10 = 0;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        while (true) {
            float[] fArr = this.f36164k;
            if (i10 < fArr.length) {
                if (i10 >= 0 && i10 < fArr.length) {
                    str = d().a(this.f36164k[i10]);
                } else {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (str != null && str2.length() < str.length()) {
                    str2 = str;
                }
                i10++;
            } else {
                return str2;
            }
        }
    }

    public final vm.c d() {
        vm.c cVar = this.f36159f;
        if (cVar == null || ((cVar instanceof vm.a) && ((vm.a) cVar).f38178b != this.f36167n)) {
            this.f36159f = new vm.a(this.f36167n);
        }
        return this.f36159f;
    }

    public final boolean e() {
        return this.f36175v && this.f36166m > 0;
    }
}
