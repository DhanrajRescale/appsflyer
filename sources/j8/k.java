package j8;

import androidx.work.g0;
import androidx.work.u;
import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: s, reason: collision with root package name */
    public static final String f21073s = u.C("WorkSpec");

    /* renamed from: a, reason: collision with root package name */
    public String f21074a;

    /* renamed from: b, reason: collision with root package name */
    public g0 f21075b = g0.f2565a;

    /* renamed from: c, reason: collision with root package name */
    public String f21076c;

    /* renamed from: d, reason: collision with root package name */
    public String f21077d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.work.k f21078e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.work.k f21079f;

    /* renamed from: g, reason: collision with root package name */
    public long f21080g;

    /* renamed from: h, reason: collision with root package name */
    public long f21081h;

    /* renamed from: i, reason: collision with root package name */
    public long f21082i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.work.e f21083j;

    /* renamed from: k, reason: collision with root package name */
    public int f21084k;

    /* renamed from: l, reason: collision with root package name */
    public int f21085l;

    /* renamed from: m, reason: collision with root package name */
    public long f21086m;

    /* renamed from: n, reason: collision with root package name */
    public long f21087n;

    /* renamed from: o, reason: collision with root package name */
    public long f21088o;

    /* renamed from: p, reason: collision with root package name */
    public long f21089p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21090q;

    /* renamed from: r, reason: collision with root package name */
    public int f21091r;

    public k(String str, String str2) {
        androidx.work.k kVar = androidx.work.k.f2621c;
        this.f21078e = kVar;
        this.f21079f = kVar;
        this.f21083j = androidx.work.e.f2551i;
        this.f21085l = 1;
        this.f21086m = 30000L;
        this.f21089p = -1L;
        this.f21091r = 1;
        this.f21074a = str;
        this.f21076c = str2;
    }

    public final long a() {
        int i10;
        long scalb;
        if (this.f21075b == g0.f2565a && (i10 = this.f21084k) > 0) {
            if (this.f21085l == 2) {
                scalb = this.f21086m * i10;
            } else {
                scalb = Math.scalb((float) this.f21086m, i10 - 1);
            }
            return Math.min(18000000L, scalb) + this.f21087n;
        }
        long j10 = 0;
        if (c()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = this.f21087n;
            if (j11 == 0) {
                j11 = this.f21080g + currentTimeMillis;
            }
            long j12 = this.f21082i;
            long j13 = this.f21081h;
            if (j12 != j13) {
                if (j11 == 0) {
                    j10 = j12 * (-1);
                }
                return j11 + j13 + j10;
            }
            if (j11 != 0) {
                j10 = j13;
            }
            return j11 + j10;
        }
        long j14 = this.f21087n;
        if (j14 == 0) {
            j14 = System.currentTimeMillis();
        }
        return j14 + this.f21080g;
    }

    public final boolean b() {
        return !androidx.work.e.f2551i.equals(this.f21083j);
    }

    public final boolean c() {
        return this.f21081h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f21080g != kVar.f21080g || this.f21081h != kVar.f21081h || this.f21082i != kVar.f21082i || this.f21084k != kVar.f21084k || this.f21086m != kVar.f21086m || this.f21087n != kVar.f21087n || this.f21088o != kVar.f21088o || this.f21089p != kVar.f21089p || this.f21090q != kVar.f21090q || !this.f21074a.equals(kVar.f21074a) || this.f21075b != kVar.f21075b || !this.f21076c.equals(kVar.f21076c)) {
            return false;
        }
        String str = this.f21077d;
        if (str == null ? kVar.f21077d != null : !str.equals(kVar.f21077d)) {
            return false;
        }
        if (this.f21078e.equals(kVar.f21078e) && this.f21079f.equals(kVar.f21079f) && this.f21083j.equals(kVar.f21083j) && this.f21085l == kVar.f21085l && this.f21091r == kVar.f21091r) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int g10 = jr.h.g(this.f21076c, (this.f21075b.hashCode() + (this.f21074a.hashCode() * 31)) * 31, 31);
        String str = this.f21077d;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode = (this.f21079f.hashCode() + ((this.f21078e.hashCode() + ((g10 + i10) * 31)) * 31)) * 31;
        long j10 = this.f21080g;
        int i11 = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f21081h;
        int i12 = (i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f21082i;
        int e10 = (w.k.e(this.f21085l) + ((((this.f21083j.hashCode() + ((i12 + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31) + this.f21084k) * 31)) * 31;
        long j13 = this.f21086m;
        int i13 = (e10 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f21087n;
        int i14 = (i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f21088o;
        int i15 = (i14 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f21089p;
        return w.k.e(this.f21091r) + ((((i15 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f21090q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("{WorkSpec: "), this.f21074a, UrlTreeKt.componentParamSuffix);
    }
}
