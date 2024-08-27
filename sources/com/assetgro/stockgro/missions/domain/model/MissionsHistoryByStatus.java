package com.assetgro.stockgro.missions.domain.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/missions/domain/model/MissionsHistoryByStatus;", "Landroid/os/Parcelable;", "userTasks", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/missions/domain/model/UserTask;", "disclaimer", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;Ljava/lang/String;)V", "getDisclaimer", "()Ljava/lang/String;", "getUserTasks", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MissionsHistoryByStatus implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MissionsHistoryByStatus> CREATOR = new Creator();
    private final String disclaimer;
    private final List<UserTask> userTasks;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<MissionsHistoryByStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MissionsHistoryByStatus createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i10 = 0;
                while (i10 != readInt) {
                    i10 = h.e(UserTask.CREATOR, parcel, arrayList2, i10, 1);
                }
                arrayList = arrayList2;
            }
            return new MissionsHistoryByStatus(arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MissionsHistoryByStatus[] newArray(int i10) {
            return new MissionsHistoryByStatus[i10];
        }
    }

    public MissionsHistoryByStatus(List<UserTask> list, String str) {
        this.userTasks = list;
        this.disclaimer = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MissionsHistoryByStatus copy$default(MissionsHistoryByStatus missionsHistoryByStatus, List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = missionsHistoryByStatus.userTasks;
        }
        if ((i10 & 2) != 0) {
            str = missionsHistoryByStatus.disclaimer;
        }
        return missionsHistoryByStatus.copy(list, str);
    }

    public final List<UserTask> component1() {
        return this.userTasks;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    public final MissionsHistoryByStatus copy(List<UserTask> userTasks, String disclaimer) {
        return new MissionsHistoryByStatus(userTasks, disclaimer);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionsHistoryByStatus)) {
            return false;
        }
        MissionsHistoryByStatus missionsHistoryByStatus = (MissionsHistoryByStatus) other;
        return Intrinsics.a(this.userTasks, missionsHistoryByStatus.userTasks) && Intrinsics.a(this.disclaimer, missionsHistoryByStatus.disclaimer);
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final List<UserTask> getUserTasks() {
        return this.userTasks;
    }

    public int hashCode() {
        List<UserTask> list = this.userTasks;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.disclaimer;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MissionsHistoryByStatus(userTasks=" + this.userTasks + ", disclaimer=" + this.disclaimer + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<UserTask> list = this.userTasks;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator o10 = a.o(parcel, 1, list);
            while (o10.hasNext()) {
                ((UserTask) o10.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.disclaimer);
    }
}
