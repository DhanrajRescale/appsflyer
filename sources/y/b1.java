package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f40623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2 f40624b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f40625c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(j2 j2Var, long j10, yt.a aVar) {
        super(2, aVar);
        this.f40624b = j2Var;
        this.f40625c = j10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        b1 b1Var = new b1(this.f40624b, this.f40625c, aVar);
        b1Var.f40623a = obj;
        return b1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b1) create((q1) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        this.f40624b.a((q1) this.f40623a, this.f40625c, 4);
        return Unit.f23355a;
    }
}
