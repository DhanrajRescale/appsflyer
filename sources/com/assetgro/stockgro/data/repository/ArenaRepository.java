package com.assetgro.stockgro.data.repository;

import at.m;
import com.assetgro.stockgro.data.ArenaAchievementShareDto;
import com.assetgro.stockgro.data.model.InviteTemplateDto;
import com.assetgro.stockgro.data.model.LeagueUnifiedResponseDto;
import com.assetgro.stockgro.data.model.TopLeaguesDto;
import com.assetgro.stockgro.data.model.arenaV2.ArenaAllData;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.model.arenaV2.ArenaSortOptions;
import com.assetgro.stockgro.data.remote.NetworkResult;
import com.assetgro.stockgro.data.remote.NetworkService;
import com.assetgro.stockgro.data.remote.request.LeagueExitRequestDto;
import com.assetgro.stockgro.data.remote.request.LeagueJoinRequestDto;
import com.assetgro.stockgro.data.remote.request.LeagueReportRequestDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto;
import com.assetgro.stockgro.data.remote.response.InviteTemplateResponse;
import com.assetgro.stockgro.data.remote.response.LeagueEligibiltyResponseDto;
import com.assetgro.stockgro.data.remote.response.base.BaseApiResponse;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b4\u00105J$\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0010\u0010\u0007J$\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0012\u0010\u0007J>\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\n2\u0006\u0010\u001b\u001a\u00020\u001aJ\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\n2\u0006\u0010\u001e\u001a\u00020\u001dJ\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00050\n2\u0006\u0010\u0003\u001a\u00020\u0002J&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00050\u00042\b\u0010#\u001a\u0004\u0018\u00010\"H\u0086@¢\u0006\u0004\b%\u0010&JB\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0\u00042\u0006\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b+\u0010,J$\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0\u00042\u0006\u0010\u0013\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b-\u0010\u0007J\u001c\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0)0\u0004H\u0086@¢\u0006\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/assetgro/stockgro/data/repository/ArenaRepository;", "Lcom/assetgro/stockgro/data/remote/response/base/BaseApiResponse;", HttpUrl.FRAGMENT_ENCODE_SET, "leagueId", "Lnv/v0;", "Lcom/assetgro/stockgro/data/remote/response/BaseResponseDto;", "joinLeagueWithAutomaticPortfolioSelection", "(Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", HttpUrl.FRAGMENT_ENCODE_SET, "pageNumber", "Lat/m;", "Lcom/assetgro/stockgro/data/model/TopLeaguesDto;", "getWinners", "(Ljava/lang/String;Ljava/lang/Integer;)Lat/m;", "Lcom/assetgro/stockgro/data/remote/NetworkResult;", "Lcom/assetgro/stockgro/data/ArenaAchievementShareDto;", "shareYourAchievementCta", "Lcom/assetgro/stockgro/data/model/arenaV2/ArenaGame;", "getLeagueInfo", "assetClass", "portfolioId", HttpUrl.FRAGMENT_ENCODE_SET, "ignoreSquaredValues", "Lcom/assetgro/stockgro/data/model/LeagueUnifiedResponseDto;", "getUnifiedLeaguePortfolioData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/request/LeagueExitRequestDto;", "leagueExitRequestDto", "exitLeague", "Lcom/assetgro/stockgro/data/remote/request/LeagueReportRequestDto;", "leagueReportRequestDto", "reportLeague", "Lcom/assetgro/stockgro/data/remote/response/LeagueEligibiltyResponseDto;", "checkLeagueEligibilty", "Lcom/assetgro/stockgro/data/model/InviteTemplateDto;", "inviteTemplateDto", "Lcom/assetgro/stockgro/data/remote/response/InviteTemplateResponse;", "getInviteTemplate", "(Lcom/assetgro/stockgro/data/model/InviteTemplateDto;Lyt/a;)Ljava/lang/Object;", "sortBy", "sortDirection", "Lcom/assetgro/stockgro/data/remote/response/BaseResponseV2Dto;", "Lcom/assetgro/stockgro/data/model/arenaV2/ArenaAllData;", "getAllUpcomingLeaguesLokiWithAssetClass", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "getAllMyLeaguesLokiWithAssetClass", "Lcom/assetgro/stockgro/data/model/arenaV2/ArenaSortOptions;", "getAllSortOptions", "(Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "networkService", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "<init>", "(Lcom/assetgro/stockgro/data/remote/NetworkService;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ArenaRepository extends BaseApiResponse {
    public static final int $stable = 8;

    @NotNull
    private final NetworkService networkService;

    @Inject
    public ArenaRepository(@NotNull NetworkService networkService) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        this.networkService = networkService;
    }

    public static /* synthetic */ Object getAllUpcomingLeaguesLokiWithAssetClass$default(ArenaRepository arenaRepository, String str, String str2, String str3, String str4, yt.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "1";
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = "startTime";
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = "desc";
        }
        return arenaRepository.getAllUpcomingLeaguesLokiWithAssetClass(str, str5, str6, str4, aVar);
    }

    @NotNull
    public final m<BaseResponseDto<LeagueEligibiltyResponseDto>> checkLeagueEligibilty(@NotNull String leagueId) {
        Intrinsics.checkNotNullParameter(leagueId, "leagueId");
        return this.networkService.checkLeagueEligibilty(leagueId);
    }

    @NotNull
    public final m<BaseResponseDto<String>> exitLeague(@NotNull LeagueExitRequestDto leagueExitRequestDto) {
        Intrinsics.checkNotNullParameter(leagueExitRequestDto, "leagueExitRequestDto");
        return this.networkService.exitLeague(leagueExitRequestDto);
    }

    public final Object getAllMyLeaguesLokiWithAssetClass(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseV2Dto<ArenaAllData>>> aVar) {
        return this.networkService.getAllMyLeaguesWithAssets(str, aVar);
    }

    public final Object getAllSortOptions(@NotNull yt.a<? super v0<BaseResponseV2Dto<ArenaSortOptions>>> aVar) {
        return this.networkService.getAllSortOptions(aVar);
    }

    public final Object getAllUpcomingLeaguesLokiWithAssetClass(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull yt.a<? super v0<BaseResponseV2Dto<ArenaAllData>>> aVar) {
        return this.networkService.getAllUpcomingLeaguesWithAssets(str, str2, str3, str4, aVar);
    }

    public final Object getInviteTemplate(InviteTemplateDto inviteTemplateDto, @NotNull yt.a<? super v0<BaseResponseDto<InviteTemplateResponse>>> aVar) {
        return this.networkService.getTemplateFromGooglyService(inviteTemplateDto, aVar);
    }

    public final Object getLeagueInfo(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseDto<ArenaGame>>> aVar) {
        return this.networkService.getLeagueInfo(str, aVar);
    }

    public final Object getUnifiedLeaguePortfolioData(@NotNull String str, @NotNull String str2, String str3, boolean z10, @NotNull yt.a<? super v0<BaseResponseDto<LeagueUnifiedResponseDto>>> aVar) {
        if (Intrinsics.a(str, "OPTIONS")) {
            return NetworkService.DefaultImpls.getPrepZoneOptionPortfolioData$default(this.networkService, str2, str3, Boolean.TRUE, Boolean.valueOf(z10), null, null, aVar, 48, null);
        }
        return this.networkService.getPrepZoneEquityPortfolioData(str2, str3, Boolean.TRUE, Boolean.valueOf(z10), aVar);
    }

    @NotNull
    public final m<BaseResponseDto<TopLeaguesDto>> getWinners(@NotNull String leagueId, Integer pageNumber) {
        Intrinsics.checkNotNullParameter(leagueId, "leagueId");
        return this.networkService.getWinners(leagueId, pageNumber);
    }

    public final Object joinLeagueWithAutomaticPortfolioSelection(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseDto<String>>> aVar) {
        return this.networkService.joinLeagueWithAutomaticPortfolioSelection(new LeagueJoinRequestDto(str), aVar);
    }

    @NotNull
    public final m<BaseResponseDto<String>> reportLeague(@NotNull LeagueReportRequestDto leagueReportRequestDto) {
        Intrinsics.checkNotNullParameter(leagueReportRequestDto, "leagueReportRequestDto");
        return this.networkService.reportLeague(leagueReportRequestDto);
    }

    public final Object shareYourAchievementCta(@NotNull String str, @NotNull yt.a<? super NetworkResult<BaseResponseDto<ArenaAchievementShareDto>>> aVar) {
        return safeApiCall(new ArenaRepository$shareYourAchievementCta$2(this, str, null), aVar);
    }
}
