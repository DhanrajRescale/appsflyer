package com.assetgro.stockgro.data.model.portfolio;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Lcom/assetgro/stockgro/data/model/portfolio/ExpiryWalletDetailData;", "Landroid/os/Parcelable;", "text", HttpUrl.FRAGMENT_ENCODE_SET, "timeline", "timelineImp", HttpUrl.FRAGMENT_ENCODE_SET, "cta", "Lcom/assetgro/stockgro/data/model/portfolio/WalletCta;", "(Ljava/lang/String;Ljava/lang/String;ZLcom/assetgro/stockgro/data/model/portfolio/WalletCta;)V", "getCta", "()Lcom/assetgro/stockgro/data/model/portfolio/WalletCta;", "getText", "()Ljava/lang/String;", "getTimeline", "getTimelineImp", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ExpiryWalletDetailData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ExpiryWalletDetailData> CREATOR = new Creator();

    @SerializedName("cta")
    private final WalletCta cta;

    @SerializedName("text")
    private final String text;

    @SerializedName("timeline")
    private final String timeline;

    @SerializedName("timeline_imp")
    private final boolean timelineImp;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<ExpiryWalletDetailData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ExpiryWalletDetailData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExpiryWalletDetailData(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : WalletCta.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ExpiryWalletDetailData[] newArray(int i10) {
            return new ExpiryWalletDetailData[i10];
        }
    }

    public ExpiryWalletDetailData(String str, String str2, boolean z10, WalletCta walletCta) {
        this.text = str;
        this.timeline = str2;
        this.timelineImp = z10;
        this.cta = walletCta;
    }

    public static /* synthetic */ ExpiryWalletDetailData copy$default(ExpiryWalletDetailData expiryWalletDetailData, String str, String str2, boolean z10, WalletCta walletCta, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = expiryWalletDetailData.text;
        }
        if ((i10 & 2) != 0) {
            str2 = expiryWalletDetailData.timeline;
        }
        if ((i10 & 4) != 0) {
            z10 = expiryWalletDetailData.timelineImp;
        }
        if ((i10 & 8) != 0) {
            walletCta = expiryWalletDetailData.cta;
        }
        return expiryWalletDetailData.copy(str, str2, z10, walletCta);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTimeline() {
        return this.timeline;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getTimelineImp() {
        return this.timelineImp;
    }

    /* renamed from: component4, reason: from getter */
    public final WalletCta getCta() {
        return this.cta;
    }

    @NotNull
    public final ExpiryWalletDetailData copy(String text, String timeline, boolean timelineImp, WalletCta cta) {
        return new ExpiryWalletDetailData(text, timeline, timelineImp, cta);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpiryWalletDetailData)) {
            return false;
        }
        ExpiryWalletDetailData expiryWalletDetailData = (ExpiryWalletDetailData) other;
        return Intrinsics.a(this.text, expiryWalletDetailData.text) && Intrinsics.a(this.timeline, expiryWalletDetailData.timeline) && this.timelineImp == expiryWalletDetailData.timelineImp && Intrinsics.a(this.cta, expiryWalletDetailData.cta);
    }

    public final WalletCta getCta() {
        return this.cta;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTimeline() {
        return this.timeline;
    }

    public final boolean getTimelineImp() {
        return this.timelineImp;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.text;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.timeline;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int d10 = e.d(this.timelineImp, (i11 + hashCode2) * 31, 31);
        WalletCta walletCta = this.cta;
        if (walletCta != null) {
            i10 = walletCta.hashCode();
        }
        return d10 + i10;
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.timeline;
        boolean z10 = this.timelineImp;
        WalletCta walletCta = this.cta;
        StringBuilder l10 = e.l("ExpiryWalletDetailData(text=", str, ", timeline=", str2, ", timelineImp=");
        l10.append(z10);
        l10.append(", cta=");
        l10.append(walletCta);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.text);
        parcel.writeString(this.timeline);
        parcel.writeInt(this.timelineImp ? 1 : 0);
        WalletCta walletCta = this.cta;
        if (walletCta == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            walletCta.writeToParcel(parcel, flags);
        }
    }
}
