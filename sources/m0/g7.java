package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class g7 extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f26215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f26216b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(b1.c cVar, Function2 function2) {
        super(3);
        this.f26215a = cVar;
        this.f26216b = function2;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        t0.n nVar = (t0.n) obj2;
        if ((((Number) obj3).intValue() & 17) == 16) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        m7.d(this.f26215a, this.f26216b, nVar, 0);
        return Unit.f23355a;
    }
}
