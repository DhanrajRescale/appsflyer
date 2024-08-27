package xb;

import h2.t;
import h2.v;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f40160b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f40161c = new e(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40162a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(1);
        this.f40162a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f40162a;
        switch (i10) {
            case 0:
                v semantics = (v) obj;
                switch (i10) {
                    case 0:
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        t.e(semantics, "viewShimmer");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        t.e(semantics, "viewListShimmer");
                        break;
                }
                return Unit.f23355a;
            default:
                v semantics2 = (v) obj;
                switch (i10) {
                    case 0:
                        Intrinsics.checkNotNullParameter(semantics2, "$this$semantics");
                        t.e(semantics2, "viewShimmer");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(semantics2, "$this$semantics");
                        t.e(semantics2, "viewListShimmer");
                        break;
                }
                return Unit.f23355a;
        }
    }
}
