package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0002\u0010\nR$\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/assetgro/stockgro/data/model/UserSocialAuthStatusDto;", "Landroid/os/Parcelable;", "isPresent", HttpUrl.FRAGMENT_ENCODE_SET, "platformMeta", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/PlatformMeta;", "userId", "(Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPlatformMeta", "()Ljava/util/Map;", "getUserId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/String;)Lcom/assetgro/stockgro/data/model/UserSocialAuthStatusDto;", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UserSocialAuthStatusDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<UserSocialAuthStatusDto> CREATOR = new Creator();

    @SerializedName("is_present")
    private final Boolean isPresent;

    @SerializedName("platform_metas")
    private final Map<String, PlatformMeta> platformMeta;

    @SerializedName("sg_user_id")
    private final String userId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<UserSocialAuthStatusDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserSocialAuthStatusDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            LinkedHashMap linkedHashMap = null;
            Boolean valueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    linkedHashMap2.put(parcel.readString(), PlatformMeta.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new UserSocialAuthStatusDto(valueOf, linkedHashMap, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserSocialAuthStatusDto[] newArray(int i10) {
            return new UserSocialAuthStatusDto[i10];
        }
    }

    public UserSocialAuthStatusDto(Boolean bool, Map<String, PlatformMeta> map, String str) {
        this.isPresent = bool;
        this.platformMeta = map;
        this.userId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserSocialAuthStatusDto copy$default(UserSocialAuthStatusDto userSocialAuthStatusDto, Boolean bool, Map map, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = userSocialAuthStatusDto.isPresent;
        }
        if ((i10 & 2) != 0) {
            map = userSocialAuthStatusDto.platformMeta;
        }
        if ((i10 & 4) != 0) {
            str = userSocialAuthStatusDto.userId;
        }
        return userSocialAuthStatusDto.copy(bool, map, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsPresent() {
        return this.isPresent;
    }

    public final Map<String, PlatformMeta> component2() {
        return this.platformMeta;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final UserSocialAuthStatusDto copy(Boolean isPresent, Map<String, PlatformMeta> platformMeta, String userId) {
        return new UserSocialAuthStatusDto(isPresent, platformMeta, userId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSocialAuthStatusDto)) {
            return false;
        }
        UserSocialAuthStatusDto userSocialAuthStatusDto = (UserSocialAuthStatusDto) other;
        return Intrinsics.a(this.isPresent, userSocialAuthStatusDto.isPresent) && Intrinsics.a(this.platformMeta, userSocialAuthStatusDto.platformMeta) && Intrinsics.a(this.userId, userSocialAuthStatusDto.userId);
    }

    public final Map<String, PlatformMeta> getPlatformMeta() {
        return this.platformMeta;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Boolean bool = this.isPresent;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Map<String, PlatformMeta> map = this.platformMeta;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.userId;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final Boolean isPresent() {
        return this.isPresent;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.isPresent;
        Map<String, PlatformMeta> map = this.platformMeta;
        String str = this.userId;
        StringBuilder sb2 = new StringBuilder("UserSocialAuthStatusDto(isPresent=");
        sb2.append(bool);
        sb2.append(", platformMeta=");
        sb2.append(map);
        sb2.append(", userId=");
        return d.o(sb2, str, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Boolean bool = this.isPresent;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool);
        }
        Map<String, PlatformMeta> map = this.platformMeta;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, PlatformMeta> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                entry.getValue().writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.userId);
    }
}
