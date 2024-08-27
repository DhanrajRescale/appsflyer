package com.assetgro.stockgro.missions.data.remote;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.missions.domain.model.MissionsHistoryByStatus;
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

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/assetgro/stockgro/missions/data/remote/MissionsHistoryByStatusDto;", "Landroid/os/Parcelable;", "userTasks", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/missions/data/remote/UserTasksDto;", "disclaimer", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;Ljava/lang/String;)V", "getDisclaimer", "()Ljava/lang/String;", "getUserTasks", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toMissionsHistoryByStatus", "Lcom/assetgro/stockgro/missions/domain/model/MissionsHistoryByStatus;", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MissionsHistoryByStatusDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MissionsHistoryByStatusDto> CREATOR = new Creator();

    @SerializedName("disclaimer")
    private final String disclaimer;

    @SerializedName("user_tasks")
    private final List<UserTasksDto> userTasks;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<MissionsHistoryByStatusDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MissionsHistoryByStatusDto createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i10 = 0;
                while (i10 != readInt) {
                    i10 = h.e(UserTasksDto.CREATOR, parcel, arrayList2, i10, 1);
                }
                arrayList = arrayList2;
            }
            return new MissionsHistoryByStatusDto(arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MissionsHistoryByStatusDto[] newArray(int i10) {
            return new MissionsHistoryByStatusDto[i10];
        }
    }

    public MissionsHistoryByStatusDto(List<UserTasksDto> list, String str) {
        this.userTasks = list;
        this.disclaimer = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MissionsHistoryByStatusDto copy$default(MissionsHistoryByStatusDto missionsHistoryByStatusDto, List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = missionsHistoryByStatusDto.userTasks;
        }
        if ((i10 & 2) != 0) {
            str = missionsHistoryByStatusDto.disclaimer;
        }
        return missionsHistoryByStatusDto.copy(list, str);
    }

    public final List<UserTasksDto> component1() {
        return this.userTasks;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    public final MissionsHistoryByStatusDto copy(List<UserTasksDto> userTasks, String disclaimer) {
        return new MissionsHistoryByStatusDto(userTasks, disclaimer);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionsHistoryByStatusDto)) {
            return false;
        }
        MissionsHistoryByStatusDto missionsHistoryByStatusDto = (MissionsHistoryByStatusDto) other;
        return Intrinsics.a(this.userTasks, missionsHistoryByStatusDto.userTasks) && Intrinsics.a(this.disclaimer, missionsHistoryByStatusDto.disclaimer);
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final List<UserTasksDto> getUserTasks() {
        return this.userTasks;
    }

    public int hashCode() {
        List<UserTasksDto> list = this.userTasks;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.disclaimer;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [vt.i0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    @NotNull
    public final MissionsHistoryByStatus toMissionsHistoryByStatus() {
        ?? r12;
        List<UserTasksDto> list = this.userTasks;
        if (list != null) {
            r12 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r12.add(((UserTasksDto) it.next()).toUserTasks());
            }
        } else {
            r12 = i0.f38321a;
        }
        return new MissionsHistoryByStatus(r12, this.disclaimer);
    }

    @NotNull
    public String toString() {
        return "MissionsHistoryByStatusDto(userTasks=" + this.userTasks + ", disclaimer=" + this.disclaimer + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<UserTasksDto> list = this.userTasks;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator o10 = a.o(parcel, 1, list);
            while (o10.hasNext()) {
                ((UserTasksDto) o10.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.disclaimer);
    }
}
