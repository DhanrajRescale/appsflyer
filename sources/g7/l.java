package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16877a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16878b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tu.f f16879c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f16880d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(tu.f fVar, yt.a aVar, m mVar) {
        super(2, aVar);
        this.f16879c = fVar;
        this.f16880d = mVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        l lVar = new l(this.f16879c, aVar, this.f16880d);
        lVar.f16878b = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((tu.g) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16877a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            k kVar = new k((tu.g) this.f16878b, this.f16880d);
            this.f16877a = 1;
            if (this.f16879c.c(kVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
