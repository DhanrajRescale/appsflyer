package com.assetgro.stockgro.data.remote.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/assetgro/stockgro/data/remote/request/ExitData;", "Landroid/os/Parcelable;", "reasonCode", HttpUrl.FRAGMENT_ENCODE_SET, "reasonString", "(Ljava/lang/String;Ljava/lang/String;)V", "getReasonCode", "()Ljava/lang/String;", "getReasonString", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ExitData implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<ExitData> CREATOR = new Creator();

    @SerializedName("reason_code")
    private final String reasonCode;

    @SerializedName("reason_string")
    private final String reasonString;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<ExitData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ExitData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExitData(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ExitData[] newArray(int i10) {
            return new ExitData[i10];
        }
    }

    public ExitData(String str, String str2) {
        this.reasonCode = str;
        this.reasonString = str2;
    }

    public static /* synthetic */ ExitData copy$default(ExitData exitData, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = exitData.reasonCode;
        }
        if ((i10 & 2) != 0) {
            str2 = exitData.reasonString;
        }
        return exitData.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReasonCode() {
        return this.reasonCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReasonString() {
        return this.reasonString;
    }

    @NotNull
    public final ExitData copy(String reasonCode, String reasonString) {
        return new ExitData(reasonCode, reasonString);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExitData)) {
            return false;
        }
        ExitData exitData = (ExitData) other;
        return Intrinsics.a(this.reasonCode, exitData.reasonCode) && Intrinsics.a(this.reasonString, exitData.reasonString);
    }

    public final String getReasonCode() {
        return this.reasonCode;
    }

    public final String getReasonString() {
        return this.reasonString;
    }

    public int hashCode() {
        String str = this.reasonCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.reasonString;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return h.s("ExitData(reasonCode=", this.reasonCode, ", reasonString=", this.reasonString, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.reasonCode);
        parcel.writeString(this.reasonString);
    }
}
