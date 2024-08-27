package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i1 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w.d f26272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f26273c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f26274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j1 f26275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0.j f26276f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(w.d dVar, float f10, boolean z10, j1 j1Var, a0.j jVar, yt.a aVar) {
        super(2, aVar);
        this.f26272b = dVar;
        this.f26273c = f10;
        this.f26274d = z10;
        this.f26275e = j1Var;
        this.f26276f = jVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i1(this.f26272b, this.f26273c, this.f26274d, this.f26275e, this.f26276f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i1) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        a0.n nVar;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f26271a;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.n.b(obj);
        } else {
            ut.n.b(obj);
            w.d dVar = this.f26272b;
            float f10 = ((w2.e) dVar.f38455e.getValue()).f38783a;
            float f11 = this.f26273c;
            if (!w2.e.a(f10, f11)) {
                if (!this.f26274d) {
                    w2.e eVar = new w2.e(f11);
                    this.f26271a = 1;
                    if (dVar.e(eVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    float f12 = ((w2.e) dVar.f38455e.getValue()).f38783a;
                    j1 j1Var = this.f26275e;
                    if (w2.e.a(f12, j1Var.f26313b)) {
                        nVar = new a0.n(m1.c.f27233b);
                    } else if (w2.e.a(f12, j1Var.f26315d)) {
                        nVar = new Object();
                    } else if (w2.e.a(f12, j1Var.f26316e)) {
                        nVar = new Object();
                    } else {
                        nVar = null;
                    }
                    this.f26271a = 2;
                    if (s2.a(dVar, f11, nVar, this.f26276f, this) == aVar) {
                        return aVar;
                    }
                }
            }
        }
        return Unit.f23355a;
    }
}
