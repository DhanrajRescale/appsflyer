package rj;

import h2.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final l f33891b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f33892c = new l(1);

    /* renamed from: d, reason: collision with root package name */
    public static final l f33893d = new l(2);

    /* renamed from: e, reason: collision with root package name */
    public static final l f33894e = new l(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33895a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10) {
        super(1);
        this.f33895a = i10;
    }

    public final void a(v semantics) {
        switch (this.f33895a) {
            case 0:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "IncrementDecrementWidgetTextMinus");
                return;
            case 1:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "IncrementDecrementWidgetNameField");
                return;
            default:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "IncrementDecrementWidgetPlus");
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f33895a) {
            case 0:
                a((v) obj);
                return Unit.f23355a;
            case 1:
                a((v) obj);
                return Unit.f23355a;
            case 2:
                a((v) obj);
                return Unit.f23355a;
            default:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.f23355a;
        }
    }
}
