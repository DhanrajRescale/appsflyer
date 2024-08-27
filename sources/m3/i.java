package m3;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f27374a;

    /* renamed from: b, reason: collision with root package name */
    public final l f27375b;

    /* renamed from: c, reason: collision with root package name */
    public final k f27376c;

    /* renamed from: d, reason: collision with root package name */
    public final j f27377d;

    /* renamed from: e, reason: collision with root package name */
    public final m f27378e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f27379f;

    /* JADX WARN: Type inference failed for: r0v0, types: [m3.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [m3.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [m3.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [m3.m, java.lang.Object] */
    public i() {
        ?? obj = new Object();
        obj.f27431a = 0;
        obj.f27432b = 0;
        obj.f27433c = 1.0f;
        obj.f27434d = Float.NaN;
        this.f27375b = obj;
        ?? obj2 = new Object();
        obj2.f27422a = -1;
        obj2.f27423b = 0;
        obj2.f27424c = -1;
        obj2.f27425d = Float.NaN;
        obj2.f27426e = Float.NaN;
        obj2.f27427f = Float.NaN;
        obj2.f27428g = -1;
        obj2.f27429h = null;
        obj2.f27430i = -1;
        this.f27376c = obj2;
        ?? obj3 = new Object();
        obj3.f27381a = false;
        obj3.f27387d = -1;
        obj3.f27389e = -1;
        obj3.f27391f = -1.0f;
        obj3.f27393g = true;
        obj3.f27395h = -1;
        obj3.f27397i = -1;
        obj3.f27399j = -1;
        obj3.f27401k = -1;
        obj3.f27403l = -1;
        obj3.f27405m = -1;
        obj3.f27407n = -1;
        obj3.f27408o = -1;
        obj3.f27410p = -1;
        obj3.f27411q = -1;
        obj3.f27412r = -1;
        obj3.f27413s = -1;
        obj3.f27414t = -1;
        obj3.f27415u = -1;
        obj3.f27416v = -1;
        obj3.f27417w = 0.5f;
        obj3.f27418x = 0.5f;
        obj3.f27419y = null;
        obj3.f27420z = -1;
        obj3.A = 0;
        obj3.B = s0.g.f34069a;
        obj3.C = -1;
        obj3.D = -1;
        obj3.E = -1;
        obj3.F = 0;
        obj3.G = 0;
        obj3.H = 0;
        obj3.I = 0;
        obj3.J = 0;
        obj3.K = 0;
        obj3.L = 0;
        obj3.M = Integer.MIN_VALUE;
        obj3.N = Integer.MIN_VALUE;
        obj3.O = Integer.MIN_VALUE;
        obj3.P = Integer.MIN_VALUE;
        obj3.Q = Integer.MIN_VALUE;
        obj3.R = Integer.MIN_VALUE;
        obj3.S = Integer.MIN_VALUE;
        obj3.T = -1.0f;
        obj3.U = -1.0f;
        obj3.V = 0;
        obj3.W = 0;
        obj3.X = 0;
        obj3.Y = 0;
        obj3.Z = 0;
        obj3.f27382a0 = 0;
        obj3.f27384b0 = 0;
        obj3.f27386c0 = 0;
        obj3.f27388d0 = 1.0f;
        obj3.f27390e0 = 1.0f;
        obj3.f27392f0 = -1;
        obj3.f27394g0 = 0;
        obj3.f27396h0 = -1;
        obj3.f27404l0 = false;
        obj3.f27406m0 = false;
        obj3.n0 = true;
        obj3.f27409o0 = 0;
        this.f27377d = obj3;
        ?? obj4 = new Object();
        obj4.f27436a = s0.g.f34069a;
        obj4.f27437b = s0.g.f34069a;
        obj4.f27438c = s0.g.f34069a;
        obj4.f27439d = 1.0f;
        obj4.f27440e = 1.0f;
        obj4.f27441f = Float.NaN;
        obj4.f27442g = Float.NaN;
        obj4.f27443h = -1;
        obj4.f27444i = s0.g.f34069a;
        obj4.f27445j = s0.g.f34069a;
        obj4.f27446k = s0.g.f34069a;
        obj4.f27447l = false;
        obj4.f27448m = s0.g.f34069a;
        this.f27378e = obj4;
        this.f27379f = new HashMap();
    }

    public final void a(d dVar) {
        j jVar = this.f27377d;
        dVar.f27314e = jVar.f27395h;
        dVar.f27316f = jVar.f27397i;
        dVar.f27318g = jVar.f27399j;
        dVar.f27320h = jVar.f27401k;
        dVar.f27322i = jVar.f27403l;
        dVar.f27324j = jVar.f27405m;
        dVar.f27326k = jVar.f27407n;
        dVar.f27328l = jVar.f27408o;
        dVar.f27330m = jVar.f27410p;
        dVar.f27332n = jVar.f27411q;
        dVar.f27333o = jVar.f27412r;
        dVar.f27339s = jVar.f27413s;
        dVar.f27340t = jVar.f27414t;
        dVar.f27341u = jVar.f27415u;
        dVar.f27342v = jVar.f27416v;
        ((ViewGroup.MarginLayoutParams) dVar).leftMargin = jVar.F;
        ((ViewGroup.MarginLayoutParams) dVar).rightMargin = jVar.G;
        ((ViewGroup.MarginLayoutParams) dVar).topMargin = jVar.H;
        ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = jVar.I;
        dVar.A = jVar.R;
        dVar.B = jVar.Q;
        dVar.f27344x = jVar.N;
        dVar.f27346z = jVar.P;
        dVar.E = jVar.f27417w;
        dVar.F = jVar.f27418x;
        dVar.f27335p = jVar.f27420z;
        dVar.f27337q = jVar.A;
        dVar.f27338r = jVar.B;
        dVar.G = jVar.f27419y;
        dVar.T = jVar.C;
        dVar.U = jVar.D;
        dVar.I = jVar.T;
        dVar.H = jVar.U;
        dVar.K = jVar.W;
        dVar.J = jVar.V;
        dVar.W = jVar.f27404l0;
        dVar.X = jVar.f27406m0;
        dVar.L = jVar.X;
        dVar.M = jVar.Y;
        dVar.P = jVar.Z;
        dVar.Q = jVar.f27382a0;
        dVar.N = jVar.f27384b0;
        dVar.O = jVar.f27386c0;
        dVar.R = jVar.f27388d0;
        dVar.S = jVar.f27390e0;
        dVar.V = jVar.E;
        dVar.f27310c = jVar.f27391f;
        dVar.f27306a = jVar.f27387d;
        dVar.f27308b = jVar.f27389e;
        ((ViewGroup.MarginLayoutParams) dVar).width = jVar.f27383b;
        ((ViewGroup.MarginLayoutParams) dVar).height = jVar.f27385c;
        String str = jVar.f27402k0;
        if (str != null) {
            dVar.Y = str;
        }
        dVar.Z = jVar.f27409o0;
        dVar.setMarginStart(jVar.K);
        dVar.setMarginEnd(jVar.J);
        dVar.a();
    }

    public final Object clone() {
        i iVar = new i();
        j jVar = iVar.f27377d;
        jVar.getClass();
        j jVar2 = this.f27377d;
        jVar.f27381a = jVar2.f27381a;
        jVar.f27383b = jVar2.f27383b;
        jVar.f27385c = jVar2.f27385c;
        jVar.f27387d = jVar2.f27387d;
        jVar.f27389e = jVar2.f27389e;
        jVar.f27391f = jVar2.f27391f;
        jVar.f27393g = jVar2.f27393g;
        jVar.f27395h = jVar2.f27395h;
        jVar.f27397i = jVar2.f27397i;
        jVar.f27399j = jVar2.f27399j;
        jVar.f27401k = jVar2.f27401k;
        jVar.f27403l = jVar2.f27403l;
        jVar.f27405m = jVar2.f27405m;
        jVar.f27407n = jVar2.f27407n;
        jVar.f27408o = jVar2.f27408o;
        jVar.f27410p = jVar2.f27410p;
        jVar.f27411q = jVar2.f27411q;
        jVar.f27412r = jVar2.f27412r;
        jVar.f27413s = jVar2.f27413s;
        jVar.f27414t = jVar2.f27414t;
        jVar.f27415u = jVar2.f27415u;
        jVar.f27416v = jVar2.f27416v;
        jVar.f27417w = jVar2.f27417w;
        jVar.f27418x = jVar2.f27418x;
        jVar.f27419y = jVar2.f27419y;
        jVar.f27420z = jVar2.f27420z;
        jVar.A = jVar2.A;
        jVar.B = jVar2.B;
        jVar.C = jVar2.C;
        jVar.D = jVar2.D;
        jVar.E = jVar2.E;
        jVar.F = jVar2.F;
        jVar.G = jVar2.G;
        jVar.H = jVar2.H;
        jVar.I = jVar2.I;
        jVar.J = jVar2.J;
        jVar.K = jVar2.K;
        jVar.L = jVar2.L;
        jVar.M = jVar2.M;
        jVar.N = jVar2.N;
        jVar.O = jVar2.O;
        jVar.P = jVar2.P;
        jVar.Q = jVar2.Q;
        jVar.R = jVar2.R;
        jVar.S = jVar2.S;
        jVar.T = jVar2.T;
        jVar.U = jVar2.U;
        jVar.V = jVar2.V;
        jVar.W = jVar2.W;
        jVar.X = jVar2.X;
        jVar.Y = jVar2.Y;
        jVar.Z = jVar2.Z;
        jVar.f27382a0 = jVar2.f27382a0;
        jVar.f27384b0 = jVar2.f27384b0;
        jVar.f27386c0 = jVar2.f27386c0;
        jVar.f27388d0 = jVar2.f27388d0;
        jVar.f27390e0 = jVar2.f27390e0;
        jVar.f27392f0 = jVar2.f27392f0;
        jVar.f27394g0 = jVar2.f27394g0;
        jVar.f27396h0 = jVar2.f27396h0;
        jVar.f27402k0 = jVar2.f27402k0;
        int[] iArr = jVar2.f27398i0;
        if (iArr != null && jVar2.f27400j0 == null) {
            jVar.f27398i0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            jVar.f27398i0 = null;
        }
        jVar.f27400j0 = jVar2.f27400j0;
        jVar.f27404l0 = jVar2.f27404l0;
        jVar.f27406m0 = jVar2.f27406m0;
        jVar.n0 = jVar2.n0;
        jVar.f27409o0 = jVar2.f27409o0;
        k kVar = iVar.f27376c;
        kVar.getClass();
        k kVar2 = this.f27376c;
        kVar2.getClass();
        kVar.f27422a = kVar2.f27422a;
        kVar.f27424c = kVar2.f27424c;
        kVar.f27426e = kVar2.f27426e;
        kVar.f27425d = kVar2.f27425d;
        l lVar = iVar.f27375b;
        lVar.getClass();
        l lVar2 = this.f27375b;
        lVar2.getClass();
        lVar.f27431a = lVar2.f27431a;
        lVar.f27433c = lVar2.f27433c;
        lVar.f27434d = lVar2.f27434d;
        lVar.f27432b = lVar2.f27432b;
        m mVar = iVar.f27378e;
        mVar.getClass();
        m mVar2 = this.f27378e;
        mVar2.getClass();
        mVar.f27436a = mVar2.f27436a;
        mVar.f27437b = mVar2.f27437b;
        mVar.f27438c = mVar2.f27438c;
        mVar.f27439d = mVar2.f27439d;
        mVar.f27440e = mVar2.f27440e;
        mVar.f27441f = mVar2.f27441f;
        mVar.f27442g = mVar2.f27442g;
        mVar.f27443h = mVar2.f27443h;
        mVar.f27444i = mVar2.f27444i;
        mVar.f27445j = mVar2.f27445j;
        mVar.f27446k = mVar2.f27446k;
        mVar.f27447l = mVar2.f27447l;
        mVar.f27448m = mVar2.f27448m;
        iVar.f27374a = this.f27374a;
        return iVar;
    }
}
