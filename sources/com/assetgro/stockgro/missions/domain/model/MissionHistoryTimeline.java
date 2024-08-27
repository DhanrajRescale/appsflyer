package com.assetgro.stockgro.missions.domain.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/assetgro/stockgro/missions/domain/model/MissionHistoryTimeline;", HttpUrl.FRAGMENT_ENCODE_SET, "date", HttpUrl.FRAGMENT_ENCODE_SET, "list", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/missions/domain/model/UserTask;", "(JLjava/util/List;)V", "getDate", "()J", "getList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MissionHistoryTimeline {
    public static final int $stable = 8;
    private final long date;

    @NotNull
    private final List<UserTask> list;

    public MissionHistoryTimeline(long j10, @NotNull List<UserTask> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.date = j10;
        this.list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MissionHistoryTimeline copy$default(MissionHistoryTimeline missionHistoryTimeline, long j10, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = missionHistoryTimeline.date;
        }
        if ((i10 & 2) != 0) {
            list = missionHistoryTimeline.list;
        }
        return missionHistoryTimeline.copy(j10, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    @NotNull
    public final List<UserTask> component2() {
        return this.list;
    }

    @NotNull
    public final MissionHistoryTimeline copy(long date, @NotNull List<UserTask> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return new MissionHistoryTimeline(date, list);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionHistoryTimeline)) {
            return false;
        }
        MissionHistoryTimeline missionHistoryTimeline = (MissionHistoryTimeline) other;
        return this.date == missionHistoryTimeline.date && Intrinsics.a(this.list, missionHistoryTimeline.list);
    }

    public final long getDate() {
        return this.date;
    }

    @NotNull
    public final List<UserTask> getList() {
        return this.list;
    }

    public int hashCode() {
        return this.list.hashCode() + (Long.hashCode(this.date) * 31);
    }

    @NotNull
    public String toString() {
        return "MissionHistoryTimeline(date=" + this.date + ", list=" + this.list + ")";
    }
}
