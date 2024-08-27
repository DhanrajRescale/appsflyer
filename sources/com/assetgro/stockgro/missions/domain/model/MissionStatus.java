package com.assetgro.stockgro.missions.domain.model;

import bu.a;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/assetgro/stockgro/missions/domain/model/MissionStatus;", HttpUrl.FRAGMENT_ENCODE_SET, "paramName", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;ILjava/lang/String;)V", "getParamName", "()Ljava/lang/String;", "NOT_STARTED", "UNDER_REVIEW", "FAILED", "COMPLETED", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MissionStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MissionStatus[] $VALUES;

    @NotNull
    private final String paramName;
    public static final MissionStatus NOT_STARTED = new MissionStatus("NOT_STARTED", 0, HttpUrl.FRAGMENT_ENCODE_SET);
    public static final MissionStatus UNDER_REVIEW = new MissionStatus("UNDER_REVIEW", 1, "in-review");
    public static final MissionStatus FAILED = new MissionStatus("FAILED", 2, "failed");
    public static final MissionStatus COMPLETED = new MissionStatus("COMPLETED", 3, "completed");

    private static final /* synthetic */ MissionStatus[] $values() {
        return new MissionStatus[]{NOT_STARTED, UNDER_REVIEW, FAILED, COMPLETED};
    }

    static {
        MissionStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f.E($values);
    }

    private MissionStatus(String str, int i10, String str2) {
        this.paramName = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static MissionStatus valueOf(String str) {
        return (MissionStatus) Enum.valueOf(MissionStatus.class, str);
    }

    public static MissionStatus[] values() {
        return (MissionStatus[]) $VALUES.clone();
    }

    @NotNull
    public final String getParamName() {
        return this.paramName;
    }
}
