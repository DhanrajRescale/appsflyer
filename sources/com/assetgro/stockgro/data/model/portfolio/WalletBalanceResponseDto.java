package com.assetgro.stockgro.data.model.portfolio;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jq\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\t\u00102\u001a\u000203HÖ\u0001J\u0013\u00104\u001a\u00020\u00072\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000203HÖ\u0001J\t\u00108\u001a\u00020\tHÖ\u0001J\u0019\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u000203HÖ\u0001R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006>"}, d2 = {"Lcom/assetgro/stockgro/data/model/portfolio/WalletBalanceResponseDto;", "Landroid/os/Parcelable;", "total", HttpUrl.FRAGMENT_ENCODE_SET, "funds", "Lcom/assetgro/stockgro/data/model/portfolio/WalletFunds;", "kycRequired", HttpUrl.FRAGMENT_ENCODE_SET, "withdrawLimitTitle", HttpUrl.FRAGMENT_ENCODE_SET, "withdraw", "Lcom/assetgro/stockgro/data/model/portfolio/WithdrawPreCheckData;", "deposit", "Lcom/assetgro/stockgro/data/model/portfolio/WalletUIData;", "cash", "bonus", "announcement", "Lcom/assetgro/stockgro/data/model/portfolio/WalletHomeAnnouncement;", "expiry", "Lcom/assetgro/stockgro/data/model/portfolio/WalletExpiryData;", "(DLcom/assetgro/stockgro/data/model/portfolio/WalletFunds;ZLjava/lang/String;Lcom/assetgro/stockgro/data/model/portfolio/WithdrawPreCheckData;Lcom/assetgro/stockgro/data/model/portfolio/WalletUIData;Lcom/assetgro/stockgro/data/model/portfolio/WalletUIData;Lcom/assetgro/stockgro/data/model/portfolio/WalletUIData;Lcom/assetgro/stockgro/data/model/portfolio/WalletHomeAnnouncement;Lcom/assetgro/stockgro/data/model/portfolio/WalletExpiryData;)V", "getAnnouncement", "()Lcom/assetgro/stockgro/data/model/portfolio/WalletHomeAnnouncement;", "getBonus", "()Lcom/assetgro/stockgro/data/model/portfolio/WalletUIData;", "getCash", "getDeposit", "getExpiry", "()Lcom/assetgro/stockgro/data/model/portfolio/WalletExpiryData;", "getFunds", "()Lcom/assetgro/stockgro/data/model/portfolio/WalletFunds;", "getKycRequired", "()Z", "getTotal", "()D", "getWithdraw", "()Lcom/assetgro/stockgro/data/model/portfolio/WithdrawPreCheckData;", "getWithdrawLimitTitle", "()Ljava/lang/String;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WalletBalanceResponseDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<WalletBalanceResponseDto> CREATOR = new Creator();

    @SerializedName("announcement")
    private final WalletHomeAnnouncement announcement;

    @SerializedName("bonus")
    @NotNull
    private final WalletUIData bonus;

    @SerializedName("cash")
    @NotNull
    private final WalletUIData cash;

    @SerializedName("deposit")
    @NotNull
    private final WalletUIData deposit;

    @SerializedName("expiry")
    private final WalletExpiryData expiry;

    @SerializedName("funds")
    @NotNull
    private final WalletFunds funds;

    @SerializedName("kyc_required")
    private final boolean kycRequired;

    @SerializedName("total")
    private final double total;

    @SerializedName("withdraw")
    @NotNull
    private final WithdrawPreCheckData withdraw;

    @SerializedName("withdraw_limit_title")
    @NotNull
    private final String withdrawLimitTitle;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<WalletBalanceResponseDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WalletBalanceResponseDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            double readDouble = parcel.readDouble();
            WalletFunds createFromParcel = WalletFunds.CREATOR.createFromParcel(parcel);
            boolean z10 = parcel.readInt() != 0;
            String readString = parcel.readString();
            WithdrawPreCheckData createFromParcel2 = WithdrawPreCheckData.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<WalletUIData> creator = WalletUIData.CREATOR;
            return new WalletBalanceResponseDto(readDouble, createFromParcel, z10, readString, createFromParcel2, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : WalletHomeAnnouncement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? WalletExpiryData.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WalletBalanceResponseDto[] newArray(int i10) {
            return new WalletBalanceResponseDto[i10];
        }
    }

    public WalletBalanceResponseDto(double d10, @NotNull WalletFunds funds, boolean z10, @NotNull String withdrawLimitTitle, @NotNull WithdrawPreCheckData withdraw, @NotNull WalletUIData deposit, @NotNull WalletUIData cash, @NotNull WalletUIData bonus, WalletHomeAnnouncement walletHomeAnnouncement, WalletExpiryData walletExpiryData) {
        Intrinsics.checkNotNullParameter(funds, "funds");
        Intrinsics.checkNotNullParameter(withdrawLimitTitle, "withdrawLimitTitle");
        Intrinsics.checkNotNullParameter(withdraw, "withdraw");
        Intrinsics.checkNotNullParameter(deposit, "deposit");
        Intrinsics.checkNotNullParameter(cash, "cash");
        Intrinsics.checkNotNullParameter(bonus, "bonus");
        this.total = d10;
        this.funds = funds;
        this.kycRequired = z10;
        this.withdrawLimitTitle = withdrawLimitTitle;
        this.withdraw = withdraw;
        this.deposit = deposit;
        this.cash = cash;
        this.bonus = bonus;
        this.announcement = walletHomeAnnouncement;
        this.expiry = walletExpiryData;
    }

    /* renamed from: component1, reason: from getter */
    public final double getTotal() {
        return this.total;
    }

    /* renamed from: component10, reason: from getter */
    public final WalletExpiryData getExpiry() {
        return this.expiry;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final WalletFunds getFunds() {
        return this.funds;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getKycRequired() {
        return this.kycRequired;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getWithdrawLimitTitle() {
        return this.withdrawLimitTitle;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final WithdrawPreCheckData getWithdraw() {
        return this.withdraw;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final WalletUIData getDeposit() {
        return this.deposit;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final WalletUIData getCash() {
        return this.cash;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final WalletUIData getBonus() {
        return this.bonus;
    }

    /* renamed from: component9, reason: from getter */
    public final WalletHomeAnnouncement getAnnouncement() {
        return this.announcement;
    }

    @NotNull
    public final WalletBalanceResponseDto copy(double total, @NotNull WalletFunds funds, boolean kycRequired, @NotNull String withdrawLimitTitle, @NotNull WithdrawPreCheckData withdraw, @NotNull WalletUIData deposit, @NotNull WalletUIData cash, @NotNull WalletUIData bonus, WalletHomeAnnouncement announcement, WalletExpiryData expiry) {
        Intrinsics.checkNotNullParameter(funds, "funds");
        Intrinsics.checkNotNullParameter(withdrawLimitTitle, "withdrawLimitTitle");
        Intrinsics.checkNotNullParameter(withdraw, "withdraw");
        Intrinsics.checkNotNullParameter(deposit, "deposit");
        Intrinsics.checkNotNullParameter(cash, "cash");
        Intrinsics.checkNotNullParameter(bonus, "bonus");
        return new WalletBalanceResponseDto(total, funds, kycRequired, withdrawLimitTitle, withdraw, deposit, cash, bonus, announcement, expiry);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletBalanceResponseDto)) {
            return false;
        }
        WalletBalanceResponseDto walletBalanceResponseDto = (WalletBalanceResponseDto) other;
        return Double.compare(this.total, walletBalanceResponseDto.total) == 0 && Intrinsics.a(this.funds, walletBalanceResponseDto.funds) && this.kycRequired == walletBalanceResponseDto.kycRequired && Intrinsics.a(this.withdrawLimitTitle, walletBalanceResponseDto.withdrawLimitTitle) && Intrinsics.a(this.withdraw, walletBalanceResponseDto.withdraw) && Intrinsics.a(this.deposit, walletBalanceResponseDto.deposit) && Intrinsics.a(this.cash, walletBalanceResponseDto.cash) && Intrinsics.a(this.bonus, walletBalanceResponseDto.bonus) && Intrinsics.a(this.announcement, walletBalanceResponseDto.announcement) && Intrinsics.a(this.expiry, walletBalanceResponseDto.expiry);
    }

    public final WalletHomeAnnouncement getAnnouncement() {
        return this.announcement;
    }

    @NotNull
    public final WalletUIData getBonus() {
        return this.bonus;
    }

    @NotNull
    public final WalletUIData getCash() {
        return this.cash;
    }

    @NotNull
    public final WalletUIData getDeposit() {
        return this.deposit;
    }

    public final WalletExpiryData getExpiry() {
        return this.expiry;
    }

    @NotNull
    public final WalletFunds getFunds() {
        return this.funds;
    }

    public final boolean getKycRequired() {
        return this.kycRequired;
    }

    public final double getTotal() {
        return this.total;
    }

    @NotNull
    public final WithdrawPreCheckData getWithdraw() {
        return this.withdraw;
    }

    @NotNull
    public final String getWithdrawLimitTitle() {
        return this.withdrawLimitTitle;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.bonus.hashCode() + ((this.cash.hashCode() + ((this.deposit.hashCode() + ((this.withdraw.hashCode() + h.g(this.withdrawLimitTitle, e.d(this.kycRequired, (this.funds.hashCode() + (Double.hashCode(this.total) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31;
        WalletHomeAnnouncement walletHomeAnnouncement = this.announcement;
        int i10 = 0;
        if (walletHomeAnnouncement == null) {
            hashCode = 0;
        } else {
            hashCode = walletHomeAnnouncement.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        WalletExpiryData walletExpiryData = this.expiry;
        if (walletExpiryData != null) {
            i10 = walletExpiryData.hashCode();
        }
        return i11 + i10;
    }

    @NotNull
    public String toString() {
        return "WalletBalanceResponseDto(total=" + this.total + ", funds=" + this.funds + ", kycRequired=" + this.kycRequired + ", withdrawLimitTitle=" + this.withdrawLimitTitle + ", withdraw=" + this.withdraw + ", deposit=" + this.deposit + ", cash=" + this.cash + ", bonus=" + this.bonus + ", announcement=" + this.announcement + ", expiry=" + this.expiry + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.total);
        this.funds.writeToParcel(parcel, flags);
        parcel.writeInt(this.kycRequired ? 1 : 0);
        parcel.writeString(this.withdrawLimitTitle);
        this.withdraw.writeToParcel(parcel, flags);
        this.deposit.writeToParcel(parcel, flags);
        this.cash.writeToParcel(parcel, flags);
        this.bonus.writeToParcel(parcel, flags);
        WalletHomeAnnouncement walletHomeAnnouncement = this.announcement;
        if (walletHomeAnnouncement == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            walletHomeAnnouncement.writeToParcel(parcel, flags);
        }
        WalletExpiryData walletExpiryData = this.expiry;
        if (walletExpiryData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            walletExpiryData.writeToParcel(parcel, flags);
        }
    }
}
