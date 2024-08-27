package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class l extends au.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f32526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f32527b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hu.c f32528c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(t tVar, yt.a aVar, hu.c cVar) {
        super(1, aVar);
        this.f32527b = tVar;
        this.f32528c = cVar;
    }

    @Override // au.a
    public final yt.a create(yt.a aVar) {
        return new l(this.f32527b, aVar, this.f32528c);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((l) create((yt.a) obj)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f32526a;
        int i11 = 1;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            t tVar = this.f32527b;
            r rVar = new r(tVar, i11);
            k kVar = new k(tVar, null, this.f32528c);
            this.f32526a = 1;
            if (al.d.J(rVar, kVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
