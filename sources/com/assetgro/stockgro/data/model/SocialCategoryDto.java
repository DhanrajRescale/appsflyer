package com.assetgro.stockgro.data.model;

import a3.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/data/model/SocialCategoryDto;", HttpUrl.FRAGMENT_ENCODE_SET, "categories", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/DiscoverCategory;", "(Ljava/util/List;)V", "getCategories", "()Ljava/util/List;", "setCategories", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SocialCategoryDto {
    public static final int $stable = 8;

    @SerializedName("categories")
    @NotNull
    private List<DiscoverCategory> categories;

    public SocialCategoryDto(@NotNull List<DiscoverCategory> categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.categories = categories;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SocialCategoryDto copy$default(SocialCategoryDto socialCategoryDto, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = socialCategoryDto.categories;
        }
        return socialCategoryDto.copy(list);
    }

    @NotNull
    public final List<DiscoverCategory> component1() {
        return this.categories;
    }

    @NotNull
    public final SocialCategoryDto copy(@NotNull List<DiscoverCategory> categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        return new SocialCategoryDto(categories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SocialCategoryDto) && Intrinsics.a(this.categories, ((SocialCategoryDto) other).categories);
    }

    @NotNull
    public final List<DiscoverCategory> getCategories() {
        return this.categories;
    }

    public int hashCode() {
        return this.categories.hashCode();
    }

    public final void setCategories(@NotNull List<DiscoverCategory> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.categories = list;
    }

    @NotNull
    public String toString() {
        return a.h("SocialCategoryDto(categories=", this.categories, ")");
    }
}
