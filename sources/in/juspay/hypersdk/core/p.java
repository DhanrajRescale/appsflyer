package in.juspay.hypersdk.core;

import android.view.ViewGroup;
import in.juspay.hypersdk.safe.JuspayWebView;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20311c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20312d;

    public /* synthetic */ p(int i10, Object obj, Object obj2, Object obj3) {
        this.f20309a = i10;
        this.f20311c = obj;
        this.f20312d = obj2;
        this.f20310b = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20309a;
        Object obj = this.f20310b;
        Object obj2 = this.f20312d;
        Object obj3 = this.f20311c;
        switch (i10) {
            case 0:
                ((DynamicUI) obj3).lambda$addJavascriptInterface$1(obj2, (String) obj);
                return;
            case 1:
                ((DuiInterface) obj3).lambda$runInJuspayBrowser$3((String) obj, (SdkTracker) obj2);
                return;
            case 2:
                DuiInterface.lambda$loadUrl$6((String) obj, (JuspayWebView) obj3, (String) obj2);
                return;
            case 3:
                ((DuiInterface) obj3).lambda$runInJuspayWebView$5((String) obj, (JuspayWebView) obj2);
                return;
            case 4:
                ((JsInterface) obj3).lambda$requestPendingLogs$3((String) obj, (String) obj2);
                return;
            case 5:
                ((JsInterface) obj3).lambda$setAnalyticsHeader$2((JSONObject) obj2, (String) obj);
                return;
            case 6:
                ((JuspayServices) obj3).lambda$logEncryptionSupport$1((JSONObject) obj2, (SdkTracker) obj);
                return;
            default:
                ((JuspayServices) obj3).lambda$process$4((androidx.fragment.app.j0) obj2, (ViewGroup) obj);
                return;
        }
    }

    public /* synthetic */ p(JsInterface jsInterface, String str, Object obj, int i10) {
        this.f20309a = i10;
        this.f20311c = jsInterface;
        this.f20310b = str;
        this.f20312d = obj;
    }

    public /* synthetic */ p(String str, JuspayWebView juspayWebView, String str2) {
        this.f20309a = 2;
        this.f20310b = str;
        this.f20311c = juspayWebView;
        this.f20312d = str2;
    }
}
