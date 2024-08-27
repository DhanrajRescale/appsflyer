package uu;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes2.dex */
public final class j extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f37438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f37439b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tu.g f37440c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f37441d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, tu.g gVar, Object obj, yt.a aVar) {
        super(2, aVar);
        this.f37439b = nVar;
        this.f37440c = gVar;
        this.f37441d = obj;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j(this.f37439b, this.f37440c, this.f37441d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f37438a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            hu.c cVar = this.f37439b.f37455e;
            this.f37438a = 1;
            if (cVar.b(this.f37440c, this.f37441d, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
