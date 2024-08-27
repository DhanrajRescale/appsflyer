package mb;

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
public final class a extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f27694b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f27695c = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27696a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(1);
        this.f27696a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f27696a) {
            case 0:
                v semantics = (v) obj;
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "commentShimmerList");
                return Unit.f23355a;
            default:
                d0 LazyColumn = (d0) obj;
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                d0.a(LazyColumn, d.f27701a);
                ((j) LazyColumn).a0(5, null, y.f7619c, d.f27702b);
                d0.a(LazyColumn, d.f27703c);
                return Unit.f23355a;
        }
    }
}
