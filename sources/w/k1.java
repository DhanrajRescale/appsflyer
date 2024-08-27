package w;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class k1 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iu.z f38569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f38571c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f38572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f38573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f38574f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function1 f38575g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(iu.z zVar, Object obj, j jVar, t tVar, o oVar, float f10, Function1 function1) {
        super(1);
        this.f38569a = zVar;
        this.f38570b = obj;
        this.f38571c = jVar;
        this.f38572d = tVar;
        this.f38573e = oVar;
        this.f38574f = f10;
        this.f38575g = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.f38570b;
        j jVar = this.f38571c;
        m mVar = new m(obj2, jVar.c(), this.f38572d, longValue, jVar.g(), longValue, new j1(this.f38573e, 0));
        e.p(mVar, longValue, this.f38574f, this.f38571c, this.f38573e, this.f38575g);
        this.f38569a.f20560a = mVar;
        return Unit.f23355a;
    }
}
