package yg;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.h;
import com.assetgro.stockgro.data.model.portfolio.WalletBalanceResponseDto;
import com.assetgro.stockgro.data.remote.response.UnlockPortfolioData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final UnlockPortfolioData f41632a;

    /* renamed from: b, reason: collision with root package name */
    public final WalletBalanceResponseDto f41633b;

    public d(UnlockPortfolioData unlockPortfolio, WalletBalanceResponseDto wallet) {
        Intrinsics.checkNotNullParameter(unlockPortfolio, "unlockPortfolio");
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        this.f41632a = unlockPortfolio;
        this.f41633b = wallet;
    }

    @NotNull
    public static final d fromBundle(@NotNull Bundle bundle) {
        if (da.e.y(bundle, "bundle", d.class, "unlock_portfolio")) {
            if (!Parcelable.class.isAssignableFrom(UnlockPortfolioData.class) && !Serializable.class.isAssignableFrom(UnlockPortfolioData.class)) {
                throw new UnsupportedOperationException(UnlockPortfolioData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            UnlockPortfolioData unlockPortfolioData = (UnlockPortfolioData) bundle.get("unlock_portfolio");
            if (unlockPortfolioData != null) {
                if (bundle.containsKey("wallet")) {
                    if (!Parcelable.class.isAssignableFrom(WalletBalanceResponseDto.class) && !Serializable.class.isAssignableFrom(WalletBalanceResponseDto.class)) {
                        throw new UnsupportedOperationException(WalletBalanceResponseDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    WalletBalanceResponseDto walletBalanceResponseDto = (WalletBalanceResponseDto) bundle.get("wallet");
                    if (walletBalanceResponseDto != null) {
                        return new d(unlockPortfolioData, walletBalanceResponseDto);
                    }
                    throw new IllegalArgumentException("Argument \"wallet\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"wallet\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"unlock_portfolio\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"unlock_portfolio\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.a(this.f41632a, dVar.f41632a) && Intrinsics.a(this.f41633b, dVar.f41633b);
    }

    public final int hashCode() {
        return this.f41633b.hashCode() + (this.f41632a.hashCode() * 31);
    }

    public final String toString() {
        return "UnlockPortfolioDetailFragmentArgs(unlockPortfolio=" + this.f41632a + ", wallet=" + this.f41633b + ")";
    }
}
