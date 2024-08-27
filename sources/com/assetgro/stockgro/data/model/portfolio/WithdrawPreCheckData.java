package com.assetgro.stockgro.data.model.portfolio;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import da.e;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/assetgro/stockgro/data/model/portfolio/WithdrawPreCheckData;", "Landroid/os/Parcelable;", "ctaTitle", HttpUrl.FRAGMENT_ENCODE_SET, "errorMessage", "goToWallet", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Z)V", "getCtaTitle", "()Ljava/lang/String;", "getErrorMessage", "getGoToWallet", "()Z", "component1", "component2", "component3", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WithdrawPreCheckData implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<WithdrawPreCheckData> CREATOR = new Creator();

    @SerializedName("cta_title")
    @NotNull
    private final String ctaTitle;

    @SerializedName("error_message")
    @NotNull
    private final String errorMessage;
    private final transient boolean goToWallet;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<WithdrawPreCheckData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WithdrawPreCheckData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WithdrawPreCheckData(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WithdrawPreCheckData[] newArray(int i10) {
            return new WithdrawPreCheckData[i10];
        }
    }

    public WithdrawPreCheckData(@NotNull String ctaTitle, @NotNull String errorMessage, boolean z10) {
        Intrinsics.checkNotNullParameter(ctaTitle, "ctaTitle");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.ctaTitle = ctaTitle;
        this.errorMessage = errorMessage;
        this.goToWallet = z10;
    }

    public static /* synthetic */ WithdrawPreCheckData copy$default(WithdrawPreCheckData withdrawPreCheckData, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = withdrawPreCheckData.ctaTitle;
        }
        if ((i10 & 2) != 0) {
            str2 = withdrawPreCheckData.errorMessage;
        }
        if ((i10 & 4) != 0) {
            z10 = withdrawPreCheckData.goToWallet;
        }
        return withdrawPreCheckData.copy(str, str2, z10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getGoToWallet() {
        return this.goToWallet;
    }

    @NotNull
    public final WithdrawPreCheckData copy(@NotNull String ctaTitle, @NotNull String errorMessage, boolean goToWallet) {
        Intrinsics.checkNotNullParameter(ctaTitle, "ctaTitle");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new WithdrawPreCheckData(ctaTitle, errorMessage, goToWallet);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawPreCheckData)) {
            return false;
        }
        WithdrawPreCheckData withdrawPreCheckData = (WithdrawPreCheckData) other;
        return Intrinsics.a(this.ctaTitle, withdrawPreCheckData.ctaTitle) && Intrinsics.a(this.errorMessage, withdrawPreCheckData.errorMessage) && this.goToWallet == withdrawPreCheckData.goToWallet;
    }

    @NotNull
    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getGoToWallet() {
        return this.goToWallet;
    }

    public int hashCode() {
        return Boolean.hashCode(this.goToWallet) + h.g(this.errorMessage, this.ctaTitle.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.ctaTitle;
        String str2 = this.errorMessage;
        return e.o(v.e.l("WithdrawPreCheckData(ctaTitle=", str, ", errorMessage=", str2, ", goToWallet="), this.goToWallet, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ctaTitle);
        parcel.writeString(this.errorMessage);
        parcel.writeInt(this.goToWallet ? 1 : 0);
    }
}
