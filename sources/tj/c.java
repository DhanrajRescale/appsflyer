package tj;

import c0.d0;
import c0.j;
import c0.y;
import h2.t;
import h2.v;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f36141b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f36142c = new c(1);

    /* renamed from: d, reason: collision with root package name */
    public static final c f36143d = new c(2);

    /* renamed from: e, reason: collision with root package name */
    public static final c f36144e = new c(3);

    /* renamed from: f, reason: collision with root package name */
    public static final c f36145f = new c(4);

    /* renamed from: g, reason: collision with root package name */
    public static final c f36146g = new c(5);

    /* renamed from: h, reason: collision with root package name */
    public static final c f36147h = new c(6);

    /* renamed from: i, reason: collision with root package name */
    public static final c f36148i = new c(7);

    /* renamed from: j, reason: collision with root package name */
    public static final c f36149j = new c(8);

    /* renamed from: k, reason: collision with root package name */
    public static final c f36150k = new c(9);

    /* renamed from: l, reason: collision with root package name */
    public static final c f36151l = new c(10);

    /* renamed from: m, reason: collision with root package name */
    public static final c f36152m = new c(11);

    /* renamed from: n, reason: collision with root package name */
    public static final c f36153n = new c(12);

    /* renamed from: o, reason: collision with root package name */
    public static final c f36154o = new c(13);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36155a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(1);
        this.f36155a = i10;
    }

    public final void a(d0 LazyRow) {
        switch (this.f36155a) {
            case 0:
                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                ((j) LazyRow).a0(8, null, y.f7619c, b.f36136a);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                ((j) LazyRow).a0(8, null, y.f7619c, b.f36137b);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                ((j) LazyRow).a0(8, null, y.f7619c, b.f36138c);
                return;
            case 3:
                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                ((j) LazyRow).a0(4, null, y.f7619c, b.f36139d);
                return;
            default:
                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                ((j) LazyRow).a0(8, null, y.f7619c, b.f36140e);
                return;
        }
    }

    public final void d(v semantics) {
        switch (this.f36155a) {
            case 5:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "Info Data Title");
                return;
            case 6:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "Info Data Subtitle");
                return;
            case 7:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "Info Data Subtitle Extra");
                return;
            case 8:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "Home Page Title Section Row");
                return;
            case 9:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "Home Page Title Section Text Column");
                return;
            case 10:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "Home Page Title Text");
                return;
            case 11:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "StockGro Text");
                return;
            case 12:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "Container Card");
                return;
            default:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "Container Box");
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f36155a) {
            case 0:
                a((d0) obj);
                return Unit.f23355a;
            case 1:
                a((d0) obj);
                return Unit.f23355a;
            case 2:
                a((d0) obj);
                return Unit.f23355a;
            case 3:
                a((d0) obj);
                return Unit.f23355a;
            case 4:
                a((d0) obj);
                return Unit.f23355a;
            case 5:
                d((v) obj);
                return Unit.f23355a;
            case 6:
                d((v) obj);
                return Unit.f23355a;
            case 7:
                d((v) obj);
                return Unit.f23355a;
            case 8:
                d((v) obj);
                return Unit.f23355a;
            case 9:
                d((v) obj);
                return Unit.f23355a;
            case 10:
                d((v) obj);
                return Unit.f23355a;
            case 11:
                d((v) obj);
                return Unit.f23355a;
            case 12:
                d((v) obj);
                return Unit.f23355a;
            default:
                d((v) obj);
                return Unit.f23355a;
        }
    }
}
