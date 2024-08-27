package rj;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.g1;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1.o f33896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f33897b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f33898c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f33899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f33900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f33901f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g1.o oVar, g1 g1Var, int i10, boolean z10, int i11, int i12) {
        super(2);
        this.f33896a = oVar;
        this.f33897b = g1Var;
        this.f33898c = i10;
        this.f33899d = z10;
        this.f33900e = i11;
        this.f33901f = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        al.d.f(this.f33896a, this.f33897b, this.f33898c, this.f33899d, (t0.n) obj, t0.t.H0(this.f33900e | 1), this.f33901f);
        return Unit.f23355a;
    }
}
