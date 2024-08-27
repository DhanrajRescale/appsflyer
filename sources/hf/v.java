package hf;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final v f18417b = new v(0);

    /* renamed from: c, reason: collision with root package name */
    public static final v f18418c = new v(1);

    /* renamed from: d, reason: collision with root package name */
    public static final v f18419d = new v(2);

    /* renamed from: e, reason: collision with root package name */
    public static final v f18420e = new v(3);

    /* renamed from: f, reason: collision with root package name */
    public static final v f18421f = new v(4);

    /* renamed from: g, reason: collision with root package name */
    public static final v f18422g = new v(5);

    /* renamed from: h, reason: collision with root package name */
    public static final v f18423h = new v(6);

    /* renamed from: i, reason: collision with root package name */
    public static final v f18424i = new v(7);

    /* renamed from: j, reason: collision with root package name */
    public static final v f18425j = new v(8);

    /* renamed from: k, reason: collision with root package name */
    public static final v f18426k = new v(9);

    /* renamed from: l, reason: collision with root package name */
    public static final v f18427l = new v(10);

    /* renamed from: m, reason: collision with root package name */
    public static final v f18428m = new v(11);

    /* renamed from: n, reason: collision with root package name */
    public static final v f18429n = new v(12);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18430a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i10) {
        super(1);
        this.f18430a = i10;
    }

    public final void a(h2.v semantics) {
        switch (this.f18430a) {
            case 0:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "PortfolioAssetText ");
                return;
            case 1:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "PortfolioTitle");
                return;
            case 2:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "SocialExpertImage");
                return;
            case 3:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "SocialExpertGroupName");
                return;
            case 4:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "SocialExpertItemName");
                return;
            case 5:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "SocialExpertGroupMembers");
                return;
            case 6:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "SocialExpertImage");
                return;
            case 7:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "TitleImage");
                return;
            case 8:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "UserInfoContainer");
                return;
            case 9:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "UserInfoText");
                return;
            case 10:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "UserInfoPercentageReturn");
                return;
            case 11:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "UserInfoSubTitle");
                return;
            default:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "UserInfoImage");
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f18430a) {
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
                a((h2.v) obj);
                return Unit.f23355a;
            case 4:
                a((h2.v) obj);
                return Unit.f23355a;
            case 5:
                a((h2.v) obj);
                return Unit.f23355a;
            case 6:
                a((h2.v) obj);
                return Unit.f23355a;
            case 7:
                a((h2.v) obj);
                return Unit.f23355a;
            case 8:
                a((h2.v) obj);
                return Unit.f23355a;
            case 9:
                a((h2.v) obj);
                return Unit.f23355a;
            case 10:
                a((h2.v) obj);
                return Unit.f23355a;
            case 11:
                a((h2.v) obj);
                return Unit.f23355a;
            default:
                a((h2.v) obj);
                return Unit.f23355a;
        }
    }
}
