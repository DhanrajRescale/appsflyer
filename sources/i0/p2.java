package i0;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p2 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final p2 f19108a = new iu.k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        q2 q2Var = (q2) obj2;
        Object[] objArr = new Object[2];
        boolean z10 = false;
        objArr[0] = Float.valueOf(q2Var.f19157a.i());
        if (((y.g1) q2Var.f19161e.getValue()) == y.g1.f40723a) {
            z10 = true;
        }
        objArr[1] = Boolean.valueOf(z10);
        return vt.y.g(objArr);
    }
}
