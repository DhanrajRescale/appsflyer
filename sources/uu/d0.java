package uu;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class d0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f37425a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tu.g f37427c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(tu.g gVar, yt.a aVar) {
        super(2, aVar);
        this.f37427c = gVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        d0 d0Var = new d0(this.f37427c, aVar);
        d0Var.f37426b = obj;
        return d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create(obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f37425a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            Object obj2 = this.f37426b;
            this.f37425a = 1;
            if (this.f37427c.a(obj2, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
