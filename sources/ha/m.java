package ha;

import android.os.Bundle;
import android.os.Parcelable;
import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class m implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final FnoOption f18092a;

    /* renamed from: b, reason: collision with root package name */
    public final OptionContract f18093b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18094c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18095d;

    public m(FnoOption identifierInfo, OptionContract optionContract, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(identifierInfo, "identifierInfo");
        Intrinsics.checkNotNullParameter(optionContract, "optionContract");
        this.f18092a = identifierInfo;
        this.f18093b = optionContract;
        this.f18094c = z10;
        this.f18095d = z11;
    }

    @NotNull
    public static final m fromBundle(@NotNull Bundle bundle) {
        boolean z10;
        boolean z11;
        if (da.e.y(bundle, "bundle", m.class, "identifierInfo")) {
            if (!Parcelable.class.isAssignableFrom(FnoOption.class) && !Serializable.class.isAssignableFrom(FnoOption.class)) {
                throw new UnsupportedOperationException(FnoOption.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            FnoOption fnoOption = (FnoOption) bundle.get("identifierInfo");
            if (fnoOption != null) {
                if (bundle.containsKey("optionContract")) {
                    if (!Parcelable.class.isAssignableFrom(OptionContract.class) && !Serializable.class.isAssignableFrom(OptionContract.class)) {
                        throw new UnsupportedOperationException(OptionContract.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    OptionContract optionContract = (OptionContract) bundle.get("optionContract");
                    if (optionContract != null) {
                        if (bundle.containsKey("isModel")) {
                            z10 = bundle.getBoolean("isModel");
                        } else {
                            z10 = true;
                        }
                        if (bundle.containsKey("isFromPortfolio")) {
                            z11 = bundle.getBoolean("isFromPortfolio");
                        } else {
                            z11 = false;
                        }
                        return new m(fnoOption, optionContract, z10, z11);
                    }
                    throw new IllegalArgumentException("Argument \"optionContract\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"optionContract\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"identifierInfo\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"identifierInfo\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.a(this.f18092a, mVar.f18092a) && Intrinsics.a(this.f18093b, mVar.f18093b) && this.f18094c == mVar.f18094c && this.f18095d == mVar.f18095d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18095d) + v.e.d(this.f18094c, (this.f18093b.hashCode() + (this.f18092a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "OptionDetailFragmentArgs(identifierInfo=" + this.f18092a + ", optionContract=" + this.f18093b + ", isModel=" + this.f18094c + ", isFromPortfolio=" + this.f18095d + ")";
    }
}
