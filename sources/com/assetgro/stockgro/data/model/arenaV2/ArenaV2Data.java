package com.assetgro.stockgro.data.model.arenaV2;

import a3.a;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/assetgro/stockgro/data/model/arenaV2/ArenaV2Data;", HttpUrl.FRAGMENT_ENCODE_SET, "arenaAllData", "Lcom/assetgro/stockgro/data/model/arenaV2/ArenaAllData;", "errorCode", HttpUrl.FRAGMENT_ENCODE_SET, "errorMessage", "status", "(Lcom/assetgro/stockgro/data/model/arenaV2/ArenaAllData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getArenaAllData", "()Lcom/assetgro/stockgro/data/model/arenaV2/ArenaAllData;", "getErrorCode", "()Ljava/lang/String;", "getErrorMessage", "getStatus", "component1", "component2", "component3", "component4", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ArenaV2Data {
    public static final int $stable = 8;

    @SerializedName("data")
    @NotNull
    private final ArenaAllData arenaAllData;

    @SerializedName("error_code")
    @NotNull
    private final String errorCode;

    @SerializedName("error_message")
    @NotNull
    private final String errorMessage;

    @SerializedName("status")
    @NotNull
    private final String status;

    public ArenaV2Data(@NotNull ArenaAllData arenaAllData, @NotNull String errorCode, @NotNull String errorMessage, @NotNull String status) {
        Intrinsics.checkNotNullParameter(arenaAllData, "arenaAllData");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(status, "status");
        this.arenaAllData = arenaAllData;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.status = status;
    }

    public static /* synthetic */ ArenaV2Data copy$default(ArenaV2Data arenaV2Data, ArenaAllData arenaAllData, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arenaAllData = arenaV2Data.arenaAllData;
        }
        if ((i10 & 2) != 0) {
            str = arenaV2Data.errorCode;
        }
        if ((i10 & 4) != 0) {
            str2 = arenaV2Data.errorMessage;
        }
        if ((i10 & 8) != 0) {
            str3 = arenaV2Data.status;
        }
        return arenaV2Data.copy(arenaAllData, str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ArenaAllData getArenaAllData() {
        return this.arenaAllData;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final ArenaV2Data copy(@NotNull ArenaAllData arenaAllData, @NotNull String errorCode, @NotNull String errorMessage, @NotNull String status) {
        Intrinsics.checkNotNullParameter(arenaAllData, "arenaAllData");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(status, "status");
        return new ArenaV2Data(arenaAllData, errorCode, errorMessage, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArenaV2Data)) {
            return false;
        }
        ArenaV2Data arenaV2Data = (ArenaV2Data) other;
        return Intrinsics.a(this.arenaAllData, arenaV2Data.arenaAllData) && Intrinsics.a(this.errorCode, arenaV2Data.errorCode) && Intrinsics.a(this.errorMessage, arenaV2Data.errorMessage) && Intrinsics.a(this.status, arenaV2Data.status);
    }

    @NotNull
    public final ArenaAllData getArenaAllData() {
        return this.arenaAllData;
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + h.g(this.errorMessage, h.g(this.errorCode, this.arenaAllData.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        ArenaAllData arenaAllData = this.arenaAllData;
        String str = this.errorCode;
        String str2 = this.errorMessage;
        String str3 = this.status;
        StringBuilder sb2 = new StringBuilder("ArenaV2Data(arenaAllData=");
        sb2.append(arenaAllData);
        sb2.append(", errorCode=");
        sb2.append(str);
        sb2.append(", errorMessage=");
        return a.k(sb2, str2, ", status=", str3, ")");
    }
}
