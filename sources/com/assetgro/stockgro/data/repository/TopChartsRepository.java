package com.assetgro.stockgro.data.repository;

import at.m;
import com.assetgro.stockgro.data.model.ChampionDto;
import com.assetgro.stockgro.data.model.homedata.WidgetData;
import com.assetgro.stockgro.data.remote.NetworkResult;
import com.assetgro.stockgro.data.remote.NetworkService;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.HomePageTopDataResponse;
import com.assetgro.stockgro.data.remote.response.base.BaseApiResponse;
import com.assetgro.stockgro.ui.home.homepage.data.MainHomeDto;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0002H\u0086@¢\u0006\u0004\b\t\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002H\u0086@¢\u0006\u0004\b\u000b\u0010\u0007J\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\fR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/assetgro/stockgro/data/repository/TopChartsRepository;", "Lcom/assetgro/stockgro/data/remote/response/base/BaseApiResponse;", "Lcom/assetgro/stockgro/data/remote/NetworkResult;", "Lcom/assetgro/stockgro/data/remote/response/BaseResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/ChampionDto;", "getAllChampions", "(Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/homedata/WidgetData;", "getHomePageDataV2", "Lcom/assetgro/stockgro/ui/home/homepage/data/MainHomeDto;", "getHomePageDataV3", "Lat/m;", "Lcom/assetgro/stockgro/data/remote/response/HomePageTopDataResponse;", "getHomePageTopData", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "networkService", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "<init>", "(Lcom/assetgro/stockgro/data/remote/NetworkService;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class TopChartsRepository extends BaseApiResponse {
    public static final int $stable = 8;

    @NotNull
    private final NetworkService networkService;

    @Inject
    public TopChartsRepository(@NotNull NetworkService networkService) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        this.networkService = networkService;
    }

    public final Object getAllChampions(@NotNull yt.a<? super NetworkResult<BaseResponseDto<List<ChampionDto>>>> aVar) {
        return safeApiCall(new TopChartsRepository$getAllChampions$2(this, null), aVar);
    }

    public final Object getHomePageDataV2(@NotNull yt.a<? super NetworkResult<BaseResponseDto<WidgetData>>> aVar) {
        return safeApiCall(new TopChartsRepository$getHomePageDataV2$2(this, null), aVar);
    }

    public final Object getHomePageDataV3(@NotNull yt.a<? super NetworkResult<BaseResponseDto<MainHomeDto>>> aVar) {
        return safeApiCall(new TopChartsRepository$getHomePageDataV3$2(this, null), aVar);
    }

    @NotNull
    public final m<BaseResponseDto<HomePageTopDataResponse>> getHomePageTopData() {
        return this.networkService.getTrendingStocks();
    }
}
