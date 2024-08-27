package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39498a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0.l f39499b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.h f39500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a0.l lVar, a0.h hVar, yt.a aVar) {
        super(2, aVar);
        this.f39499b = lVar;
        this.f39500c = hVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new b(this.f39499b, this.f39500c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39498a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f39498a = 1;
            if (this.f39499b.a(this.f39500c, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
