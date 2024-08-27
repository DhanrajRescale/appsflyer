package b1;

import d0.n0;
import iu.k;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.n;
import t0.r;
import t0.w1;
import t0.x1;
import t0.y1;
import w.t1;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f3074a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3075b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3076c;

    /* renamed from: d, reason: collision with root package name */
    public x1 f3077d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3078e;

    public c(k kVar, boolean z10, int i10) {
        this.f3074a = i10;
        this.f3075b = z10;
        this.f3076c = kVar;
    }

    public final Object a(Object obj, Object obj2, Object obj3, Object obj4, n nVar, int i10) {
        int a10;
        r rVar = (r) nVar;
        rVar.c0(this.f3074a);
        f(rVar);
        if (rVar.h(this)) {
            a10 = d.a(2, 4);
        } else {
            a10 = d.a(1, 4);
        }
        Object obj5 = this.f3076c;
        Intrinsics.d(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        zq.f.z(6, obj5);
        Object h10 = ((hu.e) obj5).h(obj, obj2, obj3, obj4, rVar, Integer.valueOf(i10 | a10));
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new b(this, obj, obj2, obj3, obj4, i10, 0);
        }
        return h10;
    }

    @Override // hu.c
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        return e(obj, (n) obj2, ((Number) obj3).intValue());
    }

    public final Object d(Object obj, Object obj2, n nVar, int i10) {
        int a10;
        r rVar = (r) nVar;
        rVar.c0(this.f3074a);
        f(rVar);
        if (rVar.h(this)) {
            a10 = d.a(2, 2);
        } else {
            a10 = d.a(1, 2);
        }
        Object obj3 = this.f3076c;
        Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        zq.f.z(4, obj3);
        Object g10 = ((hu.d) obj3).g(obj, obj2, rVar, Integer.valueOf(a10 | i10));
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new n0(this, obj, obj2, i10, 3);
        }
        return g10;
    }

    public final Object e(Object obj, n nVar, int i10) {
        int a10;
        r rVar = (r) nVar;
        rVar.c0(this.f3074a);
        f(rVar);
        if (rVar.h(this)) {
            a10 = d.a(2, 1);
        } else {
            a10 = d.a(1, 1);
        }
        Object obj2 = this.f3076c;
        Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        zq.f.z(3, obj2);
        Object b10 = ((hu.c) obj2).b(obj, rVar, Integer.valueOf(a10 | i10));
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new t1(this, obj, i10, 7);
        }
        return b10;
    }

    public final void f(n nVar) {
        r rVar;
        x1 D;
        if (this.f3075b && (D = (rVar = (r) nVar).D()) != null) {
            rVar.getClass();
            D.f35242a |= 1;
            if (d.d(this.f3077d, D)) {
                this.f3077d = D;
                return;
            }
            ArrayList arrayList = this.f3078e;
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList();
                this.f3078e = arrayList2;
                arrayList2.add(D);
                return;
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (d.d((w1) arrayList.get(i10), D)) {
                    arrayList.set(i10, D);
                    return;
                }
            }
            arrayList.add(D);
        }
    }

    @Override // hu.d
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        return d(obj, obj2, (n) obj3, ((Number) obj4).intValue());
    }

    @Override // hu.e
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Integer num) {
        return a(obj, obj2, obj3, obj4, (n) obj5, num.intValue());
    }

    public final void i(k kVar) {
        boolean z10;
        if (!Intrinsics.a(this.f3076c, kVar)) {
            if (this.f3076c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f3076c = kVar;
            if (!z10 && this.f3075b) {
                x1 x1Var = this.f3077d;
                if (x1Var != null) {
                    y1 y1Var = x1Var.f35243b;
                    if (y1Var != null) {
                        y1Var.d(x1Var, null);
                    }
                    this.f3077d = null;
                }
                ArrayList arrayList = this.f3078e;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        x1 x1Var2 = (x1) ((w1) arrayList.get(i10));
                        y1 y1Var2 = x1Var2.f35243b;
                        if (y1Var2 != null) {
                            y1Var2.d(x1Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int a10;
        int intValue = ((Number) obj2).intValue();
        r rVar = (r) ((n) obj);
        rVar.c0(this.f3074a);
        f(rVar);
        if (rVar.h(this)) {
            a10 = d.a(2, 0);
        } else {
            a10 = d.a(1, 0);
        }
        int i10 = intValue | a10;
        Object obj3 = this.f3076c;
        Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        zq.f.z(2, obj3);
        Object invoke = ((Function2) obj3).invoke(rVar, Integer.valueOf(i10));
        x1 w10 = rVar.w();
        if (w10 != null) {
            zq.f.z(2, this);
            w10.f35245d = this;
        }
        return invoke;
    }
}
