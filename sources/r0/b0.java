package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f32329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w.d f32330b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f32331c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f32332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0 f32333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0.j f32334f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(w.d dVar, float f10, boolean z10, c0 c0Var, a0.j jVar, yt.a aVar) {
        super(2, aVar);
        this.f32330b = dVar;
        this.f32331c = f10;
        this.f32332d = z10;
        this.f32333e = c0Var;
        this.f32334f = jVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new b0(this.f32330b, this.f32331c, this.f32332d, this.f32333e, this.f32334f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        a0.n nVar;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f32329a;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.n.b(obj);
        } else {
            ut.n.b(obj);
            w.d dVar = this.f32330b;
            float f10 = ((w2.e) dVar.f38455e.getValue()).f38783a;
            float f11 = this.f32331c;
            if (!w2.e.a(f10, f11)) {
                if (!this.f32332d) {
                    w2.e eVar = new w2.e(f11);
                    this.f32329a = 1;
                    if (dVar.e(eVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    float f12 = ((w2.e) dVar.f38455e.getValue()).f38783a;
                    c0 c0Var = this.f32333e;
                    if (w2.e.a(f12, c0Var.f32344b)) {
                        nVar = new a0.n(m1.c.f27233b);
                    } else if (w2.e.a(f12, c0Var.f32346d)) {
                        nVar = new Object();
                    } else if (w2.e.a(f12, c0Var.f32345c)) {
                        nVar = new Object();
                    } else {
                        nVar = null;
                    }
                    this.f32329a = 2;
                    if (y0.a(dVar, f11, nVar, this.f32334f, this) == aVar) {
                        return aVar;
                    }
                }
            }
        }
        return Unit.f23355a;
    }
}
