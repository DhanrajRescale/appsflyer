package com.assetgro.stockgro.missions.data.remote;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.missions.domain.model.HomePageSection;
import com.assetgro.stockgro.missions.domain.model.LifetimeEarnings;
import com.assetgro.stockgro.missions.domain.model.MissionsHomeData;
import com.assetgro.stockgro.missions.domain.model.ProgressData;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import sh.c;
import vt.i0;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b2\u00103J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0012\u001a\u00020\n2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0017HÖ\u0001J\u0019\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0012\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b-\u0010.R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/assetgro/stockgro/missions/data/remote/MissionsHomeDto;", "Landroid/os/Parcelable;", "Lcom/assetgro/stockgro/missions/domain/model/MissionsHomeData;", "toMissionsHomeData", "Lcom/assetgro/stockgro/missions/data/remote/HomePageSectionDto;", "component1", "Lcom/assetgro/stockgro/missions/data/remote/LifetimeEarningsDto;", "component2", "Lsh/c;", "component3", "Lcom/assetgro/stockgro/missions/data/remote/ProgressDataDto;", "component4", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/missions/data/remote/UserTasksDto;", "component5", "homePageSection", "lifetimeEarnings", "scratchCards", "progressData", "userTasks", "copy", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", "Lcom/assetgro/stockgro/missions/data/remote/HomePageSectionDto;", "getHomePageSection", "()Lcom/assetgro/stockgro/missions/data/remote/HomePageSectionDto;", "Lcom/assetgro/stockgro/missions/data/remote/LifetimeEarningsDto;", "getLifetimeEarnings", "()Lcom/assetgro/stockgro/missions/data/remote/LifetimeEarningsDto;", "Lsh/c;", "getScratchCards", "()Lsh/c;", "Lcom/assetgro/stockgro/missions/data/remote/ProgressDataDto;", "getProgressData", "()Lcom/assetgro/stockgro/missions/data/remote/ProgressDataDto;", "Ljava/util/List;", "getUserTasks", "()Ljava/util/List;", "<init>", "(Lcom/assetgro/stockgro/missions/data/remote/HomePageSectionDto;Lcom/assetgro/stockgro/missions/data/remote/LifetimeEarningsDto;Lsh/c;Lcom/assetgro/stockgro/missions/data/remote/ProgressDataDto;Ljava/util/List;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class MissionsHomeDto implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MissionsHomeDto> CREATOR = new Creator();

    @SerializedName("home_page_section")
    @NotNull
    private final HomePageSectionDto homePageSection;

    @SerializedName("lifetime_earnings")
    @NotNull
    private final LifetimeEarningsDto lifetimeEarnings;

    @SerializedName("progress_data")
    @NotNull
    private final ProgressDataDto progressData;

    @SerializedName("scratch_cards")
    private final c scratchCards;

    @SerializedName("user_tasks")
    private final List<UserTasksDto> userTasks;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<MissionsHomeDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MissionsHomeDto createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            HomePageSectionDto createFromParcel = HomePageSectionDto.CREATOR.createFromParcel(parcel);
            LifetimeEarningsDto createFromParcel2 = LifetimeEarningsDto.CREATOR.createFromParcel(parcel);
            ArrayList arrayList = null;
            c createFromParcel3 = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
            ProgressDataDto createFromParcel4 = ProgressDataDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i10 = 0;
                while (i10 != readInt) {
                    i10 = h.e(UserTasksDto.CREATOR, parcel, arrayList, i10, 1);
                }
            }
            return new MissionsHomeDto(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MissionsHomeDto[] newArray(int i10) {
            return new MissionsHomeDto[i10];
        }
    }

    public MissionsHomeDto(@NotNull HomePageSectionDto homePageSection, @NotNull LifetimeEarningsDto lifetimeEarnings, c cVar, @NotNull ProgressDataDto progressData, List<UserTasksDto> list) {
        Intrinsics.checkNotNullParameter(homePageSection, "homePageSection");
        Intrinsics.checkNotNullParameter(lifetimeEarnings, "lifetimeEarnings");
        Intrinsics.checkNotNullParameter(progressData, "progressData");
        this.homePageSection = homePageSection;
        this.lifetimeEarnings = lifetimeEarnings;
        this.scratchCards = cVar;
        this.progressData = progressData;
        this.userTasks = list;
    }

    public static /* synthetic */ MissionsHomeDto copy$default(MissionsHomeDto missionsHomeDto, HomePageSectionDto homePageSectionDto, LifetimeEarningsDto lifetimeEarningsDto, c cVar, ProgressDataDto progressDataDto, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            homePageSectionDto = missionsHomeDto.homePageSection;
        }
        if ((i10 & 2) != 0) {
            lifetimeEarningsDto = missionsHomeDto.lifetimeEarnings;
        }
        LifetimeEarningsDto lifetimeEarningsDto2 = lifetimeEarningsDto;
        if ((i10 & 4) != 0) {
            cVar = missionsHomeDto.scratchCards;
        }
        c cVar2 = cVar;
        if ((i10 & 8) != 0) {
            progressDataDto = missionsHomeDto.progressData;
        }
        ProgressDataDto progressDataDto2 = progressDataDto;
        if ((i10 & 16) != 0) {
            list = missionsHomeDto.userTasks;
        }
        return missionsHomeDto.copy(homePageSectionDto, lifetimeEarningsDto2, cVar2, progressDataDto2, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final HomePageSectionDto getHomePageSection() {
        return this.homePageSection;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final LifetimeEarningsDto getLifetimeEarnings() {
        return this.lifetimeEarnings;
    }

    /* renamed from: component3, reason: from getter */
    public final c getScratchCards() {
        return this.scratchCards;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ProgressDataDto getProgressData() {
        return this.progressData;
    }

    public final List<UserTasksDto> component5() {
        return this.userTasks;
    }

    @NotNull
    public final MissionsHomeDto copy(@NotNull HomePageSectionDto homePageSection, @NotNull LifetimeEarningsDto lifetimeEarnings, c scratchCards, @NotNull ProgressDataDto progressData, List<UserTasksDto> userTasks) {
        Intrinsics.checkNotNullParameter(homePageSection, "homePageSection");
        Intrinsics.checkNotNullParameter(lifetimeEarnings, "lifetimeEarnings");
        Intrinsics.checkNotNullParameter(progressData, "progressData");
        return new MissionsHomeDto(homePageSection, lifetimeEarnings, scratchCards, progressData, userTasks);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionsHomeDto)) {
            return false;
        }
        MissionsHomeDto missionsHomeDto = (MissionsHomeDto) other;
        return Intrinsics.a(this.homePageSection, missionsHomeDto.homePageSection) && Intrinsics.a(this.lifetimeEarnings, missionsHomeDto.lifetimeEarnings) && Intrinsics.a(this.scratchCards, missionsHomeDto.scratchCards) && Intrinsics.a(this.progressData, missionsHomeDto.progressData) && Intrinsics.a(this.userTasks, missionsHomeDto.userTasks);
    }

    @NotNull
    public final HomePageSectionDto getHomePageSection() {
        return this.homePageSection;
    }

    @NotNull
    public final LifetimeEarningsDto getLifetimeEarnings() {
        return this.lifetimeEarnings;
    }

    @NotNull
    public final ProgressDataDto getProgressData() {
        return this.progressData;
    }

    public final c getScratchCards() {
        return this.scratchCards;
    }

    public final List<UserTasksDto> getUserTasks() {
        return this.userTasks;
    }

    public int hashCode() {
        int hashCode = (this.lifetimeEarnings.hashCode() + (this.homePageSection.hashCode() * 31)) * 31;
        c cVar = this.scratchCards;
        int hashCode2 = (this.progressData.hashCode() + ((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31;
        List<UserTasksDto> list = this.userTasks;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final MissionsHomeData toMissionsHomeData() {
        th.c cVar;
        i0 i0Var;
        HomePageSection homePageSection = this.homePageSection.toHomePageSection();
        LifetimeEarnings lifetimeEarnings = this.lifetimeEarnings.toLifetimeEarnings();
        ProgressData progressData = this.progressData.toProgressData();
        c cVar2 = this.scratchCards;
        if (cVar2 != null) {
            cVar = cVar2.a();
        } else {
            cVar = null;
        }
        th.c cVar3 = cVar;
        List<UserTasksDto> list = this.userTasks;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((UserTasksDto) it.next()).toUserTasks());
            }
            i0Var = arrayList;
        } else {
            i0Var = i0.f38321a;
        }
        return new MissionsHomeData(homePageSection, lifetimeEarnings, cVar3, progressData, i0Var);
    }

    @NotNull
    public String toString() {
        return "MissionsHomeDto(homePageSection=" + this.homePageSection + ", lifetimeEarnings=" + this.lifetimeEarnings + ", scratchCards=" + this.scratchCards + ", progressData=" + this.progressData + ", userTasks=" + this.userTasks + ")";
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
        List<UserTasksDto> list = this.userTasks;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator o10 = a.o(parcel, 1, list);
        while (o10.hasNext()) {
            ((UserTasksDto) o10.next()).writeToParcel(parcel, flags);
        }
    }
}
