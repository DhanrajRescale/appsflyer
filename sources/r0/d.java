package r0;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class d extends au.i implements hu.d {

    /* renamed from: a, reason: collision with root package name */
    public int f32353a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ p f32354b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ f1 f32355c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f32356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f32357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f32358f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t tVar, float f10, yt.a aVar) {
        super(4, aVar);
        this.f32357e = tVar;
        this.f32358f = f10;
    }

    @Override // hu.d
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        d dVar = new d(this.f32357e, this.f32358f, (yt.a) obj4);
        dVar.f32354b = (p) obj;
        dVar.f32355c = (f1) obj2;
        dVar.f32356d = obj3;
        return dVar.invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [iu.w, java.lang.Object] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        float i10;
        zt.a aVar = zt.a.f42823a;
        int i11 = this.f32353a;
        if (i11 != 0) {
            if (i11 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            p pVar = this.f32354b;
            float c10 = this.f32355c.c(this.f32356d);
            if (!Float.isNaN(c10)) {
                ?? obj2 = new Object();
                t tVar = this.f32357e;
                if (Float.isNaN(tVar.f32724i.i())) {
                    i10 = s0.g.f34069a;
                } else {
                    i10 = tVar.f32724i.i();
                }
                float f10 = i10;
                obj2.f20557a = f10;
                float f11 = this.f32358f;
                w.f1 f1Var = b.f32328a;
                c cVar = new c(0, pVar, obj2);
                this.f32354b = null;
                this.f32355c = null;
                this.f32353a = 1;
                if (w.e.c(f10, c10, f11, f1Var, cVar, this) == aVar) {
                    return aVar;
                }
            }
        }
        return Unit.f23355a;
    }
}
