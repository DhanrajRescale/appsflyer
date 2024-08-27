package com.assetgro.stockgro.missions.presentation.history;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.MissionsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.missions.domain.model.MissionHistoryTimeline;
import com.assetgro.stockgro.missions.domain.model.UserTask;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import gc.g;
import hv.e;
import hv.q;
import hv.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import pj.a;
import qu.i0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/missions/presentation/history/MissionStatusDetailViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MissionStatusDetailViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final MissionsRepository f8891n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f8892o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f8893p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f8894q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f8895r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f8896s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f8897t;

    /* renamed from: u, reason: collision with root package name */
    public final d0 f8898u;

    /* renamed from: v, reason: collision with root package name */
    public final d0 f8899v;

    /* renamed from: w, reason: collision with root package name */
    public final d0 f8900w;

    /* renamed from: x, reason: collision with root package name */
    public final int f8901x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public MissionStatusDetailViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, MissionsRepository missionsRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(missionsRepository, "missionsRepository");
        this.f8891n = missionsRepository;
        this.f8892o = new LiveData();
        ?? liveData = new LiveData();
        this.f8893p = liveData;
        this.f8894q = new LiveData();
        ?? liveData2 = new LiveData();
        this.f8895r = liveData2;
        ?? liveData3 = new LiveData();
        this.f8896s = liveData3;
        this.f8897t = liveData3;
        this.f8898u = i0.C(liveData2, g.f17232f);
        this.f8899v = i0.C(liveData, g.f17234h);
        this.f8900w = i0.C(liveData, g.f17233g);
        this.f8901x = R.drawable.ic_placeholder_user;
        UserRepository userRepository2 = this.f9081d;
        liveData.postValue(new Pair(userRepository2.getUserDisplayName(), userRepository2.getUserDisplayImage()));
    }

    public static final ArrayList h(MissionStatusDetailViewModel missionStatusDetailViewModel, List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        long j10 = 0;
        while (it.hasNext()) {
            UserTask userTask = (UserTask) it.next();
            Long sortingDate = userTask.getSortingDate();
            if (sortingDate != null) {
                long longValue = sortingDate.longValue();
                if (j10 == 0) {
                    j10 = longValue;
                }
                jv.a b10 = jv.a.b("dd-MM-yyyy");
                Intrinsics.checkNotNullExpressionValue(b10, "ofPattern(...)");
                e l10 = e.l(0, longValue);
                q p10 = q.p();
                l10.getClass();
                String a10 = b10.a(t.p(l10, p10));
                e l11 = e.l(0, j10);
                q p11 = q.p();
                l11.getClass();
                if (!Intrinsics.a(a10, b10.a(t.p(l11, p11)))) {
                    arrayList.add(new MissionHistoryTimeline(j10, arrayList2));
                    arrayList2 = new ArrayList();
                    j10 = longValue;
                }
                arrayList2.add(userTask);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new MissionHistoryTimeline(j10, arrayList2));
        }
        return arrayList;
    }
}
