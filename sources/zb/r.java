package zb;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f42331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f42332b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f42333c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f42334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f42335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1.o f42336f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function2 f42337g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f42338h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f42339i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(float f10, float f11, float f12, String str, e eVar, g1.o oVar, Function2 function2, int i10, int i11) {
        super(2);
        this.f42331a = f10;
        this.f42332b = f11;
        this.f42333c = f12;
        this.f42334d = str;
        this.f42335e = eVar;
        this.f42336f = oVar;
        this.f42337g = function2;
        this.f42338h = i10;
        this.f42339i = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        yk.j.j0(this.f42331a, this.f42332b, this.f42333c, this.f42334d, this.f42335e, this.f42336f, this.f42337g, (t0.n) obj, t0.t.H0(this.f42338h | 1), this.f42339i);
        return Unit.f23355a;
    }
}
