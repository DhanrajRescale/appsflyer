package com.assetgro.stockgro.data.repository;

import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.assetgro.stockgro.data.remote.NetworkService;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.missions.data.remote.MetaDto;
import com.assetgro.stockgro.missions.data.remote.MissionDetailDto;
import com.assetgro.stockgro.missions.data.remote.MissionMetaDto;
import com.assetgro.stockgro.missions.data.remote.MissionsHistoryByStatusDto;
import com.assetgro.stockgro.missions.data.remote.MissionsHistoryConsolidatedDto;
import com.assetgro.stockgro.missions.data.remote.MissionsHomeDto;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0002H\u0086@¢\u0006\u0004\b\b\u0010\u0006J$\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\u00022\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00030\u00022\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u0012\u0010\rJ$\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00030\u00022\u0006\u0010\u0013\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u0015\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/assetgro/stockgro/data/repository/MissionsRepository;", HttpUrl.FRAGMENT_ENCODE_SET, "Lnv/v0;", "Lcom/assetgro/stockgro/data/remote/response/BaseResponseDto;", "Lcom/assetgro/stockgro/missions/data/remote/MissionsHomeDto;", "getUserMissions", "(Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/missions/data/remote/MissionsHistoryConsolidatedDto;", "getUserMissionsHistoryConsolidated", HttpUrl.FRAGMENT_ENCODE_SET, "taskId", "Lcom/assetgro/stockgro/missions/data/remote/MissionDetailDto;", "getUserMissionDetails", "(Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "input", HttpUrl.FRAGMENT_ENCODE_SET, "startMission", "(Ljava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "retryMission", "status", "Lcom/assetgro/stockgro/missions/data/remote/MissionsHistoryByStatusDto;", "getUserMissionsHistoryByStatus", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "networkService", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "userPreferences", "Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "<init>", "(Lcom/assetgro/stockgro/data/remote/NetworkService;Lcom/assetgro/stockgro/data/local/preference/UserPreferences;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MissionsRepository {
    public static final int $stable = 8;

    @NotNull
    private final NetworkService networkService;

    @NotNull
    private final UserPreferences userPreferences;

    @Inject
    public MissionsRepository(@NotNull NetworkService networkService, @NotNull UserPreferences userPreferences) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(userPreferences, "userPreferences");
        this.networkService = networkService;
        this.userPreferences = userPreferences;
    }

    public final Object getUserMissionDetails(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseDto<MissionDetailDto>>> aVar) {
        return this.networkService.getUserMissionDetails(this.userPreferences.getUuid(), str, aVar);
    }

    public final Object getUserMissions(@NotNull yt.a<? super v0<BaseResponseDto<MissionsHomeDto>>> aVar) {
        return this.networkService.getUserMissions(this.userPreferences.getUuid(), aVar);
    }

    public final Object getUserMissionsHistoryByStatus(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseDto<MissionsHistoryByStatusDto>>> aVar) {
        return this.networkService.getUserMissionsHistoryByStatus(this.userPreferences.getUuid(), str, aVar);
    }

    public final Object getUserMissionsHistoryConsolidated(@NotNull yt.a<? super v0<BaseResponseDto<MissionsHistoryConsolidatedDto>>> aVar) {
        return this.networkService.getUserMissionsHistoryConsolidated(this.userPreferences.getUuid(), aVar);
    }

    public final Object retryMission(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseDto<Unit>>> aVar) {
        return this.networkService.retryMission(this.userPreferences.getUuid(), str, aVar);
    }

    public final Object startMission(@NotNull String str, String str2, @NotNull yt.a<? super v0<BaseResponseDto<Unit>>> aVar) {
        return this.networkService.startMission(this.userPreferences.getUuid(), str, new MissionMetaDto(new MetaDto(str2)), aVar);
    }
}
