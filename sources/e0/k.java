package e0;

import a2.a1;
import java.util.List;
import y.g1;

/* loaded from: classes.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final int f14741a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14742b;

    /* renamed from: c, reason: collision with root package name */
    public final List f14743c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14744d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f14745e;

    /* renamed from: f, reason: collision with root package name */
    public final g1.b f14746f;

    /* renamed from: g, reason: collision with root package name */
    public final g1.c f14747g;

    /* renamed from: h, reason: collision with root package name */
    public final w2.k f14748h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f14749i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f14750j;

    /* renamed from: k, reason: collision with root package name */
    public final int f14751k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f14752l;

    /* renamed from: m, reason: collision with root package name */
    public int f14753m;

    /* renamed from: n, reason: collision with root package name */
    public int f14754n;

    public k(int i10, int i11, List list, long j10, Object obj, g1 g1Var, g1.b bVar, g1.c cVar, w2.k kVar, boolean z10) {
        boolean z11;
        int i12;
        this.f14741a = i10;
        this.f14742b = i11;
        this.f14743c = list;
        this.f14744d = j10;
        this.f14745e = obj;
        this.f14746f = bVar;
        this.f14747g = cVar;
        this.f14748h = kVar;
        this.f14749i = z10;
        if (g1Var == g1.f40723a) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f14750j = z11;
        int size = list.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            a1 a1Var = (a1) list.get(i14);
            if (!this.f14750j) {
                i12 = a1Var.f30b;
            } else {
                i12 = a1Var.f29a;
            }
            i13 = Math.max(i13, i12);
        }
        this.f14751k = i13;
        this.f14752l = new int[this.f14743c.size() * 2];
        this.f14754n = Integer.MIN_VALUE;
    }

    public final void a(int i10) {
        this.f14753m += i10;
        int[] iArr = this.f14752l;
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            boolean z10 = this.f14750j;
            if ((z10 && i11 % 2 == 1) || (!z10 && i11 % 2 == 0)) {
                iArr[i11] = iArr[i11] + i10;
            }
        }
    }

    public final void b(int i10, int i11, int i12) {
        int i13;
        int i14;
        this.f14753m = i10;
        boolean z10 = this.f14750j;
        if (z10) {
            i13 = i12;
        } else {
            i13 = i11;
        }
        this.f14754n = i13;
        List list = this.f14743c;
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            a1 a1Var = (a1) list.get(i15);
            int i16 = i15 * 2;
            int[] iArr = this.f14752l;
            if (z10) {
                g1.b bVar = this.f14746f;
                if (bVar != null) {
                    iArr[i16] = ((g1.e) bVar).a(a1Var.f29a, i11, this.f14748h);
                    iArr[i16 + 1] = i10;
                    i14 = a1Var.f30b;
                } else {
                    throw new IllegalArgumentException("null horizontalAlignment".toString());
                }
            } else {
                iArr[i16] = i10;
                int i17 = i16 + 1;
                g1.c cVar = this.f14747g;
                if (cVar != null) {
                    iArr[i17] = ((g1.f) cVar).a(a1Var.f30b, i12);
                    i14 = a1Var.f29a;
                } else {
                    throw new IllegalArgumentException("null verticalAlignment".toString());
                }
            }
            i10 += i14;
        }
    }
}
