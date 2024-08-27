package l1;

import c0.d0;
import c0.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23900b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, int i11) {
        super(1);
        this.f23899a = i11;
        this.f23900b = i10;
    }

    public final Boolean a(t tVar) {
        int i10 = this.f23899a;
        boolean z10 = false;
        int i11 = this.f23900b;
        switch (i10) {
            case 0:
                Boolean D = androidx.compose.ui.focus.a.D(tVar, i11);
                if (D != null) {
                    z10 = D.booleanValue();
                }
                return Boolean.valueOf(z10);
            default:
                Boolean D2 = androidx.compose.ui.focus.a.D(tVar, i11);
                if (D2 != null) {
                    z10 = D2.booleanValue();
                }
                return Boolean.valueOf(z10);
        }
    }

    public final void d(h2.v semantics) {
        String str;
        int i10 = this.f23899a;
        int i11 = this.f23900b;
        switch (i10) {
            case 2:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                if (i11 == 0) {
                    str = "MarketTabElement";
                } else {
                    str = "LimitTabElement";
                }
                h2.t.e(semantics, str);
                return;
            case 3:
            case 4:
            default:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "Video Wide Item " + i11);
                return;
            case 5:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "Chat Long Item Number " + i11);
                return;
            case 6:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "Info Data Item Number " + i11);
                return;
            case 7:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "Info Data Item " + i11);
                return;
            case 8:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "User Data Item " + i11);
                return;
            case 9:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "Video Long Item Number " + i11);
                return;
            case 10:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "Video Long Item Number " + i11);
                return;
            case 11:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                h2.t.e(semantics, "Video Wide Item Number " + i11);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f23899a;
        int i11 = this.f23900b;
        switch (i10) {
            case 0:
                return a((t) obj);
            case 1:
                return a((t) obj);
            case 2:
                d((h2.v) obj);
                return Unit.f23355a;
            case 3:
                Integer timePassed = (Integer) obj;
                Intrinsics.checkNotNullParameter(timePassed, "timePassed");
                return Integer.valueOf(i11 - timePassed.intValue());
            case 4:
                d0 LazyColumn = (d0) obj;
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                d0.a(LazyColumn, xb.c.f40154a);
                ((c0.j) LazyColumn).a0(i11, null, y.f7619c, xb.c.f40155b);
                d0.a(LazyColumn, xb.c.f40156c);
                return Unit.f23355a;
            case 5:
                d((h2.v) obj);
                return Unit.f23355a;
            case 6:
                d((h2.v) obj);
                return Unit.f23355a;
            case 7:
                d((h2.v) obj);
                return Unit.f23355a;
            case 8:
                d((h2.v) obj);
                return Unit.f23355a;
            case 9:
                d((h2.v) obj);
                return Unit.f23355a;
            case 10:
                d((h2.v) obj);
                return Unit.f23355a;
            case 11:
                d((h2.v) obj);
                return Unit.f23355a;
            default:
                d((h2.v) obj);
                return Unit.f23355a;
        }
    }
}
