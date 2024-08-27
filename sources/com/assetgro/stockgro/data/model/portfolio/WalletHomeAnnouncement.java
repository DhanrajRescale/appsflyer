package com.assetgro.stockgro.data.model.portfolio;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/assetgro/stockgro/data/model/portfolio/WalletHomeAnnouncement;", "Landroid/os/Parcelable;", "text", HttpUrl.FRAGMENT_ENCODE_SET, "theme", "cta", "Lcom/assetgro/stockgro/data/model/portfolio/WalletCta;", "(Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/portfolio/WalletCta;)V", "getCta", "()Lcom/assetgro/stockgro/data/model/portfolio/WalletCta;", "getText", "()Ljava/lang/String;", "getTheme", "component1", "component2", "component3", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WalletHomeAnnouncement implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<WalletHomeAnnouncement> CREATOR = new Creator();

    @SerializedName("cta")
    private final WalletCta cta;

    @SerializedName("text")
    @NotNull
    private final String text;

    @SerializedName("theme")
    @NotNull
    private final String theme;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<WalletHomeAnnouncement> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WalletHomeAnnouncement createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WalletHomeAnnouncement(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : WalletCta.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WalletHomeAnnouncement[] newArray(int i10) {
            return new WalletHomeAnnouncement[i10];
        }
    }

    public WalletHomeAnnouncement(@NotNull String text, @NotNull String theme, WalletCta walletCta) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.text = text;
        this.theme = theme;
        this.cta = walletCta;
    }

    public static /* synthetic */ WalletHomeAnnouncement copy$default(WalletHomeAnnouncement walletHomeAnnouncement, String str, String str2, WalletCta walletCta, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = walletHomeAnnouncement.text;
        }
        if ((i10 & 2) != 0) {
            str2 = walletHomeAnnouncement.theme;
        }
        if ((i10 & 4) != 0) {
            walletCta = walletHomeAnnouncement.cta;
        }
        return walletHomeAnnouncement.copy(str, str2, walletCta);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* renamed from: component3, reason: from getter */
    public final WalletCta getCta() {
        return this.cta;
    }

    @NotNull
    public final WalletHomeAnnouncement copy(@NotNull String text, @NotNull String theme, WalletCta cta) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return new WalletHomeAnnouncement(text, theme, cta);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletHomeAnnouncement)) {
            return false;
        }
        WalletHomeAnnouncement walletHomeAnnouncement = (WalletHomeAnnouncement) other;
        return Intrinsics.a(this.text, walletHomeAnnouncement.text) && Intrinsics.a(this.theme, walletHomeAnnouncement.theme) && Intrinsics.a(this.cta, walletHomeAnnouncement.cta);
    }

    public final WalletCta getCta() {
        return this.cta;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int hashCode;
        int g10 = h.g(this.theme, this.text.hashCode() * 31, 31);
        WalletCta walletCta = this.cta;
        if (walletCta == null) {
            hashCode = 0;
        } else {
            hashCode = walletCta.hashCode();
        }
        return g10 + hashCode;
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.theme;
        WalletCta walletCta = this.cta;
        StringBuilder l10 = e.l("WalletHomeAnnouncement(text=", str, ", theme=", str2, ", cta=");
        l10.append(walletCta);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.text);
        parcel.writeString(this.theme);
        WalletCta walletCta = this.cta;
        if (walletCta == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            walletCta.writeToParcel(parcel, flags);
        }
    }
}
