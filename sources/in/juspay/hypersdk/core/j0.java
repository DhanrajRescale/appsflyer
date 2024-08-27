package in.juspay.hypersdk.core;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class j0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JuspayServices f20276b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONObject f20277c;

    public /* synthetic */ j0(JuspayServices juspayServices, JSONObject jSONObject, int i10) {
        this.f20275a = i10;
        this.f20276b = juspayServices;
        this.f20277c = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20275a;
        JSONObject jSONObject = this.f20277c;
        JuspayServices juspayServices = this.f20276b;
        switch (i10) {
            case 0:
                JuspayServices.i(juspayServices, jSONObject);
                return;
            default:
                JuspayServices.b(juspayServices, jSONObject);
                return;
        }
    }
}
