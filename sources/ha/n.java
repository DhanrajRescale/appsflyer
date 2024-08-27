package ha;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.d0;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.domain.model.OptionOverview;
import com.assetgro.stockgro.prod.R;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final OptionContract f18096a;

    /* renamed from: b, reason: collision with root package name */
    public final OptionOverview f18097b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18098c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18099d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18100e;

    public n(OptionContract optionContract, OptionOverview optionOverview, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(optionContract, "optionContract");
        Intrinsics.checkNotNullParameter(optionOverview, "optionOverview");
        this.f18096a = optionContract;
        this.f18097b = optionOverview;
        this.f18098c = z10;
        this.f18099d = z11;
        this.f18100e = z12;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(OptionContract.class);
        Parcelable parcelable = this.f18096a;
        if (isAssignableFrom) {
            Intrinsics.d(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("optionContract", parcelable);
        } else if (Serializable.class.isAssignableFrom(OptionContract.class)) {
            Intrinsics.d(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("optionContract", (Serializable) parcelable);
        } else {
            throw new UnsupportedOperationException(OptionContract.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        boolean isAssignableFrom2 = Parcelable.class.isAssignableFrom(OptionOverview.class);
        Parcelable parcelable2 = this.f18097b;
        if (isAssignableFrom2) {
            Intrinsics.d(parcelable2, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("optionOverview", parcelable2);
        } else if (Serializable.class.isAssignableFrom(OptionOverview.class)) {
            Intrinsics.d(parcelable2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("optionOverview", (Serializable) parcelable2);
        } else {
            throw new UnsupportedOperationException(OptionOverview.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        bundle.putBoolean("isSell", this.f18098c);
        bundle.putBoolean("isModel", this.f18099d);
        bundle.putBoolean("isFromPortfolio", this.f18100e);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.action_fnoOptionDetailFragment_to_orderPageBottomSheetFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.a(this.f18096a, nVar.f18096a) && Intrinsics.a(this.f18097b, nVar.f18097b) && this.f18098c == nVar.f18098c && this.f18099d == nVar.f18099d && this.f18100e == nVar.f18100e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18100e) + v.e.d(this.f18099d, v.e.d(this.f18098c, (this.f18097b.hashCode() + (this.f18096a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionFnoOptionDetailFragmentToOrderPageBottomSheetFragment(optionContract=");
        sb2.append(this.f18096a);
        sb2.append(", optionOverview=");
        sb2.append(this.f18097b);
        sb2.append(", isSell=");
        sb2.append(this.f18098c);
        sb2.append(", isModel=");
        sb2.append(this.f18099d);
        sb2.append(", isFromPortfolio=");
        return da.e.o(sb2, this.f18100e, ")");
    }
}
