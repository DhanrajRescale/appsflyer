package fc;

import com.assetgro.stockgro.data.remote.response.ErrorResponse;
import com.assetgro.stockgro.data.repository.MissionsRepository;
import com.assetgro.stockgro.missions.presentation.detail.MissionTaskDetailViewModel;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.ResponseBody;
import qu.f0;

/* loaded from: classes.dex */
public final class l extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MissionTaskDetailViewModel f16029b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f16030c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f16031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f16032e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(MissionTaskDetailViewModel missionTaskDetailViewModel, String str, String str2, String str3, yt.a aVar) {
        super(2, aVar);
        this.f16029b = missionTaskDetailViewModel;
        this.f16030c = str;
        this.f16031d = str2;
        this.f16032e = str3;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new l(this.f16029b, this.f16030c, this.f16031d, this.f16032e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16028a;
        String str2 = this.f16030c;
        MissionTaskDetailViewModel missionTaskDetailViewModel = this.f16029b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                MissionsRepository missionsRepository = missionTaskDetailViewModel.f8863n;
                String str3 = this.f16031d;
                this.f16028a = 1;
                obj = missionsRepository.startMission(str2, str3, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            missionTaskDetailViewModel.f9084g.postValue(Boolean.FALSE);
            if (v0Var.f29302a.isSuccessful()) {
                if (missionTaskDetailViewModel.l()) {
                    missionTaskDetailViewModel.i(str2);
                } else {
                    String str4 = this.f16032e;
                    if (str4 != null && str4.length() > 0) {
                        missionTaskDetailViewModel.f8865p.postValue(str4);
                    }
                }
            } else {
                Gson gson = new Gson();
                ResponseBody responseBody = v0Var.f29304c;
                if (responseBody != null) {
                    str = responseBody.string();
                } else {
                    str = null;
                }
                missionTaskDetailViewModel.f8867r.postValue(new z9.g(((ErrorResponse) gson.fromJson(str, ErrorResponse.class)).getMessage()));
            }
        } catch (Exception unused) {
            missionTaskDetailViewModel.f9084g.postValue(Boolean.FALSE);
            missionTaskDetailViewModel.f8867r.postValue(new z9.g("Technical Error Occurred"));
        }
        return Unit.f23355a;
    }
}
