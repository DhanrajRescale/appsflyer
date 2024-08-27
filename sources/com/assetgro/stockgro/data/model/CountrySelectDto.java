package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import da.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003Jk\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\nHÆ\u0001J\t\u0010)\u001a\u00020\u0007HÖ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u0007HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00065"}, d2 = {"Lcom/assetgro/stockgro/data/model/CountrySelectDto;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, "code", "prefix", "phoneNumberLength", HttpUrl.FRAGMENT_ENCODE_SET, "otpChannels", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/OtpChannel;", "flagUrl", "Lcom/assetgro/stockgro/data/model/FlagUrl;", "referralCodeBannerUrl", "locale", "defaultOtpChannel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lcom/assetgro/stockgro/data/model/FlagUrl;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/OtpChannel;)V", "getCode", "()Ljava/lang/String;", "getDefaultOtpChannel", "()Lcom/assetgro/stockgro/data/model/OtpChannel;", "getFlagUrl", "()Lcom/assetgro/stockgro/data/model/FlagUrl;", "getLocale", "getName", "getOtpChannels", "()Ljava/util/List;", "getPhoneNumberLength", "()I", "getPrefix", "getReferralCodeBannerUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CountrySelectDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<CountrySelectDto> CREATOR = new Creator();

    @SerializedName("code")
    @NotNull
    private final String code;

    @SerializedName("default_otp_channel")
    @NotNull
    private final OtpChannel defaultOtpChannel;

    @SerializedName("flag_url")
    @NotNull
    private final FlagUrl flagUrl;

    @SerializedName("locale")
    @NotNull
    private final String locale;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("otp_channels")
    @NotNull
    private final List<OtpChannel> otpChannels;

    @SerializedName("length")
    private final int phoneNumberLength;

    @SerializedName("prefix")
    @NotNull
    private final String prefix;

    @SerializedName("referral_code_banner_url")
    private final String referralCodeBannerUrl;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<CountrySelectDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CountrySelectDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i10 = 0;
            while (i10 != readInt2) {
                i10 = h.e(OtpChannel.CREATOR, parcel, arrayList, i10, 1);
            }
            return new CountrySelectDto(readString, readString2, readString3, readInt, arrayList, FlagUrl.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), OtpChannel.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CountrySelectDto[] newArray(int i10) {
            return new CountrySelectDto[i10];
        }
    }

    public CountrySelectDto(@NotNull String name, @NotNull String code, @NotNull String prefix, int i10, @NotNull List<OtpChannel> otpChannels, @NotNull FlagUrl flagUrl, String str, @NotNull String locale, @NotNull OtpChannel defaultOtpChannel) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(otpChannels, "otpChannels");
        Intrinsics.checkNotNullParameter(flagUrl, "flagUrl");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(defaultOtpChannel, "defaultOtpChannel");
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.phoneNumberLength = i10;
        this.otpChannels = otpChannels;
        this.flagUrl = flagUrl;
        this.referralCodeBannerUrl = str;
        this.locale = locale;
        this.defaultOtpChannel = defaultOtpChannel;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPrefix() {
        return this.prefix;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPhoneNumberLength() {
        return this.phoneNumberLength;
    }

    @NotNull
    public final List<OtpChannel> component5() {
        return this.otpChannels;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final FlagUrl getFlagUrl() {
        return this.flagUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getReferralCodeBannerUrl() {
        return this.referralCodeBannerUrl;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final OtpChannel getDefaultOtpChannel() {
        return this.defaultOtpChannel;
    }

    @NotNull
    public final CountrySelectDto copy(@NotNull String name, @NotNull String code, @NotNull String prefix, int phoneNumberLength, @NotNull List<OtpChannel> otpChannels, @NotNull FlagUrl flagUrl, String referralCodeBannerUrl, @NotNull String locale, @NotNull OtpChannel defaultOtpChannel) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(otpChannels, "otpChannels");
        Intrinsics.checkNotNullParameter(flagUrl, "flagUrl");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(defaultOtpChannel, "defaultOtpChannel");
        return new CountrySelectDto(name, code, prefix, phoneNumberLength, otpChannels, flagUrl, referralCodeBannerUrl, locale, defaultOtpChannel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountrySelectDto)) {
            return false;
        }
        CountrySelectDto countrySelectDto = (CountrySelectDto) other;
        return Intrinsics.a(this.name, countrySelectDto.name) && Intrinsics.a(this.code, countrySelectDto.code) && Intrinsics.a(this.prefix, countrySelectDto.prefix) && this.phoneNumberLength == countrySelectDto.phoneNumberLength && Intrinsics.a(this.otpChannels, countrySelectDto.otpChannels) && Intrinsics.a(this.flagUrl, countrySelectDto.flagUrl) && Intrinsics.a(this.referralCodeBannerUrl, countrySelectDto.referralCodeBannerUrl) && Intrinsics.a(this.locale, countrySelectDto.locale) && Intrinsics.a(this.defaultOtpChannel, countrySelectDto.defaultOtpChannel);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final OtpChannel getDefaultOtpChannel() {
        return this.defaultOtpChannel;
    }

    @NotNull
    public final FlagUrl getFlagUrl() {
        return this.flagUrl;
    }

    @NotNull
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<OtpChannel> getOtpChannels() {
        return this.otpChannels;
    }

    public final int getPhoneNumberLength() {
        return this.phoneNumberLength;
    }

    @NotNull
    public final String getPrefix() {
        return this.prefix;
    }

    public final String getReferralCodeBannerUrl() {
        return this.referralCodeBannerUrl;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.flagUrl.hashCode() + d.e(this.otpChannels, e.f(this.phoneNumberLength, h.g(this.prefix, h.g(this.code, this.name.hashCode() * 31, 31), 31), 31), 31)) * 31;
        String str = this.referralCodeBannerUrl;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.defaultOtpChannel.hashCode() + h.g(this.locale, (hashCode2 + hashCode) * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.code;
        String str3 = this.prefix;
        int i10 = this.phoneNumberLength;
        List<OtpChannel> list = this.otpChannels;
        FlagUrl flagUrl = this.flagUrl;
        String str4 = this.referralCodeBannerUrl;
        String str5 = this.locale;
        OtpChannel otpChannel = this.defaultOtpChannel;
        StringBuilder l10 = v.e.l("CountrySelectDto(name=", str, ", code=", str2, ", prefix=");
        l10.append(str3);
        l10.append(", phoneNumberLength=");
        l10.append(i10);
        l10.append(", otpChannels=");
        l10.append(list);
        l10.append(", flagUrl=");
        l10.append(flagUrl);
        l10.append(", referralCodeBannerUrl=");
        v.e.v(l10, str4, ", locale=", str5, ", defaultOtpChannel=");
        l10.append(otpChannel);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.code);
        parcel.writeString(this.prefix);
        parcel.writeInt(this.phoneNumberLength);
        Iterator p10 = a.p(this.otpChannels, parcel);
        while (p10.hasNext()) {
            ((OtpChannel) p10.next()).writeToParcel(parcel, flags);
        }
        this.flagUrl.writeToParcel(parcel, flags);
        parcel.writeString(this.referralCodeBannerUrl);
        parcel.writeString(this.locale);
        this.defaultOtpChannel.writeToParcel(parcel, flags);
    }
}
