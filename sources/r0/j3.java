package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j3 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hu.c f32486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.o f32487c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f32488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f32489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f32490f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function2 f32491g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function2 f32492h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x.o2 f32493i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f32494j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f32495k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(int i10, hu.c cVar, g1.o oVar, long j10, long j11, float f10, Function2 function2, Function2 function22, x.o2 o2Var, int i11, int i12) {
        super(2);
        this.f32485a = i10;
        this.f32486b = cVar;
        this.f32487c = oVar;
        this.f32488d = j10;
        this.f32489e = j11;
        this.f32490f = f10;
        this.f32491g = function2;
        this.f32492h = function22;
        this.f32493i = o2Var;
        this.f32494j = i11;
        this.f32495k = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        k3.b(this.f32485a, this.f32486b, this.f32487c, this.f32488d, this.f32489e, this.f32490f, this.f32491g, this.f32492h, this.f32493i, (t0.n) obj, t0.t.H0(this.f32494j | 1), this.f32495k);
        return Unit.f23355a;
    }
}
