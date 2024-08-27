package m0;

import com.assetgro.stockgro.data.model.ReportReason;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o3 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26573b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ut.d f26574c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f26576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f26577f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f26578g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f26579h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(g1.o oVar, boolean z10, ReportReason reportReason, ReportReason reportReason2, Function1 function1, int i10, int i11) {
        super(2);
        this.f26572a = 2;
        this.f26578g = oVar;
        this.f26573b = z10;
        this.f26577f = reportReason;
        this.f26579h = reportReason2;
        this.f26574c = function1;
        this.f26575d = i10;
        this.f26576e = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f26572a;
        int i12 = this.f26575d;
        ut.d dVar = this.f26574c;
        Object obj = this.f26579h;
        Object obj2 = this.f26577f;
        Object obj3 = this.f26578g;
        switch (i11) {
            case 0:
                p3.a((Function0) obj2, (g1.o) obj3, this.f26573b, (a0.l) obj, (Function2) dVar, nVar, t0.t.H0(i12 | 1), this.f26576e);
                return;
            case 1:
                yk.o.y((String) obj2, (String) obj3, this.f26573b, (t0.l3) obj, (Function2) dVar, nVar, t0.t.H0(i12 | 1), this.f26576e);
                return;
            default:
                el.l.h((g1.o) obj3, this.f26573b, (ReportReason) obj2, (ReportReason) obj, (Function1) dVar, nVar, t0.t.H0(i12 | 1), this.f26576e);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26572a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(Object obj, Object obj2, boolean z10, Object obj3, Function2 function2, int i10, int i11, int i12) {
        super(2);
        this.f26572a = i12;
        this.f26577f = obj;
        this.f26578g = obj2;
        this.f26573b = z10;
        this.f26579h = obj3;
        this.f26574c = function2;
        this.f26575d = i10;
        this.f26576e = i11;
    }
}
