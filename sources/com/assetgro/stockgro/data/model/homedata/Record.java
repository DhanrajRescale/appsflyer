package com.assetgro.stockgro.data.model.homedata;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/assetgro/stockgro/data/model/homedata/Record;", HttpUrl.FRAGMENT_ENCODE_SET, AppMeasurementSdk.ConditionalUserProperty.NAME, HttpUrl.FRAGMENT_ENCODE_SET, PaymentConstants.TIMESTAMP, HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;J)V", "getName", "()Ljava/lang/String;", "getTimestamp", "()J", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Record {
    public static final int $stable = 0;

    @NotNull
    private final String name;
    private final long timestamp;

    public Record(@NotNull String name, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.timestamp = j10;
    }

    public static /* synthetic */ Record copy$default(Record record, String str, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = record.name;
        }
        if ((i10 & 2) != 0) {
            j10 = record.timestamp;
        }
        return record.copy(str, j10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final Record copy(@NotNull String name, long timestamp) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Record(name, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Record)) {
            return false;
        }
        Record record = (Record) other;
        return Intrinsics.a(this.name, record.name) && this.timestamp == record.timestamp;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + (this.name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "Record(name=" + this.name + ", timestamp=" + this.timestamp + ")";
    }
}
