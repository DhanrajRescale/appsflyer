package com.assetgro.stockgro.data.model.arenaV2;

import a3.a;
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

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, d2 = {"Lcom/assetgro/stockgro/data/model/arenaV2/Option;", "Landroid/os/Parcelable;", "defaultSelected", HttpUrl.FRAGMENT_ENCODE_SET, "defaultVal", HttpUrl.FRAGMENT_ENCODE_SET, "key", "label", "values", HttpUrl.FRAGMENT_ENCODE_SET, "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDefaultSelected", "()Z", "getDefaultVal", "()Ljava/lang/String;", "getKey", "getLabel", "getValues", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Option implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Option> CREATOR = new Creator();

    @SerializedName("default_selected")
    private final boolean defaultSelected;

    @SerializedName("default_val")
    @NotNull
    private final String defaultVal;

    @SerializedName("key")
    @NotNull
    private final String key;

    @SerializedName("label")
    @NotNull
    private final String label;

    @SerializedName("values")
    @NotNull
    private final List<String> values;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Option> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Option createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Option(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Option[] newArray(int i10) {
            return new Option[i10];
        }
    }

    public Option(boolean z10, @NotNull String defaultVal, @NotNull String key, @NotNull String label, @NotNull List<String> values) {
        Intrinsics.checkNotNullParameter(defaultVal, "defaultVal");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(values, "values");
        this.defaultSelected = z10;
        this.defaultVal = defaultVal;
        this.key = key;
        this.label = label;
        this.values = values;
    }

    public static /* synthetic */ Option copy$default(Option option, boolean z10, String str, String str2, String str3, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = option.defaultSelected;
        }
        if ((i10 & 2) != 0) {
            str = option.defaultVal;
        }
        String str4 = str;
        if ((i10 & 4) != 0) {
            str2 = option.key;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = option.label;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            list = option.values;
        }
        return option.copy(z10, str4, str5, str6, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDefaultSelected() {
        return this.defaultSelected;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDefaultVal() {
        return this.defaultVal;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final List<String> component5() {
        return this.values;
    }

    @NotNull
    public final Option copy(boolean defaultSelected, @NotNull String defaultVal, @NotNull String key, @NotNull String label, @NotNull List<String> values) {
        Intrinsics.checkNotNullParameter(defaultVal, "defaultVal");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(values, "values");
        return new Option(defaultSelected, defaultVal, key, label, values);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Option)) {
            return false;
        }
        Option option = (Option) other;
        return this.defaultSelected == option.defaultSelected && Intrinsics.a(this.defaultVal, option.defaultVal) && Intrinsics.a(this.key, option.key) && Intrinsics.a(this.label, option.label) && Intrinsics.a(this.values, option.values);
    }

    public final boolean getDefaultSelected() {
        return this.defaultSelected;
    }

    @NotNull
    public final String getDefaultVal() {
        return this.defaultVal;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final List<String> getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.values.hashCode() + h.g(this.label, h.g(this.key, h.g(this.defaultVal, Boolean.hashCode(this.defaultSelected) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        boolean z10 = this.defaultSelected;
        String str = this.defaultVal;
        String str2 = this.key;
        String str3 = this.label;
        List<String> list = this.values;
        StringBuilder sb2 = new StringBuilder("Option(defaultSelected=");
        sb2.append(z10);
        sb2.append(", defaultVal=");
        sb2.append(str);
        sb2.append(", key=");
        e.v(sb2, str2, ", label=", str3, ", values=");
        return a.l(sb2, list, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.defaultSelected ? 1 : 0);
        parcel.writeString(this.defaultVal);
        parcel.writeString(this.key);
        parcel.writeString(this.label);
        parcel.writeStringList(this.values);
    }
}
