package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0.l f39511b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.i f39512c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a0.l lVar, a0.i iVar, yt.a aVar) {
        super(2, aVar);
        this.f39511b = lVar;
        this.f39512c = iVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c(this.f39511b, this.f39512c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39510a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f39510a = 1;
            if (this.f39511b.a(this.f39512c, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
