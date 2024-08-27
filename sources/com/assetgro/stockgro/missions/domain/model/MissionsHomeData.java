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
import th.c;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b0\u00101J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JE\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0015HÖ\u0001J\u0019\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/assetgro/stockgro/missions/domain/model/MissionsHomeData;", "Landroid/os/Parcelable;", "Lcom/assetgro/stockgro/missions/domain/model/HomePageSection;", "component1", "Lcom/assetgro/stockgro/missions/domain/model/LifetimeEarnings;", "component2", "Lth/c;", "component3", "Lcom/assetgro/stockgro/missions/domain/model/ProgressData;", "component4", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/missions/domain/model/UserTask;", "component5", "homePageSection", "lifetimeEarnings", "scratchCards", "progressData", "userTasks", "copy", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", "Lcom/assetgro/stockgro/missions/domain/model/HomePageSection;", "getHomePageSection", "()Lcom/assetgro/stockgro/missions/domain/model/HomePageSection;", "Lcom/assetgro/stockgro/missions/domain/model/LifetimeEarnings;", "getLifetimeEarnings", "()Lcom/assetgro/stockgro/missions/domain/model/LifetimeEarnings;", "Lth/c;", "getScratchCards", "()Lth/c;", "Lcom/assetgro/stockgro/missions/domain/model/ProgressData;", "getProgressData", "()Lcom/assetgro/stockgro/missions/domain/model/ProgressData;", "Ljava/util/List;", "getUserTasks", "()Ljava/util/List;", "<init>", "(Lcom/assetgro/stockgro/missions/domain/model/HomePageSection;Lcom/assetgro/stockgro/missions/domain/model/LifetimeEarnings;Lth/c;Lcom/assetgro/stockgro/missions/domain/model/ProgressData;Ljava/util/List;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class MissionsHomeData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MissionsHomeData> CREATOR = new Creator();

    @NotNull
    private final HomePageSection homePageSection;

    @NotNull
    private final LifetimeEarnings lifetimeEarnings;

    @NotNull
    private final ProgressData progressData;
    private final c scratchCards;
    private final List<UserTask> userTasks;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<MissionsHomeData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MissionsHomeData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            HomePageSection createFromParcel = HomePageSection.CREATOR.createFromParcel(parcel);
            LifetimeEarnings createFromParcel2 = LifetimeEarnings.CREATOR.createFromParcel(parcel);
            ArrayList arrayList = null;
            c createFromParcel3 = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
            ProgressData createFromParcel4 = ProgressData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i10 = 0;
                while (i10 != readInt) {
                    i10 = h.e(UserTask.CREATOR, parcel, arrayList, i10, 1);
                }
            }
            return new MissionsHomeData(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MissionsHomeData[] newArray(int i10) {
            return new MissionsHomeData[i10];
        }
    }

    public MissionsHomeData(@NotNull HomePageSection homePageSection, @NotNull LifetimeEarnings lifetimeEarnings, c cVar, @NotNull ProgressData progressData, List<UserTask> list) {
        Intrinsics.checkNotNullParameter(homePageSection, "homePageSection");
        Intrinsics.checkNotNullParameter(lifetimeEarnings, "lifetimeEarnings");
        Intrinsics.checkNotNullParameter(progressData, "progressData");
        this.homePageSection = homePageSection;
        this.lifetimeEarnings = lifetimeEarnings;
        this.scratchCards = cVar;
        this.progressData = progressData;
        this.userTasks = list;
    }

    public static /* synthetic */ MissionsHomeData copy$default(MissionsHomeData missionsHomeData, HomePageSection homePageSection, LifetimeEarnings lifetimeEarnings, c cVar, ProgressData progressData, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            homePageSection = missionsHomeData.homePageSection;
        }
        if ((i10 & 2) != 0) {
            lifetimeEarnings = missionsHomeData.lifetimeEarnings;
        }
        LifetimeEarnings lifetimeEarnings2 = lifetimeEarnings;
        if ((i10 & 4) != 0) {
            cVar = missionsHomeData.scratchCards;
        }
        c cVar2 = cVar;
        if ((i10 & 8) != 0) {
            progressData = missionsHomeData.progressData;
        }
        ProgressData progressData2 = progressData;
        if ((i10 & 16) != 0) {
            list = missionsHomeData.userTasks;
        }
        return missionsHomeData.copy(homePageSection, lifetimeEarnings2, cVar2, progressData2, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final HomePageSection getHomePageSection() {
        return this.homePageSection;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final LifetimeEarnings getLifetimeEarnings() {
        return this.lifetimeEarnings;
    }

    /* renamed from: component3, reason: from getter */
    public final c getScratchCards() {
        return this.scratchCards;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ProgressData getProgressData() {
        return this.progressData;
    }

    public final List<UserTask> component5() {
        return this.userTasks;
    }

    @NotNull
    public final MissionsHomeData copy(@NotNull HomePageSection homePageSection, @NotNull LifetimeEarnings lifetimeEarnings, c scratchCards, @NotNull ProgressData progressData, List<UserTask> userTasks) {
        Intrinsics.checkNotNullParameter(homePageSection, "homePageSection");
        Intrinsics.checkNotNullParameter(lifetimeEarnings, "lifetimeEarnings");
        Intrinsics.checkNotNullParameter(progressData, "progressData");
        return new MissionsHomeData(homePageSection, lifetimeEarnings, scratchCards, progressData, userTasks);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionsHomeData)) {
            return false;
        }
        MissionsHomeData missionsHomeData = (MissionsHomeData) other;
        return Intrinsics.a(this.homePageSection, missionsHomeData.homePageSection) && Intrinsics.a(this.lifetimeEarnings, missionsHomeData.lifetimeEarnings) && Intrinsics.a(this.scratchCards, missionsHomeData.scratchCards) && Intrinsics.a(this.progressData, missionsHomeData.progressData) && Intrinsics.a(this.userTasks, missionsHomeData.userTasks);
    }

    @NotNull
    public final HomePageSection getHomePageSection() {
        return this.homePageSection;
    }

    @NotNull
    public final LifetimeEarnings getLifetimeEarnings() {
        return this.lifetimeEarnings;
    }

    @NotNull
    public final ProgressData getProgressData() {
        return this.progressData;
    }

    public final c getScratchCards() {
        return this.scratchCards;
    }

    public final List<UserTask> getUserTasks() {
        return this.userTasks;
    }

    public int hashCode() {
        int hashCode = (this.lifetimeEarnings.hashCode() + (this.homePageSection.hashCode() * 31)) * 31;
        c cVar = this.scratchCards;
        int hashCode2 = (this.progressData.hashCode() + ((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31;
        List<UserTask> list = this.userTasks;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MissionsHomeData(homePageSection=" + this.homePageSection + ", lifetimeEarnings=" + this.lifetimeEarnings + ", scratchCards=" + this.scratchCards + ", progressData=" + this.progressData + ", userTasks=" + this.userTasks + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.homePageSection.writeToParcel(parcel, flags);
        this.lifetimeEarnings.writeToParcel(parcel, flags);
        c cVar = this.scratchCards;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, flags);
        }
        this.progressData.writeToParcel(parcel, flags);
        List<UserTask> list = this.userTasks;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator o10 = a.o(parcel, 1, list);
        while (o10.hasNext()) {
            ((UserTask) o10.next()).writeToParcel(parcel, flags);
        }
    }
}
