package com.assetgro.stockgro.feature_social.data.remote.ria;

import a3.a;
import com.assetgro.stockgro.data.model.UserBlockStatusDao;
import com.assetgro.stockgro.feature_social.data.remote.feed.stream.FeedStreamDto;
import com.assetgro.stockgro.ui.home.homepage.data.HomeSocialTradeViewDto;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004-./0BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0010HÆ\u0003J_\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00061"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "expertMeta", "Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$ExpertMeta;", "isBlocked", HttpUrl.FRAGMENT_ENCODE_SET, "blockStatus", "Lcom/assetgro/stockgro/data/model/UserBlockStatusDao;", "groups", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$Group;", "posts", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedStreamDto;", "tradeViews", "Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViews;", "tradeViewsPerformance", "Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance;", "(Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$ExpertMeta;ZLcom/assetgro/stockgro/data/model/UserBlockStatusDao;Ljava/util/List;Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedStreamDto;Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViews;Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance;)V", "getBlockStatus", "()Lcom/assetgro/stockgro/data/model/UserBlockStatusDao;", "getExpertMeta", "()Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$ExpertMeta;", "getGroups", "()Ljava/util/List;", "()Z", "getPosts", "()Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedStreamDto;", "getTradeViews", "()Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViews;", "getTradeViewsPerformance", "()Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "ExpertMeta", "Group", "TradeViews", "TradeViewsPerformance", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RiaProfileResponseDto {
    public static final int $stable = 8;

    @SerializedName("block_status")
    @NotNull
    private final UserBlockStatusDao blockStatus;

    @SerializedName("expert_meta")
    private final ExpertMeta expertMeta;

    @SerializedName("groups")
    private final List<Group> groups;

    @SerializedName("is_blocked")
    private final boolean isBlocked;

    @SerializedName("posts")
    private final FeedStreamDto posts;

    @SerializedName("trade_views")
    private final TradeViews tradeViews;

    @SerializedName("trade_views_performance")
    private final TradeViewsPerformance tradeViewsPerformance;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003123Bu\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0012J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010%\u001a\u00020\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0092\u0001\u0010*\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\t\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016¨\u00064"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$ExpertMeta;", HttpUrl.FRAGMENT_ENCODE_SET, "basicInfo", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$ExpertMeta$BasicInfo;", "description", HttpUrl.FRAGMENT_ENCODE_SET, "expertise", "Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$ExpertMeta$Expertise;", "isFollowing", HttpUrl.FRAGMENT_ENCODE_SET, "isSebiVerified", AppMeasurementSdk.ConditionalUserProperty.NAME, "outlines", "Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$ExpertMeta$Outline;", "sgHandle", "sgImageUrl", "userId", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBasicInfo", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "getExpertise", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "getName", "getOutlines", "getSgHandle", "getSgImageUrl", "getUserId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$ExpertMeta;", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "BasicInfo", "Expertise", "Outline", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class ExpertMeta {
        public static final int $stable = 8;

        @SerializedName("basic_info")
        @NotNull
        private final List<BasicInfo> basicInfo;

        @SerializedName("description")
        @NotNull
        private final String description;

        @SerializedName("expertise")
        private final List<Expertise> expertise;

        @SerializedName("is_following")
        private final Boolean isFollowing;

        @SerializedName("is_sebi_verified")
        private final boolean isSebiVerified;

        @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
        private final String name;

        @SerializedName("outlines")
        private final List<Outline> outlines;

        @SerializedName("sg_handle")
        private final String sgHandle;

        @SerializedName("sg_image_url")
        private final String sgImageUrl;

        @SerializedName("user_id")
        private final String userId;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$ExpertMeta$BasicInfo;", HttpUrl.FRAGMENT_ENCODE_SET, "iconUrl", HttpUrl.FRAGMENT_ENCODE_SET, "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getIconUrl", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final /* data */ class BasicInfo {
            public static final int $stable = 0;

            @SerializedName("icon_url")
            private final String iconUrl;

            @SerializedName("title")
            private final String title;

            public BasicInfo(String str, String str2) {
                this.iconUrl = str;
                this.title = str2;
            }

            public static /* synthetic */ BasicInfo copy$default(BasicInfo basicInfo, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = basicInfo.iconUrl;
                }
                if ((i10 & 2) != 0) {
                    str2 = basicInfo.title;
                }
                return basicInfo.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getIconUrl() {
                return this.iconUrl;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            public final BasicInfo copy(String iconUrl, String title) {
                return new BasicInfo(iconUrl, title);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BasicInfo)) {
                    return false;
                }
                BasicInfo basicInfo = (BasicInfo) other;
                return Intrinsics.a(this.iconUrl, basicInfo.iconUrl) && Intrinsics.a(this.title, basicInfo.title);
            }

            public final String getIconUrl() {
                return this.iconUrl;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.iconUrl;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.title;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return h.s("BasicInfo(iconUrl=", this.iconUrl, ", title=", this.title, ")");
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$ExpertMeta$Expertise;", HttpUrl.FRAGMENT_ENCODE_SET, "description", HttpUrl.FRAGMENT_ENCODE_SET, "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final /* data */ class Expertise {
            public static final int $stable = 0;

            @SerializedName("description")
            @NotNull
            private final String description;

            @SerializedName("title")
            @NotNull
            private final String title;

            public Expertise(@NotNull String description, @NotNull String title) {
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(title, "title");
                this.description = description;
                this.title = title;
            }

            public static /* synthetic */ Expertise copy$default(Expertise expertise, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = expertise.description;
                }
                if ((i10 & 2) != 0) {
                    str2 = expertise.title;
                }
                return expertise.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            public final Expertise copy(@NotNull String description, @NotNull String title) {
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(title, "title");
                return new Expertise(description, title);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Expertise)) {
                    return false;
                }
                Expertise expertise = (Expertise) other;
                return Intrinsics.a(this.description, expertise.description) && Intrinsics.a(this.title, expertise.title);
            }

            @NotNull
            public final String getDescription() {
                return this.description;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.title.hashCode() + (this.description.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return h.s("Expertise(description=", this.description, ", title=", this.title, ")");
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$ExpertMeta$Outline;", HttpUrl.FRAGMENT_ENCODE_SET, "iconUrl", HttpUrl.FRAGMENT_ENCODE_SET, "title", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIconUrl", "()Ljava/lang/String;", "getTitle", "getValue", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final /* data */ class Outline {
            public static final int $stable = 0;

            @SerializedName("icon_url")
            private final String iconUrl;

            @SerializedName("title")
            @NotNull
            private final String title;

            @SerializedName(AppMeasurementSdk.ConditionalUserProperty.VALUE)
            @NotNull
            private final String value;

            public Outline(String str, @NotNull String title, @NotNull String value) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(value, "value");
                this.iconUrl = str;
                this.title = title;
                this.value = value;
            }

            public static /* synthetic */ Outline copy$default(Outline outline, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = outline.iconUrl;
                }
                if ((i10 & 2) != 0) {
                    str2 = outline.title;
                }
                if ((i10 & 4) != 0) {
                    str3 = outline.value;
                }
                return outline.copy(str, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getIconUrl() {
                return this.iconUrl;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            @NotNull
            public final Outline copy(String iconUrl, @NotNull String title, @NotNull String value) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(value, "value");
                return new Outline(iconUrl, title, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Outline)) {
                    return false;
                }
                Outline outline = (Outline) other;
                return Intrinsics.a(this.iconUrl, outline.iconUrl) && Intrinsics.a(this.title, outline.title) && Intrinsics.a(this.value, outline.value);
            }

            public final String getIconUrl() {
                return this.iconUrl;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                int hashCode;
                String str = this.iconUrl;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return this.value.hashCode() + h.g(this.title, hashCode * 31, 31);
            }

            @NotNull
            public String toString() {
                String str = this.iconUrl;
                String str2 = this.title;
                return d.o(e.l("Outline(iconUrl=", str, ", title=", str2, ", value="), this.value, ")");
            }
        }

        public ExpertMeta(@NotNull List<BasicInfo> basicInfo, @NotNull String description, List<Expertise> list, Boolean bool, boolean z10, String str, List<Outline> list2, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(basicInfo, "basicInfo");
            Intrinsics.checkNotNullParameter(description, "description");
            this.basicInfo = basicInfo;
            this.description = description;
            this.expertise = list;
            this.isFollowing = bool;
            this.isSebiVerified = z10;
            this.name = str;
            this.outlines = list2;
            this.sgHandle = str2;
            this.sgImageUrl = str3;
            this.userId = str4;
        }

        @NotNull
        public final List<BasicInfo> component1() {
            return this.basicInfo;
        }

        /* renamed from: component10, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final List<Expertise> component3() {
            return this.expertise;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getIsFollowing() {
            return this.isFollowing;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsSebiVerified() {
            return this.isSebiVerified;
        }

        /* renamed from: component6, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final List<Outline> component7() {
            return this.outlines;
        }

        /* renamed from: component8, reason: from getter */
        public final String getSgHandle() {
            return this.sgHandle;
        }

        /* renamed from: component9, reason: from getter */
        public final String getSgImageUrl() {
            return this.sgImageUrl;
        }

        @NotNull
        public final ExpertMeta copy(@NotNull List<BasicInfo> basicInfo, @NotNull String description, List<Expertise> expertise, Boolean isFollowing, boolean isSebiVerified, String name, List<Outline> outlines, String sgHandle, String sgImageUrl, String userId) {
            Intrinsics.checkNotNullParameter(basicInfo, "basicInfo");
            Intrinsics.checkNotNullParameter(description, "description");
            return new ExpertMeta(basicInfo, description, expertise, isFollowing, isSebiVerified, name, outlines, sgHandle, sgImageUrl, userId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExpertMeta)) {
                return false;
            }
            ExpertMeta expertMeta = (ExpertMeta) other;
            return Intrinsics.a(this.basicInfo, expertMeta.basicInfo) && Intrinsics.a(this.description, expertMeta.description) && Intrinsics.a(this.expertise, expertMeta.expertise) && Intrinsics.a(this.isFollowing, expertMeta.isFollowing) && this.isSebiVerified == expertMeta.isSebiVerified && Intrinsics.a(this.name, expertMeta.name) && Intrinsics.a(this.outlines, expertMeta.outlines) && Intrinsics.a(this.sgHandle, expertMeta.sgHandle) && Intrinsics.a(this.sgImageUrl, expertMeta.sgImageUrl) && Intrinsics.a(this.userId, expertMeta.userId);
        }

        @NotNull
        public final List<BasicInfo> getBasicInfo() {
            return this.basicInfo;
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        public final List<Expertise> getExpertise() {
            return this.expertise;
        }

        public final String getName() {
            return this.name;
        }

        public final List<Outline> getOutlines() {
            return this.outlines;
        }

        public final String getSgHandle() {
            return this.sgHandle;
        }

        public final String getSgImageUrl() {
            return this.sgImageUrl;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int g10 = h.g(this.description, this.basicInfo.hashCode() * 31, 31);
            List<Expertise> list = this.expertise;
            int i10 = 0;
            if (list == null) {
                hashCode = 0;
            } else {
                hashCode = list.hashCode();
            }
            int i11 = (g10 + hashCode) * 31;
            Boolean bool = this.isFollowing;
            if (bool == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = bool.hashCode();
            }
            int d10 = e.d(this.isSebiVerified, (i11 + hashCode2) * 31, 31);
            String str = this.name;
            if (str == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str.hashCode();
            }
            int i12 = (d10 + hashCode3) * 31;
            List<Outline> list2 = this.outlines;
            if (list2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = list2.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            String str2 = this.sgHandle;
            if (str2 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str2.hashCode();
            }
            int i14 = (i13 + hashCode5) * 31;
            String str3 = this.sgImageUrl;
            if (str3 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str3.hashCode();
            }
            int i15 = (i14 + hashCode6) * 31;
            String str4 = this.userId;
            if (str4 != null) {
                i10 = str4.hashCode();
            }
            return i15 + i10;
        }

        public final Boolean isFollowing() {
            return this.isFollowing;
        }

        public final boolean isSebiVerified() {
            return this.isSebiVerified;
        }

        @NotNull
        public String toString() {
            List<BasicInfo> list = this.basicInfo;
            String str = this.description;
            List<Expertise> list2 = this.expertise;
            Boolean bool = this.isFollowing;
            boolean z10 = this.isSebiVerified;
            String str2 = this.name;
            List<Outline> list3 = this.outlines;
            String str3 = this.sgHandle;
            String str4 = this.sgImageUrl;
            String str5 = this.userId;
            StringBuilder sb2 = new StringBuilder("ExpertMeta(basicInfo=");
            sb2.append(list);
            sb2.append(", description=");
            sb2.append(str);
            sb2.append(", expertise=");
            sb2.append(list2);
            sb2.append(", isFollowing=");
            sb2.append(bool);
            sb2.append(", isSebiVerified=");
            sb2.append(z10);
            sb2.append(", name=");
            sb2.append(str2);
            sb2.append(", outlines=");
            sb2.append(list3);
            sb2.append(", sgHandle=");
            sb2.append(str3);
            sb2.append(", sgImageUrl=");
            return a.k(sb2, str4, ", userId=", str5, ")");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$Group;", HttpUrl.FRAGMENT_ENCODE_SET, "description", HttpUrl.FRAGMENT_ENCODE_SET, "groupIconUrl", "groupId", "groupName", "subTitle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getGroupIconUrl", "getGroupId", "getGroupName", "getSubTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Group {
        public static final int $stable = 0;

        @SerializedName("description")
        private final String description;

        @SerializedName("group_icon_url")
        private final String groupIconUrl;

        @SerializedName("group_id")
        private final String groupId;

        @SerializedName("group_name")
        private final String groupName;

        @SerializedName("sub_title")
        private final String subTitle;

        public Group(String str, String str2, String str3, String str4, String str5) {
            this.description = str;
            this.groupIconUrl = str2;
            this.groupId = str3;
            this.groupName = str4;
            this.subTitle = str5;
        }

        public static /* synthetic */ Group copy$default(Group group, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = group.description;
            }
            if ((i10 & 2) != 0) {
                str2 = group.groupIconUrl;
            }
            String str6 = str2;
            if ((i10 & 4) != 0) {
                str3 = group.groupId;
            }
            String str7 = str3;
            if ((i10 & 8) != 0) {
                str4 = group.groupName;
            }
            String str8 = str4;
            if ((i10 & 16) != 0) {
                str5 = group.subTitle;
            }
            return group.copy(str, str6, str7, str8, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component2, reason: from getter */
        public final String getGroupIconUrl() {
            return this.groupIconUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final String getGroupId() {
            return this.groupId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getGroupName() {
            return this.groupName;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSubTitle() {
            return this.subTitle;
        }

        @NotNull
        public final Group copy(String description, String groupIconUrl, String groupId, String groupName, String subTitle) {
            return new Group(description, groupIconUrl, groupId, groupName, subTitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Group)) {
                return false;
            }
            Group group = (Group) other;
            return Intrinsics.a(this.description, group.description) && Intrinsics.a(this.groupIconUrl, group.groupIconUrl) && Intrinsics.a(this.groupId, group.groupId) && Intrinsics.a(this.groupName, group.groupName) && Intrinsics.a(this.subTitle, group.subTitle);
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getGroupIconUrl() {
            return this.groupIconUrl;
        }

        public final String getGroupId() {
            return this.groupId;
        }

        public final String getGroupName() {
            return this.groupName;
        }

        public final String getSubTitle() {
            return this.subTitle;
        }

        public int hashCode() {
            String str = this.description;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.groupIconUrl;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.groupId;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.groupName;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.subTitle;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.description;
            String str2 = this.groupIconUrl;
            String str3 = this.groupId;
            String str4 = this.groupName;
            String str5 = this.subTitle;
            StringBuilder l10 = e.l("Group(description=", str, ", groupIconUrl=", str2, ", groupId=");
            e.v(l10, str3, ", groupName=", str4, ", subTitle=");
            return d.o(l10, str5, ")");
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViews;", HttpUrl.FRAGMENT_ENCODE_SET, "hasTradeViews", HttpUrl.FRAGMENT_ENCODE_SET, "posts", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViews$Post;", "(Ljava/lang/Boolean;Ljava/util/List;)V", "getHasTradeViews", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPosts", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/util/List;)Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViews;", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "Post", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class TradeViews {
        public static final int $stable = 8;

        @SerializedName("has_trade_views")
        private final Boolean hasTradeViews;

        @SerializedName("posts")
        private final List<Post> posts;

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViews$Post;", HttpUrl.FRAGMENT_ENCODE_SET, "groupId", HttpUrl.FRAGMENT_ENCODE_SET, "postId", "tradeContent", "Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeContent;", "(Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeContent;)V", "getGroupId", "()Ljava/lang/String;", "getPostId", "getTradeContent", "()Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeContent;", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "getTradeViews", "Lcom/assetgro/stockgro/ui/home/homepage/data/HomeSocialTradeViewDto$TradeViewElement;", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final /* data */ class Post {
            public static final int $stable = 8;

            @SerializedName("group_id")
            private final String groupId;

            @SerializedName("post_id")
            private final String postId;

            @SerializedName("trade_content")
            private final HomeSocialTradeViewDto.TradeContent tradeContent;

            public Post(String str, String str2, HomeSocialTradeViewDto.TradeContent tradeContent) {
                this.groupId = str;
                this.postId = str2;
                this.tradeContent = tradeContent;
            }

            public static /* synthetic */ Post copy$default(Post post, String str, String str2, HomeSocialTradeViewDto.TradeContent tradeContent, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = post.groupId;
                }
                if ((i10 & 2) != 0) {
                    str2 = post.postId;
                }
                if ((i10 & 4) != 0) {
                    tradeContent = post.tradeContent;
                }
                return post.copy(str, str2, tradeContent);
            }

            /* renamed from: component1, reason: from getter */
            public final String getGroupId() {
                return this.groupId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getPostId() {
                return this.postId;
            }

            /* renamed from: component3, reason: from getter */
            public final HomeSocialTradeViewDto.TradeContent getTradeContent() {
                return this.tradeContent;
            }

            @NotNull
            public final Post copy(String groupId, String postId, HomeSocialTradeViewDto.TradeContent tradeContent) {
                return new Post(groupId, postId, tradeContent);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Post)) {
                    return false;
                }
                Post post = (Post) other;
                return Intrinsics.a(this.groupId, post.groupId) && Intrinsics.a(this.postId, post.postId) && Intrinsics.a(this.tradeContent, post.tradeContent);
            }

            public final String getGroupId() {
                return this.groupId;
            }

            public final String getPostId() {
                return this.postId;
            }

            public final HomeSocialTradeViewDto.TradeContent getTradeContent() {
                return this.tradeContent;
            }

            @NotNull
            public final HomeSocialTradeViewDto.TradeViewElement getTradeViews() {
                return new HomeSocialTradeViewDto.TradeViewElement(null, this.tradeContent, null, this.groupId, this.postId);
            }

            public int hashCode() {
                String str = this.groupId;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.postId;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                HomeSocialTradeViewDto.TradeContent tradeContent = this.tradeContent;
                return hashCode2 + (tradeContent != null ? tradeContent.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.groupId;
                String str2 = this.postId;
                HomeSocialTradeViewDto.TradeContent tradeContent = this.tradeContent;
                StringBuilder l10 = e.l("Post(groupId=", str, ", postId=", str2, ", tradeContent=");
                l10.append(tradeContent);
                l10.append(")");
                return l10.toString();
            }
        }

        public TradeViews(Boolean bool, List<Post> list) {
            this.hasTradeViews = bool;
            this.posts = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TradeViews copy$default(TradeViews tradeViews, Boolean bool, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = tradeViews.hasTradeViews;
            }
            if ((i10 & 2) != 0) {
                list = tradeViews.posts;
            }
            return tradeViews.copy(bool, list);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getHasTradeViews() {
            return this.hasTradeViews;
        }

        public final List<Post> component2() {
            return this.posts;
        }

        @NotNull
        public final TradeViews copy(Boolean hasTradeViews, List<Post> posts) {
            return new TradeViews(hasTradeViews, posts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TradeViews)) {
                return false;
            }
            TradeViews tradeViews = (TradeViews) other;
            return Intrinsics.a(this.hasTradeViews, tradeViews.hasTradeViews) && Intrinsics.a(this.posts, tradeViews.posts);
        }

        public final Boolean getHasTradeViews() {
            return this.hasTradeViews;
        }

        public final List<Post> getPosts() {
            return this.posts;
        }

        public int hashCode() {
            Boolean bool = this.hasTradeViews;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            List<Post> list = this.posts;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TradeViews(hasTradeViews=" + this.hasTradeViews + ", posts=" + this.posts + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance;", HttpUrl.FRAGMENT_ENCODE_SET, PaymentConstants.Category.CONFIG, "Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance$Config;", "description", HttpUrl.FRAGMENT_ENCODE_SET, "isEmpty", HttpUrl.FRAGMENT_ENCODE_SET, "stocks", "Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance$Stocks;", "(Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance$Config;Ljava/lang/String;ZLcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance$Stocks;)V", "getConfig", "()Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance$Config;", "getDescription", "()Ljava/lang/String;", "()Z", "getStocks", "()Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance$Stocks;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "Config", "Stocks", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class TradeViewsPerformance {
        public static final int $stable = 8;

        @SerializedName(PaymentConstants.Category.CONFIG)
        private final Config config;

        @SerializedName("description")
        private final String description;

        @SerializedName("is_empty")
        private final boolean isEmpty;

        @SerializedName("stocks")
        private final Stocks stocks;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance$Config;", HttpUrl.FRAGMENT_ENCODE_SET, "hitRateDescription", HttpUrl.FRAGMENT_ENCODE_SET, "missedTradesTitle", "profitHitTitle", "totalTradesTitle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHitRateDescription", "()Ljava/lang/String;", "getMissedTradesTitle", "getProfitHitTitle", "getTotalTradesTitle", "component1", "component2", "component3", "component4", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final /* data */ class Config {
            public static final int $stable = 0;

            @SerializedName("hit_rate_description")
            private final String hitRateDescription;

            @SerializedName("missed_trades_title")
            private final String missedTradesTitle;

            @SerializedName("profit_hit_title")
            private final String profitHitTitle;

            @SerializedName("total_trades_title")
            private final String totalTradesTitle;

            public Config(String str, String str2, String str3, String str4) {
                this.hitRateDescription = str;
                this.missedTradesTitle = str2;
                this.profitHitTitle = str3;
                this.totalTradesTitle = str4;
            }

            public static /* synthetic */ Config copy$default(Config config, String str, String str2, String str3, String str4, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = config.hitRateDescription;
                }
                if ((i10 & 2) != 0) {
                    str2 = config.missedTradesTitle;
                }
                if ((i10 & 4) != 0) {
                    str3 = config.profitHitTitle;
                }
                if ((i10 & 8) != 0) {
                    str4 = config.totalTradesTitle;
                }
                return config.copy(str, str2, str3, str4);
            }

            /* renamed from: component1, reason: from getter */
            public final String getHitRateDescription() {
                return this.hitRateDescription;
            }

            /* renamed from: component2, reason: from getter */
            public final String getMissedTradesTitle() {
                return this.missedTradesTitle;
            }

            /* renamed from: component3, reason: from getter */
            public final String getProfitHitTitle() {
                return this.profitHitTitle;
            }

            /* renamed from: component4, reason: from getter */
            public final String getTotalTradesTitle() {
                return this.totalTradesTitle;
            }

            @NotNull
            public final Config copy(String hitRateDescription, String missedTradesTitle, String profitHitTitle, String totalTradesTitle) {
                return new Config(hitRateDescription, missedTradesTitle, profitHitTitle, totalTradesTitle);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Config)) {
                    return false;
                }
                Config config = (Config) other;
                return Intrinsics.a(this.hitRateDescription, config.hitRateDescription) && Intrinsics.a(this.missedTradesTitle, config.missedTradesTitle) && Intrinsics.a(this.profitHitTitle, config.profitHitTitle) && Intrinsics.a(this.totalTradesTitle, config.totalTradesTitle);
            }

            public final String getHitRateDescription() {
                return this.hitRateDescription;
            }

            public final String getMissedTradesTitle() {
                return this.missedTradesTitle;
            }

            public final String getProfitHitTitle() {
                return this.profitHitTitle;
            }

            public final String getTotalTradesTitle() {
                return this.totalTradesTitle;
            }

            public int hashCode() {
                String str = this.hitRateDescription;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.missedTradesTitle;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.profitHitTitle;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.totalTradesTitle;
                return hashCode3 + (str4 != null ? str4.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.hitRateDescription;
                String str2 = this.missedTradesTitle;
                return a.k(e.l("Config(hitRateDescription=", str, ", missedTradesTitle=", str2, ", profitHitTitle="), this.profitHitTitle, ", totalTradesTitle=", this.totalTradesTitle, ")");
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance$Stocks;", HttpUrl.FRAGMENT_ENCODE_SET, "analysis", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance$Stocks$Analysis;", "(Ljava/util/List;)V", "getAnalysis", "()Ljava/util/List;", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "Analysis", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final /* data */ class Stocks {
            public static final int $stable = 8;

            @SerializedName("analysis")
            private final List<Analysis> analysis;

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\t\u0010&\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015¨\u0006("}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance$Stocks$Analysis;", HttpUrl.FRAGMENT_ENCODE_SET, "hitRate", "Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance$Stocks$Analysis$HitRate;", "isEmpty", HttpUrl.FRAGMENT_ENCODE_SET, "liveTradeViews", HttpUrl.FRAGMENT_ENCODE_SET, "message", HttpUrl.FRAGMENT_ENCODE_SET, "missedTradeViews", "profitHit", "totalTradeViews", "tradeType", "(Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance$Stocks$Analysis$HitRate;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHitRate", "()Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance$Stocks$Analysis$HitRate;", "()Z", "getLiveTradeViews", "()I", "getMessage", "()Ljava/lang/String;", "getMissedTradeViews", "getProfitHit", "getTotalTradeViews", "getTradeType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "HitRate", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes.dex */
            public static final /* data */ class Analysis {
                public static final int $stable = 0;

                @SerializedName("hit_rate")
                @NotNull
                private final HitRate hitRate;

                @SerializedName("is_empty")
                private final boolean isEmpty;

                @SerializedName("live_trade_views")
                private final int liveTradeViews;

                @SerializedName("message")
                @NotNull
                private final String message;

                @SerializedName("missed_trade_views")
                @NotNull
                private final String missedTradeViews;

                @SerializedName("profit_hit")
                @NotNull
                private final String profitHit;

                @SerializedName("total_trade_views")
                @NotNull
                private final String totalTradeViews;

                @SerializedName("trade_type")
                @NotNull
                private final String tradeType;

                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance$Stocks$Analysis$HitRate;", HttpUrl.FRAGMENT_ENCODE_SET, "chartColor", "Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance$Stocks$Analysis$HitRate$ChartColor;", "iconUrl", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "(Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance$Stocks$Analysis$HitRate$ChartColor;Ljava/lang/String;D)V", "getChartColor", "()Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance$Stocks$Analysis$HitRate$ChartColor;", "getIconUrl", "()Ljava/lang/String;", "getValue", "()D", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "ChartColor", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* loaded from: classes.dex */
                public static final /* data */ class HitRate {
                    public static final int $stable = 0;

                    @SerializedName("chart_color")
                    private final ChartColor chartColor;

                    @SerializedName("icon_url")
                    @NotNull
                    private final String iconUrl;

                    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.VALUE)
                    private final double value;

                    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto$TradeViewsPerformance$Stocks$Analysis$HitRate$ChartColor;", HttpUrl.FRAGMENT_ENCODE_SET, "highlighted", HttpUrl.FRAGMENT_ENCODE_SET, "secondary", "(Ljava/lang/String;Ljava/lang/String;)V", "getHighlighted", "()Ljava/lang/String;", "getSecondary", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
                    /* loaded from: classes.dex */
                    public static final /* data */ class ChartColor {
                        public static final int $stable = 0;

                        @SerializedName("highlighted")
                        @NotNull
                        private final String highlighted;

                        @SerializedName("secondary")
                        @NotNull
                        private final String secondary;

                        public ChartColor(@NotNull String highlighted, @NotNull String secondary) {
                            Intrinsics.checkNotNullParameter(highlighted, "highlighted");
                            Intrinsics.checkNotNullParameter(secondary, "secondary");
                            this.highlighted = highlighted;
                            this.secondary = secondary;
                        }

                        public static /* synthetic */ ChartColor copy$default(ChartColor chartColor, String str, String str2, int i10, Object obj) {
                            if ((i10 & 1) != 0) {
                                str = chartColor.highlighted;
                            }
                            if ((i10 & 2) != 0) {
                                str2 = chartColor.secondary;
                            }
                            return chartColor.copy(str, str2);
                        }

                        @NotNull
                        /* renamed from: component1, reason: from getter */
                        public final String getHighlighted() {
                            return this.highlighted;
                        }

                        @NotNull
                        /* renamed from: component2, reason: from getter */
                        public final String getSecondary() {
                            return this.secondary;
                        }

                        @NotNull
                        public final ChartColor copy(@NotNull String highlighted, @NotNull String secondary) {
                            Intrinsics.checkNotNullParameter(highlighted, "highlighted");
                            Intrinsics.checkNotNullParameter(secondary, "secondary");
                            return new ChartColor(highlighted, secondary);
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            if (!(other instanceof ChartColor)) {
                                return false;
                            }
                            ChartColor chartColor = (ChartColor) other;
                            return Intrinsics.a(this.highlighted, chartColor.highlighted) && Intrinsics.a(this.secondary, chartColor.secondary);
                        }

                        @NotNull
                        public final String getHighlighted() {
                            return this.highlighted;
                        }

                        @NotNull
                        public final String getSecondary() {
                            return this.secondary;
                        }

                        public int hashCode() {
                            return this.secondary.hashCode() + (this.highlighted.hashCode() * 31);
                        }

                        @NotNull
                        public String toString() {
                            return h.s("ChartColor(highlighted=", this.highlighted, ", secondary=", this.secondary, ")");
                        }
                    }

                    public HitRate(ChartColor chartColor, @NotNull String iconUrl, double d10) {
                        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
                        this.chartColor = chartColor;
                        this.iconUrl = iconUrl;
                        this.value = d10;
                    }

                    public static /* synthetic */ HitRate copy$default(HitRate hitRate, ChartColor chartColor, String str, double d10, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            chartColor = hitRate.chartColor;
                        }
                        if ((i10 & 2) != 0) {
                            str = hitRate.iconUrl;
                        }
                        if ((i10 & 4) != 0) {
                            d10 = hitRate.value;
                        }
                        return hitRate.copy(chartColor, str, d10);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final ChartColor getChartColor() {
                        return this.chartColor;
                    }

                    @NotNull
                    /* renamed from: component2, reason: from getter */
                    public final String getIconUrl() {
                        return this.iconUrl;
                    }

                    /* renamed from: component3, reason: from getter */
                    public final double getValue() {
                        return this.value;
                    }

                    @NotNull
                    public final HitRate copy(ChartColor chartColor, @NotNull String iconUrl, double value) {
                        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
                        return new HitRate(chartColor, iconUrl, value);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof HitRate)) {
                            return false;
                        }
                        HitRate hitRate = (HitRate) other;
                        return Intrinsics.a(this.chartColor, hitRate.chartColor) && Intrinsics.a(this.iconUrl, hitRate.iconUrl) && Double.compare(this.value, hitRate.value) == 0;
                    }

                    public final ChartColor getChartColor() {
                        return this.chartColor;
                    }

                    @NotNull
                    public final String getIconUrl() {
                        return this.iconUrl;
                    }

                    public final double getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        int hashCode;
                        ChartColor chartColor = this.chartColor;
                        if (chartColor == null) {
                            hashCode = 0;
                        } else {
                            hashCode = chartColor.hashCode();
                        }
                        return Double.hashCode(this.value) + h.g(this.iconUrl, hashCode * 31, 31);
                    }

                    @NotNull
                    public String toString() {
                        return "HitRate(chartColor=" + this.chartColor + ", iconUrl=" + this.iconUrl + ", value=" + this.value + ")";
                    }
                }

                public Analysis(@NotNull HitRate hitRate, boolean z10, int i10, @NotNull String message, @NotNull String missedTradeViews, @NotNull String profitHit, @NotNull String totalTradeViews, @NotNull String tradeType) {
                    Intrinsics.checkNotNullParameter(hitRate, "hitRate");
                    Intrinsics.checkNotNullParameter(message, "message");
                    Intrinsics.checkNotNullParameter(missedTradeViews, "missedTradeViews");
                    Intrinsics.checkNotNullParameter(profitHit, "profitHit");
                    Intrinsics.checkNotNullParameter(totalTradeViews, "totalTradeViews");
                    Intrinsics.checkNotNullParameter(tradeType, "tradeType");
                    this.hitRate = hitRate;
                    this.isEmpty = z10;
                    this.liveTradeViews = i10;
                    this.message = message;
                    this.missedTradeViews = missedTradeViews;
                    this.profitHit = profitHit;
                    this.totalTradeViews = totalTradeViews;
                    this.tradeType = tradeType;
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final HitRate getHitRate() {
                    return this.hitRate;
                }

                /* renamed from: component2, reason: from getter */
                public final boolean getIsEmpty() {
                    return this.isEmpty;
                }

                /* renamed from: component3, reason: from getter */
                public final int getLiveTradeViews() {
                    return this.liveTradeViews;
                }

                @NotNull
                /* renamed from: component4, reason: from getter */
                public final String getMessage() {
                    return this.message;
                }

                @NotNull
                /* renamed from: component5, reason: from getter */
                public final String getMissedTradeViews() {
                    return this.missedTradeViews;
                }

                @NotNull
                /* renamed from: component6, reason: from getter */
                public final String getProfitHit() {
                    return this.profitHit;
                }

                @NotNull
                /* renamed from: component7, reason: from getter */
                public final String getTotalTradeViews() {
                    return this.totalTradeViews;
                }

                @NotNull
                /* renamed from: component8, reason: from getter */
                public final String getTradeType() {
                    return this.tradeType;
                }

                @NotNull
                public final Analysis copy(@NotNull HitRate hitRate, boolean isEmpty, int liveTradeViews, @NotNull String message, @NotNull String missedTradeViews, @NotNull String profitHit, @NotNull String totalTradeViews, @NotNull String tradeType) {
                    Intrinsics.checkNotNullParameter(hitRate, "hitRate");
                    Intrinsics.checkNotNullParameter(message, "message");
                    Intrinsics.checkNotNullParameter(missedTradeViews, "missedTradeViews");
                    Intrinsics.checkNotNullParameter(profitHit, "profitHit");
                    Intrinsics.checkNotNullParameter(totalTradeViews, "totalTradeViews");
                    Intrinsics.checkNotNullParameter(tradeType, "tradeType");
                    return new Analysis(hitRate, isEmpty, liveTradeViews, message, missedTradeViews, profitHit, totalTradeViews, tradeType);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Analysis)) {
                        return false;
                    }
                    Analysis analysis = (Analysis) other;
                    return Intrinsics.a(this.hitRate, analysis.hitRate) && this.isEmpty == analysis.isEmpty && this.liveTradeViews == analysis.liveTradeViews && Intrinsics.a(this.message, analysis.message) && Intrinsics.a(this.missedTradeViews, analysis.missedTradeViews) && Intrinsics.a(this.profitHit, analysis.profitHit) && Intrinsics.a(this.totalTradeViews, analysis.totalTradeViews) && Intrinsics.a(this.tradeType, analysis.tradeType);
                }

                @NotNull
                public final HitRate getHitRate() {
                    return this.hitRate;
                }

                public final int getLiveTradeViews() {
                    return this.liveTradeViews;
                }

                @NotNull
                public final String getMessage() {
                    return this.message;
                }

                @NotNull
                public final String getMissedTradeViews() {
                    return this.missedTradeViews;
                }

                @NotNull
                public final String getProfitHit() {
                    return this.profitHit;
                }

                @NotNull
                public final String getTotalTradeViews() {
                    return this.totalTradeViews;
                }

                @NotNull
                public final String getTradeType() {
                    return this.tradeType;
                }

                public int hashCode() {
                    return this.tradeType.hashCode() + h.g(this.totalTradeViews, h.g(this.profitHit, h.g(this.missedTradeViews, h.g(this.message, da.e.f(this.liveTradeViews, e.d(this.isEmpty, this.hitRate.hashCode() * 31, 31), 31), 31), 31), 31), 31);
                }

                public final boolean isEmpty() {
                    return this.isEmpty;
                }

                @NotNull
                public String toString() {
                    HitRate hitRate = this.hitRate;
                    boolean z10 = this.isEmpty;
                    int i10 = this.liveTradeViews;
                    String str = this.message;
                    String str2 = this.missedTradeViews;
                    String str3 = this.profitHit;
                    String str4 = this.totalTradeViews;
                    String str5 = this.tradeType;
                    StringBuilder sb2 = new StringBuilder("Analysis(hitRate=");
                    sb2.append(hitRate);
                    sb2.append(", isEmpty=");
                    sb2.append(z10);
                    sb2.append(", liveTradeViews=");
                    d.w(sb2, i10, ", message=", str, ", missedTradeViews=");
                    e.v(sb2, str2, ", profitHit=", str3, ", totalTradeViews=");
                    return a.k(sb2, str4, ", tradeType=", str5, ")");
                }
            }

            public Stocks(List<Analysis> list) {
                this.analysis = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Stocks copy$default(Stocks stocks, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = stocks.analysis;
                }
                return stocks.copy(list);
            }

            public final List<Analysis> component1() {
                return this.analysis;
            }

            @NotNull
            public final Stocks copy(List<Analysis> analysis) {
                return new Stocks(analysis);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Stocks) && Intrinsics.a(this.analysis, ((Stocks) other).analysis);
            }

            public final List<Analysis> getAnalysis() {
                return this.analysis;
            }

            public int hashCode() {
                List<Analysis> list = this.analysis;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            @NotNull
            public String toString() {
                return a.h("Stocks(analysis=", this.analysis, ")");
            }
        }

        public TradeViewsPerformance(Config config, String str, boolean z10, Stocks stocks) {
            this.config = config;
            this.description = str;
            this.isEmpty = z10;
            this.stocks = stocks;
        }

        public static /* synthetic */ TradeViewsPerformance copy$default(TradeViewsPerformance tradeViewsPerformance, Config config, String str, boolean z10, Stocks stocks, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                config = tradeViewsPerformance.config;
            }
            if ((i10 & 2) != 0) {
                str = tradeViewsPerformance.description;
            }
            if ((i10 & 4) != 0) {
                z10 = tradeViewsPerformance.isEmpty;
            }
            if ((i10 & 8) != 0) {
                stocks = tradeViewsPerformance.stocks;
            }
            return tradeViewsPerformance.copy(config, str, z10, stocks);
        }

        /* renamed from: component1, reason: from getter */
        public final Config getConfig() {
            return this.config;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsEmpty() {
            return this.isEmpty;
        }

        /* renamed from: component4, reason: from getter */
        public final Stocks getStocks() {
            return this.stocks;
        }

        @NotNull
        public final TradeViewsPerformance copy(Config config, String description, boolean isEmpty, Stocks stocks) {
            return new TradeViewsPerformance(config, description, isEmpty, stocks);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TradeViewsPerformance)) {
                return false;
            }
            TradeViewsPerformance tradeViewsPerformance = (TradeViewsPerformance) other;
            return Intrinsics.a(this.config, tradeViewsPerformance.config) && Intrinsics.a(this.description, tradeViewsPerformance.description) && this.isEmpty == tradeViewsPerformance.isEmpty && Intrinsics.a(this.stocks, tradeViewsPerformance.stocks);
        }

        public final Config getConfig() {
            return this.config;
        }

        public final String getDescription() {
            return this.description;
        }

        public final Stocks getStocks() {
            return this.stocks;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            Config config = this.config;
            int i10 = 0;
            if (config == null) {
                hashCode = 0;
            } else {
                hashCode = config.hashCode();
            }
            int i11 = hashCode * 31;
            String str = this.description;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int d10 = e.d(this.isEmpty, (i11 + hashCode2) * 31, 31);
            Stocks stocks = this.stocks;
            if (stocks != null) {
                i10 = stocks.hashCode();
            }
            return d10 + i10;
        }

        public final boolean isEmpty() {
            return this.isEmpty;
        }

        @NotNull
        public String toString() {
            return "TradeViewsPerformance(config=" + this.config + ", description=" + this.description + ", isEmpty=" + this.isEmpty + ", stocks=" + this.stocks + ")";
        }
    }

    public RiaProfileResponseDto(ExpertMeta expertMeta, boolean z10, @NotNull UserBlockStatusDao blockStatus, List<Group> list, FeedStreamDto feedStreamDto, TradeViews tradeViews, TradeViewsPerformance tradeViewsPerformance) {
        Intrinsics.checkNotNullParameter(blockStatus, "blockStatus");
        this.expertMeta = expertMeta;
        this.isBlocked = z10;
        this.blockStatus = blockStatus;
        this.groups = list;
        this.posts = feedStreamDto;
        this.tradeViews = tradeViews;
        this.tradeViewsPerformance = tradeViewsPerformance;
    }

    public static /* synthetic */ RiaProfileResponseDto copy$default(RiaProfileResponseDto riaProfileResponseDto, ExpertMeta expertMeta, boolean z10, UserBlockStatusDao userBlockStatusDao, List list, FeedStreamDto feedStreamDto, TradeViews tradeViews, TradeViewsPerformance tradeViewsPerformance, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            expertMeta = riaProfileResponseDto.expertMeta;
        }
        if ((i10 & 2) != 0) {
            z10 = riaProfileResponseDto.isBlocked;
        }
        boolean z11 = z10;
        if ((i10 & 4) != 0) {
            userBlockStatusDao = riaProfileResponseDto.blockStatus;
        }
        UserBlockStatusDao userBlockStatusDao2 = userBlockStatusDao;
        if ((i10 & 8) != 0) {
            list = riaProfileResponseDto.groups;
        }
        List list2 = list;
        if ((i10 & 16) != 0) {
            feedStreamDto = riaProfileResponseDto.posts;
        }
        FeedStreamDto feedStreamDto2 = feedStreamDto;
        if ((i10 & 32) != 0) {
            tradeViews = riaProfileResponseDto.tradeViews;
        }
        TradeViews tradeViews2 = tradeViews;
        if ((i10 & 64) != 0) {
            tradeViewsPerformance = riaProfileResponseDto.tradeViewsPerformance;
        }
        return riaProfileResponseDto.copy(expertMeta, z11, userBlockStatusDao2, list2, feedStreamDto2, tradeViews2, tradeViewsPerformance);
    }

    /* renamed from: component1, reason: from getter */
    public final ExpertMeta getExpertMeta() {
        return this.expertMeta;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsBlocked() {
        return this.isBlocked;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final UserBlockStatusDao getBlockStatus() {
        return this.blockStatus;
    }

    public final List<Group> component4() {
        return this.groups;
    }

    /* renamed from: component5, reason: from getter */
    public final FeedStreamDto getPosts() {
        return this.posts;
    }

    /* renamed from: component6, reason: from getter */
    public final TradeViews getTradeViews() {
        return this.tradeViews;
    }

    /* renamed from: component7, reason: from getter */
    public final TradeViewsPerformance getTradeViewsPerformance() {
        return this.tradeViewsPerformance;
    }

    @NotNull
    public final RiaProfileResponseDto copy(ExpertMeta expertMeta, boolean isBlocked, @NotNull UserBlockStatusDao blockStatus, List<Group> groups, FeedStreamDto posts, TradeViews tradeViews, TradeViewsPerformance tradeViewsPerformance) {
        Intrinsics.checkNotNullParameter(blockStatus, "blockStatus");
        return new RiaProfileResponseDto(expertMeta, isBlocked, blockStatus, groups, posts, tradeViews, tradeViewsPerformance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RiaProfileResponseDto)) {
            return false;
        }
        RiaProfileResponseDto riaProfileResponseDto = (RiaProfileResponseDto) other;
        return Intrinsics.a(this.expertMeta, riaProfileResponseDto.expertMeta) && this.isBlocked == riaProfileResponseDto.isBlocked && Intrinsics.a(this.blockStatus, riaProfileResponseDto.blockStatus) && Intrinsics.a(this.groups, riaProfileResponseDto.groups) && Intrinsics.a(this.posts, riaProfileResponseDto.posts) && Intrinsics.a(this.tradeViews, riaProfileResponseDto.tradeViews) && Intrinsics.a(this.tradeViewsPerformance, riaProfileResponseDto.tradeViewsPerformance);
    }

    @NotNull
    public final UserBlockStatusDao getBlockStatus() {
        return this.blockStatus;
    }

    public final ExpertMeta getExpertMeta() {
        return this.expertMeta;
    }

    public final List<Group> getGroups() {
        return this.groups;
    }

    public final FeedStreamDto getPosts() {
        return this.posts;
    }

    public final TradeViews getTradeViews() {
        return this.tradeViews;
    }

    public final TradeViewsPerformance getTradeViewsPerformance() {
        return this.tradeViewsPerformance;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        ExpertMeta expertMeta = this.expertMeta;
        int i10 = 0;
        if (expertMeta == null) {
            hashCode = 0;
        } else {
            hashCode = expertMeta.hashCode();
        }
        int hashCode5 = (this.blockStatus.hashCode() + e.d(this.isBlocked, hashCode * 31, 31)) * 31;
        List<Group> list = this.groups;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i11 = (hashCode5 + hashCode2) * 31;
        FeedStreamDto feedStreamDto = this.posts;
        if (feedStreamDto == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = feedStreamDto.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        TradeViews tradeViews = this.tradeViews;
        if (tradeViews == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = tradeViews.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        TradeViewsPerformance tradeViewsPerformance = this.tradeViewsPerformance;
        if (tradeViewsPerformance != null) {
            i10 = tradeViewsPerformance.hashCode();
        }
        return i13 + i10;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    @NotNull
    public String toString() {
        return "RiaProfileResponseDto(expertMeta=" + this.expertMeta + ", isBlocked=" + this.isBlocked + ", blockStatus=" + this.blockStatus + ", groups=" + this.groups + ", posts=" + this.posts + ", tradeViews=" + this.tradeViews + ", tradeViewsPerformance=" + this.tradeViewsPerformance + ")";
    }
}
