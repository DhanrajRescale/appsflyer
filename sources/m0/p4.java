package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p4 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26631b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f26632c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f26633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f26634e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p4(long j10, Function0 function0, boolean z10, int i10, int i11) {
        super(2);
        this.f26630a = i11;
        this.f26631b = j10;
        this.f26632c = function0;
        this.f26633d = z10;
        this.f26634e = i10;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f26630a;
        int i12 = this.f26634e;
        switch (i11) {
            case 0:
                v4.b(this.f26631b, this.f26632c, this.f26633d, nVar, t0.t.H0(i12 | 1));
                return;
            default:
                dp.b.z0(this.f26631b, this.f26632c, this.f26633d, nVar, t0.t.H0(i12 | 1));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26630a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
