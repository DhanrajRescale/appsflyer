package d0;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final d1.e f13213a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f13214b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f13215c = new LinkedHashMap();

    public s(d1.e eVar, c0.r rVar) {
        this.f13213a = eVar;
        this.f13214b = rVar;
    }

    public final Function2 a(int i10, Object obj, Object obj2) {
        b1.c cVar;
        LinkedHashMap linkedHashMap = this.f13215c;
        r rVar = (r) linkedHashMap.get(obj);
        int i11 = 3;
        if (rVar != null && rVar.f13207c == i10 && Intrinsics.a(rVar.f13206b, obj2)) {
            Function2 function2 = rVar.f13208d;
            if (function2 == null) {
                y.q0 q0Var = new y.q0(i11, rVar.f13209e, rVar);
                Object obj3 = b1.d.f3079a;
                cVar = new b1.c(q0Var, true, 1403994769);
                rVar.f13208d = cVar;
            } else {
                return function2;
            }
        } else {
            r rVar2 = new r(this, i10, obj, obj2);
            linkedHashMap.put(obj, rVar2);
            Function2 function22 = rVar2.f13208d;
            if (function22 == null) {
                y.q0 q0Var2 = new y.q0(i11, this, rVar2);
                Object obj4 = b1.d.f3079a;
                cVar = new b1.c(q0Var2, true, 1403994769);
                rVar2.f13208d = cVar;
            } else {
                return function22;
            }
        }
        return cVar;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        r rVar = (r) this.f13215c.get(obj);
        if (rVar != null) {
            return rVar.f13206b;
        }
        u uVar = (u) this.f13214b.mo2invoke();
        int b10 = uVar.b(obj);
        if (b10 == -1) {
            return null;
        }
        return uVar.d(b10);
    }
}
