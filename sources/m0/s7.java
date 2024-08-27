package m0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class s7 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f26796b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2.k1 f26797c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f26798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d6 f26799e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f26800f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f26801g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ iu.x f26802h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ iu.x f26803i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hu.c f26804j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(int i10, ArrayList arrayList, a2.k1 k1Var, Function2 function2, d6 d6Var, int i11, long j10, iu.x xVar, iu.x xVar2, hu.c cVar) {
        super(1);
        this.f26795a = i10;
        this.f26796b = arrayList;
        this.f26797c = k1Var;
        this.f26798d = function2;
        this.f26799e = d6Var;
        this.f26800f = i11;
        this.f26801g = j10;
        this.f26802h = xVar;
        this.f26803i = xVar2;
        this.f26804j = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a2.k1 k1Var;
        iu.x xVar;
        iu.x xVar2;
        a2.z0 z0Var = (a2.z0) obj;
        ArrayList arrayList = new ArrayList();
        List list = this.f26796b;
        int size = list.size();
        int i10 = 0;
        int i11 = this.f26795a;
        int i12 = 0;
        int i13 = i11;
        while (true) {
            k1Var = this.f26797c;
            if (i12 >= size) {
                break;
            }
            a2.a1 a1Var = (a2.a1) list.get(i12);
            a2.z0.g(z0Var, a1Var, i13, 0);
            arrayList.add(new n7(k1Var.N(i13), k1Var.N(a1Var.f29a)));
            i13 += a1Var.f29a;
            i12++;
        }
        List k10 = k1Var.k(a8.f25891b, this.f26798d);
        long j10 = this.f26801g;
        int size2 = k10.size();
        int i14 = 0;
        while (true) {
            xVar = this.f26803i;
            xVar2 = this.f26802h;
            if (i14 >= size2) {
                break;
            }
            a2.l0 l0Var = (a2.l0) k10.get(i14);
            int i15 = xVar2.f20558a;
            a2.a1 E = l0Var.E(w2.a.a(j10, i15, i15, 0, 0, 8));
            a2.z0.g(z0Var, E, 0, xVar.f20558a - E.f30b);
            i14++;
            i10 = 0;
            k10 = k10;
        }
        a8 a8Var = a8.f25892c;
        r7 r7Var = new r7(this.f26804j, arrayList, i10);
        Object obj2 = b1.d.f3079a;
        List k11 = k1Var.k(a8Var, new b1.c(r7Var, true, -411868839));
        int size3 = k11.size();
        for (int i16 = 0; i16 < size3; i16++) {
            a2.l0 l0Var2 = (a2.l0) k11.get(i16);
            int i17 = xVar2.f20558a;
            int i18 = xVar.f20558a;
            if (i17 >= 0 && i18 >= 0) {
                a2.z0.g(z0Var, l0Var2.E(hl.f.Q(i17, i17, i18, i18)), 0, 0);
            } else {
                yk.j.A1("width(" + i17 + ") and height(" + i18 + ") must be >= 0");
                throw null;
            }
        }
        d6 d6Var = this.f26799e;
        Integer num = d6Var.f26053c;
        int i19 = this.f26800f;
        if (num == null || num.intValue() != i19) {
            d6Var.f26053c = Integer.valueOf(i19);
            n7 n7Var = (n7) vt.g0.x(i19, arrayList);
            if (n7Var != null) {
                n7 n7Var2 = (n7) vt.g0.C(arrayList);
                int m02 = k1Var.m0(n7Var2.f26546a + n7Var2.f26547b) + i11;
                x.o2 o2Var = d6Var.f26051a;
                int i20 = m02 - o2Var.f39656d.i();
                int m03 = k1Var.m0(n7Var.f26546a) - ((i20 / 2) - (k1Var.m0(n7Var.f26547b) / 2));
                int i21 = m02 - i20;
                if (i21 < 0) {
                    i21 = 0;
                }
                int f10 = kotlin.ranges.d.f(m03, 0, i21);
                if (o2Var.f39653a.i() != f10) {
                    yk.g.H(d6Var.f26052b, null, null, new c6(d6Var, f10, null), 3);
                }
            }
        }
        return Unit.f23355a;
    }
}
