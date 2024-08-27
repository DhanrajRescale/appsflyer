package com.assetgro.stockgro.data.model.portfolio;

import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.ui.stock.v2.data.remote.NarrationDto;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006$"}, d2 = {"Lcom/assetgro/stockgro/data/model/portfolio/WalletUIData;", "Landroid/os/Parcelable;", "title", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.VALUE, "displayValue", "narration", "Lcom/assetgro/stockgro/ui/stock/v2/data/remote/NarrationDto;", "isCash", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/ui/stock/v2/data/remote/NarrationDto;Z)V", "getDisplayValue", "()Ljava/lang/String;", "()Z", "getNarration", "()Lcom/assetgro/stockgro/ui/stock/v2/data/remote/NarrationDto;", "getTitle", "getValue", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WalletUIData implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<WalletUIData> CREATOR = new Creator();

    @SerializedName("display_value")
    @NotNull
    private final String displayValue;

    @SerializedName("is_cash")
    private final boolean isCash;

    @SerializedName("narration")
    @NotNull
    private final NarrationDto narration;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.VALUE)
    @NotNull
    private final String value;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<WalletUIData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WalletUIData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WalletUIData(parcel.readString(), parcel.readString(), parcel.readString(), NarrationDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WalletUIData[] newArray(int i10) {
            return new WalletUIData[i10];
        }
    }

    public WalletUIData(@NotNull String title, @NotNull String value, @NotNull String displayValue, @NotNull NarrationDto narration, boolean z10) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(displayValue, "displayValue");
        Intrinsics.checkNotNullParameter(narration, "narration");
        this.title = title;
        this.value = value;
        this.displayValue = displayValue;
        this.narration = narration;
        this.isCash = z10;
    }

    public static /* synthetic */ WalletUIData copy$default(WalletUIData walletUIData, String str, String str2, String str3, NarrationDto narrationDto, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = walletUIData.title;
        }
        if ((i10 & 2) != 0) {
            str2 = walletUIData.value;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            str3 = walletUIData.displayValue;
        }
        String str5 = str3;
        if ((i10 & 8) != 0) {
            narrationDto = walletUIData.narration;
        }
        NarrationDto narrationDto2 = narrationDto;
        if ((i10 & 16) != 0) {
            z10 = walletUIData.isCash;
        }
        return walletUIData.copy(str, str4, str5, narrationDto2, z10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDisplayValue() {
        return this.displayValue;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final NarrationDto getNarration() {
        return this.narration;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsCash() {
        return this.isCash;
    }

    @NotNull
    public final WalletUIData copy(@NotNull String title, @NotNull String value, @NotNull String displayValue, @NotNull NarrationDto narration, boolean isCash) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(displayValue, "displayValue");
        Intrinsics.checkNotNullParameter(narration, "narration");
        return new WalletUIData(title, value, displayValue, narration, isCash);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletUIData)) {
            return false;
        }
        WalletUIData walletUIData = (WalletUIData) other;
        return Intrinsics.a(this.title, walletUIData.title) && Intrinsics.a(this.value, walletUIData.value) && Intrinsics.a(this.displayValue, walletUIData.displayValue) && Intrinsics.a(this.narration, walletUIData.narration) && this.isCash == walletUIData.isCash;
    }

    @NotNull
    public final String getDisplayValue() {
        return this.displayValue;
    }

    @NotNull
    public final NarrationDto getNarration() {
        return this.narration;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isCash) + ((this.narration.hashCode() + h.g(this.displayValue, h.g(this.value, this.title.hashCode() * 31, 31), 31)) * 31);
    }

    public final boolean isCash() {
        return this.isCash;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.value;
        String str3 = this.displayValue;
        NarrationDto narrationDto = this.narration;
        boolean z10 = this.isCash;
        StringBuilder l10 = e.l("WalletUIData(title=", str, ", value=", str2, ", displayValue=");
        l10.append(str3);
        l10.append(", narration=");
        l10.append(narrationDto);
        l10.append(", isCash=");
        return da.e.o(l10, z10, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.title);
        parcel.writeString(this.value);
        parcel.writeString(this.displayValue);
        this.narration.writeToParcel(parcel, flags);
        parcel.writeInt(this.isCash ? 1 : 0);
    }
}
