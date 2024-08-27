package lf;

import com.assetgro.stockgro.data.model.homedata.Widget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f24753b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Widget f24754c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f24755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f24756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f24757f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f24758g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(g1.o oVar, Widget widget, boolean z10, Function2 function2, int i10, int i11, int i12) {
        super(2);
        this.f24752a = i12;
        this.f24753b = oVar;
        this.f24754c = widget;
        this.f24755d = z10;
        this.f24756e = function2;
        this.f24757f = i10;
        this.f24758g = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f24752a;
        int i12 = this.f24757f;
        switch (i11) {
            case 0:
                dp.b.b(this.f24753b, this.f24754c, this.f24755d, this.f24756e, nVar, t0.t.H0(i12 | 1), this.f24758g);
                return;
            case 1:
                dp.b.k(this.f24753b, this.f24754c, this.f24755d, this.f24756e, nVar, t0.t.H0(i12 | 1), this.f24758g);
                return;
            default:
                dp.b.q0(this.f24753b, this.f24754c, this.f24755d, this.f24756e, nVar, t0.t.H0(i12 | 1), this.f24758g);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24752a) {
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
}
