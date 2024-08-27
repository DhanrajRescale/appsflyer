package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f40653a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40654b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f40655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, yt.a aVar) {
        super(2, aVar);
        this.f40655c = jVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        d dVar = new d(this.f40655c, aVar);
        dVar.f40654b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((x1.z) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f40653a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            x1.z zVar = (x1.z) this.f40654b;
            j jVar = this.f40655c;
            if (!jVar.f40780q) {
                return Unit.f23355a;
            }
            c cVar = new c(zVar, jVar, null);
            this.f40653a = 1;
            if (hl.f.P(cVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
