package gg;

import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.n;
import t0.r;

/* loaded from: classes.dex */
public final class a extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17385a = new k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            r rVar = (r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        al.d.k(nVar, 0);
        return Unit.f23355a;
    }
}
