package lf;

import com.assetgro.stockgro.data.model.homedata.ListItem;
import com.assetgro.stockgro.data.model.homedata.Widget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f24781b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ListItem f24782c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f24784e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Widget f24785f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f24786g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f24787h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24788i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(g1.o oVar, ListItem listItem, int i10, Function2 function2, Widget widget, int i11, int i12, int i13, int i14) {
        super(2);
        this.f24780a = i14;
        this.f24781b = oVar;
        this.f24782c = listItem;
        this.f24783d = i10;
        this.f24784e = function2;
        this.f24785f = widget;
        this.f24786g = i11;
        this.f24787h = i12;
        this.f24788i = i13;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f24780a;
        int i12 = this.f24787h;
        switch (i11) {
            case 0:
                dp.b.h(this.f24781b, this.f24782c, this.f24783d, this.f24784e, this.f24785f, this.f24786g, nVar, t0.t.H0(i12 | 1), this.f24788i);
                return;
            case 1:
                dp.b.D(this.f24781b, this.f24782c, this.f24783d, this.f24784e, this.f24785f, this.f24786g, nVar, t0.t.H0(i12 | 1), this.f24788i);
                return;
            default:
                dp.b.l0(this.f24781b, this.f24782c, this.f24783d, this.f24784e, this.f24785f, this.f24786g, nVar, t0.t.H0(i12 | 1), this.f24788i);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24780a) {
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
