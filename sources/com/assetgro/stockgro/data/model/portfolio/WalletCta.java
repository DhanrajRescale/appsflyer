package com.assetgro.stockgro.data.model.portfolio;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;
import zi.i;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b#\u0010$J\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/assetgro/stockgro/data/model/portfolio/WalletCta;", "Landroid/os/Parcelable;", "Ljava/util/ArrayList;", "Lzi/i;", "Lkotlin/collections/ArrayList;", "toNarration", HttpUrl.FRAGMENT_ENCODE_SET, "component1", "component2", "Lcom/assetgro/stockgro/data/model/portfolio/WalletCtaDetails;", "component3", "label", "type", "details", "copy", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getType", "Lcom/assetgro/stockgro/data/model/portfolio/WalletCtaDetails;", "getDetails", "()Lcom/assetgro/stockgro/data/model/portfolio/WalletCtaDetails;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/portfolio/WalletCtaDetails;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class WalletCta implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<WalletCta> CREATOR = new Creator();

    @SerializedName("details")
    private final WalletCtaDetails details;

    @SerializedName("label")
    @NotNull
    private final String label;

    @SerializedName("type")
    @NotNull
    private final String type;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<WalletCta> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WalletCta createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WalletCta(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : WalletCtaDetails.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WalletCta[] newArray(int i10) {
            return new WalletCta[i10];
        }
    }

    public WalletCta(@NotNull String label, @NotNull String type, WalletCtaDetails walletCtaDetails) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(type, "type");
        this.label = label;
        this.type = type;
        this.details = walletCtaDetails;
    }

    public static /* synthetic */ WalletCta copy$default(WalletCta walletCta, String str, String str2, WalletCtaDetails walletCtaDetails, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = walletCta.label;
        }
        if ((i10 & 2) != 0) {
            str2 = walletCta.type;
        }
        if ((i10 & 4) != 0) {
            walletCtaDetails = walletCta.details;
        }
        return walletCta.copy(str, str2, walletCtaDetails);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final WalletCtaDetails getDetails() {
        return this.details;
    }

    @NotNull
    public final WalletCta copy(@NotNull String label, @NotNull String type, WalletCtaDetails details) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(type, "type");
        return new WalletCta(label, type, details);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletCta)) {
            return false;
        }
        WalletCta walletCta = (WalletCta) other;
        return Intrinsics.a(this.label, walletCta.label) && Intrinsics.a(this.type, walletCta.type) && Intrinsics.a(this.details, walletCta.details);
    }

    public final WalletCtaDetails getDetails() {
        return this.details;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.type, this.label.hashCode() * 31, 31);
        WalletCtaDetails walletCtaDetails = this.details;
        if (walletCtaDetails == null) {
            hashCode = 0;
        } else {
            hashCode = walletCtaDetails.hashCode();
        }
        return g10 + hashCode;
    }

    public final ArrayList<i> toNarration() {
        List<String> body;
        WalletCtaDetails walletCtaDetails = this.details;
        if (walletCtaDetails != null && (body = walletCtaDetails.getBody()) != null) {
            ArrayList<i> arrayList = new ArrayList<>();
            Iterator<T> it = body.iterator();
            while (it.hasNext()) {
                arrayList.add(new i(HttpUrl.FRAGMENT_ENCODE_SET, d.k("• ", (String) it.next(), " \n")));
            }
            return arrayList;
        }
        return null;
    }

    @NotNull
    public String toString() {
        String str = this.label;
        String str2 = this.type;
        WalletCtaDetails walletCtaDetails = this.details;
        StringBuilder l10 = e.l("WalletCta(label=", str, ", type=", str2, ", details=");
        l10.append(walletCtaDetails);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.label);
        parcel.writeString(this.type);
        WalletCtaDetails walletCtaDetails = this.details;
        if (walletCtaDetails == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            walletCtaDetails.writeToParcel(parcel, flags);
        }
    }
}
