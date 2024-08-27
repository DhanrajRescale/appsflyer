package com.assetgro.stockgro.missions.data.remote;

import com.assetgro.stockgro.missions.domain.model.CTA;
import com.assetgro.stockgro.missions.domain.model.InputTypeDetails;
import com.assetgro.stockgro.missions.domain.model.MissionDetail;
import com.assetgro.stockgro.missions.domain.model.MissionReward;
import com.assetgro.stockgro.missions.domain.model.Remarks;
import com.assetgro.stockgro.missions.domain.model.TaskDetails;
import com.google.gson.annotations.SerializedName;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0018J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00104\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00105\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\t\u0010;\u001a\u00020\nHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010=\u001a\u00020\u000eHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jª\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\u0016HÖ\u0001J\u0006\u0010E\u001a\u00020FJ\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\"\u0010\u001eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001c¨\u0006H"}, d2 = {"Lcom/assetgro/stockgro/missions/data/remote/MissionDetailDto;", HttpUrl.FRAGMENT_ENCODE_SET, "logo", HttpUrl.FRAGMENT_ENCODE_SET, "status", "title", "type", "reward", "Lcom/assetgro/stockgro/missions/data/remote/MissionRewardDto;", "taskDetails", "Lcom/assetgro/stockgro/missions/data/remote/TaskDetailsDto;", "inputTypeDetails", "Lcom/assetgro/stockgro/missions/data/remote/InputTypeDetailsDto;", "cta", "Lcom/assetgro/stockgro/missions/data/remote/CTADto;", "secondaryCTO", "remarks", "Lcom/assetgro/stockgro/missions/data/remote/RemarksDto;", "liveDate", HttpUrl.FRAGMENT_ENCODE_SET, "expiryDate", "set", HttpUrl.FRAGMENT_ENCODE_SET, "eventName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/missions/data/remote/MissionRewardDto;Lcom/assetgro/stockgro/missions/data/remote/TaskDetailsDto;Lcom/assetgro/stockgro/missions/data/remote/InputTypeDetailsDto;Lcom/assetgro/stockgro/missions/data/remote/CTADto;Lcom/assetgro/stockgro/missions/data/remote/CTADto;Lcom/assetgro/stockgro/missions/data/remote/RemarksDto;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)V", "getCta", "()Lcom/assetgro/stockgro/missions/data/remote/CTADto;", "getEventName", "()Ljava/lang/String;", "getExpiryDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getInputTypeDetails", "()Lcom/assetgro/stockgro/missions/data/remote/InputTypeDetailsDto;", "getLiveDate", "getLogo", "getRemarks", "()Lcom/assetgro/stockgro/missions/data/remote/RemarksDto;", "getReward", "()Lcom/assetgro/stockgro/missions/data/remote/MissionRewardDto;", "getSecondaryCTO", "getSet", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "getTaskDetails", "()Lcom/assetgro/stockgro/missions/data/remote/TaskDetailsDto;", "getTitle", "getType", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/missions/data/remote/MissionRewardDto;Lcom/assetgro/stockgro/missions/data/remote/TaskDetailsDto;Lcom/assetgro/stockgro/missions/data/remote/InputTypeDetailsDto;Lcom/assetgro/stockgro/missions/data/remote/CTADto;Lcom/assetgro/stockgro/missions/data/remote/CTADto;Lcom/assetgro/stockgro/missions/data/remote/RemarksDto;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)Lcom/assetgro/stockgro/missions/data/remote/MissionDetailDto;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toMissionDetail", "Lcom/assetgro/stockgro/missions/domain/model/MissionDetail;", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MissionDetailDto {
    public static final int $stable = 0;

    @SerializedName("cta")
    @NotNull
    private final CTADto cta;

    @SerializedName("event_name")
    private final String eventName;

    @SerializedName("expiry_date")
    private final Long expiryDate;

    @SerializedName("input_type_details")
    private final InputTypeDetailsDto inputTypeDetails;

    @SerializedName("live_date")
    private final Long liveDate;

    @SerializedName("logo")
    @NotNull
    private final String logo;

    @SerializedName("remarks")
    private final RemarksDto remarks;

    @SerializedName("reward")
    @NotNull
    private final MissionRewardDto reward;

    @SerializedName("secondary_cta")
    private final CTADto secondaryCTO;

    @SerializedName("level_id")
    private final Integer set;

    @SerializedName("status")
    private final String status;

    @SerializedName("task_details")
    @NotNull
    private final TaskDetailsDto taskDetails;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName("task_type")
    @NotNull
    private final String type;

    public MissionDetailDto(@NotNull String logo, String str, @NotNull String title, @NotNull String type, @NotNull MissionRewardDto reward, @NotNull TaskDetailsDto taskDetails, InputTypeDetailsDto inputTypeDetailsDto, @NotNull CTADto cta, CTADto cTADto, RemarksDto remarksDto, Long l10, Long l11, Integer num, String str2) {
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(taskDetails, "taskDetails");
        Intrinsics.checkNotNullParameter(cta, "cta");
        this.logo = logo;
        this.status = str;
        this.title = title;
        this.type = type;
        this.reward = reward;
        this.taskDetails = taskDetails;
        this.inputTypeDetails = inputTypeDetailsDto;
        this.cta = cta;
        this.secondaryCTO = cTADto;
        this.remarks = remarksDto;
        this.liveDate = l10;
        this.expiryDate = l11;
        this.set = num;
        this.eventName = str2;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* renamed from: component10, reason: from getter */
    public final RemarksDto getRemarks() {
        return this.remarks;
    }

    /* renamed from: component11, reason: from getter */
    public final Long getLiveDate() {
        return this.liveDate;
    }

    /* renamed from: component12, reason: from getter */
    public final Long getExpiryDate() {
        return this.expiryDate;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getSet() {
        return this.set;
    }

    /* renamed from: component14, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final MissionRewardDto getReward() {
        return this.reward;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final TaskDetailsDto getTaskDetails() {
        return this.taskDetails;
    }

    /* renamed from: component7, reason: from getter */
    public final InputTypeDetailsDto getInputTypeDetails() {
        return this.inputTypeDetails;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final CTADto getCta() {
        return this.cta;
    }

    /* renamed from: component9, reason: from getter */
    public final CTADto getSecondaryCTO() {
        return this.secondaryCTO;
    }

    @NotNull
    public final MissionDetailDto copy(@NotNull String logo, String status, @NotNull String title, @NotNull String type, @NotNull MissionRewardDto reward, @NotNull TaskDetailsDto taskDetails, InputTypeDetailsDto inputTypeDetails, @NotNull CTADto cta, CTADto secondaryCTO, RemarksDto remarks, Long liveDate, Long expiryDate, Integer set, String eventName) {
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(taskDetails, "taskDetails");
        Intrinsics.checkNotNullParameter(cta, "cta");
        return new MissionDetailDto(logo, status, title, type, reward, taskDetails, inputTypeDetails, cta, secondaryCTO, remarks, liveDate, expiryDate, set, eventName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionDetailDto)) {
            return false;
        }
        MissionDetailDto missionDetailDto = (MissionDetailDto) other;
        return Intrinsics.a(this.logo, missionDetailDto.logo) && Intrinsics.a(this.status, missionDetailDto.status) && Intrinsics.a(this.title, missionDetailDto.title) && Intrinsics.a(this.type, missionDetailDto.type) && Intrinsics.a(this.reward, missionDetailDto.reward) && Intrinsics.a(this.taskDetails, missionDetailDto.taskDetails) && Intrinsics.a(this.inputTypeDetails, missionDetailDto.inputTypeDetails) && Intrinsics.a(this.cta, missionDetailDto.cta) && Intrinsics.a(this.secondaryCTO, missionDetailDto.secondaryCTO) && Intrinsics.a(this.remarks, missionDetailDto.remarks) && Intrinsics.a(this.liveDate, missionDetailDto.liveDate) && Intrinsics.a(this.expiryDate, missionDetailDto.expiryDate) && Intrinsics.a(this.set, missionDetailDto.set) && Intrinsics.a(this.eventName, missionDetailDto.eventName);
    }

    @NotNull
    public final CTADto getCta() {
        return this.cta;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final Long getExpiryDate() {
        return this.expiryDate;
    }

    public final InputTypeDetailsDto getInputTypeDetails() {
        return this.inputTypeDetails;
    }

    public final Long getLiveDate() {
        return this.liveDate;
    }

    @NotNull
    public final String getLogo() {
        return this.logo;
    }

    public final RemarksDto getRemarks() {
        return this.remarks;
    }

    @NotNull
    public final MissionRewardDto getReward() {
        return this.reward;
    }

    public final CTADto getSecondaryCTO() {
        return this.secondaryCTO;
    }

    public final Integer getSet() {
        return this.set;
    }

    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final TaskDetailsDto getTaskDetails() {
        return this.taskDetails;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = this.logo.hashCode() * 31;
        String str = this.status;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode9 = (this.taskDetails.hashCode() + ((this.reward.hashCode() + h.g(this.type, h.g(this.title, (hashCode8 + hashCode) * 31, 31), 31)) * 31)) * 31;
        InputTypeDetailsDto inputTypeDetailsDto = this.inputTypeDetails;
        if (inputTypeDetailsDto == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = inputTypeDetailsDto.hashCode();
        }
        int hashCode10 = (this.cta.hashCode() + ((hashCode9 + hashCode2) * 31)) * 31;
        CTADto cTADto = this.secondaryCTO;
        if (cTADto == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = cTADto.hashCode();
        }
        int i11 = (hashCode10 + hashCode3) * 31;
        RemarksDto remarksDto = this.remarks;
        if (remarksDto == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = remarksDto.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Long l10 = this.liveDate;
        if (l10 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l10.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        Long l11 = this.expiryDate;
        if (l11 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l11.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        Integer num = this.set;
        if (num == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str2 = this.eventName;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i15 + i10;
    }

    @NotNull
    public final MissionDetail toMissionDetail() {
        InputTypeDetails inputTypeDetails;
        CTA cta;
        Remarks remarks;
        int i10;
        String str = this.logo;
        String str2 = this.status;
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str3 = str2;
        String str4 = this.title;
        String str5 = this.type;
        MissionReward missionReward = this.reward.toMissionReward();
        TaskDetails taskDetails = this.taskDetails.toTaskDetails();
        InputTypeDetailsDto inputTypeDetailsDto = this.inputTypeDetails;
        if (inputTypeDetailsDto != null) {
            inputTypeDetails = inputTypeDetailsDto.toInputTypeDetails();
        } else {
            inputTypeDetails = null;
        }
        CTA cta2 = this.cta.toCTA();
        CTADto cTADto = this.secondaryCTO;
        if (cTADto != null) {
            cta = cTADto.toCTA();
        } else {
            cta = null;
        }
        RemarksDto remarksDto = this.remarks;
        if (remarksDto != null) {
            remarks = remarksDto.toRemarks();
        } else {
            remarks = null;
        }
        Long l10 = this.liveDate;
        Long l11 = this.expiryDate;
        Integer num = this.set;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 1;
        }
        return new MissionDetail(str, str3, str4, str5, missionReward, taskDetails, inputTypeDetails, cta2, cta, remarks, l10, l11, i10, this.eventName);
    }

    @NotNull
    public String toString() {
        String str = this.logo;
        String str2 = this.status;
        String str3 = this.title;
        String str4 = this.type;
        MissionRewardDto missionRewardDto = this.reward;
        TaskDetailsDto taskDetailsDto = this.taskDetails;
        InputTypeDetailsDto inputTypeDetailsDto = this.inputTypeDetails;
        CTADto cTADto = this.cta;
        CTADto cTADto2 = this.secondaryCTO;
        RemarksDto remarksDto = this.remarks;
        Long l10 = this.liveDate;
        Long l11 = this.expiryDate;
        Integer num = this.set;
        String str5 = this.eventName;
        StringBuilder l12 = e.l("MissionDetailDto(logo=", str, ", status=", str2, ", title=");
        e.v(l12, str3, ", type=", str4, ", reward=");
        l12.append(missionRewardDto);
        l12.append(", taskDetails=");
        l12.append(taskDetailsDto);
        l12.append(", inputTypeDetails=");
        l12.append(inputTypeDetailsDto);
        l12.append(", cta=");
        l12.append(cTADto);
        l12.append(", secondaryCTO=");
        l12.append(cTADto2);
        l12.append(", remarks=");
        l12.append(remarksDto);
        l12.append(", liveDate=");
        l12.append(l10);
        l12.append(", expiryDate=");
        l12.append(l11);
        l12.append(", set=");
        l12.append(num);
        l12.append(", eventName=");
        l12.append(str5);
        l12.append(")");
        return l12.toString();
    }
}
