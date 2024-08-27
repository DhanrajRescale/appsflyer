package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
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

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\n\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0010HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010 J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0014HÆ\u0003J\t\u00108\u001a\u00020\u0014HÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00170\nHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0006HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÀ\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010DJ\t\u0010E\u001a\u00020\u0006HÖ\u0001J\u0013\u0010F\u001a\u00020\u00142\b\u0010G\u001a\u0004\u0018\u00010HHÖ\u0003J\t\u0010I\u001a\u00020\u0006HÖ\u0001J\t\u0010J\u001a\u00020\u0003HÖ\u0001J\u0019\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0016\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001e¨\u0006P"}, d2 = {"Lcom/assetgro/stockgro/data/model/MySubscriptionResponse;", "Landroid/os/Parcelable;", "subscriptionID", HttpUrl.FRAGMENT_ENCODE_SET, "packageID", "level", HttpUrl.FRAGMENT_ENCODE_SET, "title", "description", "features", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/SubscriptionFeature;", "validityTitle", "validity", "validitySubTitle", "startDate", HttpUrl.FRAGMENT_ENCODE_SET, "endDate", "note", "autopayEnabled", HttpUrl.FRAGMENT_ENCODE_SET, "showAutoPay", "packages", "Lcom/assetgro/stockgro/data/model/SubscriptionPackages;", "packageFlow", "Lcom/assetgro/stockgro/data/model/PackageFlow;", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;JLjava/lang/Long;Ljava/lang/String;ZZLjava/util/List;Lcom/assetgro/stockgro/data/model/PackageFlow;)V", "getAutopayEnabled", "()Z", "getDescription", "()Ljava/lang/String;", "getEndDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFeatures", "()Ljava/util/List;", "getLevel", "()I", "getNote", "getPackageFlow", "()Lcom/assetgro/stockgro/data/model/PackageFlow;", "getPackageID", "getPackages", "getShowAutoPay", "getStartDate", "()J", "getSubscriptionID", "getTitle", "getValidity", "getValiditySubTitle", "getValidityTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;JLjava/lang/Long;Ljava/lang/String;ZZLjava/util/List;Lcom/assetgro/stockgro/data/model/PackageFlow;)Lcom/assetgro/stockgro/data/model/MySubscriptionResponse;", "describeContents", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MySubscriptionResponse implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MySubscriptionResponse> CREATOR = new Creator();

    @SerializedName("autopay_enabled")
    private final boolean autopayEnabled;

    @SerializedName("description")
    @NotNull
    private final String description;

    @SerializedName("end_date")
    private final Long endDate;

    @SerializedName("features")
    @NotNull
    private final List<SubscriptionFeature> features;

    @SerializedName("level")
    private final int level;

    @SerializedName("note")
    @NotNull
    private final String note;

    @SerializedName("package_flow")
    private final PackageFlow packageFlow;

    @SerializedName("package_id")
    @NotNull
    private final String packageID;

    @SerializedName("packages")
    @NotNull
    private final List<SubscriptionPackages> packages;

    @SerializedName("show_autopay")
    private final boolean showAutoPay;

    @SerializedName("start_date")
    private final long startDate;

    @SerializedName("subscription_id")
    @NotNull
    private final String subscriptionID;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName("validity")
    private final int validity;

    @SerializedName("validity_sub_title")
    private final String validitySubTitle;

    @SerializedName("validity_title")
    @NotNull
    private final String validityTitle;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<MySubscriptionResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MySubscriptionResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i10 = 0;
            while (i10 != readInt2) {
                i10 = h.e(SubscriptionFeature.CREATOR, parcel, arrayList, i10, 1);
            }
            String readString5 = parcel.readString();
            int readInt3 = parcel.readInt();
            String readString6 = parcel.readString();
            long readLong = parcel.readLong();
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString7 = parcel.readString();
            boolean z10 = parcel.readInt() != 0;
            boolean z11 = parcel.readInt() != 0;
            int readInt4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt4);
            int i11 = 0;
            while (i11 != readInt4) {
                i11 = h.e(SubscriptionPackages.CREATOR, parcel, arrayList2, i11, 1);
                readInt4 = readInt4;
                valueOf = valueOf;
            }
            return new MySubscriptionResponse(readString, readString2, readInt, readString3, readString4, arrayList, readString5, readInt3, readString6, readLong, valueOf, readString7, z10, z11, arrayList2, parcel.readInt() == 0 ? null : PackageFlow.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MySubscriptionResponse[] newArray(int i10) {
            return new MySubscriptionResponse[i10];
        }
    }

    public MySubscriptionResponse(@NotNull String subscriptionID, @NotNull String packageID, int i10, @NotNull String title, @NotNull String description, @NotNull List<SubscriptionFeature> features, @NotNull String validityTitle, int i11, String str, long j10, Long l10, @NotNull String note, boolean z10, boolean z11, @NotNull List<SubscriptionPackages> packages, PackageFlow packageFlow) {
        Intrinsics.checkNotNullParameter(subscriptionID, "subscriptionID");
        Intrinsics.checkNotNullParameter(packageID, "packageID");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(validityTitle, "validityTitle");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(packages, "packages");
        this.subscriptionID = subscriptionID;
        this.packageID = packageID;
        this.level = i10;
        this.title = title;
        this.description = description;
        this.features = features;
        this.validityTitle = validityTitle;
        this.validity = i11;
        this.validitySubTitle = str;
        this.startDate = j10;
        this.endDate = l10;
        this.note = note;
        this.autopayEnabled = z10;
        this.showAutoPay = z11;
        this.packages = packages;
        this.packageFlow = packageFlow;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSubscriptionID() {
        return this.subscriptionID;
    }

    /* renamed from: component10, reason: from getter */
    public final long getStartDate() {
        return this.startDate;
    }

    /* renamed from: component11, reason: from getter */
    public final Long getEndDate() {
        return this.endDate;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getAutopayEnabled() {
        return this.autopayEnabled;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getShowAutoPay() {
        return this.showAutoPay;
    }

    @NotNull
    public final List<SubscriptionPackages> component15() {
        return this.packages;
    }

    /* renamed from: component16, reason: from getter */
    public final PackageFlow getPackageFlow() {
        return this.packageFlow;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPackageID() {
        return this.packageID;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final List<SubscriptionFeature> component6() {
        return this.features;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getValidityTitle() {
        return this.validityTitle;
    }

    /* renamed from: component8, reason: from getter */
    public final int getValidity() {
        return this.validity;
    }

    /* renamed from: component9, reason: from getter */
    public final String getValiditySubTitle() {
        return this.validitySubTitle;
    }

    @NotNull
    public final MySubscriptionResponse copy(@NotNull String subscriptionID, @NotNull String packageID, int level, @NotNull String title, @NotNull String description, @NotNull List<SubscriptionFeature> features, @NotNull String validityTitle, int validity, String validitySubTitle, long startDate, Long endDate, @NotNull String note, boolean autopayEnabled, boolean showAutoPay, @NotNull List<SubscriptionPackages> packages, PackageFlow packageFlow) {
        Intrinsics.checkNotNullParameter(subscriptionID, "subscriptionID");
        Intrinsics.checkNotNullParameter(packageID, "packageID");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(validityTitle, "validityTitle");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(packages, "packages");
        return new MySubscriptionResponse(subscriptionID, packageID, level, title, description, features, validityTitle, validity, validitySubTitle, startDate, endDate, note, autopayEnabled, showAutoPay, packages, packageFlow);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MySubscriptionResponse)) {
            return false;
        }
        MySubscriptionResponse mySubscriptionResponse = (MySubscriptionResponse) other;
        return Intrinsics.a(this.subscriptionID, mySubscriptionResponse.subscriptionID) && Intrinsics.a(this.packageID, mySubscriptionResponse.packageID) && this.level == mySubscriptionResponse.level && Intrinsics.a(this.title, mySubscriptionResponse.title) && Intrinsics.a(this.description, mySubscriptionResponse.description) && Intrinsics.a(this.features, mySubscriptionResponse.features) && Intrinsics.a(this.validityTitle, mySubscriptionResponse.validityTitle) && this.validity == mySubscriptionResponse.validity && Intrinsics.a(this.validitySubTitle, mySubscriptionResponse.validitySubTitle) && this.startDate == mySubscriptionResponse.startDate && Intrinsics.a(this.endDate, mySubscriptionResponse.endDate) && Intrinsics.a(this.note, mySubscriptionResponse.note) && this.autopayEnabled == mySubscriptionResponse.autopayEnabled && this.showAutoPay == mySubscriptionResponse.showAutoPay && Intrinsics.a(this.packages, mySubscriptionResponse.packages) && Intrinsics.a(this.packageFlow, mySubscriptionResponse.packageFlow);
    }

    public final boolean getAutopayEnabled() {
        return this.autopayEnabled;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final List<SubscriptionFeature> getFeatures() {
        return this.features;
    }

    public final int getLevel() {
        return this.level;
    }

    @NotNull
    public final String getNote() {
        return this.note;
    }

    public final PackageFlow getPackageFlow() {
        return this.packageFlow;
    }

    @NotNull
    public final String getPackageID() {
        return this.packageID;
    }

    @NotNull
    public final List<SubscriptionPackages> getPackages() {
        return this.packages;
    }

    public final boolean getShowAutoPay() {
        return this.showAutoPay;
    }

    public final long getStartDate() {
        return this.startDate;
    }

    @NotNull
    public final String getSubscriptionID() {
        return this.subscriptionID;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getValidity() {
        return this.validity;
    }

    public final String getValiditySubTitle() {
        return this.validitySubTitle;
    }

    @NotNull
    public final String getValidityTitle() {
        return this.validityTitle;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int f10 = e.f(this.validity, h.g(this.validityTitle, d.e(this.features, h.g(this.description, h.g(this.title, e.f(this.level, h.g(this.packageID, this.subscriptionID.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        String str = this.validitySubTitle;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c10 = v.e.c(this.startDate, (f10 + hashCode) * 31, 31);
        Long l10 = this.endDate;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int e10 = d.e(this.packages, v.e.d(this.showAutoPay, v.e.d(this.autopayEnabled, h.g(this.note, (c10 + hashCode2) * 31, 31), 31), 31), 31);
        PackageFlow packageFlow = this.packageFlow;
        if (packageFlow != null) {
            i10 = packageFlow.hashCode();
        }
        return e10 + i10;
    }

    @NotNull
    public String toString() {
        String str = this.subscriptionID;
        String str2 = this.packageID;
        int i10 = this.level;
        String str3 = this.title;
        String str4 = this.description;
        List<SubscriptionFeature> list = this.features;
        String str5 = this.validityTitle;
        int i11 = this.validity;
        String str6 = this.validitySubTitle;
        long j10 = this.startDate;
        Long l10 = this.endDate;
        String str7 = this.note;
        boolean z10 = this.autopayEnabled;
        boolean z11 = this.showAutoPay;
        List<SubscriptionPackages> list2 = this.packages;
        PackageFlow packageFlow = this.packageFlow;
        StringBuilder l11 = v.e.l("MySubscriptionResponse(subscriptionID=", str, ", packageID=", str2, ", level=");
        d.w(l11, i10, ", title=", str3, ", description=");
        l11.append(str4);
        l11.append(", features=");
        l11.append(list);
        l11.append(", validityTitle=");
        l11.append(str5);
        l11.append(", validity=");
        l11.append(i11);
        l11.append(", validitySubTitle=");
        l11.append(str6);
        l11.append(", startDate=");
        l11.append(j10);
        l11.append(", endDate=");
        l11.append(l10);
        l11.append(", note=");
        l11.append(str7);
        l11.append(", autopayEnabled=");
        l11.append(z10);
        l11.append(", showAutoPay=");
        l11.append(z11);
        l11.append(", packages=");
        l11.append(list2);
        l11.append(", packageFlow=");
        l11.append(packageFlow);
        l11.append(")");
        return l11.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.subscriptionID);
        parcel.writeString(this.packageID);
        parcel.writeInt(this.level);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Iterator p10 = a.p(this.features, parcel);
        while (p10.hasNext()) {
            ((SubscriptionFeature) p10.next()).writeToParcel(parcel, flags);
        }
        parcel.writeString(this.validityTitle);
        parcel.writeInt(this.validity);
        parcel.writeString(this.validitySubTitle);
        parcel.writeLong(this.startDate);
        Long l10 = this.endDate;
        if (l10 == null) {
            parcel.writeInt(0);
        } else {
            a.r(parcel, 1, l10);
        }
        parcel.writeString(this.note);
        parcel.writeInt(this.autopayEnabled ? 1 : 0);
        parcel.writeInt(this.showAutoPay ? 1 : 0);
        Iterator p11 = a.p(this.packages, parcel);
        while (p11.hasNext()) {
            ((SubscriptionPackages) p11.next()).writeToParcel(parcel, flags);
        }
        PackageFlow packageFlow = this.packageFlow;
        if (packageFlow == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            packageFlow.writeToParcel(parcel, flags);
        }
    }
}
