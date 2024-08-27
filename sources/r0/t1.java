package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t1 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f32730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f32731b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z2 f32732c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1.o f32733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f32734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f32735f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n1.x0 f32736g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f32737h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f32738i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f32739j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f32740k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f32741l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ hu.c f32742m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(long j10, Function0 function0, z2 z2Var, g1.o oVar, float f10, Function1 function1, n1.x0 x0Var, long j11, long j12, float f11, Function2 function2, qu.f0 f0Var, hu.c cVar) {
        super(2);
        this.f32730a = j10;
        this.f32731b = function0;
        this.f32732c = z2Var;
        this.f32733d = oVar;
        this.f32734e = f10;
        this.f32735f = function1;
        this.f32736g = x0Var;
        this.f32737h = j11;
        this.f32738i = j12;
        this.f32739j = f11;
        this.f32740k = function2;
        this.f32741l = f0Var;
        this.f32742m = cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t0.n nVar = (t0.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.d.f1286c, null, false, b1.d.b(nVar, 2008499679, new s1(this.f32730a, this.f32731b, this.f32732c, this.f32733d, this.f32734e, this.f32735f, this.f32736g, this.f32737h, this.f32738i, this.f32739j, this.f32740k, this.f32741l, this.f32742m)), nVar, 3078, 6);
        return Unit.f23355a;
    }
}
