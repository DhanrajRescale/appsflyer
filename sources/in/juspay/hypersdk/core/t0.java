package in.juspay.hypersdk.core;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class t0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SdkTracker f20357b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONObject f20358c;

    public /* synthetic */ t0(SdkTracker sdkTracker, JSONObject jSONObject, int i10) {
        this.f20356a = i10;
        this.f20357b = sdkTracker;
        this.f20358c = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20356a;
        JSONObject jSONObject = this.f20358c;
        SdkTracker sdkTracker = this.f20357b;
        switch (i10) {
            case 0:
                sdkTracker.lambda$track$17(jSONObject);
                return;
            default:
                sdkTracker.lambda$addLogToPersistedQueue$14(jSONObject);
                return;
        }
    }
}
