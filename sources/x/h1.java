package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h1 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1.b f39574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.o f39576c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1.d f39577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a2.l f39578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f39579f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n1.u f39580g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f39581h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f39582i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(q1.b bVar, String str, g1.o oVar, g1.d dVar, a2.l lVar, float f10, n1.u uVar, int i10, int i11) {
        super(2);
        this.f39574a = bVar;
        this.f39575b = str;
        this.f39576c = oVar;
        this.f39577d = dVar;
        this.f39578e = lVar;
        this.f39579f = f10;
        this.f39580g = uVar;
        this.f39581h = i10;
        this.f39582i = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        androidx.compose.foundation.a.c(this.f39574a, this.f39575b, this.f39576c, this.f39577d, this.f39578e, this.f39579f, this.f39580g, (t0.n) obj, t0.t.H0(this.f39581h | 1), this.f39582i);
        return Unit.f23355a;
    }
}
