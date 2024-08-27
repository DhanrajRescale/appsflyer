package og;

import androidx.recyclerview.widget.RecyclerView;
import k7.y1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends gd.d {

    /* renamed from: h, reason: collision with root package name */
    public final ni.l f30051h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f30052i;

    /* renamed from: j, reason: collision with root package name */
    public final Function1 f30053j;

    /* renamed from: k, reason: collision with root package name */
    public final Function1 f30054k;

    /* renamed from: l, reason: collision with root package name */
    public final Function1 f30055l;

    /* renamed from: m, reason: collision with root package name */
    public final Function1 f30056m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v5, types: [k7.w, java.lang.Object] */
    public k(androidx.lifecycle.o parentLifecycle, ni.l lVar, n onSellClicked, n onBuyMoreClicked, n onShortSellMoreClicked, n onSquareOff) {
        super(parentLifecycle, new Object());
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
        Intrinsics.checkNotNullParameter(onSellClicked, "onSellClicked");
        Intrinsics.checkNotNullParameter(onBuyMoreClicked, "onBuyMoreClicked");
        Intrinsics.checkNotNullParameter(onShortSellMoreClicked, "onShortSellMoreClicked");
        Intrinsics.checkNotNullParameter(onSquareOff, "onSquareOff");
        this.f30051h = lVar;
        this.f30052i = false;
        this.f30053j = onSellClicked;
        this.f30054k = onBuyMoreClicked;
        this.f30055l = onShortSellMoreClicked;
        this.f30056m = onSquareOff;
    }

    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new r(parent, this.f30051h, this.f30052i, this.f30053j, this.f30054k, this.f30055l, this.f30056m);
    }
}
