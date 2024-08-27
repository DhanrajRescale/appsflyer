package h7;

import au.i;
import el.l;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class d extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f18029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f18030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f18031c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CoroutineContext coroutineContext, b bVar, yt.a aVar) {
        super(2, aVar);
        this.f18030b = coroutineContext;
        this.f18031c = bVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f18030b, this.f18031c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = zt.a.f42823a;
        int i10 = this.f18029a;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        } else {
            n.b(obj);
            k kVar = k.f23369a;
            CoroutineContext coroutineContext = this.f18030b;
            boolean a10 = Intrinsics.a(coroutineContext, kVar);
            b bVar = this.f18031c;
            if (a10) {
                this.f18029a = 1;
                bVar.getClass();
                Object B = l.B(bVar.f18022a, new a(bVar, null), this);
                if (B != obj2) {
                    B = Unit.f23355a;
                }
                if (B == obj2) {
                    return obj2;
                }
            } else {
                c cVar = new c(bVar, null);
                this.f18029a = 2;
                if (yk.g.e0(coroutineContext, cVar, this) == obj2) {
                    return obj2;
                }
            }
        }
        return Unit.f23355a;
    }
}
