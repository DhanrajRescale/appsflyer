package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l7 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f26454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26455b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26456c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f26457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f26458e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(long j10, long j11, boolean z10, Function2 function2, int i10) {
        super(2);
        this.f26454a = j10;
        this.f26455b = j11;
        this.f26456c = z10;
        this.f26457d = function2;
        this.f26458e = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        m7.c(this.f26454a, this.f26455b, this.f26456c, this.f26457d, (t0.n) obj, t0.t.H0(this.f26458e | 1));
        return Unit.f23355a;
    }
}
