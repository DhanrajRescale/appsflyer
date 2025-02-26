package com.assetgro.stockgro.missions.domain.model;

import bu.a;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/assetgro/stockgro/missions/domain/model/MissionTaskType;", HttpUrl.FRAGMENT_ENCODE_SET, "taskName", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;ILjava/lang/String;)V", "getTaskName", "()Ljava/lang/String;", "USER_INPUT", "STOCKGRO_TASK", "THIRDPARTY_TASK", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MissionTaskType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MissionTaskType[] $VALUES;

    @NotNull
    private final String taskName;
    public static final MissionTaskType USER_INPUT = new MissionTaskType("USER_INPUT", 0, "user-input");
    public static final MissionTaskType STOCKGRO_TASK = new MissionTaskType("STOCKGRO_TASK", 1, "stockgro-task");
    public static final MissionTaskType THIRDPARTY_TASK = new MissionTaskType("THIRDPARTY_TASK", 2, "thirdparty-app-task");

    private static final /* synthetic */ MissionTaskType[] $values() {
        return new MissionTaskType[]{USER_INPUT, STOCKGRO_TASK, THIRDPARTY_TASK};
    }

    static {
        MissionTaskType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f.E($values);
    }

    private MissionTaskType(String str, int i10, String str2) {
        this.taskName = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static MissionTaskType valueOf(String str) {
        return (MissionTaskType) Enum.valueOf(MissionTaskType.class, str);
    }

    public static MissionTaskType[] values() {
        return (MissionTaskType[]) $VALUES.clone();
    }

    @NotNull
    public final String getTaskName() {
        return this.taskName;
    }
}
