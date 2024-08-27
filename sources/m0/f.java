package m0;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class f extends au.i implements hu.d {

    /* renamed from: a, reason: collision with root package name */
    public int f26130a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ s f26131b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ y3 f26132c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f26133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f26134e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f26135f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(y yVar, float f10, yt.a aVar) {
        super(4, aVar);
        this.f26134e = yVar;
        this.f26135f = f10;
    }

    @Override // hu.d
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        f fVar = new f(this.f26134e, this.f26135f, (yt.a) obj4);
        fVar.f26131b = (s) obj;
        fVar.f26132c = (y3) obj2;
        fVar.f26133d = obj3;
        return fVar.invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [iu.w, java.lang.Object] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        float i10;
        zt.a aVar = zt.a.f42823a;
        int i11 = this.f26130a;
        if (i11 != 0) {
            if (i11 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            s sVar = this.f26131b;
            float c10 = this.f26132c.c(this.f26133d);
            if (!Float.isNaN(c10)) {
                ?? obj2 = new Object();
                y yVar = this.f26134e;
                if (Float.isNaN(yVar.f27123j.i())) {
                    i10 = s0.g.f34069a;
                } else {
                    i10 = yVar.f27123j.i();
                }
                obj2.f20557a = i10;
                float f10 = this.f26135f;
                w.n nVar = yVar.f27116c;
                e eVar = new e(0, sVar, obj2);
                this.f26131b = null;
                this.f26132c = null;
                this.f26130a = 1;
                if (w.e.c(i10, c10, f10, nVar, eVar, this) == aVar) {
                    return aVar;
                }
            }
        }
        return Unit.f23355a;
    }
}
