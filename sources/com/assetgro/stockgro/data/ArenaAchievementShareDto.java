package com.assetgro.stockgro.data;

import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/assetgro/stockgro/data/ArenaAchievementShareDto;", HttpUrl.FRAGMENT_ENCODE_SET, "url", HttpUrl.FRAGMENT_ENCODE_SET, "templateData", "Lcom/assetgro/stockgro/data/ArenaAchievementShareDto$TemplateData;", "(Ljava/lang/String;Lcom/assetgro/stockgro/data/ArenaAchievementShareDto$TemplateData;)V", "getTemplateData", "()Lcom/assetgro/stockgro/data/ArenaAchievementShareDto$TemplateData;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "TemplateData", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ArenaAchievementShareDto {
    public static final int $stable = 0;

    @SerializedName("template_data")
    @NotNull
    private final TemplateData templateData;

    @SerializedName("url")
    @NotNull
    private final String url;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/data/ArenaAchievementShareDto$TemplateData;", HttpUrl.FRAGMENT_ENCODE_SET, "redirectUrl", HttpUrl.FRAGMENT_ENCODE_SET, "templateBody", "(Ljava/lang/String;Ljava/lang/String;)V", "getRedirectUrl", "()Ljava/lang/String;", "getTemplateBody", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class TemplateData {
        public static final int $stable = 0;

        @SerializedName("redirect_url")
        @NotNull
        private final String redirectUrl;

        @SerializedName("template_body")
        @NotNull
        private final String templateBody;

        public TemplateData(@NotNull String redirectUrl, @NotNull String templateBody) {
            Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
            Intrinsics.checkNotNullParameter(templateBody, "templateBody");
            this.redirectUrl = redirectUrl;
            this.templateBody = templateBody;
        }

        public static /* synthetic */ TemplateData copy$default(TemplateData templateData, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = templateData.redirectUrl;
            }
            if ((i10 & 2) != 0) {
                str2 = templateData.templateBody;
            }
            return templateData.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTemplateBody() {
            return this.templateBody;
        }

        @NotNull
        public final TemplateData copy(@NotNull String redirectUrl, @NotNull String templateBody) {
            Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
            Intrinsics.checkNotNullParameter(templateBody, "templateBody");
            return new TemplateData(redirectUrl, templateBody);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TemplateData)) {
                return false;
            }
            TemplateData templateData = (TemplateData) other;
            return Intrinsics.a(this.redirectUrl, templateData.redirectUrl) && Intrinsics.a(this.templateBody, templateData.templateBody);
        }

        @NotNull
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        @NotNull
        public final String getTemplateBody() {
            return this.templateBody;
        }

        public int hashCode() {
            return this.templateBody.hashCode() + (this.redirectUrl.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return h.s("TemplateData(redirectUrl=", this.redirectUrl, ", templateBody=", this.templateBody, ")");
        }
    }

    public ArenaAchievementShareDto(@NotNull String url, @NotNull TemplateData templateData) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(templateData, "templateData");
        this.url = url;
        this.templateData = templateData;
    }

    public static /* synthetic */ ArenaAchievementShareDto copy$default(ArenaAchievementShareDto arenaAchievementShareDto, String str, TemplateData templateData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = arenaAchievementShareDto.url;
        }
        if ((i10 & 2) != 0) {
            templateData = arenaAchievementShareDto.templateData;
        }
        return arenaAchievementShareDto.copy(str, templateData);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TemplateData getTemplateData() {
        return this.templateData;
    }

    @NotNull
    public final ArenaAchievementShareDto copy(@NotNull String url, @NotNull TemplateData templateData) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(templateData, "templateData");
        return new ArenaAchievementShareDto(url, templateData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArenaAchievementShareDto)) {
            return false;
        }
        ArenaAchievementShareDto arenaAchievementShareDto = (ArenaAchievementShareDto) other;
        return Intrinsics.a(this.url, arenaAchievementShareDto.url) && Intrinsics.a(this.templateData, arenaAchievementShareDto.templateData);
    }

    @NotNull
    public final TemplateData getTemplateData() {
        return this.templateData;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.templateData.hashCode() + (this.url.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ArenaAchievementShareDto(url=" + this.url + ", templateData=" + this.templateData + ")";
    }
}
