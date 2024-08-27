package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f18787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f18788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f18789c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18791e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j10, g1.o oVar, long j11, int i10, int i11) {
        super(2);
        this.f18787a = j10;
        this.f18788b = oVar;
        this.f18789c = j11;
        this.f18790d = i10;
        this.f18791e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        f.a(this.f18787a, this.f18788b, this.f18789c, (t0.n) obj, t0.t.H0(this.f18790d | 1), this.f18791e);
        return Unit.f23355a;
    }
}
