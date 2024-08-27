package uu;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class g extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f37434a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37435b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f37436c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, yt.a aVar) {
        super(2, aVar);
        this.f37436c = hVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        g gVar = new g(this.f37436c, aVar);
        gVar.f37435b = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((tu.g) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f37434a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            tu.g gVar = (tu.g) this.f37435b;
            this.f37434a = 1;
            if (this.f37436c.l(gVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
