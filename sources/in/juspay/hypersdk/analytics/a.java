package in.juspay.hypersdk.analytics;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONObject f20190c;

    public /* synthetic */ a(String str, JSONObject jSONObject) {
        this.f20188a = 2;
        this.f20190c = jSONObject;
        this.f20189b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20188a;
        String str = this.f20189b;
        JSONObject jSONObject = this.f20190c;
        switch (i10) {
            case 0:
                LogPusher.b(str, jSONObject);
                return;
            case 1:
                LogPusher.c(str, jSONObject);
                return;
            default:
                LogSessioniser.d(str, jSONObject);
                return;
        }
    }

    public /* synthetic */ a(String str, JSONObject jSONObject, int i10) {
        this.f20188a = i10;
        this.f20189b = str;
        this.f20190c = jSONObject;
    }
}
