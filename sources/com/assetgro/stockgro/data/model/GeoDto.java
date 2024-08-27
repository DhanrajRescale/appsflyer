package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/assetgro/stockgro/data/model/GeoDto;", HttpUrl.FRAGMENT_ENCODE_SET, "ip", HttpUrl.FRAGMENT_ENCODE_SET, "phoneNumber", "udid", "notification_id", "countryCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getIp", "getNotification_id", "getPhoneNumber", "getUdid", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GeoDto {
    public static final int $stable = 0;

    @SerializedName("country_code")
    @NotNull
    private final String countryCode;

    @SerializedName("ip")
    @NotNull
    private final String ip;

    @SerializedName("notification_id")
    private final String notification_id;

    @SerializedName("phone_number")
    @NotNull
    private final String phoneNumber;

    @SerializedName("udid")
    private final String udid;

    public GeoDto(@NotNull String ip2, @NotNull String phoneNumber, String str, String str2, @NotNull String countryCode) {
        Intrinsics.checkNotNullParameter(ip2, "ip");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.ip = ip2;
        this.phoneNumber = phoneNumber;
        this.udid = str;
        this.notification_id = str2;
        this.countryCode = countryCode;
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getIp() {
        return this.ip;
    }

    public final String getNotification_id() {
        return this.notification_id;
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getUdid() {
        return this.udid;
    }
}
