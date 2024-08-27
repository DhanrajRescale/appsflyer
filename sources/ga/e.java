package ga;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.d0;
import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.prod.R;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final FnoOption f17181a;

    /* renamed from: b, reason: collision with root package name */
    public final OptionContract f17182b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17183c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17184d;

    public e(FnoOption identifierInfo, OptionContract optionContract, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(identifierInfo, "identifierInfo");
        Intrinsics.checkNotNullParameter(optionContract, "optionContract");
        this.f17181a = identifierInfo;
        this.f17182b = optionContract;
        this.f17183c = z10;
        this.f17184d = z11;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(FnoOption.class);
        Parcelable parcelable = this.f17181a;
        if (isAssignableFrom) {
            Intrinsics.d(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("identifierInfo", parcelable);
        } else if (Serializable.class.isAssignableFrom(FnoOption.class)) {
            Intrinsics.d(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("identifierInfo", (Serializable) parcelable);
        } else {
            throw new UnsupportedOperationException(FnoOption.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        boolean isAssignableFrom2 = Parcelable.class.isAssignableFrom(OptionContract.class);
        Parcelable parcelable2 = this.f17182b;
        if (isAssignableFrom2) {
            Intrinsics.d(parcelable2, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("optionContract", parcelable2);
        } else if (Serializable.class.isAssignableFrom(OptionContract.class)) {
            Intrinsics.d(parcelable2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("optionContract", (Serializable) parcelable2);
        } else {
            throw new UnsupportedOperationException(OptionContract.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        bundle.putBoolean("isModel", this.f17183c);
        bundle.putBoolean("isFromPortfolio", this.f17184d);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.action_fnoOptionListFragment_to_fnoOptionDetailFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.a(this.f17181a, eVar.f17181a) && Intrinsics.a(this.f17182b, eVar.f17182b) && this.f17183c == eVar.f17183c && this.f17184d == eVar.f17184d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17184d) + v.e.d(this.f17183c, (this.f17182b.hashCode() + (this.f17181a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ActionFnoOptionListFragmentToFnoOptionDetailFragment(identifierInfo=" + this.f17181a + ", optionContract=" + this.f17182b + ", isModel=" + this.f17183c + ", isFromPortfolio=" + this.f17184d + ")";
    }
}
