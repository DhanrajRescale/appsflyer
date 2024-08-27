package ha;

import android.os.Bundle;
import android.os.Parcelable;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.domain.model.OptionOverview;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class u implements androidx.navigation.h {

    /* renamed from: a, reason: collision with root package name */
    public final OptionContract f18113a;

    /* renamed from: b, reason: collision with root package name */
    public final OptionOverview f18114b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18115c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18116d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18117e;

    public u(OptionContract optionContract, OptionOverview optionOverview, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(optionContract, "optionContract");
        Intrinsics.checkNotNullParameter(optionOverview, "optionOverview");
        this.f18113a = optionContract;
        this.f18114b = optionOverview;
        this.f18115c = z10;
        this.f18116d = z11;
        this.f18117e = z12;
    }

    @NotNull
    public static final u fromBundle(@NotNull Bundle bundle) {
        boolean z10;
        boolean z11;
        if (da.e.y(bundle, "bundle", u.class, "optionContract")) {
            if (!Parcelable.class.isAssignableFrom(OptionContract.class) && !Serializable.class.isAssignableFrom(OptionContract.class)) {
                throw new UnsupportedOperationException(OptionContract.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            OptionContract optionContract = (OptionContract) bundle.get("optionContract");
            if (optionContract != null) {
                if (bundle.containsKey("optionOverview")) {
                    if (!Parcelable.class.isAssignableFrom(OptionOverview.class) && !Serializable.class.isAssignableFrom(OptionOverview.class)) {
                        throw new UnsupportedOperationException(OptionOverview.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    OptionOverview optionOverview = (OptionOverview) bundle.get("optionOverview");
                    if (optionOverview != null) {
                        if (bundle.containsKey("isSell")) {
                            boolean z12 = bundle.getBoolean("isSell");
                            if (bundle.containsKey("isModel")) {
                                z10 = bundle.getBoolean("isModel");
                            } else {
                                z10 = true;
                            }
                            boolean z13 = z10;
                            if (bundle.containsKey("isFromPortfolio")) {
                                z11 = bundle.getBoolean("isFromPortfolio");
                            } else {
                                z11 = false;
                            }
                            return new u(optionContract, optionOverview, z12, z13, z11);
                        }
                        throw new IllegalArgumentException("Required argument \"isSell\" is missing and does not have an android:defaultValue");
                    }
                    throw new IllegalArgumentException("Argument \"optionOverview\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"optionOverview\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"optionContract\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"optionContract\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.a(this.f18113a, uVar.f18113a) && Intrinsics.a(this.f18114b, uVar.f18114b) && this.f18115c == uVar.f18115c && this.f18116d == uVar.f18116d && this.f18117e == uVar.f18117e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18117e) + v.e.d(this.f18116d, v.e.d(this.f18115c, (this.f18114b.hashCode() + (this.f18113a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OptionOrderPageBottomSheetFragmentArgs(optionContract=");
        sb2.append(this.f18113a);
        sb2.append(", optionOverview=");
        sb2.append(this.f18114b);
        sb2.append(", isSell=");
        sb2.append(this.f18115c);
        sb2.append(", isModel=");
        sb2.append(this.f18116d);
        sb2.append(", isFromPortfolio=");
        return da.e.o(sb2, this.f18117e, ")");
    }
}
