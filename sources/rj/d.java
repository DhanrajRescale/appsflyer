package rj;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2.l f33831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.o f33832c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f33833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f33834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f33835f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i10, a2.l lVar, g1.o oVar, long j10, int i11, int i12) {
        super(2);
        this.f33830a = i10;
        this.f33831b = lVar;
        this.f33832c = oVar;
        this.f33833d = j10;
        this.f33834e = i11;
        this.f33835f = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        al.d.z(this.f33830a, this.f33831b, this.f33832c, this.f33833d, (t0.n) obj, t0.t.H0(this.f33834e | 1), this.f33835f);
        return Unit.f23355a;
    }
}
