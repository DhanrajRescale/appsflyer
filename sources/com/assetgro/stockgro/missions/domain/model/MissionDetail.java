package com.assetgro.stockgro.missions.domain.model;

import da.e;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0018J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00103\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u00104\u001a\u00020\u0016HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J\t\u0010:\u001a\u00020\nHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010<\u001a\u00020\u000eHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000eHÆ\u0003J¦\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\u0016HÖ\u0001J\t\u0010D\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001c¨\u0006E"}, d2 = {"Lcom/assetgro/stockgro/missions/domain/model/MissionDetail;", HttpUrl.FRAGMENT_ENCODE_SET, "logo", HttpUrl.FRAGMENT_ENCODE_SET, "status", "title", "type", "reward", "Lcom/assetgro/stockgro/missions/domain/model/MissionReward;", "taskDetails", "Lcom/assetgro/stockgro/missions/domain/model/TaskDetails;", "inputTypeDetails", "Lcom/assetgro/stockgro/missions/domain/model/InputTypeDetails;", "cta", "Lcom/assetgro/stockgro/missions/domain/model/CTA;", "secondaryCTO", "remarks", "Lcom/assetgro/stockgro/missions/domain/model/Remarks;", "liveDate", HttpUrl.FRAGMENT_ENCODE_SET, "expiryDate", "set", HttpUrl.FRAGMENT_ENCODE_SET, "eventName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/missions/domain/model/MissionReward;Lcom/assetgro/stockgro/missions/domain/model/TaskDetails;Lcom/assetgro/stockgro/missions/domain/model/InputTypeDetails;Lcom/assetgro/stockgro/missions/domain/model/CTA;Lcom/assetgro/stockgro/missions/domain/model/CTA;Lcom/assetgro/stockgro/missions/domain/model/Remarks;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/String;)V", "getCta", "()Lcom/assetgro/stockgro/missions/domain/model/CTA;", "getEventName", "()Ljava/lang/String;", "getExpiryDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getInputTypeDetails", "()Lcom/assetgro/stockgro/missions/domain/model/InputTypeDetails;", "getLiveDate", "getLogo", "getRemarks", "()Lcom/assetgro/stockgro/missions/domain/model/Remarks;", "getReward", "()Lcom/assetgro/stockgro/missions/domain/model/MissionReward;", "getSecondaryCTO", "getSet", "()I", "getStatus", "getTaskDetails", "()Lcom/assetgro/stockgro/missions/domain/model/TaskDetails;", "getTitle", "getType", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/missions/domain/model/MissionReward;Lcom/assetgro/stockgro/missions/domain/model/TaskDetails;Lcom/assetgro/stockgro/missions/domain/model/InputTypeDetails;Lcom/assetgro/stockgro/missions/domain/model/CTA;Lcom/assetgro/stockgro/missions/domain/model/CTA;Lcom/assetgro/stockgro/missions/domain/model/Remarks;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/String;)Lcom/assetgro/stockgro/missions/domain/model/MissionDetail;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MissionDetail {
    public static final int $stable = 0;

    @NotNull
    private final CTA cta;
    private final String eventName;
    private final Long expiryDate;
    private final InputTypeDetails inputTypeDetails;
    private final Long liveDate;

    @NotNull
    private final String logo;
    private final Remarks remarks;

    @NotNull
    private final MissionReward reward;
    private final CTA secondaryCTO;
    private final int set;

    @NotNull
    private final String status;

    @NotNull
    private final TaskDetails taskDetails;

    @NotNull
    private final String title;

    @NotNull
    private final String type;

    public MissionDetail(@NotNull String logo, @NotNull String status, @NotNull String title, @NotNull String type, @NotNull MissionReward reward, @NotNull TaskDetails taskDetails, InputTypeDetails inputTypeDetails, @NotNull CTA cta, CTA cta2, Remarks remarks, Long l10, Long l11, int i10, String str) {
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(taskDetails, "taskDetails");
        Intrinsics.checkNotNullParameter(cta, "cta");
        this.logo = logo;
        this.status = status;
        this.title = title;
        this.type = type;
        this.reward = reward;
        this.taskDetails = taskDetails;
        this.inputTypeDetails = inputTypeDetails;
        this.cta = cta;
        this.secondaryCTO = cta2;
        this.remarks = remarks;
        this.liveDate = l10;
        this.expiryDate = l11;
        this.set = i10;
        this.eventName = str;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* renamed from: component10, reason: from getter */
    public final Remarks getRemarks() {
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
    public final int getSet() {
        return this.set;
    }

    /* renamed from: component14, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
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
    public final MissionReward getReward() {
        return this.reward;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final TaskDetails getTaskDetails() {
        return this.taskDetails;
    }

    /* renamed from: component7, reason: from getter */
    public final InputTypeDetails getInputTypeDetails() {
        return this.inputTypeDetails;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final CTA getCta() {
        return this.cta;
    }

    /* renamed from: component9, reason: from getter */
    public final CTA getSecondaryCTO() {
        return this.secondaryCTO;
    }

    @NotNull
    public final MissionDetail copy(@NotNull String logo, @NotNull String status, @NotNull String title, @NotNull String type, @NotNull MissionReward reward, @NotNull TaskDetails taskDetails, InputTypeDetails inputTypeDetails, @NotNull CTA cta, CTA secondaryCTO, Remarks remarks, Long liveDate, Long expiryDate, int set, String eventName) {
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(taskDetails, "taskDetails");
        Intrinsics.checkNotNullParameter(cta, "cta");
        return new MissionDetail(logo, status, title, type, reward, taskDetails, inputTypeDetails, cta, secondaryCTO, remarks, liveDate, expiryDate, set, eventName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionDetail)) {
            return false;
        }
        MissionDetail missionDetail = (MissionDetail) other;
        return Intrinsics.a(this.logo, missionDetail.logo) && Intrinsics.a(this.status, missionDetail.status) && Intrinsics.a(this.title, missionDetail.title) && Intrinsics.a(this.type, missionDetail.type) && Intrinsics.a(this.reward, missionDetail.reward) && Intrinsics.a(this.taskDetails, missionDetail.taskDetails) && Intrinsics.a(this.inputTypeDetails, missionDetail.inputTypeDetails) && Intrinsics.a(this.cta, missionDetail.cta) && Intrinsics.a(this.secondaryCTO, missionDetail.secondaryCTO) && Intrinsics.a(this.remarks, missionDetail.remarks) && Intrinsics.a(this.liveDate, missionDetail.liveDate) && Intrinsics.a(this.expiryDate, missionDetail.expiryDate) && this.set == missionDetail.set && Intrinsics.a(this.eventName, missionDetail.eventName);
    }

    @NotNull
    public final CTA getCta() {
        return this.cta;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final Long getExpiryDate() {
        return this.expiryDate;
    }

    public final InputTypeDetails getInputTypeDetails() {
        return this.inputTypeDetails;
    }

    public final Long getLiveDate() {
        return this.liveDate;
    }

    @NotNull
    public final String getLogo() {
        return this.logo;
    }

    public final Remarks getRemarks() {
        return this.remarks;
    }

    @NotNull
    public final MissionReward getReward() {
        return this.reward;
    }

    public final CTA getSecondaryCTO() {
        return this.secondaryCTO;
    }

    public final int getSet() {
        return this.set;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final TaskDetails getTaskDetails() {
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
        int hashCode6 = (this.taskDetails.hashCode() + ((this.reward.hashCode() + h.g(this.type, h.g(this.title, h.g(this.status, this.logo.hashCode() * 31, 31), 31), 31)) * 31)) * 31;
        InputTypeDetails inputTypeDetails = this.inputTypeDetails;
        int i10 = 0;
        if (inputTypeDetails == null) {
            hashCode = 0;
        } else {
            hashCode = inputTypeDetails.hashCode();
        }
        int hashCode7 = (this.cta.hashCode() + ((hashCode6 + hashCode) * 31)) * 31;
        CTA cta = this.secondaryCTO;
        if (cta == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = cta.hashCode();
        }
        int i11 = (hashCode7 + hashCode2) * 31;
        Remarks remarks = this.remarks;
        if (remarks == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = remarks.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Long l10 = this.liveDate;
        if (l10 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l10.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Long l11 = this.expiryDate;
        if (l11 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l11.hashCode();
        }
        int f10 = e.f(this.set, (i13 + hashCode5) * 31, 31);
        String str = this.eventName;
        if (str != null) {
            i10 = str.hashCode();
        }
        return f10 + i10;
    }

    @NotNull
    public String toString() {
        String str = this.logo;
        String str2 = this.status;
        String str3 = this.title;
        String str4 = this.type;
        MissionReward missionReward = this.reward;
        TaskDetails taskDetails = this.taskDetails;
        InputTypeDetails inputTypeDetails = this.inputTypeDetails;
        CTA cta = this.cta;
        CTA cta2 = this.secondaryCTO;
        Remarks remarks = this.remarks;
        Long l10 = this.liveDate;
        Long l11 = this.expiryDate;
        int i10 = this.set;
        String str5 = this.eventName;
        StringBuilder l12 = v.e.l("MissionDetail(logo=", str, ", status=", str2, ", title=");
        v.e.v(l12, str3, ", type=", str4, ", reward=");
        l12.append(missionReward);
        l12.append(", taskDetails=");
        l12.append(taskDetails);
        l12.append(", inputTypeDetails=");
        l12.append(inputTypeDetails);
        l12.append(", cta=");
        l12.append(cta);
        l12.append(", secondaryCTO=");
        l12.append(cta2);
        l12.append(", remarks=");
        l12.append(remarks);
        l12.append(", liveDate=");
        l12.append(l10);
        l12.append(", expiryDate=");
        l12.append(l11);
        l12.append(", set=");
        l12.append(i10);
        l12.append(", eventName=");
        l12.append(str5);
        l12.append(")");
        return l12.toString();
    }
}
