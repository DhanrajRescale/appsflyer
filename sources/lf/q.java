package lf;

import com.assetgro.stockgro.data.model.homedata.Widget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class q extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f24763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Widget f24764c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f24765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f24767f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(g1.o oVar, Widget widget, Function2 function2, int i10, int i11, int i12) {
        super(2);
        this.f24762a = i12;
        this.f24763b = oVar;
        this.f24764c = widget;
        this.f24765d = function2;
        this.f24766e = i10;
        this.f24767f = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f24762a;
        int i12 = this.f24766e;
        switch (i11) {
            case 0:
                dp.b.f(this.f24763b, this.f24764c, this.f24765d, nVar, t0.t.H0(i12 | 1), this.f24767f);
                return;
            case 1:
                dp.b.i(this.f24763b, this.f24764c, this.f24765d, nVar, t0.t.H0(i12 | 1), this.f24767f);
                return;
            case 2:
                dp.b.F(this.f24763b, this.f24764c, this.f24765d, nVar, t0.t.H0(i12 | 1), this.f24767f);
                return;
            case 3:
                dp.b.S(this.f24763b, this.f24764c, this.f24765d, nVar, t0.t.H0(i12 | 1), this.f24767f);
                return;
            case 4:
                dp.b.m0(this.f24763b, this.f24764c, this.f24765d, nVar, t0.t.H0(i12 | 1), this.f24767f);
                return;
            case 5:
                dp.b.o0(this.f24763b, this.f24764c, this.f24765d, nVar, t0.t.H0(i12 | 1), this.f24767f);
                return;
            default:
                dp.b.t0(this.f24763b, this.f24764c, this.f24765d, nVar, t0.t.H0(i12 | 1), this.f24767f);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24762a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 2:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 3:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 4:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 5:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
