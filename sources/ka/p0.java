package ka;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p0 extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final p0 f22904b = new p0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final p0 f22905c = new p0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final p0 f22906d = new p0(2);

    /* renamed from: e, reason: collision with root package name */
    public static final p0 f22907e = new p0(3);

    /* renamed from: f, reason: collision with root package name */
    public static final p0 f22908f = new p0(4);

    /* renamed from: g, reason: collision with root package name */
    public static final p0 f22909g = new p0(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22910a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(int i10) {
        super(1);
        this.f22910a = i10;
    }

    public final void a(h2.v semantics) {
        switch (this.f22910a) {
            case 0:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "OrderPagePlaceOrderButton");
                return;
            case 1:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "PortfolioSelectionDropdownBoxElement");
                return;
            case 2:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "PortfolioSelectionTextFieldElement");
                return;
            case 3:
            default:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "PortfolioSelectionTabRowElement");
                return;
            case 4:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "PortfolioSelectionDropdownMenuElement");
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f22910a) {
            case 0:
                a((h2.v) obj);
                return Unit.f23355a;
            case 1:
                a((h2.v) obj);
                return Unit.f23355a;
            case 2:
                a((h2.v) obj);
                return Unit.f23355a;
            case 3:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.f23355a;
            case 4:
                a((h2.v) obj);
                return Unit.f23355a;
            default:
                a((h2.v) obj);
                return Unit.f23355a;
        }
    }
}
