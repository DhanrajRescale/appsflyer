package com.assetgro.stockgro.data.model.homedata;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/assetgro/stockgro/data/model/homedata/Analytics;", HttpUrl.FRAGMENT_ENCODE_SET, "cardType", HttpUrl.FRAGMENT_ENCODE_SET, "cardSubType", "groupName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardSubType", "()Ljava/lang/String;", "getCardType", "getGroupName", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Analytics {
    public static final int $stable = 0;

    @SerializedName("card_sub_type")
    private final String cardSubType;

    @SerializedName("card_type")
    private final String cardType;

    @SerializedName("group_name")
    private final String groupName;

    public Analytics(String str, String str2, String str3) {
        this.cardType = str;
        this.cardSubType = str2;
        this.groupName = str3;
    }

    public static /* synthetic */ Analytics copy$default(Analytics analytics, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = analytics.cardType;
        }
        if ((i10 & 2) != 0) {
            str2 = analytics.cardSubType;
        }
        if ((i10 & 4) != 0) {
            str3 = analytics.groupName;
        }
        return analytics.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCardSubType() {
        return this.cardSubType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    @NotNull
    public final Analytics copy(String cardType, String cardSubType, String groupName) {
        return new Analytics(cardType, cardSubType, groupName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Analytics)) {
            return false;
        }
        Analytics analytics = (Analytics) other;
        return Intrinsics.a(this.cardType, analytics.cardType) && Intrinsics.a(this.cardSubType, analytics.cardSubType) && Intrinsics.a(this.groupName, analytics.groupName);
    }

    public final String getCardSubType() {
        return this.cardSubType;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public int hashCode() {
        String str = this.cardType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cardSubType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.groupName;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.cardType;
        String str2 = this.cardSubType;
        return d.o(e.l("Analytics(cardType=", str, ", cardSubType=", str2, ", groupName="), this.groupName, ")");
    }
}
