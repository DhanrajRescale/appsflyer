package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k5 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26405a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f26406b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f26407c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f26408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f26409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f26410f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f26411g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26412h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k5(g1.o oVar, long j10, float f10, long j11, int i10, int i11, int i12, int i13) {
        super(2);
        this.f26405a = i13;
        this.f26406b = oVar;
        this.f26407c = j10;
        this.f26408d = f10;
        this.f26409e = j11;
        this.f26410f = i10;
        this.f26411g = i11;
        this.f26412h = i12;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f26405a;
        int i12 = this.f26411g;
        switch (i11) {
            case 0:
                l5.a(this.f26406b, this.f26407c, this.f26408d, this.f26409e, this.f26410f, nVar, t0.t.H0(i12 | 1), this.f26412h);
                return;
            default:
                r0.h2.a(this.f26406b, this.f26407c, this.f26408d, this.f26409e, this.f26410f, nVar, t0.t.H0(i12 | 1), this.f26412h);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26405a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
