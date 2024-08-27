package ac;

import h2.t;
import h2.v;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final h f333b = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final h f334c = new h(1);

    /* renamed from: d, reason: collision with root package name */
    public static final h f335d = new h(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f336a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10) {
        super(1);
        this.f336a = i10;
    }

    public final void a(v semantics) {
        switch (this.f336a) {
            case 0:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "tabLayout");
                return;
            case 1:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "filterTab");
                return;
            default:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "tabTitle");
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f336a) {
            case 0:
                a((v) obj);
                return Unit.f23355a;
            case 1:
                a((v) obj);
                return Unit.f23355a;
            default:
                a((v) obj);
                return Unit.f23355a;
        }
    }
}
