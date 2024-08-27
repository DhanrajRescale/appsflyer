package com.assetgro.stockgro.feature_social.data.remote.feed.home;

import a3.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import gb.b;
import gb.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0019\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/home/SocialHomeFeedResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "Lgb/a;", "toSocialHomeFeedResponse", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_social/data/remote/feed/home/SocialHomeFeedResponseDto$SocialHomeFeedCategoryDto;", "component1", "categories", "copy", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "Ljava/util/List;", "getCategories", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "SocialHomeFeedCategoryDto", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class SocialHomeFeedResponseDto {
    public static final int $stable = 8;

    @SerializedName("categories")
    @NotNull
    private final List<SocialHomeFeedCategoryDto> categories;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B5\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/home/SocialHomeFeedResponseDto$SocialHomeFeedCategoryDto;", HttpUrl.FRAGMENT_ENCODE_SET, "Lgb/b;", "toSocialHomeFeedCategory", HttpUrl.FRAGMENT_ENCODE_SET, "component1", "component2", "component3", "component4", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_social/data/remote/feed/home/SocialHomeFeedResponseDto$SocialHomeFeedCategoryDto$SocialHomeFeedSubCategoryDto;", "component5", "categoryId", AppMeasurementSdk.ConditionalUserProperty.NAME, "description", "borderColor", "subCategories", "copy", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "Ljava/lang/String;", "getCategoryId", "()Ljava/lang/String;", "getName", "getDescription", "getBorderColor", "Ljava/util/List;", "getSubCategories", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "SocialHomeFeedSubCategoryDto", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final /* data */ class SocialHomeFeedCategoryDto {
        public static final int $stable = 8;

        @SerializedName("border_color")
        @NotNull
        private final String borderColor;

        @SerializedName("category_id")
        @NotNull
        private final String categoryId;

        @SerializedName("description")
        @NotNull
        private final String description;

        @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
        @NotNull
        private final String name;

        @SerializedName("sub_categories")
        @NotNull
        private final List<SocialHomeFeedSubCategoryDto> subCategories;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b-\u0010.J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003Jf\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001a\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b\"\u0010!R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b$\u0010!R\u001a\u0010\u0014\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010%\u001a\u0004\b\u0014\u0010&R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010'\u001a\u0004\b\u0015\u0010\rR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010*R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b+\u0010!\"\u0004\b,\u0010*¨\u0006/"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/home/SocialHomeFeedResponseDto$SocialHomeFeedCategoryDto$SocialHomeFeedSubCategoryDto;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "borderColorParent", "Lgb/d;", "toSocialHomeFeedSubCategory", "component1", "component2", "component3", "component4", HttpUrl.FRAGMENT_ENCODE_SET, "component5", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "subCategoryId", AppMeasurementSdk.ConditionalUserProperty.NAME, "categoryId", "logoUrl", "isLiked", "isFullWidth", "description", "borderColor", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/assetgro/stockgro/feature_social/data/remote/feed/home/SocialHomeFeedResponseDto$SocialHomeFeedCategoryDto$SocialHomeFeedSubCategoryDto;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "other", "equals", "Ljava/lang/String;", "getSubCategoryId", "()Ljava/lang/String;", "getName", "getCategoryId", "getLogoUrl", "Z", "()Z", "Ljava/lang/Boolean;", "getDescription", "setDescription", "(Ljava/lang/String;)V", "getBorderColor", "setBorderColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes.dex */
        public static final /* data */ class SocialHomeFeedSubCategoryDto {
            public static final int $stable = 8;

            @SerializedName("border_color")
            private String borderColor;

            @SerializedName("category_id")
            @NotNull
            private final String categoryId;

            @SerializedName("description")
            private String description;

            @SerializedName("is_full_width")
            private final Boolean isFullWidth;

            @SerializedName("is_liked")
            private final boolean isLiked;

            @SerializedName("logo_url")
            @NotNull
            private final String logoUrl;

            @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
            @NotNull
            private final String name;

            @SerializedName("sub_category_id")
            @NotNull
            private final String subCategoryId;

            public SocialHomeFeedSubCategoryDto(@NotNull String subCategoryId, @NotNull String name, @NotNull String categoryId, @NotNull String logoUrl, boolean z10, Boolean bool, String str, String str2) {
                Intrinsics.checkNotNullParameter(subCategoryId, "subCategoryId");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(categoryId, "categoryId");
                Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
                this.subCategoryId = subCategoryId;
                this.name = name;
                this.categoryId = categoryId;
                this.logoUrl = logoUrl;
                this.isLiked = z10;
                this.isFullWidth = bool;
                this.description = str;
                this.borderColor = str2;
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getSubCategoryId() {
                return this.subCategoryId;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getCategoryId() {
                return this.categoryId;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final String getLogoUrl() {
                return this.logoUrl;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getIsLiked() {
                return this.isLiked;
            }

            /* renamed from: component6, reason: from getter */
            public final Boolean getIsFullWidth() {
                return this.isFullWidth;
            }

            /* renamed from: component7, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* renamed from: component8, reason: from getter */
            public final String getBorderColor() {
                return this.borderColor;
            }

            @NotNull
            public final SocialHomeFeedSubCategoryDto copy(@NotNull String subCategoryId, @NotNull String name, @NotNull String categoryId, @NotNull String logoUrl, boolean isLiked, Boolean isFullWidth, String description, String borderColor) {
                Intrinsics.checkNotNullParameter(subCategoryId, "subCategoryId");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(categoryId, "categoryId");
                Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
                return new SocialHomeFeedSubCategoryDto(subCategoryId, name, categoryId, logoUrl, isLiked, isFullWidth, description, borderColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SocialHomeFeedSubCategoryDto)) {
                    return false;
                }
                SocialHomeFeedSubCategoryDto socialHomeFeedSubCategoryDto = (SocialHomeFeedSubCategoryDto) other;
                return Intrinsics.a(this.subCategoryId, socialHomeFeedSubCategoryDto.subCategoryId) && Intrinsics.a(this.name, socialHomeFeedSubCategoryDto.name) && Intrinsics.a(this.categoryId, socialHomeFeedSubCategoryDto.categoryId) && Intrinsics.a(this.logoUrl, socialHomeFeedSubCategoryDto.logoUrl) && this.isLiked == socialHomeFeedSubCategoryDto.isLiked && Intrinsics.a(this.isFullWidth, socialHomeFeedSubCategoryDto.isFullWidth) && Intrinsics.a(this.description, socialHomeFeedSubCategoryDto.description) && Intrinsics.a(this.borderColor, socialHomeFeedSubCategoryDto.borderColor);
            }

            public final String getBorderColor() {
                return this.borderColor;
            }

            @NotNull
            public final String getCategoryId() {
                return this.categoryId;
            }

            public final String getDescription() {
                return this.description;
            }

            @NotNull
            public final String getLogoUrl() {
                return this.logoUrl;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }

            @NotNull
            public final String getSubCategoryId() {
                return this.subCategoryId;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int d10 = e.d(this.isLiked, h.g(this.logoUrl, h.g(this.categoryId, h.g(this.name, this.subCategoryId.hashCode() * 31, 31), 31), 31), 31);
                Boolean bool = this.isFullWidth;
                int i10 = 0;
                if (bool == null) {
                    hashCode = 0;
                } else {
                    hashCode = bool.hashCode();
                }
                int i11 = (d10 + hashCode) * 31;
                String str = this.description;
                if (str == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str.hashCode();
                }
                int i12 = (i11 + hashCode2) * 31;
                String str2 = this.borderColor;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return i12 + i10;
            }

            public final Boolean isFullWidth() {
                return this.isFullWidth;
            }

            public final boolean isLiked() {
                return this.isLiked;
            }

            public final void setBorderColor(String str) {
                this.borderColor = str;
            }

            public final void setDescription(String str) {
                this.description = str;
            }

            @NotNull
            public final d toSocialHomeFeedSubCategory(@NotNull String borderColorParent) {
                String str;
                boolean z10;
                Intrinsics.checkNotNullParameter(borderColorParent, "borderColorParent");
                String str2 = this.subCategoryId;
                String str3 = this.name;
                String str4 = this.categoryId;
                String str5 = this.logoUrl;
                boolean z11 = this.isLiked;
                String str6 = this.borderColor;
                if (str6 == null) {
                    str = borderColorParent;
                } else {
                    str = str6;
                }
                Boolean bool = this.isFullWidth;
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    z10 = false;
                }
                boolean z12 = z10;
                String str7 = this.description;
                if (str7 == null) {
                    str7 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                return new d(str2, str3, str4, str5, z11, z12, str7, str);
            }

            @NotNull
            public String toString() {
                String str = this.subCategoryId;
                String str2 = this.name;
                String str3 = this.categoryId;
                String str4 = this.logoUrl;
                boolean z10 = this.isLiked;
                Boolean bool = this.isFullWidth;
                String str5 = this.description;
                String str6 = this.borderColor;
                StringBuilder l10 = e.l("SocialHomeFeedSubCategoryDto(subCategoryId=", str, ", name=", str2, ", categoryId=");
                e.v(l10, str3, ", logoUrl=", str4, ", isLiked=");
                l10.append(z10);
                l10.append(", isFullWidth=");
                l10.append(bool);
                l10.append(", description=");
                return a.k(l10, str5, ", borderColor=", str6, ")");
            }

            public /* synthetic */ SocialHomeFeedSubCategoryDto(String str, String str2, String str3, String str4, boolean z10, Boolean bool, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, str4, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? Boolean.FALSE : bool, str5, str6);
            }
        }

        public SocialHomeFeedCategoryDto(@NotNull String categoryId, @NotNull String name, @NotNull String description, @NotNull String borderColor, @NotNull List<SocialHomeFeedSubCategoryDto> subCategories) {
            Intrinsics.checkNotNullParameter(categoryId, "categoryId");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(borderColor, "borderColor");
            Intrinsics.checkNotNullParameter(subCategories, "subCategories");
            this.categoryId = categoryId;
            this.name = name;
            this.description = description;
            this.borderColor = borderColor;
            this.subCategories = subCategories;
        }

        public static /* synthetic */ SocialHomeFeedCategoryDto copy$default(SocialHomeFeedCategoryDto socialHomeFeedCategoryDto, String str, String str2, String str3, String str4, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = socialHomeFeedCategoryDto.categoryId;
            }
            if ((i10 & 2) != 0) {
                str2 = socialHomeFeedCategoryDto.name;
            }
            String str5 = str2;
            if ((i10 & 4) != 0) {
                str3 = socialHomeFeedCategoryDto.description;
            }
            String str6 = str3;
            if ((i10 & 8) != 0) {
                str4 = socialHomeFeedCategoryDto.borderColor;
            }
            String str7 = str4;
            if ((i10 & 16) != 0) {
                list = socialHomeFeedCategoryDto.subCategories;
            }
            return socialHomeFeedCategoryDto.copy(str, str5, str6, str7, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getCategoryId() {
            return this.categoryId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final List<SocialHomeFeedSubCategoryDto> component5() {
            return this.subCategories;
        }

        @NotNull
        public final SocialHomeFeedCategoryDto copy(@NotNull String categoryId, @NotNull String name, @NotNull String description, @NotNull String borderColor, @NotNull List<SocialHomeFeedSubCategoryDto> subCategories) {
            Intrinsics.checkNotNullParameter(categoryId, "categoryId");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(borderColor, "borderColor");
            Intrinsics.checkNotNullParameter(subCategories, "subCategories");
            return new SocialHomeFeedCategoryDto(categoryId, name, description, borderColor, subCategories);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SocialHomeFeedCategoryDto)) {
                return false;
            }
            SocialHomeFeedCategoryDto socialHomeFeedCategoryDto = (SocialHomeFeedCategoryDto) other;
            return Intrinsics.a(this.categoryId, socialHomeFeedCategoryDto.categoryId) && Intrinsics.a(this.name, socialHomeFeedCategoryDto.name) && Intrinsics.a(this.description, socialHomeFeedCategoryDto.description) && Intrinsics.a(this.borderColor, socialHomeFeedCategoryDto.borderColor) && Intrinsics.a(this.subCategories, socialHomeFeedCategoryDto.subCategories);
        }

        @NotNull
        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final String getCategoryId() {
            return this.categoryId;
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final List<SocialHomeFeedSubCategoryDto> getSubCategories() {
            return this.subCategories;
        }

        public int hashCode() {
            return this.subCategories.hashCode() + h.g(this.borderColor, h.g(this.description, h.g(this.name, this.categoryId.hashCode() * 31, 31), 31), 31);
        }

        @NotNull
        public final b toSocialHomeFeedCategory() {
            String str = this.categoryId;
            String str2 = this.name;
            String str3 = this.description;
            String str4 = this.borderColor;
            List<SocialHomeFeedSubCategoryDto> list = this.subCategories;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((SocialHomeFeedSubCategoryDto) it.next()).toSocialHomeFeedSubCategory(this.borderColor));
            }
            return new b(str, str2, str3, str4, arrayList);
        }

        @NotNull
        public String toString() {
            String str = this.categoryId;
            String str2 = this.name;
            String str3 = this.description;
            String str4 = this.borderColor;
            List<SocialHomeFeedSubCategoryDto> list = this.subCategories;
            StringBuilder l10 = e.l("SocialHomeFeedCategoryDto(categoryId=", str, ", name=", str2, ", description=");
            e.v(l10, str3, ", borderColor=", str4, ", subCategories=");
            return a.l(l10, list, ")");
        }
    }

    public SocialHomeFeedResponseDto(@NotNull List<SocialHomeFeedCategoryDto> categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.categories = categories;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SocialHomeFeedResponseDto copy$default(SocialHomeFeedResponseDto socialHomeFeedResponseDto, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = socialHomeFeedResponseDto.categories;
        }
        return socialHomeFeedResponseDto.copy(list);
    }

    @NotNull
    public final List<SocialHomeFeedCategoryDto> component1() {
        return this.categories;
    }

    @NotNull
    public final SocialHomeFeedResponseDto copy(@NotNull List<SocialHomeFeedCategoryDto> categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        return new SocialHomeFeedResponseDto(categories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SocialHomeFeedResponseDto) && Intrinsics.a(this.categories, ((SocialHomeFeedResponseDto) other).categories);
    }

    @NotNull
    public final List<SocialHomeFeedCategoryDto> getCategories() {
        return this.categories;
    }

    public int hashCode() {
        return this.categories.hashCode();
    }

    @NotNull
    public final gb.a toSocialHomeFeedResponse() {
        List<SocialHomeFeedCategoryDto> list = this.categories;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SocialHomeFeedCategoryDto) it.next()).toSocialHomeFeedCategory());
        }
        return new gb.a(arrayList);
    }

    @NotNull
    public String toString() {
        return a.h("SocialHomeFeedResponseDto(categories=", this.categories, ")");
    }
}
