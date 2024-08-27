package com.assetgro.stockgro.missions.presentation.detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.MissionsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.missions.domain.model.CTA;
import com.assetgro.stockgro.missions.domain.model.MissionDetail;
import com.assetgro.stockgro.missions.domain.model.MissionStatus;
import com.assetgro.stockgro.missions.domain.model.MissionTaskType;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import fc.h;
import fc.i;
import fc.j;
import fc.l;
import fd.c;
import java.util.ArrayList;
import kj.f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import pj.a;
import qu.i0;
import vt.p0;
import vt.v;
import vt.y;
import yk.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/missions/presentation/detail/MissionTaskDetailViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "sb/b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MissionTaskDetailViewModel extends BaseViewModel {
    public final d0 A;
    public final d0 B;
    public final String C;
    public final String D;
    public final int E;

    /* renamed from: n, reason: collision with root package name */
    public final MissionsRepository f8863n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f8864o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f8865p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f8866q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f8867r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f8868s;

    /* renamed from: t, reason: collision with root package name */
    public String f8869t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8870u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8871v;

    /* renamed from: w, reason: collision with root package name */
    public c f8872w;

    /* renamed from: x, reason: collision with root package name */
    public final d0 f8873x;

    /* renamed from: y, reason: collision with root package name */
    public final d0 f8874y;

    /* renamed from: z, reason: collision with root package name */
    public final d0 f8875z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public MissionTaskDetailViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, MissionsRepository missionsRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(missionsRepository, "missionsRepository");
        this.f8863n = missionsRepository;
        ?? liveData = new LiveData();
        this.f8864o = liveData;
        this.f8865p = new LiveData();
        this.f8866q = new LiveData();
        this.f8867r = new LiveData();
        this.f8868s = y.c(MissionStatus.UNDER_REVIEW, MissionStatus.FAILED, MissionStatus.COMPLETED);
        LiveData liveData2 = new LiveData();
        this.f8870u = true;
        this.f8873x = i0.C(liveData, j.f16020d);
        this.f8874y = i0.C(liveData, j.f16019c);
        this.f8875z = i0.C(liveData, j.f16022f);
        this.A = i0.C(liveData, j.f16018b);
        this.B = i0.C(liveData, j.f16021e);
        UserRepository userRepository2 = this.f9081d;
        liveData2.postValue(new Pair(userRepository2.getUserDisplayName(), userRepository2.getUserDisplayImage()));
        g.H(u0.f(this), null, null, new h(this, null), 3);
        this.C = d.k("Great job, ", f.h(userRepository.getUserDisplayName()), "!");
        this.D = userRepository.getUserDisplayImage();
        this.E = R.drawable.ic_alien;
        userRepository.getTimeDiff();
    }

    public static CTA j(MissionDetail missionDetail) {
        Intrinsics.checkNotNullParameter(missionDetail, "missionDetail");
        String status = missionDetail.getStatus();
        if (status != null && status.length() != 0) {
            return new CTA("Go Back", HttpUrl.FRAGMENT_ENCODE_SET);
        }
        return missionDetail.getCta();
    }

    public static CTA k(MissionDetail missionDetail) {
        Intrinsics.checkNotNullParameter(missionDetail, "missionDetail");
        if (v.o(new MissionStatus[]{MissionStatus.NOT_STARTED, MissionStatus.COMPLETED}, yk.j.Z0(missionDetail.getStatus()))) {
            return null;
        }
        CTA secondaryCTO = missionDetail.getSecondaryCTO();
        if (secondaryCTO == null) {
            return new CTA("Retry", HttpUrl.FRAGMENT_ENCODE_SET);
        }
        return secondaryCTO;
    }

    public final AnalyticEvent h(boolean z10) {
        MissionDetail missionDetail;
        String ctaTapped;
        String str = null;
        if (this.f8869t == null || (missionDetail = (MissionDetail) this.f8864o.getValue()) == null) {
            return null;
        }
        String taskId = String.valueOf(this.f8869t);
        String set = String.valueOf(missionDetail.getSet());
        String status = missionDetail.getStatus();
        String taskType = missionDetail.getType();
        String rewardType = missionDetail.getReward().getType();
        String rewardAmount = String.valueOf(missionDetail.getReward().getAmount());
        String title = missionDetail.getTitle();
        if (z10) {
            ctaTapped = j(missionDetail).getName();
        } else {
            CTA k10 = k(missionDetail);
            if (k10 != null) {
                str = k10.getName();
            }
            ctaTapped = String.valueOf(str);
        }
        String eventName = String.valueOf(missionDetail.getEventName());
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(set, "set");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(taskType, "taskType");
        Intrinsics.checkNotNullParameter(rewardType, "rewardType");
        Intrinsics.checkNotNullParameter(rewardAmount, "rewardAmount");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ctaTapped, "ctaTapped");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("task_id", taskId);
        pairArr[1] = new Pair("set", set);
        if (status.length() == 0) {
            status = "unattempted";
        }
        pairArr[2] = new Pair("status", status);
        pairArr[3] = new Pair("task_type", taskType);
        pairArr[4] = new Pair("reward_type", rewardType);
        pairArr[5] = new Pair("reward_amount", rewardAmount);
        pairArr[6] = new Pair("title", title);
        pairArr[7] = new Pair("cta_tapped", ctaTapped);
        pairArr[8] = new Pair("event_name", eventName);
        return new AnalyticEvent("app_missiondetails_CTA_tapped", p0.f(pairArr));
    }

    public final void i(String str) {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f8867r.postValue(new z9.h(R.string.no_internet_connection, new Object[0]));
            return;
        }
        if (this.f8870u) {
            this.f8870u = false;
            this.f9084g.postValue(Boolean.TRUE);
        }
        g.H(u0.f(this), null, null, new i(this, str, null), 3);
    }

    public final boolean l() {
        String str;
        MissionDetail missionDetail = (MissionDetail) this.f8864o.getValue();
        if (missionDetail != null) {
            str = missionDetail.getType();
        } else {
            str = null;
        }
        return Intrinsics.a(str, MissionTaskType.USER_INPUT.getTaskName());
    }

    public final void m(String taskId, String str, String str2) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f8867r.postValue(new z9.h(R.string.no_internet_connection, new Object[0]));
        } else {
            this.f9084g.postValue(Boolean.TRUE);
            g.H(u0.f(this), null, null, new l(this, taskId, str, str2, null), 3);
        }
    }

    public final boolean n() {
        String status;
        MissionDetail missionDetail = (MissionDetail) this.f8864o.getValue();
        if (missionDetail != null && (status = missionDetail.getStatus()) != null) {
            return v.o(new MissionStatus[]{MissionStatus.COMPLETED, MissionStatus.UNDER_REVIEW, MissionStatus.FAILED}, yk.j.Z0(status));
        }
        return false;
    }
}
