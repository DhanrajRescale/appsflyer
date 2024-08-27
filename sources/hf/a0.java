package hf;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class a0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1.o f18321a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18322b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f18323c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f18324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f18325e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f18326f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18327g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18328h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(g1.o oVar, boolean z10, Function0 function0, Function2 function2, long j10, long j11, int i10, int i11) {
        super(2);
        this.f18321a = oVar;
        this.f18322b = z10;
        this.f18323c = function0;
        this.f18324d = function2;
        this.f18325e = j10;
        this.f18326f = j11;
        this.f18327g = i10;
        this.f18328h = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        dp.b.l(this.f18321a, this.f18322b, this.f18323c, this.f18324d, this.f18325e, this.f18326f, (t0.n) obj, t0.t.H0(this.f18327g | 1), this.f18328h);
        return Unit.f23355a;
    }
}
