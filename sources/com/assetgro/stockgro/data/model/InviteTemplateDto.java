package com.assetgro.stockgro.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J<\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/assetgro/stockgro/data/model/InviteTemplateDto;", HttpUrl.FRAGMENT_ENCODE_SET, "templateId", HttpUrl.FRAGMENT_ENCODE_SET, "templateParams", "Lcom/assetgro/stockgro/data/model/TemplateParams;", "redirectRequired", HttpUrl.FRAGMENT_ENCODE_SET, "redirectConfig", "Lcom/assetgro/stockgro/data/model/RedirectConfig;", "(Ljava/lang/String;Lcom/assetgro/stockgro/data/model/TemplateParams;Ljava/lang/Boolean;Lcom/assetgro/stockgro/data/model/RedirectConfig;)V", "getRedirectConfig", "()Lcom/assetgro/stockgro/data/model/RedirectConfig;", "getRedirectRequired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTemplateId", "()Ljava/lang/String;", "getTemplateParams", "()Lcom/assetgro/stockgro/data/model/TemplateParams;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/assetgro/stockgro/data/model/TemplateParams;Ljava/lang/Boolean;Lcom/assetgro/stockgro/data/model/RedirectConfig;)Lcom/assetgro/stockgro/data/model/InviteTemplateDto;", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InviteTemplateDto {
    public static final int $stable = 0;

    @SerializedName("redirect_config")
    private final RedirectConfig redirectConfig;

    @SerializedName("redirect_required")
    private final Boolean redirectRequired;

    @SerializedName("template_id")
    @NotNull
    private final String templateId;

    @SerializedName("params")
    private final TemplateParams templateParams;

    public InviteTemplateDto(@NotNull String templateId, TemplateParams templateParams, Boolean bool, RedirectConfig redirectConfig) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        this.templateId = templateId;
        this.templateParams = templateParams;
        this.redirectRequired = bool;
        this.redirectConfig = redirectConfig;
    }

    public static /* synthetic */ InviteTemplateDto copy$default(InviteTemplateDto inviteTemplateDto, String str, TemplateParams templateParams, Boolean bool, RedirectConfig redirectConfig, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inviteTemplateDto.templateId;
        }
        if ((i10 & 2) != 0) {
            templateParams = inviteTemplateDto.templateParams;
        }
        if ((i10 & 4) != 0) {
            bool = inviteTemplateDto.redirectRequired;
        }
        if ((i10 & 8) != 0) {
            redirectConfig = inviteTemplateDto.redirectConfig;
        }
        return inviteTemplateDto.copy(str, templateParams, bool, redirectConfig);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    /* renamed from: component2, reason: from getter */
    public final TemplateParams getTemplateParams() {
        return this.templateParams;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getRedirectRequired() {
        return this.redirectRequired;
    }

    /* renamed from: component4, reason: from getter */
    public final RedirectConfig getRedirectConfig() {
        return this.redirectConfig;
    }

    @NotNull
    public final InviteTemplateDto copy(@NotNull String templateId, TemplateParams templateParams, Boolean redirectRequired, RedirectConfig redirectConfig) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        return new InviteTemplateDto(templateId, templateParams, redirectRequired, redirectConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InviteTemplateDto)) {
            return false;
        }
        InviteTemplateDto inviteTemplateDto = (InviteTemplateDto) other;
        return Intrinsics.a(this.templateId, inviteTemplateDto.templateId) && Intrinsics.a(this.templateParams, inviteTemplateDto.templateParams) && Intrinsics.a(this.redirectRequired, inviteTemplateDto.redirectRequired) && Intrinsics.a(this.redirectConfig, inviteTemplateDto.redirectConfig);
    }

    public final RedirectConfig getRedirectConfig() {
        return this.redirectConfig;
    }

    public final Boolean getRedirectRequired() {
        return this.redirectRequired;
    }

    @NotNull
    public final String getTemplateId() {
        return this.templateId;
    }

    public final TemplateParams getTemplateParams() {
        return this.templateParams;
    }

    public int hashCode() {
        int hashCode = this.templateId.hashCode() * 31;
        TemplateParams templateParams = this.templateParams;
        int hashCode2 = (hashCode + (templateParams == null ? 0 : templateParams.hashCode())) * 31;
        Boolean bool = this.redirectRequired;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        RedirectConfig redirectConfig = this.redirectConfig;
        return hashCode3 + (redirectConfig != null ? redirectConfig.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InviteTemplateDto(templateId=" + this.templateId + ", templateParams=" + this.templateParams + ", redirectRequired=" + this.redirectRequired + ", redirectConfig=" + this.redirectConfig + ")";
    }
}
