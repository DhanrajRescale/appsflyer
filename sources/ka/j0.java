package ka;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t0.g1;

/* loaded from: classes.dex */
public final class j0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1.o f22806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22807b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f22808c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f22809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f22810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f22811f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function1 f22812g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22813h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22814i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(g1.o oVar, String str, g1 g1Var, boolean z10, boolean z11, boolean z12, Function1 function1, int i10, int i11) {
        super(2);
        this.f22806a = oVar;
        this.f22807b = str;
        this.f22808c = g1Var;
        this.f22809d = z10;
        this.f22810e = z11;
        this.f22811f = z12;
        this.f22812g = function1;
        this.f22813h = i10;
        this.f22814i = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        yk.o.a(this.f22806a, this.f22807b, this.f22808c, this.f22809d, this.f22810e, this.f22811f, this.f22812g, (t0.n) obj, t0.t.H0(this.f22813h | 1), this.f22814i);
        return Unit.f23355a;
    }
}
