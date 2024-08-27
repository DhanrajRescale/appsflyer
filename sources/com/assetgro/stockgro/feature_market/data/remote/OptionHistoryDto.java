package com.assetgro.stockgro.feature_market.data.remote;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.feature_market.domain.model.OptionHistory;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import vt.i0;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J7\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\""}, d2 = {"Lcom/assetgro/stockgro/feature_market/data/remote/OptionHistoryDto;", "Landroid/os/Parcelable;", "oneDay", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/feature_market/data/remote/OptionHistoryChartDataDto;", "oneWeek", "olhcv", "Lcom/assetgro/stockgro/feature_market/data/remote/OptionOhlcDto;", "(Ljava/util/List;Ljava/util/List;Lcom/assetgro/stockgro/feature_market/data/remote/OptionOhlcDto;)V", "getOlhcv", "()Lcom/assetgro/stockgro/feature_market/data/remote/OptionOhlcDto;", "getOneDay", "()Ljava/util/List;", "getOneWeek", "component1", "component2", "component3", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toOptionHistory", "Lcom/assetgro/stockgro/feature_market/domain/model/OptionHistory;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OptionHistoryDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<OptionHistoryDto> CREATOR = new Creator();

    @SerializedName("olhcv")
    @NotNull
    private final OptionOhlcDto olhcv;

    @SerializedName("one_day")
    private final List<OptionHistoryChartDataDto> oneDay;

    @SerializedName("one_week")
    private final List<OptionHistoryChartDataDto> oneWeek;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<OptionHistoryDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionHistoryDto createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i10 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = h.e(OptionHistoryChartDataDto.CREATOR, parcel, arrayList, i11, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i10 != readInt2) {
                    i10 = h.e(OptionHistoryChartDataDto.CREATOR, parcel, arrayList2, i10, 1);
                }
            }
            return new OptionHistoryDto(arrayList, arrayList2, OptionOhlcDto.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OptionHistoryDto[] newArray(int i10) {
            return new OptionHistoryDto[i10];
        }
    }

    public OptionHistoryDto(List<OptionHistoryChartDataDto> list, List<OptionHistoryChartDataDto> list2, @NotNull OptionOhlcDto olhcv) {
        Intrinsics.checkNotNullParameter(olhcv, "olhcv");
        this.oneDay = list;
        this.oneWeek = list2;
        this.olhcv = olhcv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionHistoryDto copy$default(OptionHistoryDto optionHistoryDto, List list, List list2, OptionOhlcDto optionOhlcDto, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = optionHistoryDto.oneDay;
        }
        if ((i10 & 2) != 0) {
            list2 = optionHistoryDto.oneWeek;
        }
        if ((i10 & 4) != 0) {
            optionOhlcDto = optionHistoryDto.olhcv;
        }
        return optionHistoryDto.copy(list, list2, optionOhlcDto);
    }

    public final List<OptionHistoryChartDataDto> component1() {
        return this.oneDay;
    }

    public final List<OptionHistoryChartDataDto> component2() {
        return this.oneWeek;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final OptionOhlcDto getOlhcv() {
        return this.olhcv;
    }

    @NotNull
    public final OptionHistoryDto copy(List<OptionHistoryChartDataDto> oneDay, List<OptionHistoryChartDataDto> oneWeek, @NotNull OptionOhlcDto olhcv) {
        Intrinsics.checkNotNullParameter(olhcv, "olhcv");
        return new OptionHistoryDto(oneDay, oneWeek, olhcv);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionHistoryDto)) {
            return false;
        }
        OptionHistoryDto optionHistoryDto = (OptionHistoryDto) other;
        return Intrinsics.a(this.oneDay, optionHistoryDto.oneDay) && Intrinsics.a(this.oneWeek, optionHistoryDto.oneWeek) && Intrinsics.a(this.olhcv, optionHistoryDto.olhcv);
    }

    @NotNull
    public final OptionOhlcDto getOlhcv() {
        return this.olhcv;
    }

    public final List<OptionHistoryChartDataDto> getOneDay() {
        return this.oneDay;
    }

    public final List<OptionHistoryChartDataDto> getOneWeek() {
        return this.oneWeek;
    }

    public int hashCode() {
        List<OptionHistoryChartDataDto> list = this.oneDay;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<OptionHistoryChartDataDto> list2 = this.oneWeek;
        return this.olhcv.hashCode() + ((hashCode + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [vt.i0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [vt.i0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @NotNull
    public final OptionHistory toOptionHistory() {
        ?? r12;
        ?? r22;
        List<OptionHistoryChartDataDto> list = this.oneDay;
        if (list != null) {
            r12 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r12.add(((OptionHistoryChartDataDto) it.next()).toOptionHistoryChartData());
            }
        } else {
            r12 = i0.f38321a;
        }
        List<OptionHistoryChartDataDto> list2 = this.oneWeek;
        if (list2 != null) {
            r22 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                r22.add(((OptionHistoryChartDataDto) it2.next()).toOptionHistoryChartData());
            }
        } else {
            r22 = i0.f38321a;
        }
        return new OptionHistory(r12, r22, this.olhcv.toOptionOhlc());
    }

    @NotNull
    public String toString() {
        return "OptionHistoryDto(oneDay=" + this.oneDay + ", oneWeek=" + this.oneWeek + ", olhcv=" + this.olhcv + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<OptionHistoryChartDataDto> list = this.oneDay;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator o10 = a.o(parcel, 1, list);
            while (o10.hasNext()) {
                ((OptionHistoryChartDataDto) o10.next()).writeToParcel(parcel, flags);
            }
        }
        List<OptionHistoryChartDataDto> list2 = this.oneWeek;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator o11 = a.o(parcel, 1, list2);
            while (o11.hasNext()) {
                ((OptionHistoryChartDataDto) o11.next()).writeToParcel(parcel, flags);
            }
        }
        this.olhcv.writeToParcel(parcel, flags);
    }
}
