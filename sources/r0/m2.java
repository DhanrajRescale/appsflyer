package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class m2 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f32588c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.c f32589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f32590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f32591f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0.x1 f32592g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function2 f32593h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f32594i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2(int i10, Function2 function2, hu.c cVar, Function2 function22, Function2 function23, b0.x1 x1Var, Function2 function24, int i11, int i12) {
        super(2);
        this.f32586a = i12;
        this.f32587b = i10;
        this.f32588c = function2;
        this.f32589d = cVar;
        this.f32590e = function22;
        this.f32591f = function23;
        this.f32592g = x1Var;
        this.f32593h = function24;
        this.f32594i = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f32586a;
        int i12 = this.f32594i;
        switch (i11) {
            case 0:
                p2.a(this.f32587b, this.f32588c, this.f32589d, this.f32590e, this.f32591f, this.f32592g, this.f32593h, nVar, t0.t.H0(i12 | 1));
                return;
            case 1:
                p2.d(this.f32587b, this.f32588c, this.f32589d, this.f32590e, this.f32591f, this.f32592g, this.f32593h, nVar, t0.t.H0(i12 | 1));
                return;
            default:
                p2.c(this.f32587b, this.f32588c, this.f32589d, this.f32590e, this.f32591f, this.f32592g, this.f32593h, nVar, t0.t.H0(i12 | 1));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f32586a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
