package in.juspay.services;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HyperServices f20417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONObject f20418c;

    public /* synthetic */ a(HyperServices hyperServices, JSONObject jSONObject, int i10) {
        this.f20416a = i10;
        this.f20417b = hyperServices;
        this.f20418c = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20416a;
        JSONObject jSONObject = this.f20418c;
        HyperServices hyperServices = this.f20417b;
        switch (i10) {
            case 0:
                hyperServices.lambda$initiate$1(jSONObject);
                return;
            default:
                hyperServices.lambda$setupJuspayServices$0(jSONObject);
                return;
        }
    }
}
