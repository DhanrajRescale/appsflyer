package com.assetgro.stockgro.feature_market.domain.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import um.i;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b&\u0010'J\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004J\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J3\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0013HÖ\u0001R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/assetgro/stockgro/feature_market/domain/model/OptionHistory;", "Landroid/os/Parcelable;", "Ljava/util/ArrayList;", "Lum/i;", "Lkotlin/collections/ArrayList;", "getOneDayLineChartEntries", "getOneWeekLineChartEntries", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_market/domain/model/OptionHistoryChartData;", "component1", "component2", "Lcom/assetgro/stockgro/feature_market/domain/model/OptionOhlc;", "component3", "oneDay", "oneWeek", "olhcv", "copy", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", "Ljava/util/List;", "getOneDay", "()Ljava/util/List;", "getOneWeek", "Lcom/assetgro/stockgro/feature_market/domain/model/OptionOhlc;", "getOlhcv", "()Lcom/assetgro/stockgro/feature_market/domain/model/OptionOhlc;", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/assetgro/stockgro/feature_market/domain/model/OptionOhlc;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class OptionHistory implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<OptionHistory> CREATOR = new Creator();

    @NotNull
    private final OptionOhlc olhcv;

    @NotNull
    private final List<OptionHistoryChartData> oneDay;

    @NotNull
    private final List<OptionHistoryChartData> oneWeek;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<OptionHistory> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionHistory createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i10 = 0;
            int i11 = 0;
            while (i11 != readInt) {
                i11 = h.e(OptionHistoryChartData.CREATOR, parcel, arrayList, i11, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i10 != readInt2) {
                i10 = h.e(OptionHistoryChartData.CREATOR, parcel, arrayList2, i10, 1);
            }
            return new OptionHistory(arrayList, arrayList2, OptionOhlc.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionHistory[] newArray(int i10) {
            return new OptionHistory[i10];
        }
    }

    public OptionHistory(@NotNull List<OptionHistoryChartData> oneDay, @NotNull List<OptionHistoryChartData> oneWeek, @NotNull OptionOhlc olhcv) {
        Intrinsics.checkNotNullParameter(oneDay, "oneDay");
        Intrinsics.checkNotNullParameter(oneWeek, "oneWeek");
        Intrinsics.checkNotNullParameter(olhcv, "olhcv");
        this.oneDay = oneDay;
        this.oneWeek = oneWeek;
        this.olhcv = olhcv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionHistory copy$default(OptionHistory optionHistory, List list, List list2, OptionOhlc optionOhlc, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = optionHistory.oneDay;
        }
        if ((i10 & 2) != 0) {
            list2 = optionHistory.oneWeek;
        }
        if ((i10 & 4) != 0) {
            optionOhlc = optionHistory.olhcv;
        }
        return optionHistory.copy(list, list2, optionOhlc);
    }

    @NotNull
    public final List<OptionHistoryChartData> component1() {
        return this.oneDay;
    }

    @NotNull
    public final List<OptionHistoryChartData> component2() {
        return this.oneWeek;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final OptionOhlc getOlhcv() {
        return this.olhcv;
    }

    @NotNull
    public final OptionHistory copy(@NotNull List<OptionHistoryChartData> oneDay, @NotNull List<OptionHistoryChartData> oneWeek, @NotNull OptionOhlc olhcv) {
        Intrinsics.checkNotNullParameter(oneDay, "oneDay");
        Intrinsics.checkNotNullParameter(oneWeek, "oneWeek");
        Intrinsics.checkNotNullParameter(olhcv, "olhcv");
        return new OptionHistory(oneDay, oneWeek, olhcv);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionHistory)) {
            return false;
        }
        OptionHistory optionHistory = (OptionHistory) other;
        return Intrinsics.a(this.oneDay, optionHistory.oneDay) && Intrinsics.a(this.oneWeek, optionHistory.oneWeek) && Intrinsics.a(this.olhcv, optionHistory.olhcv);
    }

    @NotNull
    public final OptionOhlc getOlhcv() {
        return this.olhcv;
    }

    @NotNull
    public final List<OptionHistoryChartData> getOneDay() {
        return this.oneDay;
    }

    @NotNull
    public final ArrayList<i> getOneDayLineChartEntries() {
        List<OptionHistoryChartData> list = this.oneDay;
        ArrayList<i> arrayList = new ArrayList<>();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((OptionHistoryChartData) it.next()).toLineChartEntry());
        }
        return arrayList;
    }

    @NotNull
    public final List<OptionHistoryChartData> getOneWeek() {
        return this.oneWeek;
    }

    @NotNull
    public final ArrayList<i> getOneWeekLineChartEntries() {
        List<OptionHistoryChartData> list = this.oneWeek;
        ArrayList<i> arrayList = new ArrayList<>();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((OptionHistoryChartData) it.next()).toLineChartEntry());
        }
        return arrayList;
    }

    public int hashCode() {
        return this.olhcv.hashCode() + d.e(this.oneWeek, this.oneDay.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "OptionHistory(oneDay=" + this.oneDay + ", oneWeek=" + this.oneWeek + ", olhcv=" + this.olhcv + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Iterator p10 = a.p(this.oneDay, parcel);
        while (p10.hasNext()) {
            ((OptionHistoryChartData) p10.next()).writeToParcel(parcel, flags);
        }
        Iterator p11 = a.p(this.oneWeek, parcel);
        while (p11.hasNext()) {
            ((OptionHistoryChartData) p11.next()).writeToParcel(parcel, flags);
        }
        this.olhcv.writeToParcel(parcel, flags);
    }
}
