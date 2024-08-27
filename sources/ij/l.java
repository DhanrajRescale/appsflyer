package ij;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class l extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f20074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f20075b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f20076c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(long j10, Function0 function0, yt.a aVar) {
        super(2, aVar);
        this.f20075b = j10;
        this.f20076c = function0;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new l(this.f20075b, this.f20076c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f20074a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f20074a = 1;
            if (kp.j.K(this.f20075b, this) == aVar) {
                return aVar;
            }
        }
        this.f20076c.mo2invoke();
        return Unit.f23355a;
    }
}
