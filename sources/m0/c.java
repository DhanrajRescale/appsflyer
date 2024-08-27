package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f25957b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f25958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(y yVar, float f10, yt.a aVar) {
        super(2, aVar);
        this.f25957b = yVar;
        this.f25958c = f10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c(this.f25957b, this.f25958c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f25956a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f25956a = 1;
            if (this.f25957b.j(this.f25958c, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
