package r0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i3 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f32451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2.k1 f32452c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f32453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s2 f32454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f32455f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f32456g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f32457h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f32458i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f32459j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ hu.c f32460k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(int i10, ArrayList arrayList, a2.k1 k1Var, Function2 function2, s2 s2Var, int i11, ArrayList arrayList2, long j10, int i12, int i13, hu.c cVar) {
        super(1);
        this.f32450a = i10;
        this.f32451b = arrayList;
        this.f32452c = k1Var;
        this.f32453d = function2;
        this.f32454e = s2Var;
        this.f32455f = i11;
        this.f32456g = arrayList2;
        this.f32457h = j10;
        this.f32458i = i12;
        this.f32459j = i13;
        this.f32460k = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a2.k1 k1Var;
        int i10;
        a2.z0 z0Var = (a2.z0) obj;
        ArrayList arrayList = new ArrayList();
        List list = this.f32451b;
        int size = list.size();
        int i11 = this.f32450a;
        int i12 = 0;
        int i13 = i11;
        while (true) {
            k1Var = this.f32452c;
            if (i12 >= size) {
                break;
            }
            a2.a1 a1Var = (a2.a1) list.get(i12);
            a2.z0.g(z0Var, a1Var, i13, 0);
            arrayList.add(new e3(k1Var.N(i13), k1Var.N(a1Var.f29a), ((w2.e) this.f32456g.get(i12)).f38783a));
            i13 += a1Var.f29a;
            i12++;
        }
        List k10 = k1Var.k(l3.f32566b, this.f32453d);
        long j10 = this.f32457h;
        int i14 = this.f32458i;
        int size2 = k10.size();
        int i15 = 0;
        while (true) {
            i10 = this.f32459j;
            if (i15 >= size2) {
                break;
            }
            a2.a1 E = ((a2.l0) k10.get(i15)).E(w2.a.a(j10, i14, i14, 0, 0, 8));
            a2.z0.g(z0Var, E, 0, i10 - E.f30b);
            i15++;
            size2 = size2;
        }
        l3 l3Var = l3.f32567c;
        c cVar = new c(3, this.f32460k, arrayList);
        Object obj2 = b1.d.f3079a;
        List k11 = k1Var.k(l3Var, new b1.c(cVar, true, 358596038));
        int size3 = k11.size();
        for (int i16 = 0; i16 < size3; i16++) {
            a2.l0 l0Var = (a2.l0) k11.get(i16);
            int i17 = this.f32458i;
            if (i17 >= 0 && i10 >= 0) {
                a2.z0.g(z0Var, l0Var.E(hl.f.Q(i17, i17, i10, i10)), 0, 0);
            } else {
                yk.j.A1("width(" + i17 + ") and height(" + i10 + ") must be >= 0");
                throw null;
            }
        }
        s2 s2Var = this.f32454e;
        Integer num = s2Var.f32715c;
        int i18 = this.f32455f;
        if (num == null || num.intValue() != i18) {
            s2Var.f32715c = Integer.valueOf(i18);
            e3 e3Var = (e3) vt.g0.x(i18, arrayList);
            if (e3Var != null) {
                e3 e3Var2 = (e3) vt.g0.C(arrayList);
                int m02 = k1Var.m0(e3Var2.f32386a + e3Var2.f32387b) + i11;
                x.o2 o2Var = s2Var.f32713a;
                int i19 = m02 - o2Var.f39656d.i();
                int m03 = k1Var.m0(e3Var.f32386a) - ((i19 / 2) - (k1Var.m0(e3Var.f32387b) / 2));
                int i20 = m02 - i19;
                if (i20 < 0) {
                    i20 = 0;
                }
                int f10 = kotlin.ranges.d.f(m03, 0, i20);
                if (o2Var.f39653a.i() != f10) {
                    yk.g.H(s2Var.f32714b, null, null, new r2(s2Var, f10, null), 3);
                }
            }
        }
        return Unit.f23355a;
    }
}
