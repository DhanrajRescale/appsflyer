package h7;

import au.i;
import d2.y3;
import g7.x;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class f extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f18034a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f18035b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f18036c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CoroutineContext coroutineContext, b bVar, yt.a aVar) {
        super(2, aVar);
        this.f18035b = coroutineContext;
        this.f18036c = bVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f18035b, this.f18036c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f18034a;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        } else {
            n.b(obj);
            k kVar = k.f23369a;
            CoroutineContext coroutineContext = this.f18035b;
            boolean a10 = Intrinsics.a(coroutineContext, kVar);
            b bVar = this.f18036c;
            if (a10) {
                this.f18034a = 1;
                Object c10 = new x(bVar.f18024c.f16990j, 5).c(new y3(bVar, 3), this);
                if (c10 != aVar) {
                    c10 = Unit.f23355a;
                }
                if (c10 == aVar) {
                    return aVar;
                }
            } else {
                e eVar = new e(bVar, null);
                this.f18034a = 2;
                if (yk.g.e0(coroutineContext, eVar, this) == aVar) {
                    return aVar;
                }
            }
        }
        return Unit.f23355a;
    }
}
