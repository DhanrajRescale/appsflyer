package com.assetgro.stockgro.ui.social.data.remote;

import com.assetgro.stockgro.ui.social.domain.model.User;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u0012\u001a\u00020\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\f\"\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/assetgro/stockgro/ui/social/data/remote/UserDto;", HttpUrl.FRAGMENT_ENCODE_SET, "userId", HttpUrl.FRAGMENT_ENCODE_SET, "memberName", "displayPicture", "username", "isExpert", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDisplayPicture", "()Ljava/lang/String;", "()Z", "setExpert", "(Z)V", "getMemberName", "getUserId", "getUsername", "toUser", "Lcom/assetgro/stockgro/ui/social/domain/model/User;", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserDto {
    public static final int $stable = 8;

    @SerializedName("display_image")
    private final String displayPicture;

    @SerializedName("is_ria_rra")
    private boolean isExpert;

    @SerializedName("display_name")
    private final String memberName;

    @SerializedName("user_id")
    @NotNull
    private final String userId;

    @SerializedName("username")
    private final String username;

    public UserDto(@NotNull String userId, String str, String str2, String str3, boolean z10) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.userId = userId;
        this.memberName = str;
        this.displayPicture = str2;
        this.username = str3;
        this.isExpert = z10;
    }

    public final String getDisplayPicture() {
        return this.displayPicture;
    }

    public final String getMemberName() {
        return this.memberName;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    /* renamed from: isExpert, reason: from getter */
    public final boolean getIsExpert() {
        return this.isExpert;
    }

    public final void setExpert(boolean z10) {
        this.isExpert = z10;
    }

    @NotNull
    public final User toUser() {
        return new User(this.userId, this.memberName, this.displayPicture, this.username, this.isExpert);
    }

    public /* synthetic */ UserDto(String str, String str2, String str3, String str4, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? "@username" : str4, (i10 & 16) != 0 ? false : z10);
    }
}
