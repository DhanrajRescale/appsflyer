package com.assetgro.stockgro.data.model;

import a3.a;
import aq.g0;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import in.juspay.hyper.constants.LogSubCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;
import zp.h;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J9\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/assetgro/stockgro/data/model/SocialDataDto;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "component1", "component2", "component3", "component4", "userId", "userName", "userEmail", "displayPicture", "copy", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "getUserName", "getUserEmail", "getDisplayPicture", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lzp/h;", LogSubCategory.Action.USER, "(Ljava/lang/String;Lzp/h;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class SocialDataDto {
    public static final int $stable = 0;

    @SerializedName("dp")
    private final String displayPicture;

    @SerializedName(Scopes.EMAIL)
    private final String userEmail;

    @SerializedName("sg_user_id")
    private final String userId;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String userName;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SocialDataDto(@NotNull String userId, @NotNull h user) {
        this(userId, ((g0) user).f2717b.f2704c, ((g0) user).f2717b.f2707f, String.valueOf(user.getPhotoUrl()));
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(user, "user");
    }

    public static /* synthetic */ SocialDataDto copy$default(SocialDataDto socialDataDto, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = socialDataDto.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = socialDataDto.userName;
        }
        if ((i10 & 4) != 0) {
            str3 = socialDataDto.userEmail;
        }
        if ((i10 & 8) != 0) {
            str4 = socialDataDto.displayPicture;
        }
        return socialDataDto.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUserEmail() {
        return this.userEmail;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisplayPicture() {
        return this.displayPicture;
    }

    @NotNull
    public final SocialDataDto copy(String userId, String userName, String userEmail, String displayPicture) {
        return new SocialDataDto(userId, userName, userEmail, displayPicture);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialDataDto)) {
            return false;
        }
        SocialDataDto socialDataDto = (SocialDataDto) other;
        return Intrinsics.a(this.userId, socialDataDto.userId) && Intrinsics.a(this.userName, socialDataDto.userName) && Intrinsics.a(this.userEmail, socialDataDto.userEmail) && Intrinsics.a(this.displayPicture, socialDataDto.displayPicture);
    }

    public final String getDisplayPicture() {
        return this.displayPicture;
    }

    public final String getUserEmail() {
        return this.userEmail;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        String str = this.userId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userEmail;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayPicture;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.userId;
        String str2 = this.userName;
        return a.k(e.l("SocialDataDto(userId=", str, ", userName=", str2, ", userEmail="), this.userEmail, ", displayPicture=", this.displayPicture, ")");
    }

    public SocialDataDto(String str, String str2, String str3, String str4) {
        this.userId = str;
        this.userName = str2;
        this.userEmail = str3;
        this.displayPicture = str4;
    }
}
