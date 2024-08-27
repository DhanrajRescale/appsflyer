package c0;

import a2.a1;
import a2.z0;
import java.util.List;

/* loaded from: classes.dex */
public final class b0 implements n {

    /* renamed from: a, reason: collision with root package name */
    public final int f7464a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7465b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7466c;

    /* renamed from: d, reason: collision with root package name */
    public final g1.b f7467d;

    /* renamed from: e, reason: collision with root package name */
    public final g1.c f7468e;

    /* renamed from: f, reason: collision with root package name */
    public final w2.k f7469f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7470g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7471h;

    /* renamed from: i, reason: collision with root package name */
    public final long f7472i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f7473j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f7474k;

    /* renamed from: l, reason: collision with root package name */
    public final m f7475l;

    /* renamed from: m, reason: collision with root package name */
    public int f7476m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7477n;

    /* renamed from: o, reason: collision with root package name */
    public final int f7478o;

    /* renamed from: p, reason: collision with root package name */
    public final int f7479p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7480q;

    /* renamed from: r, reason: collision with root package name */
    public int f7481r = Integer.MIN_VALUE;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f7482s;

    public b0(int i10, List list, boolean z10, g1.b bVar, g1.c cVar, w2.k kVar, boolean z11, int i11, int i12, int i13, long j10, Object obj, Object obj2, m mVar) {
        int i14;
        int i15;
        this.f7464a = i10;
        this.f7465b = list;
        this.f7466c = z10;
        this.f7467d = bVar;
        this.f7468e = cVar;
        this.f7469f = kVar;
        this.f7470g = z11;
        this.f7471h = i13;
        this.f7472i = j10;
        this.f7473j = obj;
        this.f7474k = obj2;
        this.f7475l = mVar;
        int size = list.size();
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            a1 a1Var = (a1) list.get(i18);
            boolean z12 = this.f7466c;
            if (z12) {
                i14 = a1Var.f30b;
            } else {
                i14 = a1Var.f29a;
            }
            i16 += i14;
            if (!z12) {
                i15 = a1Var.f30b;
            } else {
                i15 = a1Var.f29a;
            }
            i17 = Math.max(i17, i15);
        }
        this.f7477n = i16;
        int i19 = i16 + this.f7471h;
        this.f7478o = i19 >= 0 ? i19 : 0;
        this.f7479p = i17;
        this.f7482s = new int[this.f7465b.size() * 2];
    }

    public final long a(int i10) {
        int i11 = i10 * 2;
        int[] iArr = this.f7482s;
        return hl.f.j(iArr[i11], iArr[i11 + 1]);
    }

    public final void b(z0 z0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.f7481r != Integer.MIN_VALUE) {
            List list = this.f7465b;
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                a1 a1Var = (a1) list.get(i14);
                boolean z10 = this.f7466c;
                if (z10) {
                    int i15 = a1Var.f30b;
                } else {
                    int i16 = a1Var.f29a;
                }
                long a10 = a(i14);
                d0.h hVar = d0.i.f13166a;
                if (this.f7470g) {
                    int i17 = w2.h.f38792c;
                    if (z10) {
                        i11 = (int) (a10 >> 32);
                    } else {
                        int i18 = this.f7481r - ((int) (a10 >> 32));
                        if (z10) {
                            i10 = a1Var.f30b;
                        } else {
                            i10 = a1Var.f29a;
                        }
                        i11 = i18 - i10;
                    }
                    if (z10) {
                        int i19 = this.f7481r - ((int) (a10 & 4294967295L));
                        if (z10) {
                            i13 = a1Var.f30b;
                        } else {
                            i13 = a1Var.f29a;
                        }
                        i12 = i19 - i13;
                    } else {
                        i12 = (int) (a10 & 4294967295L);
                    }
                    a10 = hl.f.j(i11, i12);
                }
                long j10 = this.f7472i;
                long j11 = hl.f.j(((int) (a10 >> 32)) + ((int) (j10 >> 32)), ((int) (a10 & 4294967295L)) + ((int) (4294967295L & j10)));
                if (z10) {
                    z0.m(z0Var, a1Var, j11, hVar, 2);
                } else {
                    z0.i(z0Var, a1Var, j11, hVar, 2);
                }
            }
            return;
        }
        throw new IllegalArgumentException("position() should be called first".toString());
    }

    public final void c(int i10, int i11, int i12) {
        int i13;
        int i14;
        this.f7476m = i10;
        boolean z10 = this.f7466c;
        if (z10) {
            i13 = i12;
        } else {
            i13 = i11;
        }
        this.f7481r = i13;
        List list = this.f7465b;
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            a1 a1Var = (a1) list.get(i15);
            int i16 = i15 * 2;
            int[] iArr = this.f7482s;
            if (z10) {
                g1.b bVar = this.f7467d;
                if (bVar != null) {
                    iArr[i16] = ((g1.e) bVar).a(a1Var.f29a, i11, this.f7469f);
                    iArr[i16 + 1] = i10;
                    i14 = a1Var.f30b;
                } else {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true".toString());
                }
            } else {
                iArr[i16] = i10;
                int i17 = i16 + 1;
                g1.c cVar = this.f7468e;
                if (cVar != null) {
                    iArr[i17] = ((g1.f) cVar).a(a1Var.f30b, i12);
                    i14 = a1Var.f29a;
                } else {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false".toString());
                }
            }
            i10 += i14;
        }
    }
}
