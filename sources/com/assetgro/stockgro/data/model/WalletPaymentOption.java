package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003Jo\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J\u0013\u0010(\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020'HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u00062"}, d2 = {"Lcom/assetgro/stockgro/data/model/WalletPaymentOption;", "Landroid/os/Parcelable;", "title", HttpUrl.FRAGMENT_ENCODE_SET, "subtitle", "enabled", HttpUrl.FRAGMENT_ENCODE_SET, "note", "balance", "deposit", "cash", "breakdownDeposit", "breakdownCash", "breakdownNote", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBalance", "()Ljava/lang/String;", "getBreakdownCash", "getBreakdownDeposit", "getBreakdownNote", "getCash", "getDeposit", "getEnabled", "()Z", "getNote", "getSubtitle", "getTitle", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WalletPaymentOption implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<WalletPaymentOption> CREATOR = new Creator();

    @SerializedName("balance")
    @NotNull
    private final String balance;

    @SerializedName("breakdown_cash")
    @NotNull
    private final String breakdownCash;

    @SerializedName("breakdown_deposit")
    @NotNull
    private final String breakdownDeposit;

    @SerializedName("breakdown_note")
    @NotNull
    private final String breakdownNote;

    @SerializedName("cash")
    @NotNull
    private final String cash;

    @SerializedName("deposit")
    @NotNull
    private final String deposit;

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName("note")
    @NotNull
    private final String note;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<WalletPaymentOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WalletPaymentOption createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WalletPaymentOption(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WalletPaymentOption[] newArray(int i10) {
            return new WalletPaymentOption[i10];
        }
    }

    public WalletPaymentOption(@NotNull String title, String str, boolean z10, @NotNull String note, @NotNull String balance, @NotNull String deposit, @NotNull String cash, @NotNull String breakdownDeposit, @NotNull String breakdownCash, @NotNull String breakdownNote) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(deposit, "deposit");
        Intrinsics.checkNotNullParameter(cash, "cash");
        Intrinsics.checkNotNullParameter(breakdownDeposit, "breakdownDeposit");
        Intrinsics.checkNotNullParameter(breakdownCash, "breakdownCash");
        Intrinsics.checkNotNullParameter(breakdownNote, "breakdownNote");
        this.title = title;
        this.subtitle = str;
        this.enabled = z10;
        this.note = note;
        this.balance = balance;
        this.deposit = deposit;
        this.cash = cash;
        this.breakdownDeposit = breakdownDeposit;
        this.breakdownCash = breakdownCash;
        this.breakdownNote = breakdownNote;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getBreakdownNote() {
        return this.breakdownNote;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
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
    public final String getDeposit() {
        return this.deposit;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getCash() {
        return this.cash;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getBreakdownDeposit() {
        return this.breakdownDeposit;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getBreakdownCash() {
        return this.breakdownCash;
    }

    @NotNull
    public final WalletPaymentOption copy(@NotNull String title, String subtitle, boolean enabled, @NotNull String note, @NotNull String balance, @NotNull String deposit, @NotNull String cash, @NotNull String breakdownDeposit, @NotNull String breakdownCash, @NotNull String breakdownNote) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(deposit, "deposit");
        Intrinsics.checkNotNullParameter(cash, "cash");
        Intrinsics.checkNotNullParameter(breakdownDeposit, "breakdownDeposit");
        Intrinsics.checkNotNullParameter(breakdownCash, "breakdownCash");
        Intrinsics.checkNotNullParameter(breakdownNote, "breakdownNote");
        return new WalletPaymentOption(title, subtitle, enabled, note, balance, deposit, cash, breakdownDeposit, breakdownCash, breakdownNote);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletPaymentOption)) {
            return false;
        }
        WalletPaymentOption walletPaymentOption = (WalletPaymentOption) other;
        return Intrinsics.a(this.title, walletPaymentOption.title) && Intrinsics.a(this.subtitle, walletPaymentOption.subtitle) && this.enabled == walletPaymentOption.enabled && Intrinsics.a(this.note, walletPaymentOption.note) && Intrinsics.a(this.balance, walletPaymentOption.balance) && Intrinsics.a(this.deposit, walletPaymentOption.deposit) && Intrinsics.a(this.cash, walletPaymentOption.cash) && Intrinsics.a(this.breakdownDeposit, walletPaymentOption.breakdownDeposit) && Intrinsics.a(this.breakdownCash, walletPaymentOption.breakdownCash) && Intrinsics.a(this.breakdownNote, walletPaymentOption.breakdownNote);
    }

    @NotNull
    public final String getBalance() {
        return this.balance;
    }

    @NotNull
    public final String getBreakdownCash() {
        return this.breakdownCash;
    }

    @NotNull
    public final String getBreakdownDeposit() {
        return this.breakdownDeposit;
    }

    @NotNull
    public final String getBreakdownNote() {
        return this.breakdownNote;
    }

    @NotNull
    public final String getCash() {
        return this.cash;
    }

    @NotNull
    public final String getDeposit() {
        return this.deposit;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final String getNote() {
        return this.note;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.title.hashCode() * 31;
        String str = this.subtitle;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.breakdownNote.hashCode() + h.g(this.breakdownCash, h.g(this.breakdownDeposit, h.g(this.cash, h.g(this.deposit, h.g(this.balance, h.g(this.note, e.d(this.enabled, (hashCode2 + hashCode) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        boolean z10 = this.enabled;
        String str3 = this.note;
        String str4 = this.balance;
        String str5 = this.deposit;
        String str6 = this.cash;
        String str7 = this.breakdownDeposit;
        String str8 = this.breakdownCash;
        String str9 = this.breakdownNote;
        StringBuilder l10 = e.l("WalletPaymentOption(title=", str, ", subtitle=", str2, ", enabled=");
        l10.append(z10);
        l10.append(", note=");
        l10.append(str3);
        l10.append(", balance=");
        e.v(l10, str4, ", deposit=", str5, ", cash=");
        e.v(l10, str6, ", breakdownDeposit=", str7, ", breakdownCash=");
        return a.k(l10, str8, ", breakdownNote=", str9, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeString(this.note);
        parcel.writeString(this.balance);
        parcel.writeString(this.deposit);
        parcel.writeString(this.cash);
        parcel.writeString(this.breakdownDeposit);
        parcel.writeString(this.breakdownCash);
        parcel.writeString(this.breakdownNote);
    }

    public /* synthetic */ WalletPaymentOption(String str, String str2, boolean z10, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str2, z10, str3, str4, str5, str6, str7, str8, str9);
    }
}
