package com.assetgro.stockgro.data.model.homedata;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/assetgro/stockgro/data/model/homedata/ScrollDepth;", HttpUrl.FRAGMENT_ENCODE_SET, "view_widgets", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/homedata/Record;", "entry_timestamp", HttpUrl.FRAGMENT_ENCODE_SET, "exit_timestamp", "(Ljava/util/List;JJ)V", "getEntry_timestamp", "()J", "getExit_timestamp", "getView_widgets", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ScrollDepth {
    public static final int $stable = 8;
    private final long entry_timestamp;
    private final long exit_timestamp;

    @NotNull
    private final List<Record> view_widgets;

    public ScrollDepth(@NotNull List<Record> view_widgets, long j10, long j11) {
        Intrinsics.checkNotNullParameter(view_widgets, "view_widgets");
        this.view_widgets = view_widgets;
        this.entry_timestamp = j10;
        this.exit_timestamp = j11;
    }

    public static /* synthetic */ ScrollDepth copy$default(ScrollDepth scrollDepth, List list, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = scrollDepth.view_widgets;
        }
        if ((i10 & 2) != 0) {
            j10 = scrollDepth.entry_timestamp;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = scrollDepth.exit_timestamp;
        }
        return scrollDepth.copy(list, j12, j11);
    }

    @NotNull
    public final List<Record> component1() {
        return this.view_widgets;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEntry_timestamp() {
        return this.entry_timestamp;
    }

    /* renamed from: component3, reason: from getter */
    public final long getExit_timestamp() {
        return this.exit_timestamp;
    }

    @NotNull
    public final ScrollDepth copy(@NotNull List<Record> view_widgets, long entry_timestamp, long exit_timestamp) {
        Intrinsics.checkNotNullParameter(view_widgets, "view_widgets");
        return new ScrollDepth(view_widgets, entry_timestamp, exit_timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollDepth)) {
            return false;
        }
        ScrollDepth scrollDepth = (ScrollDepth) other;
        return Intrinsics.a(this.view_widgets, scrollDepth.view_widgets) && this.entry_timestamp == scrollDepth.entry_timestamp && this.exit_timestamp == scrollDepth.exit_timestamp;
    }

    public final long getEntry_timestamp() {
        return this.entry_timestamp;
    }

    public final long getExit_timestamp() {
        return this.exit_timestamp;
    }

    @NotNull
    public final List<Record> getView_widgets() {
        return this.view_widgets;
    }

    public int hashCode() {
        return Long.hashCode(this.exit_timestamp) + e.c(this.entry_timestamp, this.view_widgets.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "ScrollDepth(view_widgets=" + this.view_widgets + ", entry_timestamp=" + this.entry_timestamp + ", exit_timestamp=" + this.exit_timestamp + ")";
    }
}
