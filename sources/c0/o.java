package c0;

import com.assetgro.stockgro.feature_market.presentation.fno.order.ModifyOrderPageBottomSheetViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7553b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7554c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7556e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i10, int i11, int i12, Object obj, Object obj2) {
        super(2);
        this.f7552a = i12;
        this.f7556e = obj;
        this.f7554c = obj2;
        this.f7553b = i10;
        this.f7555d = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f7552a;
        int i12 = this.f7555d;
        int i13 = this.f7553b;
        Object obj = this.f7554c;
        Object obj2 = this.f7556e;
        switch (i11) {
            case 0:
                ((p) obj2).e(i13, obj, nVar, t0.t.H0(i12 | 1));
                return;
            case 1:
                ((e0.w) obj2).e(i13, obj, nVar, t0.t.H0(i12 | 1));
                return;
            case 2:
                yk.j.S((ModifyOrderPageBottomSheetViewModel) obj2, (Function2) obj, nVar, t0.t.H0(i13 | 1), i12);
                return;
            case 3:
                yk.o.x((g1.o) obj2, (Function1) obj, nVar, t0.t.H0(i13 | 1), i12);
                return;
            case 4:
                yk.j.b0((Function1) obj2, (Function0) obj, nVar, t0.t.H0(i13 | 1), i12);
                return;
            case 5:
                yk.j.r((g1.o) obj2, (String) obj, nVar, t0.t.H0(i13 | 1), i12);
                return;
            case 6:
                zq.f.d((Function0) obj2, (Function0) obj, nVar, t0.t.H0(i13 | 1), i12);
                return;
            default:
                el.l.n((String) obj2, (Function0) obj, nVar, t0.t.H0(i13 | 1), i12);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f7552a) {
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
            case 6:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(d0.u uVar, int i10, Object obj, int i11, int i12) {
        super(2);
        this.f7552a = i12;
        this.f7556e = uVar;
        this.f7553b = i10;
        this.f7554c = obj;
        this.f7555d = i11;
    }
}
