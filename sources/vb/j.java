package vb;

import c0.m0;
import hb.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t0.l3;
import t0.t;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f37899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3 f37900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sb.c f37901c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f37902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f37903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f37904f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function1 f37905g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function2 f37906h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m0 f37907i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f37908j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f37909k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u uVar, l3 l3Var, sb.c cVar, Function2 function2, Function2 function22, Function1 function1, Function1 function12, Function2 function23, m0 m0Var, int i10, int i11) {
        super(2);
        this.f37899a = uVar;
        this.f37900b = l3Var;
        this.f37901c = cVar;
        this.f37902d = function2;
        this.f37903e = function22;
        this.f37904f = function1;
        this.f37905g = function12;
        this.f37906h = function23;
        this.f37907i = m0Var;
        this.f37908j = i10;
        this.f37909k = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        yk.j.y(this.f37899a, this.f37900b, this.f37901c, this.f37902d, this.f37903e, this.f37904f, this.f37905g, this.f37906h, this.f37907i, (t0.n) obj, t.H0(this.f37908j | 1), this.f37909k);
        return Unit.f23355a;
    }
}
