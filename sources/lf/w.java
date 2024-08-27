package lf;

import com.assetgro.stockgro.data.model.homedata.ListItem;
import com.assetgro.stockgro.data.model.homedata.Widget;
import com.assetgro.stockgro.data.model.homedata.Winner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f24799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24800c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f24801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Widget f24802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f24803f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f24804g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f24805h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(g1.o oVar, Object obj, Function2 function2, Widget widget, int i10, int i11, int i12, int i13) {
        super(2);
        this.f24798a = i13;
        this.f24799b = oVar;
        this.f24800c = obj;
        this.f24801d = function2;
        this.f24802e = widget;
        this.f24803f = i10;
        this.f24804g = i11;
        this.f24805h = i12;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f24798a;
        int i12 = this.f24804g;
        Object obj = this.f24800c;
        switch (i11) {
            case 0:
                dp.b.j(this.f24799b, (ListItem) obj, this.f24801d, this.f24802e, this.f24803f, nVar, t0.t.H0(i12 | 1), this.f24805h);
                return;
            case 1:
                dp.b.E(this.f24799b, (ListItem) obj, this.f24801d, this.f24802e, this.f24803f, nVar, t0.t.H0(i12 | 1), this.f24805h);
                return;
            case 2:
                dp.b.n0(this.f24799b, (ListItem) obj, this.f24801d, this.f24802e, this.f24803f, nVar, t0.t.H0(i12 | 1), this.f24805h);
                return;
            case 3:
                dp.b.p0(this.f24799b, (ListItem) obj, this.f24801d, this.f24802e, this.f24803f, nVar, t0.t.H0(i12 | 1), this.f24805h);
                return;
            default:
                dp.b.r0(this.f24799b, (Winner) obj, this.f24801d, this.f24802e, this.f24803f, nVar, t0.t.H0(i12 | 1), this.f24805h);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24798a) {
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
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
