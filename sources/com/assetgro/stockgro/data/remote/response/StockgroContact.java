package com.assetgro.stockgro.data.remote.response;

import a3.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/StockgroContact;", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, "uuid", "phoneNumber", "displayPicture", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayPicture", "()Ljava/lang/String;", "getName", "getPhoneNumber", "getUuid", "component1", "component2", "component3", "component4", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StockgroContact {
    public static final int $stable = 0;

    @SerializedName("display_picture")
    private final String displayPicture;

    @SerializedName("display_name")
    private final String name;

    @SerializedName("phn")
    @NotNull
    private final String phoneNumber;

    @SerializedName("uuid")
    @NotNull
    private final String uuid;

    public StockgroContact(String str, @NotNull String uuid, @NotNull String phoneNumber, String str2) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.name = str;
        this.uuid = uuid;
        this.phoneNumber = phoneNumber;
        this.displayPicture = str2;
    }

    public static /* synthetic */ StockgroContact copy$default(StockgroContact stockgroContact, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = stockgroContact.name;
        }
        if ((i10 & 2) != 0) {
            str2 = stockgroContact.uuid;
        }
        if ((i10 & 4) != 0) {
            str3 = stockgroContact.phoneNumber;
        }
        if ((i10 & 8) != 0) {
            str4 = stockgroContact.displayPicture;
        }
        return stockgroContact.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisplayPicture() {
        return this.displayPicture;
    }

    @NotNull
    public final StockgroContact copy(String name, @NotNull String uuid, @NotNull String phoneNumber, String displayPicture) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        return new StockgroContact(name, uuid, phoneNumber, displayPicture);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StockgroContact)) {
            return false;
        }
        StockgroContact stockgroContact = (StockgroContact) other;
        return Intrinsics.a(this.name, stockgroContact.name) && Intrinsics.a(this.uuid, stockgroContact.uuid) && Intrinsics.a(this.phoneNumber, stockgroContact.phoneNumber) && Intrinsics.a(this.displayPicture, stockgroContact.displayPicture);
    }

    public final String getDisplayPicture() {
        return this.displayPicture;
    }

    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int hashCode;
        String str = this.name;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int g10 = h.g(this.phoneNumber, h.g(this.uuid, hashCode * 31, 31), 31);
        String str2 = this.displayPicture;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return g10 + i10;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.uuid;
        return a.k(e.l("StockgroContact(name=", str, ", uuid=", str2, ", phoneNumber="), this.phoneNumber, ", displayPicture=", this.displayPicture, ")");
    }
}
