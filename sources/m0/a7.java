package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class a7 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f25889c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(boolean z10, y yVar, yt.a aVar) {
        super(2, aVar);
        this.f25888b = z10;
        this.f25889c = yVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new a7(this.f25888b, this.f25889c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a7) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f25887a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            y yVar = this.f25889c;
            boolean booleanValue = ((Boolean) yVar.f27120g.getValue()).booleanValue();
            boolean z10 = this.f25888b;
            if (z10 != booleanValue) {
                Boolean valueOf = Boolean.valueOf(z10);
                this.f25887a = 1;
                if (pp.b.s(yVar, valueOf, yVar.f27124k.i(), this) == aVar) {
                    return aVar;
                }
            }
        }
        return Unit.f23355a;
    }
}
