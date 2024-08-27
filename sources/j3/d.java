package j3;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k3.n;
import k3.q;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class d {
    public int A;
    public float B;
    public int C;
    public float D;
    public final int[] E;
    public float F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final c K;
    public final c L;
    public final c M;
    public final c N;
    public final c O;
    public final c P;
    public final c Q;
    public final c R;
    public final c[] S;
    public final ArrayList T;
    public final boolean[] U;
    public d V;
    public int W;
    public int X;
    public float Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f20848a;

    /* renamed from: a0, reason: collision with root package name */
    public int f20849a0;

    /* renamed from: b, reason: collision with root package name */
    public k3.d f20850b;

    /* renamed from: b0, reason: collision with root package name */
    public int f20851b0;

    /* renamed from: c, reason: collision with root package name */
    public k3.d f20852c;

    /* renamed from: c0, reason: collision with root package name */
    public int f20853c0;

    /* renamed from: d, reason: collision with root package name */
    public k3.l f20854d;

    /* renamed from: d0, reason: collision with root package name */
    public int f20855d0;

    /* renamed from: e, reason: collision with root package name */
    public n f20856e;

    /* renamed from: e0, reason: collision with root package name */
    public int f20857e0;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f20858f;

    /* renamed from: f0, reason: collision with root package name */
    public float f20859f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20860g;

    /* renamed from: g0, reason: collision with root package name */
    public float f20861g0;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20862h;

    /* renamed from: h0, reason: collision with root package name */
    public Object f20863h0;

    /* renamed from: i, reason: collision with root package name */
    public int f20864i;

    /* renamed from: i0, reason: collision with root package name */
    public int f20865i0;

    /* renamed from: j, reason: collision with root package name */
    public int f20866j;

    /* renamed from: j0, reason: collision with root package name */
    public String f20867j0;

    /* renamed from: k, reason: collision with root package name */
    public final g3.l f20868k;

    /* renamed from: k0, reason: collision with root package name */
    public int f20869k0;

    /* renamed from: l, reason: collision with root package name */
    public String f20870l;

    /* renamed from: l0, reason: collision with root package name */
    public int f20871l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20872m;

    /* renamed from: m0, reason: collision with root package name */
    public final float[] f20873m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20874n;
    public final d[] n0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f20875o;

    /* renamed from: o0, reason: collision with root package name */
    public final d[] f20876o0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f20877p;

    /* renamed from: p0, reason: collision with root package name */
    public int f20878p0;

    /* renamed from: q, reason: collision with root package name */
    public int f20879q;

    /* renamed from: q0, reason: collision with root package name */
    public int f20880q0;

    /* renamed from: r, reason: collision with root package name */
    public int f20881r;

    /* renamed from: r0, reason: collision with root package name */
    public final int[] f20882r0;

    /* renamed from: s, reason: collision with root package name */
    public int f20883s;

    /* renamed from: t, reason: collision with root package name */
    public int f20884t;

    /* renamed from: u, reason: collision with root package name */
    public int f20885u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f20886v;

    /* renamed from: w, reason: collision with root package name */
    public int f20887w;

    /* renamed from: x, reason: collision with root package name */
    public int f20888x;

    /* renamed from: y, reason: collision with root package name */
    public float f20889y;

    /* renamed from: z, reason: collision with root package name */
    public int f20890z;

    public d() {
        this.f20848a = false;
        this.f20854d = null;
        this.f20856e = null;
        this.f20858f = new boolean[]{true, true};
        this.f20860g = true;
        this.f20862h = true;
        this.f20864i = -1;
        this.f20866j = -1;
        this.f20868k = new g3.l(this);
        this.f20872m = false;
        this.f20874n = false;
        this.f20875o = false;
        this.f20877p = false;
        this.f20879q = -1;
        this.f20881r = -1;
        this.f20883s = 0;
        this.f20884t = 0;
        this.f20885u = 0;
        this.f20886v = new int[2];
        this.f20887w = 0;
        this.f20888x = 0;
        this.f20889y = 1.0f;
        this.f20890z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = -1;
        this.D = 1.0f;
        this.E = new int[]{Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER};
        this.F = Float.NaN;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        c cVar = new c(this, 2);
        this.K = cVar;
        c cVar2 = new c(this, 3);
        this.L = cVar2;
        c cVar3 = new c(this, 4);
        this.M = cVar3;
        c cVar4 = new c(this, 5);
        this.N = cVar4;
        c cVar5 = new c(this, 6);
        this.O = cVar5;
        this.P = new c(this, 8);
        this.Q = new c(this, 9);
        c cVar6 = new c(this, 7);
        this.R = cVar6;
        this.S = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar6};
        this.T = new ArrayList();
        this.U = new boolean[2];
        this.f20882r0 = new int[]{1, 1};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = s0.g.f34069a;
        this.Z = -1;
        this.f20849a0 = 0;
        this.f20851b0 = 0;
        this.f20853c0 = 0;
        this.f20859f0 = 0.5f;
        this.f20861g0 = 0.5f;
        this.f20865i0 = 0;
        this.f20867j0 = null;
        this.f20869k0 = 0;
        this.f20871l0 = 0;
        this.f20873m0 = new float[]{-1.0f, -1.0f};
        this.n0 = new d[]{null, null};
        this.f20876o0 = new d[]{null, null};
        this.f20878p0 = -1;
        this.f20880q0 = -1;
        b();
    }

    public static void I(int i10, int i11, String str, StringBuilder sb2) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    public static void J(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    public static void q(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, float f10, int i15) {
        sb2.append(str);
        sb2.append(" :  {\n");
        String B = da.e.B(i15);
        if (!"FIXED".equals(B)) {
            v.e.v(sb2, "      behavior", " :   ", B, ",\n");
        }
        I(i10, 0, "      size", sb2);
        I(i11, 0, "      min", sb2);
        I(i12, Api.BaseClientBuilder.API_PRIORITY_OTHER, "      max", sb2);
        I(i13, 0, "      matchMin", sb2);
        I(i14, 0, "      matchDef", sb2);
        J(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    public static void r(StringBuilder sb2, String str, c cVar) {
        if (cVar.f20844f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(cVar.f20844f);
        sb2.append("'");
        if (cVar.f20846h != Integer.MIN_VALUE || cVar.f20845g != 0) {
            sb2.append(",");
            sb2.append(cVar.f20845g);
            if (cVar.f20846h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(cVar.f20846h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public final boolean A() {
        c cVar = this.L;
        c cVar2 = cVar.f20844f;
        if (cVar2 == null || cVar2.f20844f != cVar) {
            c cVar3 = this.N;
            c cVar4 = cVar3.f20844f;
            if (cVar4 != null && cVar4.f20844f == cVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean B() {
        return this.f20860g && this.f20865i0 != 8;
    }

    public boolean C() {
        if (!this.f20872m && (!this.K.f20841c || !this.M.f20841c)) {
            return false;
        }
        return true;
    }

    public boolean D() {
        if (!this.f20874n && (!this.L.f20841c || !this.N.f20841c)) {
            return false;
        }
        return true;
    }

    public void E() {
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.V = null;
        this.F = Float.NaN;
        this.W = 0;
        this.X = 0;
        this.Y = s0.g.f34069a;
        this.Z = -1;
        this.f20849a0 = 0;
        this.f20851b0 = 0;
        this.f20853c0 = 0;
        this.f20855d0 = 0;
        this.f20857e0 = 0;
        this.f20859f0 = 0.5f;
        this.f20861g0 = 0.5f;
        int[] iArr = this.f20882r0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f20863h0 = null;
        this.f20865i0 = 0;
        this.f20869k0 = 0;
        this.f20871l0 = 0;
        float[] fArr = this.f20873m0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f20879q = -1;
        this.f20881r = -1;
        int[] iArr2 = this.E;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f20884t = 0;
        this.f20885u = 0;
        this.f20889y = 1.0f;
        this.B = 1.0f;
        this.f20888x = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.A = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f20887w = 0;
        this.f20890z = 0;
        this.C = -1;
        this.D = 1.0f;
        boolean[] zArr = this.f20858f;
        zArr[0] = true;
        zArr[1] = true;
        this.H = false;
        boolean[] zArr2 = this.U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f20860g = true;
        int[] iArr3 = this.f20886v;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f20864i = -1;
        this.f20866j = -1;
    }

    public final void F() {
        d dVar = this.V;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList arrayList = this.T;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c) arrayList.get(i10)).j();
        }
    }

    public final void G() {
        this.f20872m = false;
        this.f20874n = false;
        this.f20875o = false;
        this.f20877p = false;
        ArrayList arrayList = this.T;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) arrayList.get(i10);
            cVar.f20841c = false;
            cVar.f20840b = 0;
        }
    }

    public void H(h8.h hVar) {
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.R.k();
        this.P.k();
        this.Q.k();
    }

    public final void K(int i10) {
        this.f20853c0 = i10;
        this.G = i10 > 0;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0086 -> B:31:0x0087). Please report as a decompilation issue!!! */
    public final void L(String str) {
        float f10;
        int i10 = 0;
        if (str != null && str.length() != 0) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i11 = 0;
            int i12 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                }
                i12 = i11;
                i11 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i11, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > s0.g.f34069a && parseFloat2 > s0.g.f34069a) {
                        if (i12 == 1) {
                            f10 = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f10 = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f10 = i10;
            } else {
                String substring4 = str.substring(i11);
                if (substring4.length() > 0) {
                    f10 = Float.parseFloat(substring4);
                }
                f10 = i10;
            }
            i10 = (f10 > i10 ? 1 : (f10 == i10 ? 0 : -1));
            if (i10 > 0) {
                this.Y = f10;
                this.Z = i12;
                return;
            }
            return;
        }
        this.Y = s0.g.f34069a;
    }

    public final void M(int i10, int i11) {
        if (this.f20872m) {
            return;
        }
        this.K.l(i10);
        this.M.l(i11);
        this.f20849a0 = i10;
        this.W = i11 - i10;
        this.f20872m = true;
    }

    public final void N(int i10, int i11) {
        if (this.f20874n) {
            return;
        }
        this.L.l(i10);
        this.N.l(i11);
        this.f20851b0 = i10;
        this.X = i11 - i10;
        if (this.G) {
            this.O.l(i10 + this.f20853c0);
        }
        this.f20874n = true;
    }

    public final void O(int i10) {
        this.X = i10;
        int i11 = this.f20857e0;
        if (i10 < i11) {
            this.X = i11;
        }
    }

    public final void P(int i10) {
        this.f20882r0[0] = i10;
    }

    public final void Q(float f10, int i10, int i11, int i12) {
        this.f20884t = i10;
        this.f20887w = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f20888x = i12;
        this.f20889y = f10;
        if (f10 <= s0.g.f34069a || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f20884t = 2;
    }

    public final void R(int i10) {
        this.f20882r0[1] = i10;
    }

    public final void S(float f10, int i10, int i11, int i12) {
        this.f20885u = i10;
        this.f20890z = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.A = i12;
        this.B = f10;
        if (f10 <= s0.g.f34069a || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f20885u = 2;
    }

    public final void T(int i10) {
        this.W = i10;
        int i11 = this.f20855d0;
        if (i10 < i11) {
            this.W = i11;
        }
    }

    public void U(boolean z10, boolean z11) {
        int i10;
        int i11;
        k3.l lVar = this.f20854d;
        boolean z12 = z10 & lVar.f22035g;
        n nVar = this.f20856e;
        boolean z13 = z11 & nVar.f22035g;
        int i12 = lVar.f22036h.f22005g;
        int i13 = nVar.f22036h.f22005g;
        int i14 = lVar.f22037i.f22005g;
        int i15 = nVar.f22037i.f22005g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i15 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (z12) {
            this.f20849a0 = i12;
        }
        if (z13) {
            this.f20851b0 = i13;
        }
        if (this.f20865i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        int[] iArr = this.f20882r0;
        if (z12) {
            if (iArr[0] == 1 && i17 < (i11 = this.W)) {
                i17 = i11;
            }
            this.W = i17;
            int i19 = this.f20855d0;
            if (i17 < i19) {
                this.W = i19;
            }
        }
        if (z13) {
            if (iArr[1] == 1 && i18 < (i10 = this.X)) {
                i18 = i10;
            }
            this.X = i18;
            int i20 = this.f20857e0;
            if (i18 < i20) {
                this.X = i20;
            }
        }
    }

    public void V(c3.d dVar, boolean z10) {
        int i10;
        int i11;
        n nVar;
        k3.l lVar;
        c cVar = this.K;
        dVar.getClass();
        int n10 = c3.d.n(cVar);
        int n11 = c3.d.n(this.L);
        int n12 = c3.d.n(this.M);
        int n13 = c3.d.n(this.N);
        if (z10 && (lVar = this.f20854d) != null) {
            k3.g gVar = lVar.f22036h;
            if (gVar.f22008j) {
                k3.g gVar2 = lVar.f22037i;
                if (gVar2.f22008j) {
                    n10 = gVar.f22005g;
                    n12 = gVar2.f22005g;
                }
            }
        }
        if (z10 && (nVar = this.f20856e) != null) {
            k3.g gVar3 = nVar.f22036h;
            if (gVar3.f22008j) {
                k3.g gVar4 = nVar.f22037i;
                if (gVar4.f22008j) {
                    n11 = gVar3.f22005g;
                    n13 = gVar4.f22005g;
                }
            }
        }
        int i12 = n13 - n11;
        if (n12 - n10 < 0 || i12 < 0 || n10 == Integer.MIN_VALUE || n10 == Integer.MAX_VALUE || n11 == Integer.MIN_VALUE || n11 == Integer.MAX_VALUE || n12 == Integer.MIN_VALUE || n12 == Integer.MAX_VALUE || n13 == Integer.MIN_VALUE || n13 == Integer.MAX_VALUE) {
            n10 = 0;
            n11 = 0;
            n12 = 0;
            n13 = 0;
        }
        int i13 = n12 - n10;
        int i14 = n13 - n11;
        this.f20849a0 = n10;
        this.f20851b0 = n11;
        if (this.f20865i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        int[] iArr = this.f20882r0;
        int i15 = iArr[0];
        if (i15 == 1 && i13 < (i11 = this.W)) {
            i13 = i11;
        }
        if (iArr[1] == 1 && i14 < (i10 = this.X)) {
            i14 = i10;
        }
        this.W = i13;
        this.X = i14;
        int i16 = this.f20857e0;
        if (i14 < i16) {
            this.X = i16;
        }
        int i17 = this.f20855d0;
        if (i13 < i17) {
            this.W = i17;
        }
        int i18 = this.f20888x;
        if (i18 > 0 && i15 == 3) {
            this.W = Math.min(this.W, i18);
        }
        int i19 = this.A;
        if (i19 > 0 && iArr[1] == 3) {
            this.X = Math.min(this.X, i19);
        }
        int i20 = this.W;
        if (i13 != i20) {
            this.f20864i = i20;
        }
        int i21 = this.X;
        if (i14 != i21) {
            this.f20866j = i21;
        }
    }

    public final void b() {
        c cVar = this.K;
        ArrayList arrayList = this.T;
        arrayList.add(cVar);
        arrayList.add(this.L);
        arrayList.add(this.M);
        arrayList.add(this.N);
        arrayList.add(this.P);
        arrayList.add(this.Q);
        arrayList.add(this.R);
        arrayList.add(this.O);
    }

    public final void c(e eVar, c3.d dVar, HashSet hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            k.a(eVar, dVar, this);
            hashSet.remove(this);
            d(dVar, eVar.d0(64));
        }
        if (i10 == 0) {
            HashSet hashSet2 = this.K.f20839a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f20842d.c(eVar, dVar, hashSet, i10, true);
                }
            }
            HashSet hashSet3 = this.M.f20839a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).f20842d.c(eVar, dVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.L.f20839a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).f20842d.c(eVar, dVar, hashSet, i10, true);
            }
        }
        HashSet hashSet5 = this.N.f20839a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).f20842d.c(eVar, dVar, hashSet, i10, true);
            }
        }
        HashSet hashSet6 = this.O.f20839a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).f20842d.c(eVar, dVar, hashSet, i10, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:363:0x00d2, code lost:
    
        if (r0.d() > ((j3.c) r3.J0.get()).d()) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x060e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0239  */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(c3.d r64, boolean r65) {
        /*
            Method dump skipped, instructions count: 2060
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.d.d(c3.d, boolean):void");
    }

    public boolean e() {
        return this.f20865i0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x03a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0448 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(c3.d r29, boolean r30, boolean r31, boolean r32, boolean r33, c3.g r34, c3.g r35, int r36, boolean r37, j3.c r38, j3.c r39, int r40, int r41, int r42, int r43, float r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, int r50, int r51, int r52, int r53, float r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.d.f(c3.d, boolean, boolean, boolean, boolean, c3.g, c3.g, int, boolean, j3.c, j3.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void g(int i10, d dVar, int i11, int i12) {
        boolean z10;
        if (i10 == 7) {
            if (i11 == 7) {
                c k10 = k(2);
                c k11 = k(4);
                c k12 = k(3);
                c k13 = k(5);
                boolean z11 = true;
                if ((k10 != null && k10.h()) || (k11 != null && k11.h())) {
                    z10 = false;
                } else {
                    g(2, dVar, 2, 0);
                    g(4, dVar, 4, 0);
                    z10 = true;
                }
                if ((k12 != null && k12.h()) || (k13 != null && k13.h())) {
                    z11 = false;
                } else {
                    g(3, dVar, 3, 0);
                    g(5, dVar, 5, 0);
                }
                if (z10 && z11) {
                    k(7).a(dVar.k(7), 0);
                    return;
                } else if (z10) {
                    k(8).a(dVar.k(8), 0);
                    return;
                } else {
                    if (z11) {
                        k(9).a(dVar.k(9), 0);
                        return;
                    }
                    return;
                }
            }
            if (i11 != 2 && i11 != 4) {
                if (i11 == 3 || i11 == 5) {
                    g(3, dVar, i11, 0);
                    g(5, dVar, i11, 0);
                    k(7).a(dVar.k(i11), 0);
                    return;
                }
                return;
            }
            g(2, dVar, i11, 0);
            g(4, dVar, i11, 0);
            k(7).a(dVar.k(i11), 0);
            return;
        }
        if (i10 == 8 && (i11 == 2 || i11 == 4)) {
            c k14 = k(2);
            c k15 = dVar.k(i11);
            c k16 = k(4);
            k14.a(k15, 0);
            k16.a(k15, 0);
            k(8).a(k15, 0);
            return;
        }
        if (i10 == 9 && (i11 == 3 || i11 == 5)) {
            c k17 = dVar.k(i11);
            k(3).a(k17, 0);
            k(5).a(k17, 0);
            k(9).a(k17, 0);
            return;
        }
        if (i10 == 8 && i11 == 8) {
            k(2).a(dVar.k(2), 0);
            k(4).a(dVar.k(4), 0);
            k(8).a(dVar.k(i11), 0);
            return;
        }
        if (i10 == 9 && i11 == 9) {
            k(3).a(dVar.k(3), 0);
            k(5).a(dVar.k(5), 0);
            k(9).a(dVar.k(i11), 0);
            return;
        }
        c k18 = k(i10);
        c k19 = dVar.k(i11);
        if (k18.i(k19)) {
            if (i10 == 6) {
                c k20 = k(3);
                c k21 = k(5);
                if (k20 != null) {
                    k20.j();
                }
                if (k21 != null) {
                    k21.j();
                }
            } else if (i10 != 3 && i10 != 5) {
                if (i10 == 2 || i10 == 4) {
                    c k22 = k(7);
                    if (k22.f20844f != k19) {
                        k22.j();
                    }
                    c f10 = k(i10).f();
                    c k23 = k(8);
                    if (k23.h()) {
                        f10.j();
                        k23.j();
                    }
                }
            } else {
                c k24 = k(6);
                if (k24 != null) {
                    k24.j();
                }
                c k25 = k(7);
                if (k25.f20844f != k19) {
                    k25.j();
                }
                c f11 = k(i10).f();
                c k26 = k(9);
                if (k26.h()) {
                    f11.j();
                    k26.j();
                }
            }
            k18.a(k19, i12);
        }
    }

    public final void h(c cVar, c cVar2, int i10) {
        if (cVar.f20842d == this) {
            g(cVar.f20843e, cVar2.f20842d, cVar2.f20843e, i10);
        }
    }

    public final void i(c3.d dVar) {
        dVar.k(this.K);
        dVar.k(this.L);
        dVar.k(this.M);
        dVar.k(this.N);
        if (this.f20853c0 > 0) {
            dVar.k(this.O);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [k3.n, k3.q] */
    /* JADX WARN: Type inference failed for: r0v3, types: [k3.l, k3.q] */
    public final void j() {
        if (this.f20854d == null) {
            ?? qVar = new q(this);
            qVar.f22036h.f22003e = 4;
            qVar.f22037i.f22003e = 5;
            qVar.f22034f = 0;
            this.f20854d = qVar;
        }
        if (this.f20856e == null) {
            ?? qVar2 = new q(this);
            k3.g gVar = new k3.g(qVar2);
            qVar2.f22016k = gVar;
            qVar2.f22017l = null;
            qVar2.f22036h.f22003e = 6;
            qVar2.f22037i.f22003e = 7;
            gVar.f22003e = 8;
            qVar2.f22034f = 1;
            this.f20856e = qVar2;
        }
    }

    public c k(int i10) {
        if (i10 != 0) {
            switch (i10 - 1) {
                case 0:
                    return null;
                case 1:
                    return this.K;
                case 2:
                    return this.L;
                case 3:
                    return this.M;
                case 4:
                    return this.N;
                case 5:
                    return this.O;
                case 6:
                    return this.R;
                case 7:
                    return this.P;
                case 8:
                    return this.Q;
                default:
                    throw new AssertionError(da.e.A(i10));
            }
        }
        throw null;
    }

    public final int l(int i10) {
        int[] iArr = this.f20882r0;
        if (i10 == 0) {
            return iArr[0];
        }
        if (i10 != 1) {
            return 0;
        }
        return iArr[1];
    }

    public final int m() {
        if (this.f20865i0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final d n(int i10) {
        c cVar;
        c cVar2;
        if (i10 == 0) {
            c cVar3 = this.M;
            c cVar4 = cVar3.f20844f;
            if (cVar4 != null && cVar4.f20844f == cVar3) {
                return cVar4.f20842d;
            }
            return null;
        }
        if (i10 == 1 && (cVar2 = (cVar = this.N).f20844f) != null && cVar2.f20844f == cVar) {
            return cVar2.f20842d;
        }
        return null;
    }

    public final d o(int i10) {
        c cVar;
        c cVar2;
        if (i10 == 0) {
            c cVar3 = this.K;
            c cVar4 = cVar3.f20844f;
            if (cVar4 != null && cVar4.f20844f == cVar3) {
                return cVar4.f20842d;
            }
            return null;
        }
        if (i10 == 1 && (cVar2 = (cVar = this.L).f20844f) != null && cVar2.f20844f == cVar) {
            return cVar2.f20842d;
        }
        return null;
    }

    public void p(StringBuilder sb2) {
        sb2.append("  " + this.f20870l + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.W);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.X);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f20849a0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f20851b0);
        sb2.append("\n");
        r(sb2, "left", this.K);
        r(sb2, "top", this.L);
        r(sb2, "right", this.M);
        r(sb2, "bottom", this.N);
        r(sb2, "baseline", this.O);
        r(sb2, "centerX", this.P);
        r(sb2, "centerY", this.Q);
        int i10 = this.W;
        int i11 = this.f20855d0;
        int[] iArr = this.E;
        int i12 = iArr[0];
        int i13 = this.f20887w;
        int i14 = this.f20884t;
        float f10 = this.f20889y;
        int[] iArr2 = this.f20882r0;
        int i15 = iArr2[0];
        float[] fArr = this.f20873m0;
        float f11 = fArr[0];
        q(sb2, "    width", i10, i11, i12, i13, i14, f10, i15);
        int i16 = this.X;
        int i17 = this.f20857e0;
        int i18 = iArr[1];
        int i19 = this.f20890z;
        int i20 = this.f20885u;
        float f12 = this.B;
        int i21 = iArr2[1];
        float f13 = fArr[1];
        q(sb2, "    height", i16, i17, i18, i19, i20, f12, i21);
        float f14 = this.Y;
        int i22 = this.Z;
        if (f14 != s0.g.f34069a) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f14);
            sb2.append(",");
            sb2.append(i22);
            sb2.append(HttpUrl.FRAGMENT_ENCODE_SET);
            sb2.append("],\n");
        }
        J(sb2, "    horizontalBias", this.f20859f0, 0.5f);
        J(sb2, "    verticalBias", this.f20861g0, 0.5f);
        I(this.f20869k0, 0, "    horizontalChainStyle", sb2);
        I(this.f20871l0, 0, "    verticalChainStyle", sb2);
        sb2.append("  }");
    }

    public final int s() {
        if (this.f20865i0 == 8) {
            return 0;
        }
        return this.W;
    }

    public final int t() {
        d dVar = this.V;
        if (dVar != null && (dVar instanceof e)) {
            return ((e) dVar).f20897z0 + this.f20849a0;
        }
        return this.f20849a0;
    }

    public String toString() {
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        StringBuilder p10 = da.e.p(HttpUrl.FRAGMENT_ENCODE_SET);
        if (this.f20867j0 != null) {
            str = nn.d.o(new StringBuilder("id: "), this.f20867j0, " ");
        }
        p10.append(str);
        p10.append("(");
        p10.append(this.f20849a0);
        p10.append(", ");
        p10.append(this.f20851b0);
        p10.append(") - (");
        p10.append(this.W);
        p10.append(" x ");
        return nn.d.m(p10, this.X, ")");
    }

    public final int u() {
        d dVar = this.V;
        if (dVar != null && (dVar instanceof e)) {
            return ((e) dVar).A0 + this.f20851b0;
        }
        return this.f20851b0;
    }

    public final boolean v(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (i10 == 0) {
            if (this.K.f20844f != null) {
                i14 = 1;
            } else {
                i14 = 0;
            }
            if (this.M.f20844f != null) {
                i15 = 1;
            } else {
                i15 = 0;
            }
            if (i14 + i15 >= 2) {
                return false;
            }
            return true;
        }
        if (this.L.f20844f != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (this.N.f20844f != null) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        int i16 = i11 + i12;
        if (this.O.f20844f != null) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        if (i16 + i13 >= 2) {
            return false;
        }
        return true;
    }

    public final boolean w(int i10, int i11) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i10 == 0) {
            c cVar5 = this.K;
            c cVar6 = cVar5.f20844f;
            if (cVar6 != null && cVar6.f20841c && (cVar4 = (cVar3 = this.M).f20844f) != null && cVar4.f20841c) {
                if ((cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f20844f.d()) >= i11) {
                    return true;
                }
                return false;
            }
        } else {
            c cVar7 = this.L;
            c cVar8 = cVar7.f20844f;
            if (cVar8 != null && cVar8.f20841c && (cVar2 = (cVar = this.N).f20844f) != null && cVar2.f20841c) {
                if ((cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f20844f.d()) >= i11) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final void x(int i10, d dVar, int i11, int i12, int i13) {
        k(i10).b(dVar.k(i11), i12, i13, true);
    }

    public final boolean y(int i10) {
        c cVar;
        c cVar2;
        int i11 = i10 * 2;
        c[] cVarArr = this.S;
        c cVar3 = cVarArr[i11];
        c cVar4 = cVar3.f20844f;
        if (cVar4 != null && cVar4.f20844f != cVar3 && (cVar2 = (cVar = cVarArr[i11 + 1]).f20844f) != null && cVar2.f20844f == cVar) {
            return true;
        }
        return false;
    }

    public final boolean z() {
        c cVar = this.K;
        c cVar2 = cVar.f20844f;
        if (cVar2 == null || cVar2.f20844f != cVar) {
            c cVar3 = this.M;
            c cVar4 = cVar3.f20844f;
            if (cVar4 != null && cVar4.f20844f == cVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public d(int i10, int i11) {
        this.f20848a = false;
        this.f20854d = null;
        this.f20856e = null;
        this.f20858f = new boolean[]{true, true};
        this.f20860g = true;
        this.f20862h = true;
        this.f20864i = -1;
        this.f20866j = -1;
        this.f20868k = new g3.l(this);
        this.f20872m = false;
        this.f20874n = false;
        this.f20875o = false;
        this.f20877p = false;
        this.f20879q = -1;
        this.f20881r = -1;
        this.f20883s = 0;
        this.f20884t = 0;
        this.f20885u = 0;
        this.f20886v = new int[2];
        this.f20887w = 0;
        this.f20888x = 0;
        this.f20889y = 1.0f;
        this.f20890z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = -1;
        this.D = 1.0f;
        this.E = new int[]{Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER};
        this.F = Float.NaN;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        c cVar = new c(this, 2);
        this.K = cVar;
        c cVar2 = new c(this, 3);
        this.L = cVar2;
        c cVar3 = new c(this, 4);
        this.M = cVar3;
        c cVar4 = new c(this, 5);
        this.N = cVar4;
        c cVar5 = new c(this, 6);
        this.O = cVar5;
        this.P = new c(this, 8);
        this.Q = new c(this, 9);
        c cVar6 = new c(this, 7);
        this.R = cVar6;
        this.S = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar6};
        this.T = new ArrayList();
        this.U = new boolean[2];
        this.f20882r0 = new int[]{1, 1};
        this.V = null;
        this.Y = s0.g.f34069a;
        this.Z = -1;
        this.f20853c0 = 0;
        this.f20859f0 = 0.5f;
        this.f20861g0 = 0.5f;
        this.f20865i0 = 0;
        this.f20867j0 = null;
        this.f20869k0 = 0;
        this.f20871l0 = 0;
        this.f20873m0 = new float[]{-1.0f, -1.0f};
        this.n0 = new d[]{null, null};
        this.f20876o0 = new d[]{null, null};
        this.f20878p0 = -1;
        this.f20880q0 = -1;
        this.f20849a0 = 0;
        this.f20851b0 = 0;
        this.W = i10;
        this.X = i11;
        b();
    }
}
