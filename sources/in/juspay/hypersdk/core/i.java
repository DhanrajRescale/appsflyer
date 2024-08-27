package in.juspay.hypersdk.core;

import android.app.Activity;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20265b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20266c;

    public /* synthetic */ i(int i10, Object obj, Object obj2) {
        this.f20264a = i10;
        this.f20266c = obj;
        this.f20265b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20264a;
        Object obj = this.f20265b;
        Object obj2 = this.f20266c;
        switch (i10) {
            case 0:
                ((AndroidInterface) obj2).lambda$processPendingAddScreen$21((String) obj);
                return;
            case 1:
                ((DynamicUI) obj2).lambda$addJsToWebView$0((String) obj);
                return;
            case 2:
                ((DuiInterface) obj2).lambda$requestKeyboardShow$7((String) obj);
                return;
            case 3:
                ((DuiInterface) obj2).lambda$clearMerchantViews$0((Activity) obj);
                return;
            case 4:
                JsInterface.a((JsInterface) obj2, (JSONObject) obj);
                return;
            case 5:
                JsInterface.c((JsInterface) obj2, (String) obj);
                return;
            case 6:
                ((JuspayServices) obj2).lambda$addFragment$7((androidx.fragment.app.j0) obj);
                return;
            case 7:
                Renderer.b((Renderer) obj2, (String) obj);
                return;
            case 8:
                Renderer.a((Renderer) obj2, (String[]) obj);
                return;
            default:
                ((SdkTracker) obj2).lambda$setEndPointSandbox$18((Boolean) obj);
                return;
        }
    }
}
