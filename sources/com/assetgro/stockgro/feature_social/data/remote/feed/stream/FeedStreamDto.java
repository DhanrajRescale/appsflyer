package com.assetgro.stockgro.feature_social.data.remote.feed.stream;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import hb.s;
import hb.t;
import hb.u;
import hb.v;
import hb.w;
import hb.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import vt.i0;
import vt.z;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0019\u001a\u001bB;\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedStreamDto;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "isCalledFromChat", "Lhb/x;", "toFeedCategory", HttpUrl.FRAGMENT_ENCODE_SET, "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedStreamDto$FeedStreamElementDto;", "elements", "Ljava/util/List;", "getElements", "()Ljava/util/List;", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedStreamDto$FiltersDto;", "filters", "getFilters", "isEndOfResponse", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)V", "FeedStreamElementDto", "FiltersDto", "SymbolsMetaDto", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FeedStreamDto {
    public static final int $stable = 8;

    @SerializedName("elements")
    private final List<FeedStreamElementDto> elements;

    @SerializedName("page_filter")
    private final List<FiltersDto> filters;

    @SerializedName("end_of_response")
    private final Boolean isEndOfResponse;

    @SerializedName("page_title")
    private final String title;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedStreamDto$FeedStreamElementDto;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "isCalledFromChat", "Lhb/u;", "toFeedCategoryElement", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto;", "post", "Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto;", "getPost", "()Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto;", "<init>", "(Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedPostDto;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class FeedStreamElementDto {
        public static final int $stable = 8;

        @SerializedName("post")
        private final FeedPostDto post;

        public FeedStreamElementDto(FeedPostDto feedPostDto) {
            this.post = feedPostDto;
        }

        public final FeedPostDto getPost() {
            return this.post;
        }

        public final u toFeedCategoryElement(boolean isCalledFromChat) {
            s a10;
            FeedPostDto feedPostDto = this.post;
            if (feedPostDto == null || (a10 = t.a(feedPostDto, isCalledFromChat)) == null) {
                return null;
            }
            return new u(a10);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedStreamDto$FiltersDto;", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getTitle", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class FiltersDto {
        public static final int $stable = 0;

        @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
        private final String name;

        @SerializedName("title")
        private final String title;

        public FiltersDto(String str, String str2) {
            this.name = str;
            this.title = str2;
        }

        public final String getName() {
            return this.name;
        }

        public final String getTitle() {
            return this.title;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/assetgro/stockgro/feature_social/data/remote/feed/stream/FeedStreamDto$SymbolsMetaDto;", HttpUrl.FRAGMENT_ENCODE_SET, "Lhb/w;", "toSymbolsMeta", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.NAME, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "imageUrl", "getImageUrl", "symbol", "getSymbol", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class SymbolsMetaDto {
        public static final int $stable = 0;

        @SerializedName("image_url")
        private final String imageUrl;

        @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
        @NotNull
        private final String name;

        @SerializedName("symbol")
        @NotNull
        private final String symbol;

        public SymbolsMetaDto(@NotNull String name, String str, @NotNull String symbol) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.name = name;
            this.imageUrl = str;
            this.symbol = symbol;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getSymbol() {
            return this.symbol;
        }

        @NotNull
        public final w toSymbolsMeta() {
            return new w(this.name, this.imageUrl, this.symbol);
        }
    }

    public FeedStreamDto(String str, List<FeedStreamElementDto> list, List<FiltersDto> list2, Boolean bool) {
        this.title = str;
        this.elements = list;
        this.filters = list2;
        this.isEndOfResponse = bool;
    }

    public static /* synthetic */ x toFeedCategory$default(FeedStreamDto feedStreamDto, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return feedStreamDto.toFeedCategory(z10);
    }

    public final List<FeedStreamElementDto> getElements() {
        return this.elements;
    }

    public final List<FiltersDto> getFilters() {
        return this.filters;
    }

    public final String getTitle() {
        return this.title;
    }

    /* renamed from: isEndOfResponse, reason: from getter */
    public final Boolean getIsEndOfResponse() {
        return this.isEndOfResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [vt.i0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    @NotNull
    public final x toFeedCategory(boolean isCalledFromChat) {
        ArrayList arrayList;
        boolean z10;
        ?? r42;
        String str = this.title;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        List<FeedStreamElementDto> list = this.elements;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                u feedCategoryElement = ((FeedStreamElementDto) it.next()).toFeedCategoryElement(isCalledFromChat);
                if (feedCategoryElement != null) {
                    arrayList.add(feedCategoryElement);
                }
            }
        } else {
            arrayList = new ArrayList();
        }
        Boolean bool = this.isEndOfResponse;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = true;
        }
        List<FiltersDto> list2 = this.filters;
        if (list2 != null) {
            r42 = new ArrayList(z.k(list2));
            for (FiltersDto filtersDto : list2) {
                String title = filtersDto.getTitle();
                if (title == null) {
                    title = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String name = filtersDto.getName();
                if (name == null) {
                    name = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                r42.add(new v(name, title, false));
            }
        } else {
            r42 = i0.f38321a;
        }
        return new x(str, arrayList, z10, r42);
    }
}
