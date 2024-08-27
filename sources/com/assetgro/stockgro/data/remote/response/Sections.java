package com.assetgro.stockgro.data.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J)\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006HÆ\u0003J3\u0010\u000b\u001a\u00020\u00002(\b\u0002\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R6\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/Sections;", "Landroid/os/Parcelable;", "sections", "Ljava/util/HashMap;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/remote/response/SectionMaintenanceConfig;", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;)V", "getSections", "()Ljava/util/HashMap;", "component1", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Sections implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Sections> CREATOR = new Creator();

    @SerializedName("sections")
    private final HashMap<String, SectionMaintenanceConfig> sections;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Sections> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Sections createFromParcel(@NotNull Parcel parcel) {
            HashMap hashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                hashMap = null;
            } else {
                int readInt = parcel.readInt();
                HashMap hashMap2 = new HashMap(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    hashMap2.put(parcel.readString(), SectionMaintenanceConfig.CREATOR.createFromParcel(parcel));
                }
                hashMap = hashMap2;
            }
            return new Sections(hashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Sections[] newArray(int i10) {
            return new Sections[i10];
        }
    }

    public Sections(HashMap<String, SectionMaintenanceConfig> hashMap) {
        this.sections = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Sections copy$default(Sections sections, HashMap hashMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hashMap = sections.sections;
        }
        return sections.copy(hashMap);
    }

    public final HashMap<String, SectionMaintenanceConfig> component1() {
        return this.sections;
    }

    @NotNull
    public final Sections copy(HashMap<String, SectionMaintenanceConfig> sections) {
        return new Sections(sections);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Sections) && Intrinsics.a(this.sections, ((Sections) other).sections);
    }

    public final HashMap<String, SectionMaintenanceConfig> getSections() {
        return this.sections;
    }

    public int hashCode() {
        HashMap<String, SectionMaintenanceConfig> hashMap = this.sections;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.hashCode();
    }

    @NotNull
    public String toString() {
        return "Sections(sections=" + this.sections + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        HashMap<String, SectionMaintenanceConfig> hashMap = this.sections;
        if (hashMap == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(hashMap.size());
        for (Map.Entry<String, SectionMaintenanceConfig> entry : hashMap.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, flags);
        }
    }
}
