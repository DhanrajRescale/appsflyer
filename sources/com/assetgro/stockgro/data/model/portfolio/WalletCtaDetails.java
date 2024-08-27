package com.assetgro.stockgro.data.model.portfolio;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006("}, d2 = {"Lcom/assetgro/stockgro/data/model/portfolio/WalletCtaDetails;", "Landroid/os/Parcelable;", "title", HttpUrl.FRAGMENT_ENCODE_SET, "body", HttpUrl.FRAGMENT_ENCODE_SET, "cta", HttpUrl.FRAGMENT_ENCODE_SET, "ctaLabel", "ctaType", "ctaLink", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBody", "()Ljava/util/List;", "getCta", "()Z", "getCtaLabel", "()Ljava/lang/String;", "getCtaLink", "getCtaType", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WalletCtaDetails implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<WalletCtaDetails> CREATOR = new Creator();

    @SerializedName("body")
    @NotNull
    private final List<String> body;

    @SerializedName("cta")
    private final boolean cta;

    @SerializedName("cta_label")
    @NotNull
    private final String ctaLabel;

    @SerializedName("cta_link")
    @NotNull
    private final String ctaLink;

    @SerializedName("cta_type")
    @NotNull
    private final String ctaType;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<WalletCtaDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WalletCtaDetails createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WalletCtaDetails(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WalletCtaDetails[] newArray(int i10) {
            return new WalletCtaDetails[i10];
        }
    }

    public WalletCtaDetails(@NotNull String title, @NotNull List<String> body, boolean z10, @NotNull String ctaLabel, @NotNull String ctaType, @NotNull String ctaLink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(ctaLabel, "ctaLabel");
        Intrinsics.checkNotNullParameter(ctaType, "ctaType");
        Intrinsics.checkNotNullParameter(ctaLink, "ctaLink");
        this.title = title;
        this.body = body;
        this.cta = z10;
        this.ctaLabel = ctaLabel;
        this.ctaType = ctaType;
        this.ctaLink = ctaLink;
    }

    public static /* synthetic */ WalletCtaDetails copy$default(WalletCtaDetails walletCtaDetails, String str, List list, boolean z10, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = walletCtaDetails.title;
        }
        if ((i10 & 2) != 0) {
            list = walletCtaDetails.body;
        }
        List list2 = list;
        if ((i10 & 4) != 0) {
            z10 = walletCtaDetails.cta;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            str2 = walletCtaDetails.ctaLabel;
        }
        String str5 = str2;
        if ((i10 & 16) != 0) {
            str3 = walletCtaDetails.ctaType;
        }
        String str6 = str3;
        if ((i10 & 32) != 0) {
            str4 = walletCtaDetails.ctaLink;
        }
        return walletCtaDetails.copy(str, list2, z11, str5, str6, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<String> component2() {
        return this.body;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCta() {
        return this.cta;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCtaLabel() {
        return this.ctaLabel;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getCtaType() {
        return this.ctaType;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getCtaLink() {
        return this.ctaLink;
    }

    @NotNull
    public final WalletCtaDetails copy(@NotNull String title, @NotNull List<String> body, boolean cta, @NotNull String ctaLabel, @NotNull String ctaType, @NotNull String ctaLink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(ctaLabel, "ctaLabel");
        Intrinsics.checkNotNullParameter(ctaType, "ctaType");
        Intrinsics.checkNotNullParameter(ctaLink, "ctaLink");
        return new WalletCtaDetails(title, body, cta, ctaLabel, ctaType, ctaLink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletCtaDetails)) {
            return false;
        }
        WalletCtaDetails walletCtaDetails = (WalletCtaDetails) other;
        return Intrinsics.a(this.title, walletCtaDetails.title) && Intrinsics.a(this.body, walletCtaDetails.body) && this.cta == walletCtaDetails.cta && Intrinsics.a(this.ctaLabel, walletCtaDetails.ctaLabel) && Intrinsics.a(this.ctaType, walletCtaDetails.ctaType) && Intrinsics.a(this.ctaLink, walletCtaDetails.ctaLink);
    }

    @NotNull
    public final List<String> getBody() {
        return this.body;
    }

    public final boolean getCta() {
        return this.cta;
    }

    @NotNull
    public final String getCtaLabel() {
        return this.ctaLabel;
    }

    @NotNull
    public final String getCtaLink() {
        return this.ctaLink;
    }

    @NotNull
    public final String getCtaType() {
        return this.ctaType;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.ctaLink.hashCode() + h.g(this.ctaType, h.g(this.ctaLabel, e.d(this.cta, d.e(this.body, this.title.hashCode() * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        List<String> list = this.body;
        boolean z10 = this.cta;
        String str2 = this.ctaLabel;
        String str3 = this.ctaType;
        String str4 = this.ctaLink;
        StringBuilder sb2 = new StringBuilder("WalletCtaDetails(title=");
        sb2.append(str);
        sb2.append(", body=");
        sb2.append(list);
        sb2.append(", cta=");
        sb2.append(z10);
        sb2.append(", ctaLabel=");
        sb2.append(str2);
        sb2.append(", ctaType=");
        return a.k(sb2, str3, ", ctaLink=", str4, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.title);
        parcel.writeStringList(this.body);
        parcel.writeInt(this.cta ? 1 : 0);
        parcel.writeString(this.ctaLabel);
        parcel.writeString(this.ctaType);
        parcel.writeString(this.ctaLink);
    }

    public /* synthetic */ WalletCtaDetails(String str, List list, boolean z10, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i10 & 4) != 0 ? false : z10, str2, str3, str4);
    }
}
