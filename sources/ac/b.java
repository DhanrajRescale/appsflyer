package ac;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import t0.g1;
import ut.n;

/* loaded from: classes.dex */
public final class b extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2.b f314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f315b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f316c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w.d f319f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g1 f320g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(w2.b bVar, f0 f0Var, g1 g1Var, float f10, float f11, w.d dVar, g1 g1Var2, yt.a aVar) {
        super(2, aVar);
        this.f314a = bVar;
        this.f315b = f0Var;
        this.f316c = g1Var;
        this.f317d = f10;
        this.f318e = f11;
        this.f319f = dVar;
        this.f320g = g1Var2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new b(this.f314a, this.f315b, this.f316c, this.f317d, this.f318e, this.f319f, this.f320g, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        float f10 = 5.0f;
        if (((Boolean) this.f316c.getValue()).booleanValue()) {
            f10 = this.f314a.c0(this.f317d - (this.f318e * 2)) - 5.0f;
        }
        yk.g.H(this.f315b, null, null, new a(this.f319f, f10, this.f320g, null), 3);
        return Unit.f23355a;
    }
}
