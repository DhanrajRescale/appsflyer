package ub;

import h2.t;
import h2.v;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f37050b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f37051c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f37052d = new d(2);

    /* renamed from: e, reason: collision with root package name */
    public static final d f37053e = new d(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37054a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f37054a = i10;
    }

    public final void a(v semantics) {
        switch (this.f37054a) {
            case 0:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "closeBottomSheet");
                return;
            case 1:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "textNotes");
                return;
            case 2:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "postTagsList");
                return;
            default:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "postTag");
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f37054a) {
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
                a((v) obj);
                return Unit.f23355a;
        }
    }
}
