package com.assetgro.stockgro.ui.home.homepage.data;

import a3.a;
import com.assetgro.stockgro.ui.home.homepage.domain.WidgetDataInterface;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/data/HomeUserInfoDto;", "Lcom/assetgro/stockgro/ui/home/homepage/domain/WidgetDataInterface;", "title", HttpUrl.FRAGMENT_ENCODE_SET, "userInfoItems", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/ui/home/homepage/data/UserInfoItem;", "extraActionCtaTitle", "extraActionBehavior", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getExtraActionBehavior", "()Ljava/lang/String;", "getExtraActionCtaTitle", "getTitle", "getUserInfoItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HomeUserInfoDto implements WidgetDataInterface {
    public static final int $stable = 0;

    @SerializedName("extra_action_behavior")
    @NotNull
    private final String extraActionBehavior;

    @SerializedName("extra_action_cta_title")
    @NotNull
    private final String extraActionCtaTitle;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName("elements")
    private final List<UserInfoItem> userInfoItems;

    public HomeUserInfoDto(@NotNull String title, List<UserInfoItem> list, @NotNull String extraActionCtaTitle, @NotNull String extraActionBehavior) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(extraActionCtaTitle, "extraActionCtaTitle");
        Intrinsics.checkNotNullParameter(extraActionBehavior, "extraActionBehavior");
        this.title = title;
        this.userInfoItems = list;
        this.extraActionCtaTitle = extraActionCtaTitle;
        this.extraActionBehavior = extraActionBehavior;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeUserInfoDto copy$default(HomeUserInfoDto homeUserInfoDto, String str, List list, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = homeUserInfoDto.title;
        }
        if ((i10 & 2) != 0) {
            list = homeUserInfoDto.userInfoItems;
        }
        if ((i10 & 4) != 0) {
            str2 = homeUserInfoDto.extraActionCtaTitle;
        }
        if ((i10 & 8) != 0) {
            str3 = homeUserInfoDto.extraActionBehavior;
        }
        return homeUserInfoDto.copy(str, list, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<UserInfoItem> component2() {
        return this.userInfoItems;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getExtraActionCtaTitle() {
        return this.extraActionCtaTitle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getExtraActionBehavior() {
        return this.extraActionBehavior;
    }

    @NotNull
    public final HomeUserInfoDto copy(@NotNull String title, List<UserInfoItem> userInfoItems, @NotNull String extraActionCtaTitle, @NotNull String extraActionBehavior) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(extraActionCtaTitle, "extraActionCtaTitle");
        Intrinsics.checkNotNullParameter(extraActionBehavior, "extraActionBehavior");
        return new HomeUserInfoDto(title, userInfoItems, extraActionCtaTitle, extraActionBehavior);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeUserInfoDto)) {
            return false;
        }
        HomeUserInfoDto homeUserInfoDto = (HomeUserInfoDto) other;
        return Intrinsics.a(this.title, homeUserInfoDto.title) && Intrinsics.a(this.userInfoItems, homeUserInfoDto.userInfoItems) && Intrinsics.a(this.extraActionCtaTitle, homeUserInfoDto.extraActionCtaTitle) && Intrinsics.a(this.extraActionBehavior, homeUserInfoDto.extraActionBehavior);
    }

    @NotNull
    public final String getExtraActionBehavior() {
        return this.extraActionBehavior;
    }

    @NotNull
    public final String getExtraActionCtaTitle() {
        return this.extraActionCtaTitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final List<UserInfoItem> getUserInfoItems() {
        return this.userInfoItems;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.title.hashCode() * 31;
        List<UserInfoItem> list = this.userInfoItems;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return this.extraActionBehavior.hashCode() + h.g(this.extraActionCtaTitle, (hashCode2 + hashCode) * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        List<UserInfoItem> list = this.userInfoItems;
        String str2 = this.extraActionCtaTitle;
        String str3 = this.extraActionBehavior;
        StringBuilder sb2 = new StringBuilder("HomeUserInfoDto(title=");
        sb2.append(str);
        sb2.append(", userInfoItems=");
        sb2.append(list);
        sb2.append(", extraActionCtaTitle=");
        return a.k(sb2, str2, ", extraActionBehavior=", str3, ")");
    }
}
