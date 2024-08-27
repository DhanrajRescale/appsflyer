package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003JK\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006'"}, d2 = {"Lcom/assetgro/stockgro/data/model/Vendor;", "Landroid/os/Parcelable;", "vendorId", HttpUrl.FRAGMENT_ENCODE_SET, "vendorName", "logo", "siteURL", "description", "tnc", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDescription", "()Ljava/lang/String;", "getLogo", "getSiteURL", "getTnc", "()Ljava/util/List;", "getVendorId", "getVendorName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Vendor implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Vendor> CREATOR = new Creator();

    @SerializedName("description")
    @NotNull
    private final String description;

    @SerializedName("logo")
    @NotNull
    private final String logo;

    @SerializedName("site_url")
    @NotNull
    private final String siteURL;

    @SerializedName("tnc")
    @NotNull
    private final List<String> tnc;

    @SerializedName("vendor_id")
    @NotNull
    private final String vendorId;

    @SerializedName("vendor_name")
    @NotNull
    private final String vendorName;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Vendor> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Vendor createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Vendor(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Vendor[] newArray(int i10) {
            return new Vendor[i10];
        }
    }

    public Vendor(@NotNull String vendorId, @NotNull String vendorName, @NotNull String logo, @NotNull String siteURL, @NotNull String description, @NotNull List<String> tnc) {
        Intrinsics.checkNotNullParameter(vendorId, "vendorId");
        Intrinsics.checkNotNullParameter(vendorName, "vendorName");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(siteURL, "siteURL");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(tnc, "tnc");
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.logo = logo;
        this.siteURL = siteURL;
        this.description = description;
        this.tnc = tnc;
    }

    public static /* synthetic */ Vendor copy$default(Vendor vendor, String str, String str2, String str3, String str4, String str5, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vendor.vendorId;
        }
        if ((i10 & 2) != 0) {
            str2 = vendor.vendorName;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = vendor.logo;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = vendor.siteURL;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = vendor.description;
        }
        String str9 = str5;
        if ((i10 & 32) != 0) {
            list = vendor.tnc;
        }
        return vendor.copy(str, str6, str7, str8, str9, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getVendorId() {
        return this.vendorId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getVendorName() {
        return this.vendorName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSiteURL() {
        return this.siteURL;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final List<String> component6() {
        return this.tnc;
    }

    @NotNull
    public final Vendor copy(@NotNull String vendorId, @NotNull String vendorName, @NotNull String logo, @NotNull String siteURL, @NotNull String description, @NotNull List<String> tnc) {
        Intrinsics.checkNotNullParameter(vendorId, "vendorId");
        Intrinsics.checkNotNullParameter(vendorName, "vendorName");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(siteURL, "siteURL");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(tnc, "tnc");
        return new Vendor(vendorId, vendorName, logo, siteURL, description, tnc);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vendor)) {
            return false;
        }
        Vendor vendor = (Vendor) other;
        return Intrinsics.a(this.vendorId, vendor.vendorId) && Intrinsics.a(this.vendorName, vendor.vendorName) && Intrinsics.a(this.logo, vendor.logo) && Intrinsics.a(this.siteURL, vendor.siteURL) && Intrinsics.a(this.description, vendor.description) && Intrinsics.a(this.tnc, vendor.tnc);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    public final String getSiteURL() {
        return this.siteURL;
    }

    @NotNull
    public final List<String> getTnc() {
        return this.tnc;
    }

    @NotNull
    public final String getVendorId() {
        return this.vendorId;
    }

    @NotNull
    public final String getVendorName() {
        return this.vendorName;
    }

    public int hashCode() {
        return this.tnc.hashCode() + h.g(this.description, h.g(this.siteURL, h.g(this.logo, h.g(this.vendorName, this.vendorId.hashCode() * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.vendorId;
        String str2 = this.vendorName;
        String str3 = this.logo;
        String str4 = this.siteURL;
        String str5 = this.description;
        List<String> list = this.tnc;
        StringBuilder l10 = e.l("Vendor(vendorId=", str, ", vendorName=", str2, ", logo=");
        e.v(l10, str3, ", siteURL=", str4, ", description=");
        l10.append(str5);
        l10.append(", tnc=");
        l10.append(list);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.vendorId);
        parcel.writeString(this.vendorName);
        parcel.writeString(this.logo);
        parcel.writeString(this.siteURL);
        parcel.writeString(this.description);
        parcel.writeStringList(this.tnc);
    }
}
