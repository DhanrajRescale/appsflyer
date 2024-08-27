package in.juspay.hypersdk.analytics;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f20194b;

    public /* synthetic */ c(JSONObject jSONObject, int i10) {
        this.f20193a = i10;
        this.f20194b = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20193a;
        JSONObject jSONObject = this.f20194b;
        switch (i10) {
            case 0:
                LogPusher.lambda$addLogsToPersistedQueue$3(jSONObject);
                return;
            case 1:
                LogPusherExp.d(jSONObject);
                return;
            default:
                LogSessioniser.f(jSONObject);
                return;
        }
    }
}
