package m0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w7 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f27042a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2.k1 f27043b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f27044c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f27046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f27047f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu.c f27048g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f27049h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27050i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(ArrayList arrayList, a2.k1 k1Var, Function2 function2, int i10, long j10, int i11, hu.c cVar, ArrayList arrayList2, int i12) {
        super(1);
        this.f27042a = arrayList;
        this.f27043b = k1Var;
        this.f27044c = function2;
        this.f27045d = i10;
        this.f27046e = j10;
        this.f27047f = i11;
        this.f27048g = cVar;
        this.f27049h = arrayList2;
        this.f27050i = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        a2.z0 z0Var = (a2.z0) obj;
        List list = this.f27042a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            a2.z0.g(z0Var, (a2.a1) list.get(i11), this.f27045d * i11, 0);
        }
        a8 a8Var = a8.f25891b;
        Function2 function2 = this.f27044c;
        a2.k1 k1Var = this.f27043b;
        List k10 = k1Var.k(a8Var, function2);
        long j10 = this.f27046e;
        int size2 = k10.size();
        int i12 = 0;
        while (true) {
            i10 = this.f27047f;
            if (i12 >= size2) {
                break;
            }
            a2.a1 E = ((a2.l0) k10.get(i12)).E(w2.a.a(j10, 0, 0, 0, 0, 11));
            a2.z0.g(z0Var, E, 0, i10 - E.f30b);
            i12++;
            k10 = k10;
        }
        a8 a8Var2 = a8.f25892c;
        r7 r7Var = new r7(this.f27048g, this.f27049h, 1);
        Object obj2 = b1.d.f3079a;
        List k11 = k1Var.k(a8Var2, new b1.c(r7Var, true, -641946361));
        int size3 = k11.size();
        for (int i13 = 0; i13 < size3; i13++) {
            a2.l0 l0Var = (a2.l0) k11.get(i13);
            int i14 = this.f27050i;
            if (i14 >= 0 && i10 >= 0) {
                a2.z0.g(z0Var, l0Var.E(hl.f.Q(i14, i14, i10, i10)), 0, 0);
            } else {
                yk.j.A1("width(" + i14 + ") and height(" + i10 + ") must be >= 0");
                throw null;
            }
        }
        return Unit.f23355a;
    }
}
