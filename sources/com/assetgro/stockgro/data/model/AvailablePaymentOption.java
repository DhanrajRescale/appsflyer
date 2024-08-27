package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006)"}, d2 = {"Lcom/assetgro/stockgro/data/model/AvailablePaymentOption;", "Landroid/os/Parcelable;", "title", HttpUrl.FRAGMENT_ENCODE_SET, "subTitle", "enabled", HttpUrl.FRAGMENT_ENCODE_SET, "note", "balance", PaymentConstants.AMOUNT, "description", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getBalance", "getDescription", "getEnabled", "()Z", "getNote", "getSubTitle", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AvailablePaymentOption implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<AvailablePaymentOption> CREATOR = new Creator();

    @SerializedName(PaymentConstants.AMOUNT)
    @NotNull
    private final String amount;

    @SerializedName("balance")
    @NotNull
    private final String balance;

    @SerializedName("description")
    @NotNull
    private final String description;

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName("note")
    @NotNull
    private final String note;

    @SerializedName("subtitle")
    @NotNull
    private final String subTitle;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<AvailablePaymentOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AvailablePaymentOption createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AvailablePaymentOption(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AvailablePaymentOption[] newArray(int i10) {
            return new AvailablePaymentOption[i10];
        }
    }

    public AvailablePaymentOption(@NotNull String title, @NotNull String subTitle, boolean z10, @NotNull String note, @NotNull String balance, @NotNull String amount, @NotNull String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        this.title = title;
        this.subTitle = subTitle;
        this.enabled = z10;
        this.note = note;
        this.balance = balance;
        this.amount = amount;
        this.description = description;
    }

    public static /* synthetic */ AvailablePaymentOption copy$default(AvailablePaymentOption availablePaymentOption, String str, String str2, boolean z10, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = availablePaymentOption.title;
        }
        if ((i10 & 2) != 0) {
            str2 = availablePaymentOption.subTitle;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            z10 = availablePaymentOption.enabled;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            str3 = availablePaymentOption.note;
        }
        String str8 = str3;
        if ((i10 & 16) != 0) {
            str4 = availablePaymentOption.balance;
        }
        String str9 = str4;
        if ((i10 & 32) != 0) {
            str5 = availablePaymentOption.amount;
        }
        String str10 = str5;
        if ((i10 & 64) != 0) {
            str6 = availablePaymentOption.description;
        }
        return availablePaymentOption.copy(str, str7, z11, str8, str9, str10, str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getBalance() {
        return this.balance;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final AvailablePaymentOption copy(@NotNull String title, @NotNull String subTitle, boolean enabled, @NotNull String note, @NotNull String balance, @NotNull String amount, @NotNull String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        return new AvailablePaymentOption(title, subTitle, enabled, note, balance, amount, description);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailablePaymentOption)) {
            return false;
        }
        AvailablePaymentOption availablePaymentOption = (AvailablePaymentOption) other;
        return Intrinsics.a(this.title, availablePaymentOption.title) && Intrinsics.a(this.subTitle, availablePaymentOption.subTitle) && this.enabled == availablePaymentOption.enabled && Intrinsics.a(this.note, availablePaymentOption.note) && Intrinsics.a(this.balance, availablePaymentOption.balance) && Intrinsics.a(this.amount, availablePaymentOption.amount) && Intrinsics.a(this.description, availablePaymentOption.description);
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getBalance() {
        return this.balance;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final String getNote() {
        return this.note;
    }

    @NotNull
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.description.hashCode() + h.g(this.amount, h.g(this.balance, h.g(this.note, e.d(this.enabled, h.g(this.subTitle, this.title.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subTitle;
        boolean z10 = this.enabled;
        String str3 = this.note;
        String str4 = this.balance;
        String str5 = this.amount;
        String str6 = this.description;
        StringBuilder l10 = e.l("AvailablePaymentOption(title=", str, ", subTitle=", str2, ", enabled=");
        l10.append(z10);
        l10.append(", note=");
        l10.append(str3);
        l10.append(", balance=");
        e.v(l10, str4, ", amount=", str5, ", description=");
        return d.o(l10, str6, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeString(this.note);
        parcel.writeString(this.balance);
        parcel.writeString(this.amount);
        parcel.writeString(this.description);
    }
}
