package com.assetgro.stockgro.feature_social.data.remote.feed.stream;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.analytics.LogConstants;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003+,-BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006."}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto;", "Landroid/os/Parcelable;", "postId", HttpUrl.FRAGMENT_ENCODE_SET, "publishedOn", "expiredAt", "header", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$HeaderDto;", "body", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto;", "footer", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$HeaderDto;Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto;Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto;)V", "getBody", "()Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto;", "getExpiredAt", "()Ljava/lang/String;", "getFooter", "()Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto;", "getHeader", "()Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$HeaderDto;", "getPostId", "getPublishedOn", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "BodyDto", "FooterDto", "HeaderDto", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FeedPostDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<FeedPostDto> CREATOR = new Creator();

    @SerializedName("body")
    private final BodyDto body;

    @SerializedName("expired_at")
    private final String expiredAt;

    @SerializedName("footer")
    private final FooterDto footer;

    @SerializedName("header")
    private final HeaderDto header;

    @SerializedName("post_id")
    private final String postId;

    @SerializedName("published_at")
    private final String publishedOn;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003JK\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006'"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto;", "Landroid/os/Parcelable;", "templateType", HttpUrl.FRAGMENT_ENCODE_SET, "heading", "description", "tradeContent", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto;", "tags", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto;Ljava/util/List;)V", "getDescription", "()Ljava/lang/String;", "getHeading", "getTags", "()Ljava/util/List;", "getTemplateType", "getTradeContent", "()Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "TradeContentDto", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class BodyDto implements Parcelable {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<BodyDto> CREATOR = new Creator();

        @SerializedName("description")
        private final String description;

        @SerializedName("heading")
        private final String heading;

        @SerializedName("tags")
        private final List<String> tags;

        @SerializedName("template_type")
        private final String templateType;

        @SerializedName("trade_content")
        private final TradeContentDto tradeContent;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<BodyDto> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final BodyDto createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BodyDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TradeContentDto.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final BodyDto[] newArray(int i10) {
                return new BodyDto[i10];
            }
        }

        @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0006789:;<Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r¢\u0006\u0002\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rHÆ\u0003Jz\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010)J\t\u0010*\u001a\u00020+HÖ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020+HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020+HÖ\u0001R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001b\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001e¨\u0006="}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto;", "Landroid/os/Parcelable;", "status", HttpUrl.FRAGMENT_ENCODE_SET, "stockMeta", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$StockMetaDto;", "entryPrice", HttpUrl.FRAGMENT_ENCODE_SET, "targetPrice", "tradeDirection", "progressBar", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ProgressBarDto;", "tradeSentiment", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$TradeSentimentDto;", "tradeMeta", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$TradeMetaDto;", "(Ljava/lang/String;Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$StockMetaDto;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ProgressBarDto;Ljava/util/List;Ljava/util/List;)V", "getEntryPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getProgressBar", "()Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ProgressBarDto;", "getStatus", "()Ljava/lang/String;", "getStockMeta", "()Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$StockMetaDto;", "getTargetPrice", "getTradeDirection", "getTradeMeta", "()Ljava/util/List;", "getTradeSentiment", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$StockMetaDto;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ProgressBarDto;Ljava/util/List;Ljava/util/List;)Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto;", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "ChangeDto", "ProgressBarDto", "StockMetaDto", "TradeDataDto", "TradeMetaDto", "TradeSentimentDto", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final /* data */ class TradeContentDto implements Parcelable {
            public static final int $stable = 8;

            @NotNull
            public static final Parcelable.Creator<TradeContentDto> CREATOR = new Creator();

            @SerializedName("entry_price")
            private final Double entryPrice;

            @SerializedName("progress_bar")
            private final ProgressBarDto progressBar;

            @SerializedName("status")
            private final String status;

            @SerializedName("stock_meta")
            private final StockMetaDto stockMeta;

            @SerializedName("target_price")
            private final Double targetPrice;

            @SerializedName("trade_direction")
            private final String tradeDirection;

            @SerializedName("trade_meta")
            private final List<TradeMetaDto> tradeMeta;

            @SerializedName("trade_sentiment")
            private final List<TradeSentimentDto> tradeSentiment;

            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\t¨\u0006 "}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ChangeDto;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "percentage", "type", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "getPercentage", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getType", "()Ljava/lang/String;", "getValue", "component1", "component2", "component3", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ChangeDto;", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes.dex */
            public static final /* data */ class ChangeDto implements Parcelable {
                public static final int $stable = 0;

                @NotNull
                public static final Parcelable.Creator<ChangeDto> CREATOR = new Creator();

                @SerializedName("percentage")
                private final Double percentage;

                @SerializedName("type")
                private final String type;

                @SerializedName(AppMeasurementSdk.ConditionalUserProperty.VALUE)
                private final Double value;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* loaded from: classes.dex */
                public static final class Creator implements Parcelable.Creator<ChangeDto> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final ChangeDto createFromParcel(@NotNull Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new ChangeDto(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final ChangeDto[] newArray(int i10) {
                        return new ChangeDto[i10];
                    }
                }

                public ChangeDto(Double d10, Double d11, String str) {
                    this.value = d10;
                    this.percentage = d11;
                    this.type = str;
                }

                public static /* synthetic */ ChangeDto copy$default(ChangeDto changeDto, Double d10, Double d11, String str, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        d10 = changeDto.value;
                    }
                    if ((i10 & 2) != 0) {
                        d11 = changeDto.percentage;
                    }
                    if ((i10 & 4) != 0) {
                        str = changeDto.type;
                    }
                    return changeDto.copy(d10, d11, str);
                }

                /* renamed from: component1, reason: from getter */
                public final Double getValue() {
                    return this.value;
                }

                /* renamed from: component2, reason: from getter */
                public final Double getPercentage() {
                    return this.percentage;
                }

                /* renamed from: component3, reason: from getter */
                public final String getType() {
                    return this.type;
                }

                @NotNull
                public final ChangeDto copy(Double value, Double percentage, String type) {
                    return new ChangeDto(value, percentage, type);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ChangeDto)) {
                        return false;
                    }
                    ChangeDto changeDto = (ChangeDto) other;
                    return Intrinsics.a(this.value, changeDto.value) && Intrinsics.a(this.percentage, changeDto.percentage) && Intrinsics.a(this.type, changeDto.type);
                }

                public final Double getPercentage() {
                    return this.percentage;
                }

                public final String getType() {
                    return this.type;
                }

                public final Double getValue() {
                    return this.value;
                }

                public int hashCode() {
                    Double d10 = this.value;
                    int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
                    Double d11 = this.percentage;
                    int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
                    String str = this.type;
                    return hashCode2 + (str != null ? str.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    Double d10 = this.value;
                    Double d11 = this.percentage;
                    String str = this.type;
                    StringBuilder sb2 = new StringBuilder("ChangeDto(value=");
                    sb2.append(d10);
                    sb2.append(", percentage=");
                    sb2.append(d11);
                    sb2.append(", type=");
                    return d.o(sb2, str, ")");
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@NotNull Parcel parcel, int flags) {
                    Intrinsics.checkNotNullParameter(parcel, "out");
                    Double d10 = this.value;
                    if (d10 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeDouble(d10.doubleValue());
                    }
                    Double d11 = this.percentage;
                    if (d11 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeDouble(d11.doubleValue());
                    }
                    parcel.writeString(this.type);
                }
            }

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes.dex */
            public static final class Creator implements Parcelable.Creator<TradeContentDto> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final TradeContentDto createFromParcel(@NotNull Parcel parcel) {
                    ArrayList arrayList;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    ArrayList arrayList2 = null;
                    StockMetaDto createFromParcel = parcel.readInt() == 0 ? null : StockMetaDto.CREATOR.createFromParcel(parcel);
                    Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
                    Double valueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
                    String readString2 = parcel.readString();
                    ProgressBarDto createFromParcel2 = parcel.readInt() == 0 ? null : ProgressBarDto.CREATOR.createFromParcel(parcel);
                    int i10 = 0;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int readInt = parcel.readInt();
                        arrayList = new ArrayList(readInt);
                        int i11 = 0;
                        while (i11 != readInt) {
                            i11 = h.e(TradeSentimentDto.CREATOR, parcel, arrayList, i11, 1);
                        }
                    }
                    if (parcel.readInt() != 0) {
                        int readInt2 = parcel.readInt();
                        arrayList2 = new ArrayList(readInt2);
                        while (i10 != readInt2) {
                            i10 = h.e(TradeMetaDto.CREATOR, parcel, arrayList2, i10, 1);
                        }
                    }
                    return new TradeContentDto(readString, createFromParcel, valueOf, valueOf2, readString2, createFromParcel2, arrayList, arrayList2);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final TradeContentDto[] newArray(int i10) {
                    return new TradeContentDto[i10];
                }
            }

            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0006\u0010\u000e¨\u0006#"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ProgressBarDto;", "Landroid/os/Parcelable;", "entryPosition", HttpUrl.FRAGMENT_ENCODE_SET, "indicatorPosition", "endPosition", "isNegativeTrade", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;)V", "getEndPosition", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getEntryPosition", "getIndicatorPosition", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;)Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ProgressBarDto;", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes.dex */
            public static final /* data */ class ProgressBarDto implements Parcelable {
                public static final int $stable = 0;

                @NotNull
                public static final Parcelable.Creator<ProgressBarDto> CREATOR = new Creator();

                @SerializedName("target_position")
                private final Float endPosition;

                @SerializedName("entry_position")
                private final Float entryPosition;

                @SerializedName("indicator_position")
                private final Float indicatorPosition;

                @SerializedName("is_negative_trade")
                private final Boolean isNegativeTrade;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* loaded from: classes.dex */
                public static final class Creator implements Parcelable.Creator<ProgressBarDto> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final ProgressBarDto createFromParcel(@NotNull Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        Boolean bool = null;
                        Float valueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                        Float valueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                        Float valueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                        if (parcel.readInt() != 0) {
                            bool = Boolean.valueOf(parcel.readInt() != 0);
                        }
                        return new ProgressBarDto(valueOf, valueOf2, valueOf3, bool);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final ProgressBarDto[] newArray(int i10) {
                        return new ProgressBarDto[i10];
                    }
                }

                public ProgressBarDto(Float f10, Float f11, Float f12, Boolean bool) {
                    this.entryPosition = f10;
                    this.indicatorPosition = f11;
                    this.endPosition = f12;
                    this.isNegativeTrade = bool;
                }

                public static /* synthetic */ ProgressBarDto copy$default(ProgressBarDto progressBarDto, Float f10, Float f11, Float f12, Boolean bool, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        f10 = progressBarDto.entryPosition;
                    }
                    if ((i10 & 2) != 0) {
                        f11 = progressBarDto.indicatorPosition;
                    }
                    if ((i10 & 4) != 0) {
                        f12 = progressBarDto.endPosition;
                    }
                    if ((i10 & 8) != 0) {
                        bool = progressBarDto.isNegativeTrade;
                    }
                    return progressBarDto.copy(f10, f11, f12, bool);
                }

                /* renamed from: component1, reason: from getter */
                public final Float getEntryPosition() {
                    return this.entryPosition;
                }

                /* renamed from: component2, reason: from getter */
                public final Float getIndicatorPosition() {
                    return this.indicatorPosition;
                }

                /* renamed from: component3, reason: from getter */
                public final Float getEndPosition() {
                    return this.endPosition;
                }

                /* renamed from: component4, reason: from getter */
                public final Boolean getIsNegativeTrade() {
                    return this.isNegativeTrade;
                }

                @NotNull
                public final ProgressBarDto copy(Float entryPosition, Float indicatorPosition, Float endPosition, Boolean isNegativeTrade) {
                    return new ProgressBarDto(entryPosition, indicatorPosition, endPosition, isNegativeTrade);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ProgressBarDto)) {
                        return false;
                    }
                    ProgressBarDto progressBarDto = (ProgressBarDto) other;
                    return Intrinsics.a(this.entryPosition, progressBarDto.entryPosition) && Intrinsics.a(this.indicatorPosition, progressBarDto.indicatorPosition) && Intrinsics.a(this.endPosition, progressBarDto.endPosition) && Intrinsics.a(this.isNegativeTrade, progressBarDto.isNegativeTrade);
                }

                public final Float getEndPosition() {
                    return this.endPosition;
                }

                public final Float getEntryPosition() {
                    return this.entryPosition;
                }

                public final Float getIndicatorPosition() {
                    return this.indicatorPosition;
                }

                public int hashCode() {
                    Float f10 = this.entryPosition;
                    int hashCode = (f10 == null ? 0 : f10.hashCode()) * 31;
                    Float f11 = this.indicatorPosition;
                    int hashCode2 = (hashCode + (f11 == null ? 0 : f11.hashCode())) * 31;
                    Float f12 = this.endPosition;
                    int hashCode3 = (hashCode2 + (f12 == null ? 0 : f12.hashCode())) * 31;
                    Boolean bool = this.isNegativeTrade;
                    return hashCode3 + (bool != null ? bool.hashCode() : 0);
                }

                public final Boolean isNegativeTrade() {
                    return this.isNegativeTrade;
                }

                @NotNull
                public String toString() {
                    return "ProgressBarDto(entryPosition=" + this.entryPosition + ", indicatorPosition=" + this.indicatorPosition + ", endPosition=" + this.endPosition + ", isNegativeTrade=" + this.isNegativeTrade + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@NotNull Parcel parcel, int flags) {
                    Intrinsics.checkNotNullParameter(parcel, "out");
                    Float f10 = this.entryPosition;
                    if (f10 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeFloat(f10.floatValue());
                    }
                    Float f11 = this.indicatorPosition;
                    if (f11 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeFloat(f11.floatValue());
                    }
                    Float f12 = this.endPosition;
                    if (f12 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeFloat(f12.floatValue());
                    }
                    Boolean bool = this.isNegativeTrade;
                    if (bool == null) {
                        parcel.writeInt(0);
                    } else {
                        a.q(parcel, 1, bool);
                    }
                }
            }

            @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\\\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006."}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$StockMetaDto;", "Landroid/os/Parcelable;", "identifier", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.NAME, "imageUrl", "lastTradePrice", HttpUrl.FRAGMENT_ENCODE_SET, "change", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ChangeDto;", "tradeData", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$TradeDataDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ChangeDto;Ljava/util/List;)V", "getChange", "()Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ChangeDto;", "getIdentifier", "()Ljava/lang/String;", "getImageUrl", "getLastTradePrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getName", "getTradeData", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ChangeDto;Ljava/util/List;)Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$StockMetaDto;", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes.dex */
            public static final /* data */ class StockMetaDto implements Parcelable {
                public static final int $stable = 8;

                @NotNull
                public static final Parcelable.Creator<StockMetaDto> CREATOR = new Creator();

                @SerializedName("market_price_change")
                private final ChangeDto change;

                @SerializedName("identifier")
                private final String identifier;

                @SerializedName("image_url")
                private final String imageUrl;

                @SerializedName("last_traded_price")
                private final Double lastTradePrice;

                @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
                private final String name;

                @SerializedName("trade_ticks")
                private final List<TradeDataDto> tradeData;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* loaded from: classes.dex */
                public static final class Creator implements Parcelable.Creator<StockMetaDto> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final StockMetaDto createFromParcel(@NotNull Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        String readString3 = parcel.readString();
                        ArrayList arrayList = null;
                        Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
                        ChangeDto createFromParcel = parcel.readInt() == 0 ? null : ChangeDto.CREATOR.createFromParcel(parcel);
                        if (parcel.readInt() != 0) {
                            int readInt = parcel.readInt();
                            arrayList = new ArrayList(readInt);
                            int i10 = 0;
                            while (i10 != readInt) {
                                i10 = h.e(TradeDataDto.CREATOR, parcel, arrayList, i10, 1);
                            }
                        }
                        return new StockMetaDto(readString, readString2, readString3, valueOf, createFromParcel, arrayList);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final StockMetaDto[] newArray(int i10) {
                        return new StockMetaDto[i10];
                    }
                }

                public StockMetaDto(String str, String str2, String str3, Double d10, ChangeDto changeDto, List<TradeDataDto> list) {
                    this.identifier = str;
                    this.name = str2;
                    this.imageUrl = str3;
                    this.lastTradePrice = d10;
                    this.change = changeDto;
                    this.tradeData = list;
                }

                public static /* synthetic */ StockMetaDto copy$default(StockMetaDto stockMetaDto, String str, String str2, String str3, Double d10, ChangeDto changeDto, List list, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = stockMetaDto.identifier;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = stockMetaDto.name;
                    }
                    String str4 = str2;
                    if ((i10 & 4) != 0) {
                        str3 = stockMetaDto.imageUrl;
                    }
                    String str5 = str3;
                    if ((i10 & 8) != 0) {
                        d10 = stockMetaDto.lastTradePrice;
                    }
                    Double d11 = d10;
                    if ((i10 & 16) != 0) {
                        changeDto = stockMetaDto.change;
                    }
                    ChangeDto changeDto2 = changeDto;
                    if ((i10 & 32) != 0) {
                        list = stockMetaDto.tradeData;
                    }
                    return stockMetaDto.copy(str, str4, str5, d11, changeDto2, list);
                }

                /* renamed from: component1, reason: from getter */
                public final String getIdentifier() {
                    return this.identifier;
                }

                /* renamed from: component2, reason: from getter */
                public final String getName() {
                    return this.name;
                }

                /* renamed from: component3, reason: from getter */
                public final String getImageUrl() {
                    return this.imageUrl;
                }

                /* renamed from: component4, reason: from getter */
                public final Double getLastTradePrice() {
                    return this.lastTradePrice;
                }

                /* renamed from: component5, reason: from getter */
                public final ChangeDto getChange() {
                    return this.change;
                }

                public final List<TradeDataDto> component6() {
                    return this.tradeData;
                }

                @NotNull
                public final StockMetaDto copy(String identifier, String name, String imageUrl, Double lastTradePrice, ChangeDto change, List<TradeDataDto> tradeData) {
                    return new StockMetaDto(identifier, name, imageUrl, lastTradePrice, change, tradeData);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof StockMetaDto)) {
                        return false;
                    }
                    StockMetaDto stockMetaDto = (StockMetaDto) other;
                    return Intrinsics.a(this.identifier, stockMetaDto.identifier) && Intrinsics.a(this.name, stockMetaDto.name) && Intrinsics.a(this.imageUrl, stockMetaDto.imageUrl) && Intrinsics.a(this.lastTradePrice, stockMetaDto.lastTradePrice) && Intrinsics.a(this.change, stockMetaDto.change) && Intrinsics.a(this.tradeData, stockMetaDto.tradeData);
                }

                public final ChangeDto getChange() {
                    return this.change;
                }

                public final String getIdentifier() {
                    return this.identifier;
                }

                public final String getImageUrl() {
                    return this.imageUrl;
                }

                public final Double getLastTradePrice() {
                    return this.lastTradePrice;
                }

                public final String getName() {
                    return this.name;
                }

                public final List<TradeDataDto> getTradeData() {
                    return this.tradeData;
                }

                public int hashCode() {
                    String str = this.identifier;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.name;
                    int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.imageUrl;
                    int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    Double d10 = this.lastTradePrice;
                    int hashCode4 = (hashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
                    ChangeDto changeDto = this.change;
                    int hashCode5 = (hashCode4 + (changeDto == null ? 0 : changeDto.hashCode())) * 31;
                    List<TradeDataDto> list = this.tradeData;
                    return hashCode5 + (list != null ? list.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.identifier;
                    String str2 = this.name;
                    String str3 = this.imageUrl;
                    Double d10 = this.lastTradePrice;
                    ChangeDto changeDto = this.change;
                    List<TradeDataDto> list = this.tradeData;
                    StringBuilder l10 = e.l("StockMetaDto(identifier=", str, ", name=", str2, ", imageUrl=");
                    l10.append(str3);
                    l10.append(", lastTradePrice=");
                    l10.append(d10);
                    l10.append(", change=");
                    l10.append(changeDto);
                    l10.append(", tradeData=");
                    l10.append(list);
                    l10.append(")");
                    return l10.toString();
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@NotNull Parcel parcel, int flags) {
                    Intrinsics.checkNotNullParameter(parcel, "out");
                    parcel.writeString(this.identifier);
                    parcel.writeString(this.name);
                    parcel.writeString(this.imageUrl);
                    Double d10 = this.lastTradePrice;
                    if (d10 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeDouble(d10.doubleValue());
                    }
                    ChangeDto changeDto = this.change;
                    if (changeDto == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        changeDto.writeToParcel(parcel, flags);
                    }
                    List<TradeDataDto> list = this.tradeData;
                    if (list == null) {
                        parcel.writeInt(0);
                        return;
                    }
                    Iterator o10 = a.o(parcel, 1, list);
                    while (o10.hasNext()) {
                        ((TradeDataDto) o10.next()).writeToParcel(parcel, flags);
                    }
                }
            }

            @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$TradeDataDto;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, PaymentConstants.TIMESTAMP, HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Double;Ljava/lang/Long;)V", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getValue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Long;)Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$TradeDataDto;", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes.dex */
            public static final /* data */ class TradeDataDto implements Parcelable {
                public static final int $stable = 0;

                @NotNull
                public static final Parcelable.Creator<TradeDataDto> CREATOR = new Creator();

                @SerializedName("ts")
                private final Long timestamp;

                @SerializedName("val")
                private final Double value;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* loaded from: classes.dex */
                public static final class Creator implements Parcelable.Creator<TradeDataDto> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final TradeDataDto createFromParcel(@NotNull Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new TradeDataDto(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final TradeDataDto[] newArray(int i10) {
                        return new TradeDataDto[i10];
                    }
                }

                public TradeDataDto(Double d10, Long l10) {
                    this.value = d10;
                    this.timestamp = l10;
                }

                public static /* synthetic */ TradeDataDto copy$default(TradeDataDto tradeDataDto, Double d10, Long l10, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        d10 = tradeDataDto.value;
                    }
                    if ((i10 & 2) != 0) {
                        l10 = tradeDataDto.timestamp;
                    }
                    return tradeDataDto.copy(d10, l10);
                }

                /* renamed from: component1, reason: from getter */
                public final Double getValue() {
                    return this.value;
                }

                /* renamed from: component2, reason: from getter */
                public final Long getTimestamp() {
                    return this.timestamp;
                }

                @NotNull
                public final TradeDataDto copy(Double value, Long timestamp) {
                    return new TradeDataDto(value, timestamp);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TradeDataDto)) {
                        return false;
                    }
                    TradeDataDto tradeDataDto = (TradeDataDto) other;
                    return Intrinsics.a(this.value, tradeDataDto.value) && Intrinsics.a(this.timestamp, tradeDataDto.timestamp);
                }

                public final Long getTimestamp() {
                    return this.timestamp;
                }

                public final Double getValue() {
                    return this.value;
                }

                public int hashCode() {
                    Double d10 = this.value;
                    int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
                    Long l10 = this.timestamp;
                    return hashCode + (l10 != null ? l10.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "TradeDataDto(value=" + this.value + ", timestamp=" + this.timestamp + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@NotNull Parcel parcel, int flags) {
                    Intrinsics.checkNotNullParameter(parcel, "out");
                    Double d10 = this.value;
                    if (d10 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeDouble(d10.doubleValue());
                    }
                    Long l10 = this.timestamp;
                    if (l10 == null) {
                        parcel.writeInt(0);
                    } else {
                        a.r(parcel, 1, l10);
                    }
                }
            }

            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006!"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$TradeMetaDto;", "Landroid/os/Parcelable;", "type", HttpUrl.FRAGMENT_ENCODE_SET, "title", "description", "change", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ChangeDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ChangeDto;)V", "getChange", "()Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$ChangeDto;", "getDescription", "()Ljava/lang/String;", "getTitle", "getType", "component1", "component2", "component3", "component4", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes.dex */
            public static final /* data */ class TradeMetaDto implements Parcelable {
                public static final int $stable = 0;

                @NotNull
                public static final Parcelable.Creator<TradeMetaDto> CREATOR = new Creator();

                @SerializedName("trade_call_change_meta")
                private final ChangeDto change;

                @SerializedName("description")
                private final String description;

                @SerializedName(AppMeasurementSdk.ConditionalUserProperty.VALUE)
                private final String title;

                @SerializedName("type")
                private final String type;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* loaded from: classes.dex */
                public static final class Creator implements Parcelable.Creator<TradeMetaDto> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final TradeMetaDto createFromParcel(@NotNull Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new TradeMetaDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ChangeDto.CREATOR.createFromParcel(parcel));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final TradeMetaDto[] newArray(int i10) {
                        return new TradeMetaDto[i10];
                    }
                }

                public TradeMetaDto(String str, String str2, String str3, ChangeDto changeDto) {
                    this.type = str;
                    this.title = str2;
                    this.description = str3;
                    this.change = changeDto;
                }

                public static /* synthetic */ TradeMetaDto copy$default(TradeMetaDto tradeMetaDto, String str, String str2, String str3, ChangeDto changeDto, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = tradeMetaDto.type;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = tradeMetaDto.title;
                    }
                    if ((i10 & 4) != 0) {
                        str3 = tradeMetaDto.description;
                    }
                    if ((i10 & 8) != 0) {
                        changeDto = tradeMetaDto.change;
                    }
                    return tradeMetaDto.copy(str, str2, str3, changeDto);
                }

                /* renamed from: component1, reason: from getter */
                public final String getType() {
                    return this.type;
                }

                /* renamed from: component2, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component3, reason: from getter */
                public final String getDescription() {
                    return this.description;
                }

                /* renamed from: component4, reason: from getter */
                public final ChangeDto getChange() {
                    return this.change;
                }

                @NotNull
                public final TradeMetaDto copy(String type, String title, String description, ChangeDto change) {
                    return new TradeMetaDto(type, title, description, change);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TradeMetaDto)) {
                        return false;
                    }
                    TradeMetaDto tradeMetaDto = (TradeMetaDto) other;
                    return Intrinsics.a(this.type, tradeMetaDto.type) && Intrinsics.a(this.title, tradeMetaDto.title) && Intrinsics.a(this.description, tradeMetaDto.description) && Intrinsics.a(this.change, tradeMetaDto.change);
                }

                public final ChangeDto getChange() {
                    return this.change;
                }

                public final String getDescription() {
                    return this.description;
                }

                public final String getTitle() {
                    return this.title;
                }

                public final String getType() {
                    return this.type;
                }

                public int hashCode() {
                    String str = this.type;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.title;
                    int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.description;
                    int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    ChangeDto changeDto = this.change;
                    return hashCode3 + (changeDto != null ? changeDto.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.type;
                    String str2 = this.title;
                    String str3 = this.description;
                    ChangeDto changeDto = this.change;
                    StringBuilder l10 = e.l("TradeMetaDto(type=", str, ", title=", str2, ", description=");
                    l10.append(str3);
                    l10.append(", change=");
                    l10.append(changeDto);
                    l10.append(")");
                    return l10.toString();
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@NotNull Parcel parcel, int flags) {
                    Intrinsics.checkNotNullParameter(parcel, "out");
                    parcel.writeString(this.type);
                    parcel.writeString(this.title);
                    parcel.writeString(this.description);
                    ChangeDto changeDto = this.change;
                    if (changeDto == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        changeDto.writeToParcel(parcel, flags);
                    }
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010$J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015¨\u00061"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$TradeSentimentDto;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, "order", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "percentage", "type", "color", "textPrefix", "textSuffix", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "getName", "getOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPercentage", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTextPrefix", "getTextSuffix", "getType", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$BodyDto$TradeContentDto$TradeSentimentDto;", "describeContents", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes.dex */
            public static final /* data */ class TradeSentimentDto implements Parcelable {
                public static final int $stable = 0;

                @NotNull
                public static final Parcelable.Creator<TradeSentimentDto> CREATOR = new Creator();

                @SerializedName("color")
                private final String color;

                @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
                private final String name;

                @SerializedName("order")
                private final Integer order;

                @SerializedName("percentage")
                private final Double percentage;

                @SerializedName("text_prefix")
                private final String textPrefix;

                @SerializedName("text_suffix")
                private final String textSuffix;

                @SerializedName("type")
                private final String type;

                @SerializedName(AppMeasurementSdk.ConditionalUserProperty.VALUE)
                private final Double value;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* loaded from: classes.dex */
                public static final class Creator implements Parcelable.Creator<TradeSentimentDto> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final TradeSentimentDto createFromParcel(@NotNull Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new TradeSentimentDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final TradeSentimentDto[] newArray(int i10) {
                        return new TradeSentimentDto[i10];
                    }
                }

                public TradeSentimentDto(String str, Integer num, Double d10, Double d11, String str2, String str3, String str4, String str5) {
                    this.name = str;
                    this.order = num;
                    this.value = d10;
                    this.percentage = d11;
                    this.type = str2;
                    this.color = str3;
                    this.textPrefix = str4;
                    this.textSuffix = str5;
                }

                /* renamed from: component1, reason: from getter */
                public final String getName() {
                    return this.name;
                }

                /* renamed from: component2, reason: from getter */
                public final Integer getOrder() {
                    return this.order;
                }

                /* renamed from: component3, reason: from getter */
                public final Double getValue() {
                    return this.value;
                }

                /* renamed from: component4, reason: from getter */
                public final Double getPercentage() {
                    return this.percentage;
                }

                /* renamed from: component5, reason: from getter */
                public final String getType() {
                    return this.type;
                }

                /* renamed from: component6, reason: from getter */
                public final String getColor() {
                    return this.color;
                }

                /* renamed from: component7, reason: from getter */
                public final String getTextPrefix() {
                    return this.textPrefix;
                }

                /* renamed from: component8, reason: from getter */
                public final String getTextSuffix() {
                    return this.textSuffix;
                }

                @NotNull
                public final TradeSentimentDto copy(String name, Integer order, Double value, Double percentage, String type, String color, String textPrefix, String textSuffix) {
                    return new TradeSentimentDto(name, order, value, percentage, type, color, textPrefix, textSuffix);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TradeSentimentDto)) {
                        return false;
                    }
                    TradeSentimentDto tradeSentimentDto = (TradeSentimentDto) other;
                    return Intrinsics.a(this.name, tradeSentimentDto.name) && Intrinsics.a(this.order, tradeSentimentDto.order) && Intrinsics.a(this.value, tradeSentimentDto.value) && Intrinsics.a(this.percentage, tradeSentimentDto.percentage) && Intrinsics.a(this.type, tradeSentimentDto.type) && Intrinsics.a(this.color, tradeSentimentDto.color) && Intrinsics.a(this.textPrefix, tradeSentimentDto.textPrefix) && Intrinsics.a(this.textSuffix, tradeSentimentDto.textSuffix);
                }

                public final String getColor() {
                    return this.color;
                }

                public final String getName() {
                    return this.name;
                }

                public final Integer getOrder() {
                    return this.order;
                }

                public final Double getPercentage() {
                    return this.percentage;
                }

                public final String getTextPrefix() {
                    return this.textPrefix;
                }

                public final String getTextSuffix() {
                    return this.textSuffix;
                }

                public final String getType() {
                    return this.type;
                }

                public final Double getValue() {
                    return this.value;
                }

                public int hashCode() {
                    String str = this.name;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    Integer num = this.order;
                    int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                    Double d10 = this.value;
                    int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
                    Double d11 = this.percentage;
                    int hashCode4 = (hashCode3 + (d11 == null ? 0 : d11.hashCode())) * 31;
                    String str2 = this.type;
                    int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.color;
                    int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    String str4 = this.textPrefix;
                    int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
                    String str5 = this.textSuffix;
                    return hashCode7 + (str5 != null ? str5.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.name;
                    Integer num = this.order;
                    Double d10 = this.value;
                    Double d11 = this.percentage;
                    String str2 = this.type;
                    String str3 = this.color;
                    String str4 = this.textPrefix;
                    String str5 = this.textSuffix;
                    StringBuilder sb2 = new StringBuilder("TradeSentimentDto(name=");
                    sb2.append(str);
                    sb2.append(", order=");
                    sb2.append(num);
                    sb2.append(", value=");
                    sb2.append(d10);
                    sb2.append(", percentage=");
                    sb2.append(d11);
                    sb2.append(", type=");
                    e.v(sb2, str2, ", color=", str3, ", textPrefix=");
                    return a.k(sb2, str4, ", textSuffix=", str5, ")");
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@NotNull Parcel parcel, int flags) {
                    Intrinsics.checkNotNullParameter(parcel, "out");
                    parcel.writeString(this.name);
                    Integer num = this.order;
                    if (num == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeInt(num.intValue());
                    }
                    Double d10 = this.value;
                    if (d10 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeDouble(d10.doubleValue());
                    }
                    Double d11 = this.percentage;
                    if (d11 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeDouble(d11.doubleValue());
                    }
                    parcel.writeString(this.type);
                    parcel.writeString(this.color);
                    parcel.writeString(this.textPrefix);
                    parcel.writeString(this.textSuffix);
                }
            }

            public TradeContentDto(String str, StockMetaDto stockMetaDto, Double d10, Double d11, String str2, ProgressBarDto progressBarDto, List<TradeSentimentDto> list, List<TradeMetaDto> list2) {
                this.status = str;
                this.stockMeta = stockMetaDto;
                this.entryPrice = d10;
                this.targetPrice = d11;
                this.tradeDirection = str2;
                this.progressBar = progressBarDto;
                this.tradeSentiment = list;
                this.tradeMeta = list2;
            }

            /* renamed from: component1, reason: from getter */
            public final String getStatus() {
                return this.status;
            }

            /* renamed from: component2, reason: from getter */
            public final StockMetaDto getStockMeta() {
                return this.stockMeta;
            }

            /* renamed from: component3, reason: from getter */
            public final Double getEntryPrice() {
                return this.entryPrice;
            }

            /* renamed from: component4, reason: from getter */
            public final Double getTargetPrice() {
                return this.targetPrice;
            }

            /* renamed from: component5, reason: from getter */
            public final String getTradeDirection() {
                return this.tradeDirection;
            }

            /* renamed from: component6, reason: from getter */
            public final ProgressBarDto getProgressBar() {
                return this.progressBar;
            }

            public final List<TradeSentimentDto> component7() {
                return this.tradeSentiment;
            }

            public final List<TradeMetaDto> component8() {
                return this.tradeMeta;
            }

            @NotNull
            public final TradeContentDto copy(String status, StockMetaDto stockMeta, Double entryPrice, Double targetPrice, String tradeDirection, ProgressBarDto progressBar, List<TradeSentimentDto> tradeSentiment, List<TradeMetaDto> tradeMeta) {
                return new TradeContentDto(status, stockMeta, entryPrice, targetPrice, tradeDirection, progressBar, tradeSentiment, tradeMeta);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TradeContentDto)) {
                    return false;
                }
                TradeContentDto tradeContentDto = (TradeContentDto) other;
                return Intrinsics.a(this.status, tradeContentDto.status) && Intrinsics.a(this.stockMeta, tradeContentDto.stockMeta) && Intrinsics.a(this.entryPrice, tradeContentDto.entryPrice) && Intrinsics.a(this.targetPrice, tradeContentDto.targetPrice) && Intrinsics.a(this.tradeDirection, tradeContentDto.tradeDirection) && Intrinsics.a(this.progressBar, tradeContentDto.progressBar) && Intrinsics.a(this.tradeSentiment, tradeContentDto.tradeSentiment) && Intrinsics.a(this.tradeMeta, tradeContentDto.tradeMeta);
            }

            public final Double getEntryPrice() {
                return this.entryPrice;
            }

            public final ProgressBarDto getProgressBar() {
                return this.progressBar;
            }

            public final String getStatus() {
                return this.status;
            }

            public final StockMetaDto getStockMeta() {
                return this.stockMeta;
            }

            public final Double getTargetPrice() {
                return this.targetPrice;
            }

            public final String getTradeDirection() {
                return this.tradeDirection;
            }

            public final List<TradeMetaDto> getTradeMeta() {
                return this.tradeMeta;
            }

            public final List<TradeSentimentDto> getTradeSentiment() {
                return this.tradeSentiment;
            }

            public int hashCode() {
                String str = this.status;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                StockMetaDto stockMetaDto = this.stockMeta;
                int hashCode2 = (hashCode + (stockMetaDto == null ? 0 : stockMetaDto.hashCode())) * 31;
                Double d10 = this.entryPrice;
                int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
                Double d11 = this.targetPrice;
                int hashCode4 = (hashCode3 + (d11 == null ? 0 : d11.hashCode())) * 31;
                String str2 = this.tradeDirection;
                int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
                ProgressBarDto progressBarDto = this.progressBar;
                int hashCode6 = (hashCode5 + (progressBarDto == null ? 0 : progressBarDto.hashCode())) * 31;
                List<TradeSentimentDto> list = this.tradeSentiment;
                int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
                List<TradeMetaDto> list2 = this.tradeMeta;
                return hashCode7 + (list2 != null ? list2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "TradeContentDto(status=" + this.status + ", stockMeta=" + this.stockMeta + ", entryPrice=" + this.entryPrice + ", targetPrice=" + this.targetPrice + ", tradeDirection=" + this.tradeDirection + ", progressBar=" + this.progressBar + ", tradeSentiment=" + this.tradeSentiment + ", tradeMeta=" + this.tradeMeta + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.status);
                StockMetaDto stockMetaDto = this.stockMeta;
                if (stockMetaDto == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    stockMetaDto.writeToParcel(parcel, flags);
                }
                Double d10 = this.entryPrice;
                if (d10 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeDouble(d10.doubleValue());
                }
                Double d11 = this.targetPrice;
                if (d11 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeDouble(d11.doubleValue());
                }
                parcel.writeString(this.tradeDirection);
                ProgressBarDto progressBarDto = this.progressBar;
                if (progressBarDto == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    progressBarDto.writeToParcel(parcel, flags);
                }
                List<TradeSentimentDto> list = this.tradeSentiment;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator o10 = a.o(parcel, 1, list);
                    while (o10.hasNext()) {
                        ((TradeSentimentDto) o10.next()).writeToParcel(parcel, flags);
                    }
                }
                List<TradeMetaDto> list2 = this.tradeMeta;
                if (list2 == null) {
                    parcel.writeInt(0);
                    return;
                }
                Iterator o11 = a.o(parcel, 1, list2);
                while (o11.hasNext()) {
                    ((TradeMetaDto) o11.next()).writeToParcel(parcel, flags);
                }
            }
        }

        public BodyDto(String str, String str2, String str3, TradeContentDto tradeContentDto, List<String> list) {
            this.templateType = str;
            this.heading = str2;
            this.description = str3;
            this.tradeContent = tradeContentDto;
            this.tags = list;
        }

        public static /* synthetic */ BodyDto copy$default(BodyDto bodyDto, String str, String str2, String str3, TradeContentDto tradeContentDto, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bodyDto.templateType;
            }
            if ((i10 & 2) != 0) {
                str2 = bodyDto.heading;
            }
            String str4 = str2;
            if ((i10 & 4) != 0) {
                str3 = bodyDto.description;
            }
            String str5 = str3;
            if ((i10 & 8) != 0) {
                tradeContentDto = bodyDto.tradeContent;
            }
            TradeContentDto tradeContentDto2 = tradeContentDto;
            if ((i10 & 16) != 0) {
                list = bodyDto.tags;
            }
            return bodyDto.copy(str, str4, str5, tradeContentDto2, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTemplateType() {
            return this.templateType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getHeading() {
            return this.heading;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final TradeContentDto getTradeContent() {
            return this.tradeContent;
        }

        public final List<String> component5() {
            return this.tags;
        }

        @NotNull
        public final BodyDto copy(String templateType, String heading, String description, TradeContentDto tradeContent, List<String> tags) {
            return new BodyDto(templateType, heading, description, tradeContent, tags);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BodyDto)) {
                return false;
            }
            BodyDto bodyDto = (BodyDto) other;
            return Intrinsics.a(this.templateType, bodyDto.templateType) && Intrinsics.a(this.heading, bodyDto.heading) && Intrinsics.a(this.description, bodyDto.description) && Intrinsics.a(this.tradeContent, bodyDto.tradeContent) && Intrinsics.a(this.tags, bodyDto.tags);
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getHeading() {
            return this.heading;
        }

        public final List<String> getTags() {
            return this.tags;
        }

        public final String getTemplateType() {
            return this.templateType;
        }

        public final TradeContentDto getTradeContent() {
            return this.tradeContent;
        }

        public int hashCode() {
            String str = this.templateType;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.heading;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.description;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            TradeContentDto tradeContentDto = this.tradeContent;
            int hashCode4 = (hashCode3 + (tradeContentDto == null ? 0 : tradeContentDto.hashCode())) * 31;
            List<String> list = this.tags;
            return hashCode4 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.templateType;
            String str2 = this.heading;
            String str3 = this.description;
            TradeContentDto tradeContentDto = this.tradeContent;
            List<String> list = this.tags;
            StringBuilder l10 = e.l("BodyDto(templateType=", str, ", heading=", str2, ", description=");
            l10.append(str3);
            l10.append(", tradeContent=");
            l10.append(tradeContentDto);
            l10.append(", tags=");
            return a.l(l10, list, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.templateType);
            parcel.writeString(this.heading);
            parcel.writeString(this.description);
            TradeContentDto tradeContentDto = this.tradeContent;
            if (tradeContentDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                tradeContentDto.writeToParcel(parcel, flags);
            }
            parcel.writeStringList(this.tags);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<FeedPostDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FeedPostDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FeedPostDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : HeaderDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BodyDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FooterDto.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FeedPostDto[] newArray(int i10) {
            return new FeedPostDto[i10];
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004+,-.B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\fHÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006/"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto;", "Landroid/os/Parcelable;", "likes", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$LikesDto;", "comments", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$CommentsDto;", "attachments", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$AttachmentsDto;", "bookmarks", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$BookmarksDto;", "order", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "(Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$LikesDto;Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$CommentsDto;Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$AttachmentsDto;Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$BookmarksDto;Ljava/util/List;)V", "getAttachments", "()Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$AttachmentsDto;", "getBookmarks", "()Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$BookmarksDto;", "getComments", "()Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$CommentsDto;", "getLikes", "()Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$LikesDto;", "getOrder", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "AttachmentsDto", "BookmarksDto", "CommentsDto", "LikesDto", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class FooterDto implements Parcelable {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<FooterDto> CREATOR = new Creator();

        @SerializedName("attachments")
        private final AttachmentsDto attachments;

        @SerializedName("bookmarks")
        private final BookmarksDto bookmarks;

        @SerializedName("comments")
        private final CommentsDto comments;

        @SerializedName("likes")
        private final LikesDto likes;

        @SerializedName("order")
        private final List<String> order;

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bHÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$AttachmentsDto;", "Landroid/os/Parcelable;", "media", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$AttachmentsDto$MediaDto;", "(Ljava/util/List;)V", "getMedia", "()Ljava/util/List;", "component1", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "MediaDto", "ThumbnailDto", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final /* data */ class AttachmentsDto implements Parcelable {
            public static final int $stable = 8;

            @NotNull
            public static final Parcelable.Creator<AttachmentsDto> CREATOR = new Creator();

            @SerializedName("media")
            private final List<MediaDto> media;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes.dex */
            public static final class Creator implements Parcelable.Creator<AttachmentsDto> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final AttachmentsDto createFromParcel(@NotNull Parcel parcel) {
                    ArrayList arrayList;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int readInt = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(readInt);
                        int i10 = 0;
                        while (i10 != readInt) {
                            i10 = h.e(MediaDto.CREATOR, parcel, arrayList2, i10, 1);
                        }
                        arrayList = arrayList2;
                    }
                    return new AttachmentsDto(arrayList);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final AttachmentsDto[] newArray(int i10) {
                    return new AttachmentsDto[i10];
                }
            }

            @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JW\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eHÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006+"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$AttachmentsDto$MediaDto;", "Landroid/os/Parcelable;", "url", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$AttachmentsDto$MediaDto$UrlDto;", "type", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.NAME, "source", "contentId", "thumbnail", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$AttachmentsDto$ThumbnailDto;", "(Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$AttachmentsDto$MediaDto$UrlDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getContentId", "()Ljava/lang/String;", "getName", "getSource", "getThumbnail", "()Ljava/util/List;", "getType", "getUrl", "()Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$AttachmentsDto$MediaDto$UrlDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "UrlDto", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes.dex */
            public static final /* data */ class MediaDto implements Parcelable {
                public static final int $stable = 8;

                @NotNull
                public static final Parcelable.Creator<MediaDto> CREATOR = new Creator();

                @SerializedName("content_id")
                private final String contentId;

                @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
                private final String name;

                @SerializedName("source")
                private final String source;

                @SerializedName("thumbnail")
                private final List<ThumbnailDto> thumbnail;

                @SerializedName("type")
                private final String type;

                @SerializedName("url")
                private final UrlDto url;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* loaded from: classes.dex */
                public static final class Creator implements Parcelable.Creator<MediaDto> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final MediaDto createFromParcel(@NotNull Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        ArrayList arrayList = null;
                        UrlDto createFromParcel = parcel.readInt() == 0 ? null : UrlDto.CREATOR.createFromParcel(parcel);
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        String readString3 = parcel.readString();
                        String readString4 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            int readInt = parcel.readInt();
                            arrayList = new ArrayList(readInt);
                            int i10 = 0;
                            while (i10 != readInt) {
                                i10 = h.e(ThumbnailDto.CREATOR, parcel, arrayList, i10, 1);
                            }
                        }
                        return new MediaDto(createFromParcel, readString, readString2, readString3, readString4, arrayList);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final MediaDto[] newArray(int i10) {
                        return new MediaDto[i10];
                    }
                }

                @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$AttachmentsDto$MediaDto$UrlDto;", "Landroid/os/Parcelable;", "defaultURL", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;)V", "getDefaultURL", "()Ljava/lang/String;", "component1", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* loaded from: classes.dex */
                public static final /* data */ class UrlDto implements Parcelable {
                    public static final int $stable = 0;

                    @NotNull
                    public static final Parcelable.Creator<UrlDto> CREATOR = new Creator();

                    @SerializedName(LogConstants.DEFAULT_CHANNEL)
                    private final String defaultURL;

                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    /* loaded from: classes.dex */
                    public static final class Creator implements Parcelable.Creator<UrlDto> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @NotNull
                        public final UrlDto createFromParcel(@NotNull Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new UrlDto(parcel.readString());
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @NotNull
                        public final UrlDto[] newArray(int i10) {
                            return new UrlDto[i10];
                        }
                    }

                    public UrlDto(String str) {
                        this.defaultURL = str;
                    }

                    public static /* synthetic */ UrlDto copy$default(UrlDto urlDto, String str, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            str = urlDto.defaultURL;
                        }
                        return urlDto.copy(str);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final String getDefaultURL() {
                        return this.defaultURL;
                    }

                    @NotNull
                    public final UrlDto copy(String defaultURL) {
                        return new UrlDto(defaultURL);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof UrlDto) && Intrinsics.a(this.defaultURL, ((UrlDto) other).defaultURL);
                    }

                    public final String getDefaultURL() {
                        return this.defaultURL;
                    }

                    public int hashCode() {
                        String str = this.defaultURL;
                        if (str == null) {
                            return 0;
                        }
                        return str.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        return d.k("UrlDto(defaultURL=", this.defaultURL, ")");
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@NotNull Parcel parcel, int flags) {
                        Intrinsics.checkNotNullParameter(parcel, "out");
                        parcel.writeString(this.defaultURL);
                    }
                }

                public MediaDto(UrlDto urlDto, String str, String str2, String str3, String str4, List<ThumbnailDto> list) {
                    this.url = urlDto;
                    this.type = str;
                    this.name = str2;
                    this.source = str3;
                    this.contentId = str4;
                    this.thumbnail = list;
                }

                public static /* synthetic */ MediaDto copy$default(MediaDto mediaDto, UrlDto urlDto, String str, String str2, String str3, String str4, List list, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        urlDto = mediaDto.url;
                    }
                    if ((i10 & 2) != 0) {
                        str = mediaDto.type;
                    }
                    String str5 = str;
                    if ((i10 & 4) != 0) {
                        str2 = mediaDto.name;
                    }
                    String str6 = str2;
                    if ((i10 & 8) != 0) {
                        str3 = mediaDto.source;
                    }
                    String str7 = str3;
                    if ((i10 & 16) != 0) {
                        str4 = mediaDto.contentId;
                    }
                    String str8 = str4;
                    if ((i10 & 32) != 0) {
                        list = mediaDto.thumbnail;
                    }
                    return mediaDto.copy(urlDto, str5, str6, str7, str8, list);
                }

                /* renamed from: component1, reason: from getter */
                public final UrlDto getUrl() {
                    return this.url;
                }

                /* renamed from: component2, reason: from getter */
                public final String getType() {
                    return this.type;
                }

                /* renamed from: component3, reason: from getter */
                public final String getName() {
                    return this.name;
                }

                /* renamed from: component4, reason: from getter */
                public final String getSource() {
                    return this.source;
                }

                /* renamed from: component5, reason: from getter */
                public final String getContentId() {
                    return this.contentId;
                }

                public final List<ThumbnailDto> component6() {
                    return this.thumbnail;
                }

                @NotNull
                public final MediaDto copy(UrlDto url, String type, String name, String source, String contentId, List<ThumbnailDto> thumbnail) {
                    return new MediaDto(url, type, name, source, contentId, thumbnail);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof MediaDto)) {
                        return false;
                    }
                    MediaDto mediaDto = (MediaDto) other;
                    return Intrinsics.a(this.url, mediaDto.url) && Intrinsics.a(this.type, mediaDto.type) && Intrinsics.a(this.name, mediaDto.name) && Intrinsics.a(this.source, mediaDto.source) && Intrinsics.a(this.contentId, mediaDto.contentId) && Intrinsics.a(this.thumbnail, mediaDto.thumbnail);
                }

                public final String getContentId() {
                    return this.contentId;
                }

                public final String getName() {
                    return this.name;
                }

                public final String getSource() {
                    return this.source;
                }

                public final List<ThumbnailDto> getThumbnail() {
                    return this.thumbnail;
                }

                public final String getType() {
                    return this.type;
                }

                public final UrlDto getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    UrlDto urlDto = this.url;
                    int hashCode = (urlDto == null ? 0 : urlDto.hashCode()) * 31;
                    String str = this.type;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.name;
                    int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.source;
                    int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    String str4 = this.contentId;
                    int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                    List<ThumbnailDto> list = this.thumbnail;
                    return hashCode5 + (list != null ? list.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    UrlDto urlDto = this.url;
                    String str = this.type;
                    String str2 = this.name;
                    String str3 = this.source;
                    String str4 = this.contentId;
                    List<ThumbnailDto> list = this.thumbnail;
                    StringBuilder sb2 = new StringBuilder("MediaDto(url=");
                    sb2.append(urlDto);
                    sb2.append(", type=");
                    sb2.append(str);
                    sb2.append(", name=");
                    e.v(sb2, str2, ", source=", str3, ", contentId=");
                    sb2.append(str4);
                    sb2.append(", thumbnail=");
                    sb2.append(list);
                    sb2.append(")");
                    return sb2.toString();
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@NotNull Parcel parcel, int flags) {
                    Intrinsics.checkNotNullParameter(parcel, "out");
                    UrlDto urlDto = this.url;
                    if (urlDto == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        urlDto.writeToParcel(parcel, flags);
                    }
                    parcel.writeString(this.type);
                    parcel.writeString(this.name);
                    parcel.writeString(this.source);
                    parcel.writeString(this.contentId);
                    List<ThumbnailDto> list = this.thumbnail;
                    if (list == null) {
                        parcel.writeInt(0);
                        return;
                    }
                    Iterator o10 = a.o(parcel, 1, list);
                    while (o10.hasNext()) {
                        ((ThumbnailDto) o10.next()).writeToParcel(parcel, flags);
                    }
                }
            }

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$AttachmentsDto$ThumbnailDto;", "Landroid/os/Parcelable;", "url", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes.dex */
            public static final /* data */ class ThumbnailDto implements Parcelable {
                public static final int $stable = 0;

                @NotNull
                public static final Parcelable.Creator<ThumbnailDto> CREATOR = new Creator();

                @SerializedName("url")
                private final String url;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* loaded from: classes.dex */
                public static final class Creator implements Parcelable.Creator<ThumbnailDto> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final ThumbnailDto createFromParcel(@NotNull Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new ThumbnailDto(parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @NotNull
                    public final ThumbnailDto[] newArray(int i10) {
                        return new ThumbnailDto[i10];
                    }
                }

                public ThumbnailDto(String str) {
                    this.url = str;
                }

                public static /* synthetic */ ThumbnailDto copy$default(ThumbnailDto thumbnailDto, String str, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = thumbnailDto.url;
                    }
                    return thumbnailDto.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                @NotNull
                public final ThumbnailDto copy(String url) {
                    return new ThumbnailDto(url);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ThumbnailDto) && Intrinsics.a(this.url, ((ThumbnailDto) other).url);
                }

                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    String str = this.url;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                @NotNull
                public String toString() {
                    return d.k("ThumbnailDto(url=", this.url, ")");
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@NotNull Parcel parcel, int flags) {
                    Intrinsics.checkNotNullParameter(parcel, "out");
                    parcel.writeString(this.url);
                }
            }

            public AttachmentsDto(List<MediaDto> list) {
                this.media = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AttachmentsDto copy$default(AttachmentsDto attachmentsDto, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = attachmentsDto.media;
                }
                return attachmentsDto.copy(list);
            }

            public final List<MediaDto> component1() {
                return this.media;
            }

            @NotNull
            public final AttachmentsDto copy(List<MediaDto> media) {
                return new AttachmentsDto(media);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AttachmentsDto) && Intrinsics.a(this.media, ((AttachmentsDto) other).media);
            }

            public final List<MediaDto> getMedia() {
                return this.media;
            }

            public int hashCode() {
                List<MediaDto> list = this.media;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            @NotNull
            public String toString() {
                return a.h("AttachmentsDto(media=", this.media, ")");
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                List<MediaDto> list = this.media;
                if (list == null) {
                    parcel.writeInt(0);
                    return;
                }
                Iterator o10 = a.o(parcel, 1, list);
                while (o10.hasNext()) {
                    ((MediaDto) o10.next()).writeToParcel(parcel, flags);
                }
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\tJ\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0017"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$BookmarksDto;", "Landroid/os/Parcelable;", "isBookmark", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$BookmarksDto;", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final /* data */ class BookmarksDto implements Parcelable {
            public static final int $stable = 0;

            @NotNull
            public static final Parcelable.Creator<BookmarksDto> CREATOR = new Creator();

            @SerializedName("is_bookmark")
            private final Boolean isBookmark;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes.dex */
            public static final class Creator implements Parcelable.Creator<BookmarksDto> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BookmarksDto createFromParcel(@NotNull Parcel parcel) {
                    Boolean valueOf;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    if (parcel.readInt() == 0) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new BookmarksDto(valueOf);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final BookmarksDto[] newArray(int i10) {
                    return new BookmarksDto[i10];
                }
            }

            public BookmarksDto(Boolean bool) {
                this.isBookmark = bool;
            }

            public static /* synthetic */ BookmarksDto copy$default(BookmarksDto bookmarksDto, Boolean bool, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    bool = bookmarksDto.isBookmark;
                }
                return bookmarksDto.copy(bool);
            }

            /* renamed from: component1, reason: from getter */
            public final Boolean getIsBookmark() {
                return this.isBookmark;
            }

            @NotNull
            public final BookmarksDto copy(Boolean isBookmark) {
                return new BookmarksDto(isBookmark);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BookmarksDto) && Intrinsics.a(this.isBookmark, ((BookmarksDto) other).isBookmark);
            }

            public int hashCode() {
                Boolean bool = this.isBookmark;
                if (bool == null) {
                    return 0;
                }
                return bool.hashCode();
            }

            public final Boolean isBookmark() {
                return this.isBookmark;
            }

            @NotNull
            public String toString() {
                return "BookmarksDto(isBookmark=" + this.isBookmark + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                Boolean bool = this.isBookmark;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    a.q(parcel, 1, bool);
                }
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$CommentsDto;", "Landroid/os/Parcelable;", "canComment", HttpUrl.FRAGMENT_ENCODE_SET, "count", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getCanComment", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$CommentsDto;", "describeContents", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final /* data */ class CommentsDto implements Parcelable {
            public static final int $stable = 0;

            @NotNull
            public static final Parcelable.Creator<CommentsDto> CREATOR = new Creator();

            @SerializedName("can_comment")
            private final Boolean canComment;

            @SerializedName("count")
            private final Integer count;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes.dex */
            public static final class Creator implements Parcelable.Creator<CommentsDto> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final CommentsDto createFromParcel(@NotNull Parcel parcel) {
                    Boolean valueOf;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    if (parcel.readInt() == 0) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new CommentsDto(valueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final CommentsDto[] newArray(int i10) {
                    return new CommentsDto[i10];
                }
            }

            public CommentsDto(Boolean bool, Integer num) {
                this.canComment = bool;
                this.count = num;
            }

            public static /* synthetic */ CommentsDto copy$default(CommentsDto commentsDto, Boolean bool, Integer num, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    bool = commentsDto.canComment;
                }
                if ((i10 & 2) != 0) {
                    num = commentsDto.count;
                }
                return commentsDto.copy(bool, num);
            }

            /* renamed from: component1, reason: from getter */
            public final Boolean getCanComment() {
                return this.canComment;
            }

            /* renamed from: component2, reason: from getter */
            public final Integer getCount() {
                return this.count;
            }

            @NotNull
            public final CommentsDto copy(Boolean canComment, Integer count) {
                return new CommentsDto(canComment, count);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CommentsDto)) {
                    return false;
                }
                CommentsDto commentsDto = (CommentsDto) other;
                return Intrinsics.a(this.canComment, commentsDto.canComment) && Intrinsics.a(this.count, commentsDto.count);
            }

            public final Boolean getCanComment() {
                return this.canComment;
            }

            public final Integer getCount() {
                return this.count;
            }

            public int hashCode() {
                Boolean bool = this.canComment;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Integer num = this.count;
                return hashCode + (num != null ? num.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "CommentsDto(canComment=" + this.canComment + ", count=" + this.count + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                Boolean bool = this.canComment;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    a.q(parcel, 1, bool);
                }
                Integer num = this.count;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(num.intValue());
                }
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<FooterDto> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final FooterDto createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FooterDto(parcel.readInt() == 0 ? null : LikesDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CommentsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttachmentsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BookmarksDto.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final FooterDto[] newArray(int i10) {
                return new FooterDto[i10];
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0002\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$LikesDto;", "Landroid/os/Parcelable;", "isLiked", HttpUrl.FRAGMENT_ENCODE_SET, "count", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$FooterDto$LikesDto;", "describeContents", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final /* data */ class LikesDto implements Parcelable {
            public static final int $stable = 0;

            @NotNull
            public static final Parcelable.Creator<LikesDto> CREATOR = new Creator();

            @SerializedName("count")
            private final Integer count;

            @SerializedName("is_liked")
            private final Boolean isLiked;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes.dex */
            public static final class Creator implements Parcelable.Creator<LikesDto> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final LikesDto createFromParcel(@NotNull Parcel parcel) {
                    Boolean valueOf;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    if (parcel.readInt() == 0) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new LikesDto(valueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final LikesDto[] newArray(int i10) {
                    return new LikesDto[i10];
                }
            }

            public LikesDto(Boolean bool, Integer num) {
                this.isLiked = bool;
                this.count = num;
            }

            public static /* synthetic */ LikesDto copy$default(LikesDto likesDto, Boolean bool, Integer num, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    bool = likesDto.isLiked;
                }
                if ((i10 & 2) != 0) {
                    num = likesDto.count;
                }
                return likesDto.copy(bool, num);
            }

            /* renamed from: component1, reason: from getter */
            public final Boolean getIsLiked() {
                return this.isLiked;
            }

            /* renamed from: component2, reason: from getter */
            public final Integer getCount() {
                return this.count;
            }

            @NotNull
            public final LikesDto copy(Boolean isLiked, Integer count) {
                return new LikesDto(isLiked, count);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LikesDto)) {
                    return false;
                }
                LikesDto likesDto = (LikesDto) other;
                return Intrinsics.a(this.isLiked, likesDto.isLiked) && Intrinsics.a(this.count, likesDto.count);
            }

            public final Integer getCount() {
                return this.count;
            }

            public int hashCode() {
                Boolean bool = this.isLiked;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Integer num = this.count;
                return hashCode + (num != null ? num.hashCode() : 0);
            }

            public final Boolean isLiked() {
                return this.isLiked;
            }

            @NotNull
            public String toString() {
                return "LikesDto(isLiked=" + this.isLiked + ", count=" + this.count + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                Boolean bool = this.isLiked;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    a.q(parcel, 1, bool);
                }
                Integer num = this.count;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(num.intValue());
                }
            }
        }

        public FooterDto(LikesDto likesDto, CommentsDto commentsDto, AttachmentsDto attachmentsDto, BookmarksDto bookmarksDto, List<String> list) {
            this.likes = likesDto;
            this.comments = commentsDto;
            this.attachments = attachmentsDto;
            this.bookmarks = bookmarksDto;
            this.order = list;
        }

        public static /* synthetic */ FooterDto copy$default(FooterDto footerDto, LikesDto likesDto, CommentsDto commentsDto, AttachmentsDto attachmentsDto, BookmarksDto bookmarksDto, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                likesDto = footerDto.likes;
            }
            if ((i10 & 2) != 0) {
                commentsDto = footerDto.comments;
            }
            CommentsDto commentsDto2 = commentsDto;
            if ((i10 & 4) != 0) {
                attachmentsDto = footerDto.attachments;
            }
            AttachmentsDto attachmentsDto2 = attachmentsDto;
            if ((i10 & 8) != 0) {
                bookmarksDto = footerDto.bookmarks;
            }
            BookmarksDto bookmarksDto2 = bookmarksDto;
            if ((i10 & 16) != 0) {
                list = footerDto.order;
            }
            return footerDto.copy(likesDto, commentsDto2, attachmentsDto2, bookmarksDto2, list);
        }

        /* renamed from: component1, reason: from getter */
        public final LikesDto getLikes() {
            return this.likes;
        }

        /* renamed from: component2, reason: from getter */
        public final CommentsDto getComments() {
            return this.comments;
        }

        /* renamed from: component3, reason: from getter */
        public final AttachmentsDto getAttachments() {
            return this.attachments;
        }

        /* renamed from: component4, reason: from getter */
        public final BookmarksDto getBookmarks() {
            return this.bookmarks;
        }

        public final List<String> component5() {
            return this.order;
        }

        @NotNull
        public final FooterDto copy(LikesDto likes, CommentsDto comments, AttachmentsDto attachments, BookmarksDto bookmarks, List<String> order) {
            return new FooterDto(likes, comments, attachments, bookmarks, order);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FooterDto)) {
                return false;
            }
            FooterDto footerDto = (FooterDto) other;
            return Intrinsics.a(this.likes, footerDto.likes) && Intrinsics.a(this.comments, footerDto.comments) && Intrinsics.a(this.attachments, footerDto.attachments) && Intrinsics.a(this.bookmarks, footerDto.bookmarks) && Intrinsics.a(this.order, footerDto.order);
        }

        public final AttachmentsDto getAttachments() {
            return this.attachments;
        }

        public final BookmarksDto getBookmarks() {
            return this.bookmarks;
        }

        public final CommentsDto getComments() {
            return this.comments;
        }

        public final LikesDto getLikes() {
            return this.likes;
        }

        public final List<String> getOrder() {
            return this.order;
        }

        public int hashCode() {
            LikesDto likesDto = this.likes;
            int hashCode = (likesDto == null ? 0 : likesDto.hashCode()) * 31;
            CommentsDto commentsDto = this.comments;
            int hashCode2 = (hashCode + (commentsDto == null ? 0 : commentsDto.hashCode())) * 31;
            AttachmentsDto attachmentsDto = this.attachments;
            int hashCode3 = (hashCode2 + (attachmentsDto == null ? 0 : attachmentsDto.hashCode())) * 31;
            BookmarksDto bookmarksDto = this.bookmarks;
            int hashCode4 = (hashCode3 + (bookmarksDto == null ? 0 : bookmarksDto.hashCode())) * 31;
            List<String> list = this.order;
            return hashCode4 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "FooterDto(likes=" + this.likes + ", comments=" + this.comments + ", attachments=" + this.attachments + ", bookmarks=" + this.bookmarks + ", order=" + this.order + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            LikesDto likesDto = this.likes;
            if (likesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                likesDto.writeToParcel(parcel, flags);
            }
            CommentsDto commentsDto = this.comments;
            if (commentsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                commentsDto.writeToParcel(parcel, flags);
            }
            AttachmentsDto attachmentsDto = this.attachments;
            if (attachmentsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attachmentsDto.writeToParcel(parcel, flags);
            }
            BookmarksDto bookmarksDto = this.bookmarks;
            if (bookmarksDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                bookmarksDto.writeToParcel(parcel, flags);
            }
            parcel.writeStringList(this.order);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jz\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010!J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0013\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#HÖ\u0001R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\n\u0010\u0013R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0006\u0010\u0013R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0004\u0010\u0013R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006."}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$HeaderDto;", "Landroid/os/Parcelable;", "title", HttpUrl.FRAGMENT_ENCODE_SET, "isSebiRegistered", HttpUrl.FRAGMENT_ENCODE_SET, "isRiaRra", "displayImage", "groupId", "userId", "isFollowed", "creatorName", "groupName", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getCreatorName", "()Ljava/lang/String;", "getDisplayImage", "getGroupId", "getGroupName", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitle", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto$HeaderDto;", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class HeaderDto implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<HeaderDto> CREATOR = new Creator();

        @SerializedName("creator_name")
        private final String creatorName;

        @SerializedName("display_image")
        private final String displayImage;

        @SerializedName("group_id")
        private final String groupId;

        @SerializedName("group_name")
        private final String groupName;

        @SerializedName("is_followed")
        private final Boolean isFollowed;

        @SerializedName("is_ria_rra")
        private final Boolean isRiaRra;

        @SerializedName("is_sebi_registered")
        private final Boolean isSebiRegistered;

        @SerializedName("title")
        private final String title;

        @SerializedName("user_id")
        private final String userId;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<HeaderDto> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final HeaderDto createFromParcel(@NotNull Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new HeaderDto(readString, valueOf, valueOf2, readString2, readString3, readString4, valueOf3, parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final HeaderDto[] newArray(int i10) {
                return new HeaderDto[i10];
            }
        }

        public HeaderDto(String str, Boolean bool, Boolean bool2, String str2, String str3, String str4, Boolean bool3, String str5, String str6) {
            this.title = str;
            this.isSebiRegistered = bool;
            this.isRiaRra = bool2;
            this.displayImage = str2;
            this.groupId = str3;
            this.userId = str4;
            this.isFollowed = bool3;
            this.creatorName = str5;
            this.groupName = str6;
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsSebiRegistered() {
            return this.isSebiRegistered;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getIsRiaRra() {
            return this.isRiaRra;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDisplayImage() {
            return this.displayImage;
        }

        /* renamed from: component5, reason: from getter */
        public final String getGroupId() {
            return this.groupId;
        }

        /* renamed from: component6, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        /* renamed from: component7, reason: from getter */
        public final Boolean getIsFollowed() {
            return this.isFollowed;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCreatorName() {
            return this.creatorName;
        }

        /* renamed from: component9, reason: from getter */
        public final String getGroupName() {
            return this.groupName;
        }

        @NotNull
        public final HeaderDto copy(String title, Boolean isSebiRegistered, Boolean isRiaRra, String displayImage, String groupId, String userId, Boolean isFollowed, String creatorName, String groupName) {
            return new HeaderDto(title, isSebiRegistered, isRiaRra, displayImage, groupId, userId, isFollowed, creatorName, groupName);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderDto)) {
                return false;
            }
            HeaderDto headerDto = (HeaderDto) other;
            return Intrinsics.a(this.title, headerDto.title) && Intrinsics.a(this.isSebiRegistered, headerDto.isSebiRegistered) && Intrinsics.a(this.isRiaRra, headerDto.isRiaRra) && Intrinsics.a(this.displayImage, headerDto.displayImage) && Intrinsics.a(this.groupId, headerDto.groupId) && Intrinsics.a(this.userId, headerDto.userId) && Intrinsics.a(this.isFollowed, headerDto.isFollowed) && Intrinsics.a(this.creatorName, headerDto.creatorName) && Intrinsics.a(this.groupName, headerDto.groupName);
        }

        public final String getCreatorName() {
            return this.creatorName;
        }

        public final String getDisplayImage() {
            return this.displayImage;
        }

        public final String getGroupId() {
            return this.groupId;
        }

        public final String getGroupName() {
            return this.groupName;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isSebiRegistered;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isRiaRra;
            int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str2 = this.displayImage;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.groupId;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.userId;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool3 = this.isFollowed;
            int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str5 = this.creatorName;
            int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.groupName;
            return hashCode8 + (str6 != null ? str6.hashCode() : 0);
        }

        public final Boolean isFollowed() {
            return this.isFollowed;
        }

        public final Boolean isRiaRra() {
            return this.isRiaRra;
        }

        public final Boolean isSebiRegistered() {
            return this.isSebiRegistered;
        }

        @NotNull
        public String toString() {
            String str = this.title;
            Boolean bool = this.isSebiRegistered;
            Boolean bool2 = this.isRiaRra;
            String str2 = this.displayImage;
            String str3 = this.groupId;
            String str4 = this.userId;
            Boolean bool3 = this.isFollowed;
            String str5 = this.creatorName;
            String str6 = this.groupName;
            StringBuilder sb2 = new StringBuilder("HeaderDto(title=");
            sb2.append(str);
            sb2.append(", isSebiRegistered=");
            sb2.append(bool);
            sb2.append(", isRiaRra=");
            sb2.append(bool2);
            sb2.append(", displayImage=");
            sb2.append(str2);
            sb2.append(", groupId=");
            e.v(sb2, str3, ", userId=", str4, ", isFollowed=");
            sb2.append(bool3);
            sb2.append(", creatorName=");
            sb2.append(str5);
            sb2.append(", groupName=");
            return d.o(sb2, str6, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.title);
            Boolean bool = this.isSebiRegistered;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                a.q(parcel, 1, bool);
            }
            Boolean bool2 = this.isRiaRra;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                a.q(parcel, 1, bool2);
            }
            parcel.writeString(this.displayImage);
            parcel.writeString(this.groupId);
            parcel.writeString(this.userId);
            Boolean bool3 = this.isFollowed;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                a.q(parcel, 1, bool3);
            }
            parcel.writeString(this.creatorName);
            parcel.writeString(this.groupName);
        }
    }

    public FeedPostDto(String str, String str2, String str3, HeaderDto headerDto, BodyDto bodyDto, FooterDto footerDto) {
        this.postId = str;
        this.publishedOn = str2;
        this.expiredAt = str3;
        this.header = headerDto;
        this.body = bodyDto;
        this.footer = footerDto;
    }

    public static /* synthetic */ FeedPostDto copy$default(FeedPostDto feedPostDto, String str, String str2, String str3, HeaderDto headerDto, BodyDto bodyDto, FooterDto footerDto, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = feedPostDto.postId;
        }
        if ((i10 & 2) != 0) {
            str2 = feedPostDto.publishedOn;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            str3 = feedPostDto.expiredAt;
        }
        String str5 = str3;
        if ((i10 & 8) != 0) {
            headerDto = feedPostDto.header;
        }
        HeaderDto headerDto2 = headerDto;
        if ((i10 & 16) != 0) {
            bodyDto = feedPostDto.body;
        }
        BodyDto bodyDto2 = bodyDto;
        if ((i10 & 32) != 0) {
            footerDto = feedPostDto.footer;
        }
        return feedPostDto.copy(str, str4, str5, headerDto2, bodyDto2, footerDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPostId() {
        return this.postId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPublishedOn() {
        return this.publishedOn;
    }

    /* renamed from: component3, reason: from getter */
    public final String getExpiredAt() {
        return this.expiredAt;
    }

    /* renamed from: component4, reason: from getter */
    public final HeaderDto getHeader() {
        return this.header;
    }

    /* renamed from: component5, reason: from getter */
    public final BodyDto getBody() {
        return this.body;
    }

    /* renamed from: component6, reason: from getter */
    public final FooterDto getFooter() {
        return this.footer;
    }

    @NotNull
    public final FeedPostDto copy(String postId, String publishedOn, String expiredAt, HeaderDto header, BodyDto body, FooterDto footer) {
        return new FeedPostDto(postId, publishedOn, expiredAt, header, body, footer);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedPostDto)) {
            return false;
        }
        FeedPostDto feedPostDto = (FeedPostDto) other;
        return Intrinsics.a(this.postId, feedPostDto.postId) && Intrinsics.a(this.publishedOn, feedPostDto.publishedOn) && Intrinsics.a(this.expiredAt, feedPostDto.expiredAt) && Intrinsics.a(this.header, feedPostDto.header) && Intrinsics.a(this.body, feedPostDto.body) && Intrinsics.a(this.footer, feedPostDto.footer);
    }

    public final BodyDto getBody() {
        return this.body;
    }

    public final String getExpiredAt() {
        return this.expiredAt;
    }

    public final FooterDto getFooter() {
        return this.footer;
    }

    public final HeaderDto getHeader() {
        return this.header;
    }

    public final String getPostId() {
        return this.postId;
    }

    public final String getPublishedOn() {
        return this.publishedOn;
    }

    public int hashCode() {
        String str = this.postId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.publishedOn;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expiredAt;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        HeaderDto headerDto = this.header;
        int hashCode4 = (hashCode3 + (headerDto == null ? 0 : headerDto.hashCode())) * 31;
        BodyDto bodyDto = this.body;
        int hashCode5 = (hashCode4 + (bodyDto == null ? 0 : bodyDto.hashCode())) * 31;
        FooterDto footerDto = this.footer;
        return hashCode5 + (footerDto != null ? footerDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.postId;
        String str2 = this.publishedOn;
        String str3 = this.expiredAt;
        HeaderDto headerDto = this.header;
        BodyDto bodyDto = this.body;
        FooterDto footerDto = this.footer;
        StringBuilder l10 = e.l("FeedPostDto(postId=", str, ", publishedOn=", str2, ", expiredAt=");
        l10.append(str3);
        l10.append(", header=");
        l10.append(headerDto);
        l10.append(", body=");
        l10.append(bodyDto);
        l10.append(", footer=");
        l10.append(footerDto);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.postId);
        parcel.writeString(this.publishedOn);
        parcel.writeString(this.expiredAt);
        HeaderDto headerDto = this.header;
        if (headerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            headerDto.writeToParcel(parcel, flags);
        }
        BodyDto bodyDto = this.body;
        if (bodyDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bodyDto.writeToParcel(parcel, flags);
        }
        FooterDto footerDto = this.footer;
        if (footerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            footerDto.writeToParcel(parcel, flags);
        }
    }
}
