package com.assetgro.stockgro.ui.social.data.remote;

import a3.a;
import com.assetgro.stockgro.ui.social.domain.model.CreatorMeta;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/assetgro/stockgro/ui/social/data/remote/CreatorMetaDto;", HttpUrl.FRAGMENT_ENCODE_SET, "displayName", HttpUrl.FRAGMENT_ENCODE_SET, "username", "displayImage", "userId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayImage", "()Ljava/lang/String;", "getDisplayName", "getUserId", "getUsername", "component1", "component2", "component3", "component4", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toCreatorMeta", "Lcom/assetgro/stockgro/ui/social/domain/model/CreatorMeta;", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CreatorMetaDto {
    public static final int $stable = 0;

    @SerializedName("display_image")
    private final String displayImage;

    @SerializedName("display_name")
    private final String displayName;

    @SerializedName(alternate = {"user_id"}, value = "uuid")
    private final String userId;

    @SerializedName("username")
    private final String username;

    public CreatorMetaDto(String str, String str2, String str3, String str4) {
        this.displayName = str;
        this.username = str2;
        this.displayImage = str3;
        this.userId = str4;
    }

    public static /* synthetic */ CreatorMetaDto copy$default(CreatorMetaDto creatorMetaDto, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = creatorMetaDto.displayName;
        }
        if ((i10 & 2) != 0) {
            str2 = creatorMetaDto.username;
        }
        if ((i10 & 4) != 0) {
            str3 = creatorMetaDto.displayImage;
        }
        if ((i10 & 8) != 0) {
            str4 = creatorMetaDto.userId;
        }
        return creatorMetaDto.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisplayImage() {
        return this.displayImage;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final CreatorMetaDto copy(String displayName, String username, String displayImage, String userId) {
        return new CreatorMetaDto(displayName, username, displayImage, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatorMetaDto)) {
            return false;
        }
        CreatorMetaDto creatorMetaDto = (CreatorMetaDto) other;
        return Intrinsics.a(this.displayName, creatorMetaDto.displayName) && Intrinsics.a(this.username, creatorMetaDto.username) && Intrinsics.a(this.displayImage, creatorMetaDto.displayImage) && Intrinsics.a(this.userId, creatorMetaDto.userId);
    }

    public final String getDisplayImage() {
        return this.displayImage;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.displayName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.username;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayImage;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.userId;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public final CreatorMeta toCreatorMeta() {
        return new CreatorMeta(this.displayName, this.username, this.displayImage, this.userId);
    }

    @NotNull
    public String toString() {
        String str = this.displayName;
        String str2 = this.username;
        return a.k(e.l("CreatorMetaDto(displayName=", str, ", username=", str2, ", displayImage="), this.displayImage, ", userId=", this.userId, ")");
    }
}
