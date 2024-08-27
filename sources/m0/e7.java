package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class e7 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0.w f26106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26108c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r1 f26109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f26110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0.k f26111f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f26112g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(b0.w wVar, boolean z10, boolean z11, r1 r1Var, Function0 function0, a0.k kVar, int i10) {
        super(2);
        this.f26106a = wVar;
        this.f26107b = z10;
        this.f26108c = z11;
        this.f26109d = r1Var;
        this.f26110e = function0;
        this.f26111f = kVar;
        this.f26112g = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        f7.b(this.f26106a, this.f26107b, this.f26108c, this.f26109d, this.f26110e, this.f26111f, (t0.n) obj, t0.t.H0(this.f26112g | 1));
        return Unit.f23355a;
    }
}
