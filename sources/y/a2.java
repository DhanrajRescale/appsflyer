package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class a2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f40611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2 f40612b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f40613c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(j2 j2Var, long j10, yt.a aVar) {
        super(2, aVar);
        this.f40612b = j2Var;
        this.f40613c = j10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        a2 a2Var = new a2(this.f40612b, this.f40613c, aVar);
        a2Var.f40611a = obj;
        return a2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a2) create((q1) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        this.f40612b.a((q1) this.f40611a, this.f40613c, 4);
        return Unit.f23355a;
    }
}
