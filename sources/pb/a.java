package pb;

import h2.t;
import h2.v;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f30815b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f30816c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f30817d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f30818e = new a(3);

    /* renamed from: f, reason: collision with root package name */
    public static final a f30819f = new a(4);

    /* renamed from: g, reason: collision with root package name */
    public static final a f30820g = new a(5);

    /* renamed from: h, reason: collision with root package name */
    public static final a f30821h = new a(6);

    /* renamed from: i, reason: collision with root package name */
    public static final a f30822i = new a(7);

    /* renamed from: j, reason: collision with root package name */
    public static final a f30823j = new a(8);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30824a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(1);
        this.f30824a = i10;
    }

    public final void a(v semantics) {
        switch (this.f30824a) {
            case 0:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "btnFavoriteFeeds");
                return;
            case 1:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "textMyFavourite");
                return;
            case 2:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "textFavouriteFeedCount");
                return;
            case 3:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "textCategoryName");
                return;
            case 4:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "textCategoryDescription");
                return;
            case 5:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "btnViewSubcategory");
                return;
            case 6:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "imageSubcategoryLogo");
                return;
            case 7:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "textSubCategoryName");
                return;
            default:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "btnMarkSubCategoryFavourite");
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f30824a) {
            case 0:
                a((v) obj);
                return Unit.f23355a;
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
            default:
                a((v) obj);
                return Unit.f23355a;
        }
    }
}
