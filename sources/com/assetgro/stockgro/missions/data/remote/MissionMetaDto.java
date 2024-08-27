package com.assetgro.stockgro.missions.data.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/assetgro/stockgro/missions/data/remote/MissionMetaDto;", HttpUrl.FRAGMENT_ENCODE_SET, "taskMeta", "Lcom/assetgro/stockgro/missions/data/remote/MetaDto;", "(Lcom/assetgro/stockgro/missions/data/remote/MetaDto;)V", "getTaskMeta", "()Lcom/assetgro/stockgro/missions/data/remote/MetaDto;", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MissionMetaDto {
    public static final int $stable = 0;

    @SerializedName("task_meta")
    private final MetaDto taskMeta;

    public MissionMetaDto(MetaDto metaDto) {
        this.taskMeta = metaDto;
    }

    public static /* synthetic */ MissionMetaDto copy$default(MissionMetaDto missionMetaDto, MetaDto metaDto, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            metaDto = missionMetaDto.taskMeta;
        }
        return missionMetaDto.copy(metaDto);
    }

    /* renamed from: component1, reason: from getter */
    public final MetaDto getTaskMeta() {
        return this.taskMeta;
    }

    @NotNull
    public final MissionMetaDto copy(MetaDto taskMeta) {
        return new MissionMetaDto(taskMeta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MissionMetaDto) && Intrinsics.a(this.taskMeta, ((MissionMetaDto) other).taskMeta);
    }

    public final MetaDto getTaskMeta() {
        return this.taskMeta;
    }

    public int hashCode() {
        MetaDto metaDto = this.taskMeta;
        if (metaDto == null) {
            return 0;
        }
        return metaDto.hashCode();
    }

    @NotNull
    public String toString() {
        return "MissionMetaDto(taskMeta=" + this.taskMeta + ")";
    }
}
