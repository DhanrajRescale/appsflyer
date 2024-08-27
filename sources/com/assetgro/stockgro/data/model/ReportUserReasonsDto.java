package com.assetgro.stockgro.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J#\u0010\n\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fHÖ\u0001R&\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/assetgro/stockgro/data/model/ReportUserReasonsDto;", "Landroid/os/Parcelable;", "reasonsList", "Ljava/util/ArrayList;", "Lcom/assetgro/stockgro/data/model/ReportReason;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getReasonsList", "()Ljava/util/ArrayList;", "component1", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ReportUserReasonsDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ReportUserReasonsDto> CREATOR = new Creator();

    @SerializedName("reasons_meta")
    @NotNull
    private final ArrayList<ReportReason> reasonsList;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<ReportUserReasonsDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ReportUserReasonsDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i10 = 0;
            while (i10 != readInt) {
                i10 = h.e(ReportReason.CREATOR, parcel, arrayList, i10, 1);
            }
            return new ReportUserReasonsDto(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ReportUserReasonsDto[] newArray(int i10) {
            return new ReportUserReasonsDto[i10];
        }
    }

    public ReportUserReasonsDto(@NotNull ArrayList<ReportReason> reasonsList) {
        Intrinsics.checkNotNullParameter(reasonsList, "reasonsList");
        this.reasonsList = reasonsList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReportUserReasonsDto copy$default(ReportUserReasonsDto reportUserReasonsDto, ArrayList arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = reportUserReasonsDto.reasonsList;
        }
        return reportUserReasonsDto.copy(arrayList);
    }

    @NotNull
    public final ArrayList<ReportReason> component1() {
        return this.reasonsList;
    }

    @NotNull
    public final ReportUserReasonsDto copy(@NotNull ArrayList<ReportReason> reasonsList) {
        Intrinsics.checkNotNullParameter(reasonsList, "reasonsList");
        return new ReportUserReasonsDto(reasonsList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReportUserReasonsDto) && Intrinsics.a(this.reasonsList, ((ReportUserReasonsDto) other).reasonsList);
    }

    @NotNull
    public final ArrayList<ReportReason> getReasonsList() {
        return this.reasonsList;
    }

    public int hashCode() {
        return this.reasonsList.hashCode();
    }

    @NotNull
    public String toString() {
        return "ReportUserReasonsDto(reasonsList=" + this.reasonsList + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        ArrayList<ReportReason> arrayList = this.reasonsList;
        parcel.writeInt(arrayList.size());
        Iterator<ReportReason> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }
}
