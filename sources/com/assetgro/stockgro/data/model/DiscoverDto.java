package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BS\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bHÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Lcom/assetgro/stockgro/data/model/DiscoverDto;", "Landroid/os/Parcelable;", "categories", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/DiscoverCategory;", "groupJoinStatus", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "userConfig", "Lcom/assetgro/stockgro/data/model/UserConfig;", "userPermissions", "Lcom/assetgro/stockgro/data/model/UserPermissions;", "isSocialFeedEnabled", HttpUrl.FRAGMENT_ENCODE_SET, "socialLanding", "(Ljava/util/List;Ljava/util/Map;Lcom/assetgro/stockgro/data/model/UserConfig;Lcom/assetgro/stockgro/data/model/UserPermissions;ZZ)V", "getCategories", "()Ljava/util/List;", "getGroupJoinStatus", "()Ljava/util/Map;", "()Z", "getSocialLanding", "getUserConfig", "()Lcom/assetgro/stockgro/data/model/UserConfig;", "getUserPermissions", "()Lcom/assetgro/stockgro/data/model/UserPermissions;", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DiscoverDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<DiscoverDto> CREATOR = new Creator();

    @SerializedName("categories")
    private final List<DiscoverCategory> categories;

    @SerializedName("group_to_status")
    private final Map<String, String> groupJoinStatus;

    @SerializedName("is_social_feed_enabled")
    private final boolean isSocialFeedEnabled;

    @SerializedName("social_landing")
    private final boolean socialLanding;

    @SerializedName(PaymentConstants.Category.CONFIG)
    private final UserConfig userConfig;

    @SerializedName("user_permissions")
    private final UserPermissions userPermissions;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<DiscoverDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DiscoverDto createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i10 = 0;
                while (i10 != readInt) {
                    i10 = h.e(DiscoverCategory.CREATOR, parcel, arrayList2, i10, 1);
                }
                arrayList = arrayList2;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                for (int i11 = 0; i11 != readInt2; i11++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new DiscoverDto(arrayList, linkedHashMap, parcel.readInt() == 0 ? null : UserConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UserPermissions.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DiscoverDto[] newArray(int i10) {
            return new DiscoverDto[i10];
        }
    }

    public DiscoverDto(List<DiscoverCategory> list, Map<String, String> map, UserConfig userConfig, UserPermissions userPermissions, boolean z10, boolean z11) {
        this.categories = list;
        this.groupJoinStatus = map;
        this.userConfig = userConfig;
        this.userPermissions = userPermissions;
        this.isSocialFeedEnabled = z10;
        this.socialLanding = z11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<DiscoverCategory> getCategories() {
        return this.categories;
    }

    public final Map<String, String> getGroupJoinStatus() {
        return this.groupJoinStatus;
    }

    public final boolean getSocialLanding() {
        return this.socialLanding;
    }

    public final UserConfig getUserConfig() {
        return this.userConfig;
    }

    public final UserPermissions getUserPermissions() {
        return this.userPermissions;
    }

    /* renamed from: isSocialFeedEnabled, reason: from getter */
    public final boolean getIsSocialFeedEnabled() {
        return this.isSocialFeedEnabled;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<DiscoverCategory> list = this.categories;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator o10 = a.o(parcel, 1, list);
            while (o10.hasNext()) {
                ((DiscoverCategory) o10.next()).writeToParcel(parcel, flags);
            }
        }
        Map<String, String> map = this.groupJoinStatus;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        UserConfig userConfig = this.userConfig;
        if (userConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userConfig.writeToParcel(parcel, flags);
        }
        UserPermissions userPermissions = this.userPermissions;
        if (userPermissions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userPermissions.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.isSocialFeedEnabled ? 1 : 0);
        parcel.writeInt(this.socialLanding ? 1 : 0);
    }

    public /* synthetic */ DiscoverDto(List list, Map map, UserConfig userConfig, UserPermissions userPermissions, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, map, userConfig, userPermissions, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? false : z11);
    }
}
