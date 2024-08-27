package com.assetgro.stockgro.missions.domain.model;

import da.e;
import kotlin.Metadata;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/assetgro/stockgro/missions/domain/model/MissionsHistoryConsolidated;", HttpUrl.FRAGMENT_ENCODE_SET, "inReview", HttpUrl.FRAGMENT_ENCODE_SET, "completed", "failed", "(III)V", "getCompleted", "()I", "getFailed", "getInReview", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MissionsHistoryConsolidated {
    public static final int $stable = 0;
    private final int completed;
    private final int failed;
    private final int inReview;

    public MissionsHistoryConsolidated(int i10, int i11, int i12) {
        this.inReview = i10;
        this.completed = i11;
        this.failed = i12;
    }

    public static /* synthetic */ MissionsHistoryConsolidated copy$default(MissionsHistoryConsolidated missionsHistoryConsolidated, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = missionsHistoryConsolidated.inReview;
        }
        if ((i13 & 2) != 0) {
            i11 = missionsHistoryConsolidated.completed;
        }
        if ((i13 & 4) != 0) {
            i12 = missionsHistoryConsolidated.failed;
        }
        return missionsHistoryConsolidated.copy(i10, i11, i12);
    }

    /* renamed from: component1, reason: from getter */
    public final int getInReview() {
        return this.inReview;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCompleted() {
        return this.completed;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFailed() {
        return this.failed;
    }

    @NotNull
    public final MissionsHistoryConsolidated copy(int inReview, int completed, int failed) {
        return new MissionsHistoryConsolidated(inReview, completed, failed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionsHistoryConsolidated)) {
            return false;
        }
        MissionsHistoryConsolidated missionsHistoryConsolidated = (MissionsHistoryConsolidated) other;
        return this.inReview == missionsHistoryConsolidated.inReview && this.completed == missionsHistoryConsolidated.completed && this.failed == missionsHistoryConsolidated.failed;
    }

    public final int getCompleted() {
        return this.completed;
    }

    public final int getFailed() {
        return this.failed;
    }

    public final int getInReview() {
        return this.inReview;
    }

    public int hashCode() {
        return Integer.hashCode(this.failed) + e.f(this.completed, Integer.hashCode(this.inReview) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i10 = this.inReview;
        int i11 = this.completed;
        return d.m(e.q("MissionsHistoryConsolidated(inReview=", i10, ", completed=", i11, ", failed="), this.failed, ")");
    }
}
