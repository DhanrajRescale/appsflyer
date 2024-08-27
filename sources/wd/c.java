package wd;

import au.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.w4;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4 f39016b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(w4 w4Var, yt.a aVar) {
        super(2, aVar);
        this.f39016b = w4Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c(this.f39016b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39015a;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            this.f39015a = 1;
            if (this.f39016b.e(this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
