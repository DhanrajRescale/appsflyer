package vh;

import h2.t;
import h2.v;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final b f38048b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f38049c = new b(1);

    /* renamed from: d, reason: collision with root package name */
    public static final b f38050d = new b(2);

    /* renamed from: e, reason: collision with root package name */
    public static final b f38051e = new b(3);

    /* renamed from: f, reason: collision with root package name */
    public static final b f38052f = new b(4);

    /* renamed from: g, reason: collision with root package name */
    public static final b f38053g = new b(5);

    /* renamed from: h, reason: collision with root package name */
    public static final b f38054h = new b(6);

    /* renamed from: i, reason: collision with root package name */
    public static final b f38055i = new b(7);

    /* renamed from: j, reason: collision with root package name */
    public static final b f38056j = new b(8);

    /* renamed from: k, reason: collision with root package name */
    public static final b f38057k = new b(9);

    /* renamed from: l, reason: collision with root package name */
    public static final b f38058l = new b(10);

    /* renamed from: m, reason: collision with root package name */
    public static final b f38059m = new b(11);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38060a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(1);
        this.f38060a = i10;
    }

    public final void a(v semantics) {
        switch (this.f38060a) {
            case 1:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "ScratchCardAlertBanner");
                return;
            case 2:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "ScratchCardAlertText");
                return;
            case 3:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "ScratchCardCellContainer");
                return;
            case 4:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "ScratchCardPlaceholder");
                return;
            case 5:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "ScratchCardExpiryDateText");
                return;
            case 6:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "NoScratchCardView");
                return;
            case 7:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "ScratchCardPreviewList");
                return;
            case 8:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "ScratchCardListSubText");
                return;
            case 9:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "ScratchCardListTitle");
                return;
            case 10:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "ScratchedCardContainer");
                return;
            default:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "UnScratchedCardContainer");
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38060a) {
            case 0:
                ((Number) obj).intValue();
                return 200;
            case 1:
                a((v) obj);
                return Unit.f23355a;
            case 2:
                a((v) obj);
                return Unit.f23355a;
            case 3:
                a((v) obj);
                return Unit.f23355a;
            case 4:
                a((v) obj);
                return Unit.f23355a;
            case 5:
                a((v) obj);
                return Unit.f23355a;
            case 6:
                a((v) obj);
                return Unit.f23355a;
            case 7:
                a((v) obj);
                return Unit.f23355a;
            case 8:
                a((v) obj);
                return Unit.f23355a;
            case 9:
                a((v) obj);
                return Unit.f23355a;
            case 10:
                a((v) obj);
                return Unit.f23355a;
            default:
                a((v) obj);
                return Unit.f23355a;
        }
    }
}
