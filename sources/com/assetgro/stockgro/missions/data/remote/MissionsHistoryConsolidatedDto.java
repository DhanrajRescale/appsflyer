package com.assetgro.stockgro.missions.data.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.missions.domain.model.MissionsHistoryConsolidated;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006 "}, d2 = {"Lcom/assetgro/stockgro/missions/data/remote/MissionsHistoryConsolidatedDto;", "Landroid/os/Parcelable;", "inReview", HttpUrl.FRAGMENT_ENCODE_SET, "completed", "failed", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCompleted", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFailed", "getInReview", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/assetgro/stockgro/missions/data/remote/MissionsHistoryConsolidatedDto;", "describeContents", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toMissionsHistoryConsolidated", "Lcom/assetgro/stockgro/missions/domain/model/MissionsHistoryConsolidated;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MissionsHistoryConsolidatedDto implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<MissionsHistoryConsolidatedDto> CREATOR = new Creator();

    @SerializedName("completed")
    private final Integer completed;

    @SerializedName("failed")
    private final Integer failed;

    @SerializedName("in_review")
    private final Integer inReview;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<MissionsHistoryConsolidatedDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MissionsHistoryConsolidatedDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MissionsHistoryConsolidatedDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MissionsHistoryConsolidatedDto[] newArray(int i10) {
            return new MissionsHistoryConsolidatedDto[i10];
        }
    }

    public MissionsHistoryConsolidatedDto(Integer num, Integer num2, Integer num3) {
        this.inReview = num;
        this.completed = num2;
        this.failed = num3;
    }

    public static /* synthetic */ MissionsHistoryConsolidatedDto copy$default(MissionsHistoryConsolidatedDto missionsHistoryConsolidatedDto, Integer num, Integer num2, Integer num3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = missionsHistoryConsolidatedDto.inReview;
        }
        if ((i10 & 2) != 0) {
            num2 = missionsHistoryConsolidatedDto.completed;
        }
        if ((i10 & 4) != 0) {
            num3 = missionsHistoryConsolidatedDto.failed;
        }
        return missionsHistoryConsolidatedDto.copy(num, num2, num3);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getInReview() {
        return this.inReview;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getCompleted() {
        return this.completed;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getFailed() {
        return this.failed;
    }

    @NotNull
    public final MissionsHistoryConsolidatedDto copy(Integer inReview, Integer completed, Integer failed) {
        return new MissionsHistoryConsolidatedDto(inReview, completed, failed);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionsHistoryConsolidatedDto)) {
            return false;
        }
        MissionsHistoryConsolidatedDto missionsHistoryConsolidatedDto = (MissionsHistoryConsolidatedDto) other;
        return Intrinsics.a(this.inReview, missionsHistoryConsolidatedDto.inReview) && Intrinsics.a(this.completed, missionsHistoryConsolidatedDto.completed) && Intrinsics.a(this.failed, missionsHistoryConsolidatedDto.failed);
    }

    public final Integer getCompleted() {
        return this.completed;
    }

    public final Integer getFailed() {
        return this.failed;
    }

    public final Integer getInReview() {
        return this.inReview;
    }

    public int hashCode() {
        Integer num = this.inReview;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.completed;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.failed;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public final MissionsHistoryConsolidated toMissionsHistoryConsolidated() {
        int i10;
        int i11;
        Integer num = this.inReview;
        int i12 = 0;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        Integer num2 = this.completed;
        if (num2 != null) {
            i11 = num2.intValue();
        } else {
            i11 = 0;
        }
        Integer num3 = this.failed;
        if (num3 != null) {
            i12 = num3.intValue();
        }
        return new MissionsHistoryConsolidated(i10, i11, i12);
    }

    @NotNull
    public String toString() {
        return "MissionsHistoryConsolidatedDto(inReview=" + this.inReview + ", completed=" + this.completed + ", failed=" + this.failed + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Integer num = this.inReview;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.completed;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.failed;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }
}
