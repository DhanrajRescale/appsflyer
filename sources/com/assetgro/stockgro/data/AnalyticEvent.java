package com.assetgro.stockgro.data;

import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012$\b\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J%\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J9\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032$\b\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR-\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/assetgro/stockgro/data/AnalyticEvent;", "Ljava/io/Serializable;", "eventName", HttpUrl.FRAGMENT_ENCODE_SET, "param", "Ljava/util/HashMap;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/collections/HashMap;", "(Ljava/lang/String;Ljava/util/HashMap;)V", "getEventName", "()Ljava/lang/String;", "getParam", "()Ljava/util/HashMap;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AnalyticEvent implements Serializable {
    public static final int $stable = 8;

    @NotNull
    private final String eventName;

    @NotNull
    private final HashMap<String, Object> param;

    public AnalyticEvent(@NotNull String eventName, @NotNull HashMap<String, Object> param) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(param, "param");
        this.eventName = eventName;
        this.param = param;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalyticEvent copy$default(AnalyticEvent analyticEvent, String str, HashMap hashMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = analyticEvent.eventName;
        }
        if ((i10 & 2) != 0) {
            hashMap = analyticEvent.param;
        }
        return analyticEvent.copy(str, hashMap);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final HashMap<String, Object> component2() {
        return this.param;
    }

    @NotNull
    public final AnalyticEvent copy(@NotNull String eventName, @NotNull HashMap<String, Object> param) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(param, "param");
        return new AnalyticEvent(eventName, param);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticEvent)) {
            return false;
        }
        AnalyticEvent analyticEvent = (AnalyticEvent) other;
        return Intrinsics.a(this.eventName, analyticEvent.eventName) && Intrinsics.a(this.param, analyticEvent.param);
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final HashMap<String, Object> getParam() {
        return this.param;
    }

    public int hashCode() {
        return this.param.hashCode() + (this.eventName.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AnalyticEvent(eventName=" + this.eventName + ", param=" + this.param + ")";
    }

    public /* synthetic */ AnalyticEvent(String str, HashMap hashMap, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? new HashMap() : hashMap);
    }
}
