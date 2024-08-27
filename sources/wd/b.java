package wd;

import au.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.w4;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4 f39014b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(w4 w4Var, yt.a aVar) {
        super(2, aVar);
        this.f39014b = w4Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new b(this.f39014b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39013a;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            this.f39013a = 1;
            if (this.f39014b.d(this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
