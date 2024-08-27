package com.assetgro.stockgro.data.remote.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006!"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/WithdrawInitiateDto;", "Landroid/os/Parcelable;", PaymentConstants.AMOUNT, HttpUrl.FRAGMENT_ENCODE_SET, "beneficiary", HttpUrl.FRAGMENT_ENCODE_SET, "beneficiaryType", "ifsc", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()D", "getBeneficiary", "()Ljava/lang/String;", "getBeneficiaryType", "getIfsc", "component1", "component2", "component3", "component4", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WithdrawInitiateDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<WithdrawInitiateDto> CREATOR = new Creator();

    @SerializedName(PaymentConstants.AMOUNT)
    private final double amount;

    @SerializedName("beneficiary")
    @NotNull
    private final String beneficiary;

    @SerializedName("beneficiary_type")
    @NotNull
    private final String beneficiaryType;

    @SerializedName("ifsc")
    private final String ifsc;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<WithdrawInitiateDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WithdrawInitiateDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WithdrawInitiateDto(parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WithdrawInitiateDto[] newArray(int i10) {
            return new WithdrawInitiateDto[i10];
        }
    }

    public WithdrawInitiateDto(double d10, @NotNull String beneficiary, @NotNull String beneficiaryType, String str) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(beneficiaryType, "beneficiaryType");
        this.amount = d10;
        this.beneficiary = beneficiary;
        this.beneficiaryType = beneficiaryType;
        this.ifsc = str;
    }

    public static /* synthetic */ WithdrawInitiateDto copy$default(WithdrawInitiateDto withdrawInitiateDto, double d10, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = withdrawInitiateDto.amount;
        }
        double d11 = d10;
        if ((i10 & 2) != 0) {
            str = withdrawInitiateDto.beneficiary;
        }
        String str4 = str;
        if ((i10 & 4) != 0) {
            str2 = withdrawInitiateDto.beneficiaryType;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = withdrawInitiateDto.ifsc;
        }
        return withdrawInitiateDto.copy(d11, str4, str5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBeneficiary() {
        return this.beneficiary;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBeneficiaryType() {
        return this.beneficiaryType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIfsc() {
        return this.ifsc;
    }

    @NotNull
    public final WithdrawInitiateDto copy(double amount, @NotNull String beneficiary, @NotNull String beneficiaryType, String ifsc) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(beneficiaryType, "beneficiaryType");
        return new WithdrawInitiateDto(amount, beneficiary, beneficiaryType, ifsc);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawInitiateDto)) {
            return false;
        }
        WithdrawInitiateDto withdrawInitiateDto = (WithdrawInitiateDto) other;
        return Double.compare(this.amount, withdrawInitiateDto.amount) == 0 && Intrinsics.a(this.beneficiary, withdrawInitiateDto.beneficiary) && Intrinsics.a(this.beneficiaryType, withdrawInitiateDto.beneficiaryType) && Intrinsics.a(this.ifsc, withdrawInitiateDto.ifsc);
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getBeneficiary() {
        return this.beneficiary;
    }

    @NotNull
    public final String getBeneficiaryType() {
        return this.beneficiaryType;
    }

    public final String getIfsc() {
        return this.ifsc;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.beneficiaryType, h.g(this.beneficiary, Double.hashCode(this.amount) * 31, 31), 31);
        String str = this.ifsc;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return g10 + hashCode;
    }

    @NotNull
    public String toString() {
        double d10 = this.amount;
        String str = this.beneficiary;
        String str2 = this.beneficiaryType;
        String str3 = this.ifsc;
        StringBuilder sb2 = new StringBuilder("WithdrawInitiateDto(amount=");
        sb2.append(d10);
        sb2.append(", beneficiary=");
        sb2.append(str);
        e.v(sb2, ", beneficiaryType=", str2, ", ifsc=", str3);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.amount);
        parcel.writeString(this.beneficiary);
        parcel.writeString(this.beneficiaryType);
        parcel.writeString(this.ifsc);
    }
}
