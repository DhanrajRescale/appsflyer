package g3;

import java.util.HashMap;

/* loaded from: classes.dex */
public class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public Object f16436a;

    /* renamed from: b, reason: collision with root package name */
    public final k f16438b;

    /* renamed from: b0, reason: collision with root package name */
    public float f16439b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f16441c0;

    /* renamed from: d0, reason: collision with root package name */
    public f f16443d0;

    /* renamed from: e0, reason: collision with root package name */
    public f f16445e0;

    /* renamed from: f0, reason: collision with root package name */
    public Object f16447f0;

    /* renamed from: g0, reason: collision with root package name */
    public j3.d f16449g0;

    /* renamed from: h0, reason: collision with root package name */
    public final HashMap f16451h0;

    /* renamed from: i0, reason: collision with root package name */
    public HashMap f16453i0;

    /* renamed from: c, reason: collision with root package name */
    public h3.d f16440c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f16442d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f16444e = 0;

    /* renamed from: f, reason: collision with root package name */
    public float f16446f = -1.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f16448g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f16450h = 0.5f;

    /* renamed from: i, reason: collision with root package name */
    public float f16452i = 0.5f;

    /* renamed from: j, reason: collision with root package name */
    public int f16454j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f16456k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f16457l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f16458m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f16459n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f16460o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f16461p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f16462q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f16463r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f16464s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f16465t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f16466u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f16467v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f16468w = 0;

    /* renamed from: x, reason: collision with root package name */
    public float f16469x = Float.NaN;

    /* renamed from: y, reason: collision with root package name */
    public float f16470y = Float.NaN;

    /* renamed from: z, reason: collision with root package name */
    public float f16471z = Float.NaN;
    public float A = Float.NaN;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public int I = 0;
    public Object J = null;
    public Object K = null;
    public Object L = null;
    public Object M = null;
    public Object N = null;
    public Object O = null;
    public Object P = null;
    public Object Q = null;
    public Object R = null;
    public Object S = null;
    public Object T = null;
    public Object U = null;
    public Object V = null;
    public Object W = null;
    public Object X = null;
    public Object Y = null;
    public Object Z = null;

    /* renamed from: a0, reason: collision with root package name */
    public Object f16437a0 = null;

    /* renamed from: j0, reason: collision with root package name */
    public int f16455j0 = 0;

    public b(k kVar) {
        Object obj = f.f16481i;
        String str = f.f16480h;
        f fVar = new f(str);
        fVar.f16491f = obj;
        if (obj instanceof Integer) {
            fVar.f16489d = ((Integer) obj).intValue();
            fVar.f16491f = null;
        }
        this.f16443d0 = fVar;
        f fVar2 = new f(str);
        fVar2.f16491f = obj;
        if (obj instanceof Integer) {
            fVar2.f16489d = ((Integer) obj).intValue();
            fVar2.f16491f = null;
        }
        this.f16445e0 = fVar2;
        this.f16451h0 = new HashMap();
        this.f16453i0 = new HashMap();
        this.f16438b = kVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, d3.a] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, d3.a] */
    @Override // g3.h
    public void a() {
        if (this.f16449g0 == null) {
            return;
        }
        h3.d dVar = this.f16440c;
        if (dVar != null) {
            dVar.a();
        }
        this.f16443d0.a(this.f16449g0, 0);
        this.f16445e0.a(this.f16449g0, 1);
        this.J = k(this.J);
        this.K = k(this.K);
        this.L = k(this.L);
        this.M = k(this.M);
        this.N = k(this.N);
        this.O = k(this.O);
        this.P = k(this.P);
        this.Q = k(this.Q);
        this.R = k(this.R);
        this.S = k(this.S);
        this.U = k(this.U);
        this.V = k(this.V);
        this.X = k(this.X);
        this.Y = k(this.Y);
        this.Z = k(this.Z);
        e(this.f16449g0, this.J, 1);
        e(this.f16449g0, this.K, 2);
        e(this.f16449g0, this.L, 3);
        e(this.f16449g0, this.M, 4);
        e(this.f16449g0, this.N, 5);
        e(this.f16449g0, this.O, 6);
        e(this.f16449g0, this.P, 7);
        e(this.f16449g0, this.Q, 8);
        e(this.f16449g0, this.R, 9);
        e(this.f16449g0, this.S, 10);
        e(this.f16449g0, this.T, 11);
        e(this.f16449g0, this.U, 12);
        e(this.f16449g0, this.V, 13);
        e(this.f16449g0, this.W, 14);
        e(this.f16449g0, this.X, 15);
        e(this.f16449g0, this.Y, 16);
        e(this.f16449g0, this.Z, 17);
        e(this.f16449g0, this.f16437a0, 20);
        int i10 = this.f16442d;
        if (i10 != 0) {
            this.f16449g0.f20869k0 = i10;
        }
        int i11 = this.f16444e;
        if (i11 != 0) {
            this.f16449g0.f20871l0 = i11;
        }
        float f10 = this.f16446f;
        if (f10 != -1.0f) {
            this.f16449g0.f20873m0[0] = f10;
        }
        float f11 = this.f16448g;
        if (f11 != -1.0f) {
            this.f16449g0.f20873m0[1] = f11;
        }
        j3.d dVar2 = this.f16449g0;
        dVar2.f20859f0 = this.f16450h;
        dVar2.f20861g0 = this.f16452i;
        l lVar = dVar2.f20868k;
        lVar.f16517d = this.f16469x;
        lVar.f16518e = this.f16470y;
        lVar.f16519f = this.f16471z;
        lVar.f16520g = this.A;
        lVar.f16521h = this.B;
        lVar.f16522i = this.C;
        lVar.f16523j = this.D;
        lVar.f16524k = this.E;
        lVar.f16525l = this.G;
        lVar.f16526m = this.H;
        lVar.f16527n = this.F;
        int i12 = this.I;
        lVar.f16528o = i12;
        dVar2.f20865i0 = i12;
        HashMap hashMap = this.f16451h0;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                Integer num = (Integer) hashMap.get(str);
                l lVar2 = this.f16449g0.f20868k;
                int intValue = num.intValue();
                HashMap hashMap2 = lVar2.f16529p;
                if (hashMap2.containsKey(str)) {
                    ((d3.a) hashMap2.get(str)).f13712c = intValue;
                } else {
                    ?? obj = new Object();
                    obj.f13713d = Float.NaN;
                    obj.f13714e = null;
                    obj.f13710a = str;
                    obj.f13711b = 902;
                    obj.f13712c = intValue;
                    hashMap2.put(str, obj);
                }
            }
        }
        HashMap hashMap3 = this.f16453i0;
        if (hashMap3 != null) {
            for (String str2 : hashMap3.keySet()) {
                float floatValue = ((Float) this.f16453i0.get(str2)).floatValue();
                HashMap hashMap4 = this.f16449g0.f20868k.f16529p;
                if (hashMap4.containsKey(str2)) {
                    ((d3.a) hashMap4.get(str2)).f13713d = floatValue;
                } else {
                    ?? obj2 = new Object();
                    obj2.f13712c = Integer.MIN_VALUE;
                    obj2.f13714e = null;
                    obj2.f13710a = str2;
                    obj2.f13711b = 901;
                    obj2.f13713d = floatValue;
                    hashMap4.put(str2, obj2);
                }
            }
        }
    }

    @Override // g3.h
    public final void b(j3.d dVar) {
        if (dVar == null) {
            return;
        }
        this.f16449g0 = dVar;
        dVar.f20863h0 = this.f16447f0;
    }

    @Override // g3.h
    public j3.d c() {
        if (this.f16449g0 == null) {
            j3.d dVar = new j3.d(this.f16443d0.f16489d, this.f16445e0.f16489d);
            this.f16449g0 = dVar;
            dVar.f20863h0 = this.f16447f0;
        }
        return this.f16449g0;
    }

    @Override // g3.h
    public final h3.d d() {
        return this.f16440c;
    }

    public final void e(j3.d dVar, Object obj, int i10) {
        j3.d dVar2;
        if (obj instanceof h) {
            dVar2 = ((h) obj).c();
        } else {
            dVar2 = null;
        }
        if (dVar2 == null) {
            return;
        }
        int[] iArr = a.f16435a;
        if (i10 != 0) {
            int i11 = i10 - 1;
            int i12 = iArr[i11];
            if (i10 != 0) {
                if (i11 != 19) {
                    switch (i11) {
                        case 0:
                            dVar.k(2).b(dVar2.k(2), this.f16454j, this.f16461p, false);
                            return;
                        case 1:
                            dVar.k(2).b(dVar2.k(4), this.f16454j, this.f16461p, false);
                            return;
                        case 2:
                            dVar.k(4).b(dVar2.k(2), this.f16456k, this.f16462q, false);
                            return;
                        case 3:
                            dVar.k(4).b(dVar2.k(4), this.f16456k, this.f16462q, false);
                            return;
                        case 4:
                            dVar.k(2).b(dVar2.k(2), this.f16457l, this.f16463r, false);
                            return;
                        case 5:
                            dVar.k(2).b(dVar2.k(4), this.f16457l, this.f16463r, false);
                            return;
                        case 6:
                            dVar.k(4).b(dVar2.k(2), this.f16458m, this.f16464s, false);
                            return;
                        case 7:
                            dVar.k(4).b(dVar2.k(4), this.f16458m, this.f16464s, false);
                            return;
                        case 8:
                            dVar.k(3).b(dVar2.k(3), this.f16459n, this.f16465t, false);
                            return;
                        case 9:
                            dVar.k(3).b(dVar2.k(5), this.f16459n, this.f16465t, false);
                            return;
                        case 10:
                            dVar.x(3, dVar2, 6, this.f16459n, this.f16465t);
                            return;
                        case 11:
                            dVar.k(5).b(dVar2.k(3), this.f16460o, this.f16466u, false);
                            return;
                        case 12:
                            dVar.k(5).b(dVar2.k(5), this.f16460o, this.f16466u, false);
                            return;
                        case 13:
                            dVar.x(5, dVar2, 6, this.f16460o, this.f16466u);
                            return;
                        case 14:
                            dVar.x(6, dVar2, 6, this.f16467v, this.f16468w);
                            return;
                        case 15:
                            dVar.x(6, dVar2, 3, this.f16467v, this.f16468w);
                            return;
                        case 16:
                            dVar.x(6, dVar2, 5, this.f16467v, this.f16468w);
                            return;
                        default:
                            return;
                    }
                }
                float f10 = this.f16439b0;
                dVar.x(7, dVar2, 7, (int) this.f16441c0, 0);
                dVar.F = f10;
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void f(Object obj) {
        this.f16455j0 = 13;
        this.V = obj;
    }

    public final void g() {
        int i10 = this.f16455j0;
        if (i10 != 0) {
            int e10 = w.k.e(i10);
            if (e10 != 19) {
                switch (e10) {
                    case 0:
                    case 1:
                        this.J = null;
                        this.K = null;
                        this.f16454j = 0;
                        this.f16461p = 0;
                        return;
                    case 2:
                    case 3:
                        this.L = null;
                        this.M = null;
                        this.f16456k = 0;
                        this.f16462q = 0;
                        return;
                    case 4:
                    case 5:
                        this.N = null;
                        this.O = null;
                        this.f16457l = 0;
                        this.f16463r = 0;
                        return;
                    case 6:
                    case 7:
                        this.P = null;
                        this.Q = null;
                        this.f16458m = 0;
                        this.f16464s = 0;
                        return;
                    case 8:
                    case 9:
                    case 10:
                        this.R = null;
                        this.S = null;
                        this.T = null;
                        this.f16459n = 0;
                        this.f16465t = 0;
                        return;
                    case 11:
                    case 12:
                    case 13:
                        this.U = null;
                        this.V = null;
                        this.W = null;
                        this.f16460o = 0;
                        this.f16466u = 0;
                        return;
                    case 14:
                        this.X = null;
                        return;
                    default:
                        return;
                }
            }
            this.f16437a0 = null;
            return;
        }
        this.J = null;
        this.K = null;
        this.f16454j = 0;
        this.L = null;
        this.M = null;
        this.f16456k = 0;
        this.N = null;
        this.O = null;
        this.f16457l = 0;
        this.P = null;
        this.Q = null;
        this.f16458m = 0;
        this.R = null;
        this.S = null;
        this.f16459n = 0;
        this.U = null;
        this.V = null;
        this.f16460o = 0;
        this.X = null;
        this.f16437a0 = null;
        this.f16450h = 0.5f;
        this.f16452i = 0.5f;
        this.f16461p = 0;
        this.f16462q = 0;
        this.f16463r = 0;
        this.f16464s = 0;
        this.f16465t = 0;
        this.f16466u = 0;
    }

    @Override // g3.h
    public final Object getKey() {
        return this.f16436a;
    }

    public final void h() {
        if (this.N != null) {
            this.f16455j0 = 5;
        } else {
            this.f16455j0 = 6;
        }
        g();
        if (this.P != null) {
            this.f16455j0 = 7;
        } else {
            this.f16455j0 = 8;
        }
        g();
        if (this.J != null) {
            this.f16455j0 = 1;
        } else {
            this.f16455j0 = 2;
        }
        g();
        if (this.L != null) {
            this.f16455j0 = 3;
        } else {
            this.f16455j0 = 4;
        }
        g();
    }

    public final void i() {
        if (this.R != null) {
            this.f16455j0 = 9;
        } else {
            this.f16455j0 = 10;
        }
        g();
        this.f16455j0 = 15;
        g();
        if (this.U != null) {
            this.f16455j0 = 12;
        } else {
            this.f16455j0 = 13;
        }
        g();
    }

    public final void j(Object obj) {
        this.f16455j0 = 8;
        this.Q = obj;
    }

    public final Object k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof b)) {
            return (h) this.f16438b.f16506c.get(obj);
        }
        return obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public b l(int i10) {
        int i11 = this.f16455j0;
        if (i11 != 0) {
            int e10 = w.k.e(i11);
            if (e10 != 19) {
                switch (e10) {
                    case 0:
                    case 1:
                        this.f16454j = i10;
                        break;
                    case 2:
                    case 3:
                        this.f16456k = i10;
                        break;
                    case 4:
                    case 5:
                        this.f16457l = i10;
                        break;
                    case 6:
                    case 7:
                        this.f16458m = i10;
                        break;
                    case 8:
                    case 9:
                    case 10:
                        this.f16459n = i10;
                        break;
                    case 11:
                    case 12:
                    case 13:
                        this.f16460o = i10;
                        break;
                    case 14:
                    case 15:
                    case 16:
                        this.f16467v = i10;
                        break;
                }
            } else {
                this.f16441c0 = i10;
            }
        } else {
            this.f16454j = i10;
            this.f16456k = i10;
            this.f16457l = i10;
            this.f16458m = i10;
            this.f16459n = i10;
            this.f16460o = i10;
        }
        return this;
    }

    public b m(Float f10) {
        return l(this.f16438b.c(f10));
    }

    public final void n(int i10) {
        int i11 = this.f16455j0;
        if (i11 != 0) {
            switch (w.k.e(i11)) {
                case 0:
                case 1:
                    this.f16461p = i10;
                    return;
                case 2:
                case 3:
                    this.f16462q = i10;
                    return;
                case 4:
                case 5:
                    this.f16463r = i10;
                    return;
                case 6:
                case 7:
                    this.f16464s = i10;
                    return;
                case 8:
                case 9:
                case 10:
                    this.f16465t = i10;
                    return;
                case 11:
                case 12:
                case 13:
                    this.f16466u = i10;
                    return;
                case 14:
                case 15:
                case 16:
                    this.f16468w = i10;
                    return;
                default:
                    return;
            }
        }
        this.f16461p = i10;
        this.f16462q = i10;
        this.f16463r = i10;
        this.f16464s = i10;
        this.f16465t = i10;
        this.f16466u = i10;
    }

    public final void o(Float f10) {
        n(this.f16438b.c(f10));
    }

    public final void p(Object obj) {
        this.f16455j0 = 5;
        this.N = obj;
    }

    public final void q(Object obj) {
        this.f16455j0 = 9;
        this.R = obj;
    }
}
