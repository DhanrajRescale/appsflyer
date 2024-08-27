package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39592a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39593b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f39594c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, yt.a aVar) {
        super(2, aVar);
        this.f39594c = kVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        j jVar = new j(this.f39594c, aVar);
        jVar.f39593b = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((x1.z) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39592a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            x1.z zVar = (x1.z) this.f39593b;
            this.f39592a = 1;
            if (this.f39594c.U0(zVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
