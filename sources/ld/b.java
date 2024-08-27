package ld;

import h2.t;
import h2.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final b f24530b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f24531c = new b(1);

    /* renamed from: d, reason: collision with root package name */
    public static final b f24532d = new b(2);

    /* renamed from: e, reason: collision with root package name */
    public static final b f24533e = new b(3);

    /* renamed from: f, reason: collision with root package name */
    public static final b f24534f = new b(4);

    /* renamed from: g, reason: collision with root package name */
    public static final b f24535g = new b(5);

    /* renamed from: h, reason: collision with root package name */
    public static final b f24536h = new b(6);

    /* renamed from: i, reason: collision with root package name */
    public static final b f24537i = new b(7);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24538a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(1);
        this.f24538a = i10;
    }

    public final void a(v semantics) {
        switch (this.f24538a) {
            case 0:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "ChatGroupCell");
                return;
            case 1:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "ChatGroupName");
                return;
            case 2:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "Media view Top App bar");
                return;
            case 3:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "Media title");
                return;
            case 4:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "Forward Message");
                return;
            case 5:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "Overflow Menu");
                return;
            case 6:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "Dropdown Menu message options");
                return;
            default:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "Column Media component");
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f24538a) {
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
            default:
                a((v) obj);
                return Unit.f23355a;
        }
    }
}
