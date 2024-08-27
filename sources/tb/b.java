package tb;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final b f35680b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f35681c = new b(1);

    /* renamed from: d, reason: collision with root package name */
    public static final b f35682d = new b(2);

    /* renamed from: e, reason: collision with root package name */
    public static final b f35683e = new b(3);

    /* renamed from: f, reason: collision with root package name */
    public static final b f35684f = new b(4);

    /* renamed from: g, reason: collision with root package name */
    public static final b f35685g = new b(5);

    /* renamed from: h, reason: collision with root package name */
    public static final b f35686h = new b(6);

    /* renamed from: i, reason: collision with root package name */
    public static final b f35687i = new b(7);

    /* renamed from: j, reason: collision with root package name */
    public static final b f35688j = new b(8);

    /* renamed from: k, reason: collision with root package name */
    public static final b f35689k = new b(9);

    /* renamed from: l, reason: collision with root package name */
    public static final b f35690l = new b(10);

    /* renamed from: m, reason: collision with root package name */
    public static final b f35691m = new b(11);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35692a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(1);
        this.f35692a = i10;
    }

    public final void a(h2.v semantics) {
        switch (this.f35692a) {
            case 0:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "paginationLoader");
                return;
            case 1:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "paginationEndText");
                return;
            case 2:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "btnRetryText");
                return;
            case 3:
            case 4:
            default:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "description");
                return;
            case 5:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "image");
                return;
            case 6:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "title");
                return;
            case 7:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "description");
                return;
            case 8:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "btnRetry");
                return;
            case 9:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "btnRetry");
                return;
            case 10:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "image");
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f35692a) {
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
                hb.u element = (hb.u) obj;
                Intrinsics.checkNotNullParameter(element, "element");
                return element.f18230a.f18224a;
            case 4:
                return null;
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
            default:
                a((h2.v) obj);
                return Unit.f23355a;
        }
    }
}
