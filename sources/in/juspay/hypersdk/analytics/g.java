package in.juspay.hypersdk.analytics;

import in.juspay.hypersdk.safe.JuspayWebView;
import in.juspay.services.HyperServices;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20199c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.f20197a = i10;
        this.f20198b = obj;
        this.f20199c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20197a;
        Object obj = this.f20199c;
        Object obj2 = this.f20198b;
        switch (i10) {
            case 0:
                LogSessioniserExp.a((LogSessioniserExp) obj2, (JSONObject) obj);
                return;
            case 1:
                JuspayWebView.a((String) obj, (JuspayWebView) obj2);
                return;
            default:
                HyperServices.h((HyperServices) obj2, (Throwable) obj);
                return;
        }
    }
}
