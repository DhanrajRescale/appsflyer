package y2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f41082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f41083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f41084c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, long j10, yt.a aVar) {
        super(2, aVar);
        this.f41083b = kVar;
        this.f41084c = j10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f41083b, this.f41084c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f41082a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            w1.d dVar = this.f41083b.f41092a;
            this.f41082a = 1;
            if (dVar.b(this.f41084c, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
