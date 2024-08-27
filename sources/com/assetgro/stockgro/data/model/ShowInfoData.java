package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.prod.R;
import da.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006'"}, d2 = {"Lcom/assetgro/stockgro/data/model/ShowInfoData;", "Landroid/os/Parcelable;", "title", HttpUrl.FRAGMENT_ENCODE_SET, "content", "buttonText", "infoIcon", HttpUrl.FRAGMENT_ENCODE_SET, "closeIcon", "showDefaultIcon", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V", "getButtonText", "()Ljava/lang/String;", "getCloseIcon", "()I", "getContent", "getInfoIcon", "getShowDefaultIcon", "()Z", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ShowInfoData implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<ShowInfoData> CREATOR = new Creator();
    private final String buttonText;
    private final int closeIcon;
    private final String content;
    private final int infoIcon;
    private final boolean showDefaultIcon;
    private final String title;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<ShowInfoData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ShowInfoData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShowInfoData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ShowInfoData[] newArray(int i10) {
            return new ShowInfoData[i10];
        }
    }

    public ShowInfoData() {
        this(null, null, null, 0, 0, false, 63, null);
    }

    public static /* synthetic */ ShowInfoData copy$default(ShowInfoData showInfoData, String str, String str2, String str3, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = showInfoData.title;
        }
        if ((i12 & 2) != 0) {
            str2 = showInfoData.content;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = showInfoData.buttonText;
        }
        String str5 = str3;
        if ((i12 & 8) != 0) {
            i10 = showInfoData.infoIcon;
        }
        int i13 = i10;
        if ((i12 & 16) != 0) {
            i11 = showInfoData.closeIcon;
        }
        int i14 = i11;
        if ((i12 & 32) != 0) {
            z10 = showInfoData.showDefaultIcon;
        }
        return showInfoData.copy(str, str4, str5, i13, i14, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* renamed from: component4, reason: from getter */
    public final int getInfoIcon() {
        return this.infoIcon;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCloseIcon() {
        return this.closeIcon;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowDefaultIcon() {
        return this.showDefaultIcon;
    }

    @NotNull
    public final ShowInfoData copy(String title, String content, String buttonText, int infoIcon, int closeIcon, boolean showDefaultIcon) {
        return new ShowInfoData(title, content, buttonText, infoIcon, closeIcon, showDefaultIcon);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShowInfoData)) {
            return false;
        }
        ShowInfoData showInfoData = (ShowInfoData) other;
        return Intrinsics.a(this.title, showInfoData.title) && Intrinsics.a(this.content, showInfoData.content) && Intrinsics.a(this.buttonText, showInfoData.buttonText) && this.infoIcon == showInfoData.infoIcon && this.closeIcon == showInfoData.closeIcon && this.showDefaultIcon == showInfoData.showDefaultIcon;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final int getCloseIcon() {
        return this.closeIcon;
    }

    public final String getContent() {
        return this.content;
    }

    public final int getInfoIcon() {
        return this.infoIcon;
    }

    public final boolean getShowDefaultIcon() {
        return this.showDefaultIcon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.title;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.content;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.buttonText;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return Boolean.hashCode(this.showDefaultIcon) + e.f(this.closeIcon, e.f(this.infoIcon, (i12 + i10) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.content;
        String str3 = this.buttonText;
        int i10 = this.infoIcon;
        int i11 = this.closeIcon;
        boolean z10 = this.showDefaultIcon;
        StringBuilder l10 = v.e.l("ShowInfoData(title=", str, ", content=", str2, ", buttonText=");
        l10.append(str3);
        l10.append(", infoIcon=");
        l10.append(i10);
        l10.append(", closeIcon=");
        l10.append(i11);
        l10.append(", showDefaultIcon=");
        l10.append(z10);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.buttonText);
        parcel.writeInt(this.infoIcon);
        parcel.writeInt(this.closeIcon);
        parcel.writeInt(this.showDefaultIcon ? 1 : 0);
    }

    public ShowInfoData(String str, String str2, String str3, int i10, int i11, boolean z10) {
        this.title = str;
        this.content = str2;
        this.buttonText = str3;
        this.infoIcon = i10;
        this.closeIcon = i11;
        this.showDefaultIcon = z10;
    }

    public /* synthetic */ ShowInfoData(String str, String str2, String str3, int i10, int i11, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) == 0 ? str3 : null, (i12 & 8) != 0 ? R.drawable.ic_info_home_icon : i10, (i12 & 16) != 0 ? R.drawable.ic_portfolio_close : i11, (i12 & 32) != 0 ? true : z10);
    }
}
